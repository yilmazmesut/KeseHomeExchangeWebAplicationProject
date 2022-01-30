package com.kese.stepdefinitions;

import io.cucumber.java.en.When;



import com.kese.pages.EvDegisimiPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.*;

import org.junit.Assert;

public class US036EvDegisimiStepD {

    EvDegisimiPage evDegisimiPage= new EvDegisimiPage();

    @Given("until the user fills in the blanks on page {int} {string} button should not be functional")
    public void until_the_user_fills_in_the_blanks_on_page_button_should_not_be_functional(Integer int1, String string) {

        Assert.assertTrue(evDegisimiPage.page3ilerlebutonu.isEnabled());


    }

    @When("the user click {string} button")
    public void the_user_click_button(String string) {
        evDegisimiPage.page3ilerlebutonu.click();

    }

    @When("the user not enters required  information, she sees {string}")
    public void the_user_not_enters_required_information_she_sees(String string) {

        BrowserUtils.waitFor(2);
        Assert.assertTrue(evDegisimiPage.page3lütfenkullnimalanigirinyazisi.isDisplayed());

    }

    @Then("After the user has entered the required information, the {string} button should be clickable.")
    public void after_the_user_has_entered_the_required_information_the_button_should_be_clickable(String string) {

        BrowserUtils.waitFor(2);
        evDegisimiPage.page3KullanimAlaniInput.sendKeys("120");

        Assert.assertTrue(evDegisimiPage.page3ilerlebutonu.isEnabled());

    }


}