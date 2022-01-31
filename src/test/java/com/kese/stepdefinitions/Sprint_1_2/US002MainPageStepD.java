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

        Driver.get().get(ConfigurationReader.get("url"));

        //  BrowserUtils.waitFor(3000);

        // mainPage.girisyapButtonu.click();

       /* LoginPage.enterUserName("kullanici1@gmail.com");
        LoginPage.enterPassword("1234");
        LoginPage.clickSubmitbutton();*/

        BrowserUtils.waitFor(3000);

    }

    @When("The user sees the home change button")
    public void the_user_sees_the_home_change_button() {
        BrowserUtils.waitForPageToLoad(5);
        Assert.assertTrue(mainPage.getHomechangeButton.isDisplayed());

    }

    @Then("User clicks on the home change button")
    public void user_clicks_on_the_home_change_button() {

        mainPage.EvDegisimiYeriButton.click();
    }




    @Given("The user should be able to see the text {string}")
    public void the_user_should_be_able_to_see_the_text(String expectedtext) {

        String actualtext = mainPage.EvDegisimiYeriButton.getAttribute("value");
        Assert.assertEquals(expectedtext,actualtext);

    }


}