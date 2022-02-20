package com.kese.stepdefinitions.Sprint_4;

import com.kese.pages.BirlikteSeyahatPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US130_BirlikteSeyahatPage3StepD {
    BirlikteSeyahatPage page3 = new BirlikteSeyahatPage();

    @Then("user verifies that {string} button is visible")
    public void userVerifiesThatButtonIsVisible(String ilerleButton) {
        page3.ilerleButton.isDisplayed();

        System.out.println(ilerleButton);

    }

    @Then("user verifies that the {string} button should be clickable by default, but should not move to the next step when clicked.")
    public void userVerifiesThatTheButtonShouldBeClickableByDefaultButShouldNotMoveToTheNextStepWhenClicked(String arg0) {
        page3.ilerleButton.isEnabled();
        page3.ilerleButton.click();
        Assert.assertTrue(page3.ilerleButton.isEnabled());

    }

    @Then("user verifies that the opacity value of the {string} button should be {double} by default")
    public void userVerifiesThatTheOpacityValueOfTheButtonShouldBeByDefault(String arg0, int arg1, int arg2) {

    }

    @Then("user verifies that If the seat information is not selected or the description information is not entered, if the Next button is clicked, {string} warning should be visible.")
    public void userVerifiesThatIfTheSeatInformationIsNotSelectedOrTheDescriptionInformationIsNotEnteredIfTheNextButtonIsClickedWarningShouldBeVisible(String arg0) {

    }

    @Then("user verifies that When the start point and end point are selected, the Next button should be clickable.")
    public void userVerifiesThatWhenTheStartPointAndEndPointAreSelectedTheNextButtonShouldBeClickable() {

    }
}
