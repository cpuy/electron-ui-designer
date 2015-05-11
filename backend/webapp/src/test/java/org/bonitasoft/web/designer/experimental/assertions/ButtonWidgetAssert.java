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
package org.bonitasoft.web.designer.experimental.assertions;

import static java.lang.String.format;

import org.assertj.core.api.AbstractAssert;
import org.bonitasoft.web.designer.experimental.parametrizedWidget.ButtonWidget;

/**
 * ****************************************************************************
 * Copyright (C) 2015 BonitaSoft S.A.
 * BonitaSoft is a trademark of BonitaSoft SA.
 * This software file is BONITASOFT CONFIDENTIAL. Not For Distribution.
 * For commercial licensing information, contact:
 * BonitaSoft, 32 rue Gustave Eiffel – 38000 Grenoble
 * or BonitaSoft US, 51 Federal Street, Suite 305, San Francisco, CA 94107
 * *****************************************************************************
 */

/**
 * {@link ButtonWidget} specific assertions - Generated by CustomAssertionGenerator.
 */
public class ButtonWidgetAssert extends AbstractAssert<ButtonWidgetAssert, ButtonWidget> {

    /**
     * Creates a new </code>{@link ButtonWidgetAssert}</code> to make assertions on actual ButtonWidget.
     *
     * @param actual the ButtonWidget we want to make assertions on.
     */
    public ButtonWidgetAssert(ButtonWidget actual) {
        super(actual, ButtonWidgetAssert.class);
    }

    /**
     * An entry point for ButtonWidgetAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one's can write directly : <code>assertThat(myButtonWidget)</code> and get specific assertion with code completion.
     *
     * @param actual the ButtonWidget we want to make assertions on.
     * @return a new </code>{@link ButtonWidgetAssert}</code>
     */
    public static ButtonWidgetAssert assertThat(ButtonWidget actual) {
        return new ButtonWidgetAssert(actual);
    }

    /**
     * Verifies that the actual ButtonWidget's action is equal to the given one.
     *
     * @param action the given action to compare the actual ButtonWidget's action to.
     * @return this assertion object.
     * @throws AssertionError - if the actual ButtonWidget's action is not equal to the given one.
     */
    public ButtonWidgetAssert hasAction(String action) {
        // check that actual ButtonWidget we want to make assertions on is not null.
        isNotNull();

        // we overrides the default error message with a more explicit one
        String errorMessage = format("\nExpected <%s> action to be:\n  <%s>\n but was:\n  <%s>", actual, action, actual.getAction());

        // check
        if (!actual.getAction().equals(action)) {
            throw new AssertionError(errorMessage);
        }

        // return the current assertion for method chaining
        return this;
    }

    /**
     * Verifies that the actual ButtonWidget's buttonStyle is equal to the given one.
     *
     * @param buttonStyle the given buttonStyle to compare the actual ButtonWidget's buttonStyle to.
     * @return this assertion object.
     * @throws AssertionError - if the actual ButtonWidget's buttonStyle is not equal to the given one.
     */
    public ButtonWidgetAssert hasButtonStyle(String buttonStyle) {
        // check that actual ButtonWidget we want to make assertions on is not null.
        isNotNull();

        // we overrides the default error message with a more explicit one
        String errorMessage = format("\nExpected <%s> buttonStyle to be:\n  <%s>\n but was:\n  <%s>", actual, buttonStyle, actual.getButtonStyle());

        // check
        if (!actual.getButtonStyle().equals(buttonStyle)) {
            throw new AssertionError(errorMessage);
        }

        // return the current assertion for method chaining
        return this;
    }

    /**
     * Verifies that the actual ButtonWidget's collectionToModify is equal to the given one.
     *
     * @param collectionToModify the given collectionToModify to compare the actual ButtonWidget's collectionToModify to.
     * @return this assertion object.
     * @throws AssertionError - if the actual ButtonWidget's collectionToModify is not equal to the given one.
     */
    public ButtonWidgetAssert hasCollectionToModify(String collectionToModify) {
        // check that actual ButtonWidget we want to make assertions on is not null.
        isNotNull();

        // we overrides the default error message with a more explicit one
        String errorMessage = format("\nExpected <%s> collectionToModify to be:\n  <%s>\n but was:\n  <%s>", actual, collectionToModify,
                actual.getCollectionToModify());

        // check
        if (!actual.getCollectionToModify().equals(collectionToModify)) {
            throw new AssertionError(errorMessage);
        }

        // return the current assertion for method chaining
        return this;
    }

    /**
     * Verifies that the actual ButtonWidget's dataToSend is equal to the given one.
     *
     * @param dataToSend the given dataToSend to compare the actual ButtonWidget's dataToSend to.
     * @return this assertion object.
     * @throws AssertionError - if the actual ButtonWidget's dataToSend is not equal to the given one.
     */
    public ButtonWidgetAssert hasDataToSend(String dataToSend) {
        // check that actual ButtonWidget we want to make assertions on is not null.
        isNotNull();

        // we overrides the default error message with a more explicit one
        String errorMessage = format("\nExpected <%s> dataToSend to be:\n  <%s>\n but was:\n  <%s>", actual, dataToSend, actual.getDataToSend());

        // check
        if (!actual.getDataToSend().equals(dataToSend)) {
            throw new AssertionError(errorMessage);
        }

        // return the current assertion for method chaining
        return this;
    }

    /**
     * Verifies that the actual ButtonWidget is disabled.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual ButtonWidget is not disabled.
     */
    public ButtonWidgetAssert isDisabled() {
        // check that actual ButtonWidget we want to make assertions on is not null.
        isNotNull();

        // we overrides the default error message with a more explicit one
        String errorMessage = format("Expected actual ButtonWidget to be disabled but was not.", actual);

        // check
        if (!actual.isDisabled())
            throw new AssertionError(errorMessage);

        // return the current assertion for method chaining
        return this;
    }

    /**
     * Verifies that the actual ButtonWidget is not disabled.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual ButtonWidget is disabled.
     */
    public ButtonWidgetAssert isNotDisabled() {
        // check that actual ButtonWidget we want to make assertions on is not null.
        isNotNull();

        // we overrides the default error message with a more explicit one
        String errorMessage = format("Expected actual ButtonWidget not to be disabled but was.", actual);

        // check
        if (actual.isDisabled())
            throw new AssertionError(errorMessage);

        // return the current assertion for method chaining
        return this;
    }

}
