package com.kese.stepdefinitions;

import com.kese.pages.MainPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US009MainPageStepDefs {

    MainPage mainPage = new MainPage();

    @Then("Giris Yap button should be visible and clickable")
    public void giris_Yap_button_should_be_visible_and_clickable() {
        BrowserUtils.waitFor(1);
        Assert.assertTrue(mainPage.girisYapButton.isDisplayed());
        Assert.assertTrue(mainPage.girisYapButton.isEnabled());
    }

    @When("the user clicks Giris Yap button on HomePage")
    public void the_user_clicks_Giris_Yap_button_on_HomePage() {
        BrowserUtils.waitFor(1);
        mainPage.girisYapButton.click();
    }
}
