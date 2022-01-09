package com.kese.stepdefinitions;

import com.kese.pages.SignUpPage;
import com.kese.pages.US18LoginPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US015_stepDefs {

        @Given("the user goes to {string} page")
    public void theUserGoesToPage(String signupPageUrl) {

        Driver.get().get(signupPageUrl);

    }

    @And("the user asserts The Giris Yap Button is visible and enabled")
    public void theUserAssertsTheGirisYapButtonIsVisibleAndEnabled() {

       boolean isDisplayed = SignUpPage.girisYapButtonIsDisplayed();
       boolean isEnabled = SignUpPage.girisYapButtonIsEnabled();
        Assert.assertTrue(isDisplayed);
        Assert.assertTrue(isEnabled);
    }

    @When("the user clicks Giriş Yap button")
    public void theUserClicksButton() {
        SignUpPage.clickGirisYapButton();
    }

    @Then("the user asserts that he is able to go {string} page")
    public void theUserAssertsThatHeIsAbleToGoPage(String expectedUrl) {
        String currentUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrl);
    }
}
