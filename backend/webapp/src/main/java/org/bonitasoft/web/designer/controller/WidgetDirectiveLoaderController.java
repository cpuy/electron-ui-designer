/**
 * Copyright (C) 2015 Bonitasoft S.A.
 * Bonitasoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2.0 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.bonitasoft.web.designer.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerMapping;

/**
 * Simple controller that serves widgets files located outside of the war
 *
 * ex : for a request GET [mappedurl]/pbInput/pbInput.js it will load [widgetRepositoryPath]/pbInput/pbInput.js located on disk
 * @author Colin Puy
 */
@Controller
public class WidgetDirectiveLoaderController {

    private Path widgetRepositoryPath;

    @Inject
    public WidgetDirectiveLoaderController(@Named("widgetPath") Path widgetRepositoryPath) {
        this.widgetRepositoryPath = widgetRepositoryPath;
    }

    @RequestMapping("generator/widgets/**")
    public void serveWidgetDirective(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Path filePath = extractPathWithinPattern(request);

        if (Files.notExists(filePath)) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        response.setHeader("Content-Type", request.getServletContext().getMimeType(filePath.getFileName().toString()));
        response.setHeader("Content-Length", String.valueOf(filePath.toFile().length()));
        response.setHeader("Content-Disposition", "inline; filename=\"" + filePath.getFileName() + "\"");
        response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        try (OutputStream out = response.getOutputStream()) {
            Files.copy(filePath, out);
        }
    }

    /**
     * Extract path from a controller mapping. /generator/widgets/pbInput/pbInput.js => /pbInput/pbInput.js
     */
    private Path extractPathWithinPattern(final HttpServletRequest request){
        String path = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
        String bestMatchPattern = (String ) request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE);
        String finalPath = new AntPathMatcher().extractPathWithinPattern(bestMatchPattern, path);
        return widgetRepositoryPath.resolve(finalPath);
    }
}
