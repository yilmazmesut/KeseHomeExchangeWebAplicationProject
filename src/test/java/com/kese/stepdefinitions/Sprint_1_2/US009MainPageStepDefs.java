package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.MainPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US009MainPageStepDefs {

    MainPage mainPage = new MainPage();

    @Then("Giris Yap button should be visible and clickable on home page")
    public void Giris_Yap_button_should_be_visible_and_clickable_on_home_page() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(mainPage.girisYapButton.isDisplayed());
        Assert.assertTrue(mainPage.girisYapButton.isEnabled());
    }

    @When("the user clicks Giris Yap button on home page")
    public void the_user_clicks_Giris_Yap_button_on_home_page() {
        BrowserUtils.waitFor(1);
        mainPage.girisYapButton.click();
    }
}
