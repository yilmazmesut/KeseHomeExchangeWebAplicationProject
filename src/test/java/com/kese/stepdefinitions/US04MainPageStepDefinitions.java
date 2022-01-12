package com.kese.stepdefinitions;

import com.kese.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US04MainPageStepDefinitions {
    MainPage mainPage = new MainPage();

//    @Given("user goes to homepage")
//    public void userGoesToHomepage() {
//    }

    @And("the user clicks the {string} button")
    public void theUserClicksTheButton(String arg0) {
        mainPage.BirlikteSeyehat.click();
    }

    @When("{string} is selected, the text {string} should be visible.")
    public void isSelectedTheTextShouldBeVisible(String arg0, String arg1) {
        Assert.assertTrue(mainPage.SeyehatEtmekIstediginizYeriSeciniz.isDisplayed());
    }

    @Then("user validates the drop down menu is clickable, under the {string} text")
    public void userValidatesTheDropDownMenuIsClickableUnderTheText(String arg0) {
        Assert.assertTrue(mainPage.selectDropDown.isEnabled());

    }
}
