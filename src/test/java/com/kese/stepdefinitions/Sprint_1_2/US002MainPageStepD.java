package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.LoginPage;
import com.kese.pages.MainPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.ConfigurationReader;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US002MainPageStepD   {
    MainPage mainPage =new MainPage();

    @Given("User is on login page")
    public void user_is_on_login_page_http_test_kese_nl() {

        Driver.get().get("https://kese.nl/");





    }

    @When("The user sees the home change button")
    public void the_user_sees_the_home_change_button() {
        BrowserUtils.waitForPageToLoad(5);
        Assert.assertTrue(mainPage.getHomechangeButton.isDisplayed());

    }

    @Then("User clicks on the home change button")
    public void user_clicks_on_the_home_change_button() {

        Assert.assertTrue(mainPage.EvDegisimiYeriButton.isEnabled());
    }




    @Given("The user should be able to see the text {string}")
    public void the_user_should_be_able_to_see_the_text(String expectedtext) throws InterruptedException {

        Driver.get().get("https://kese.nl/");


        String actualtext = mainPage.EvDegisimiYeriButton.getText();

        Assert.assertEquals(expectedtext,actualtext);

    }


}