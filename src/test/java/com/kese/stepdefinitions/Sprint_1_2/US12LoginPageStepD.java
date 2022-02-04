package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.US12LoginPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US12LoginPageStepD {


    @Given("user on the login page as this url {string}")
    public void user_on_the_login_page_as_this_url(String loginPageUrl) {
        Driver.get().get(loginPageUrl);
    }

    @Then("user should see the {string}")
    public void user_should_see_the(String expectedMessage) {

        String actualText = US12LoginPage.getMyText();
        Assert.assertEquals(actualText, expectedMessage);
    }

    @Then("Sifremi unuttum link should be active")
    public void sifremi_unuttum_link_should_be_active() {

        boolean myactualResult = US12LoginPage.isMyElementDisplayed();
        Assert.assertTrue(myactualResult);

    }

    @Then("Sifremi unuttum link should be {string}")
    public void sifremi_unuttum_link_should_be(String expectedCssValue) {

        String actualMessage = US12LoginPage.getMyCss();
        Assert.assertTrue(actualMessage.contains(expectedCssValue));


    }

    @When("user click on the sifremi unuttum link")
    public void user_click_on_the_sifremi_unuttum_link() {

        US12LoginPage.clickMySifremiUnuttumButton();

    }

    @Then("user should be on this page url {string}")
    public void user_should_be_on_this_page_url(String expectedUrl) {

        String actualUrl = US12LoginPage.getMyPageUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }

}
