package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.LoginPage;
import com.kese.pages.MainPage;
import com.kese.pages.SignedInHomePage;
import com.kese.pages.US011LoginPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class US026LogoutPageStepD {

    SignedInHomePage signedInHomePage = new SignedInHomePage();

    @Given("user logs in with {string} and {string}")
    public void user_logs_in_with_and(String email, String password) {

        BrowserUtils.waitFor(1);
        new MainPage().girisYapButton.click();
        LoginPage.enterUserName(email);
        LoginPage.enterPassword(password);
        LoginPage.clickSubmitbutton();

    }

    @When("user clicks Profilim link on signed in page")
    public void user_clicks_Profilim_link_on_signed_in_page() {

        BrowserUtils.waitFor(1);
        signedInHomePage.ProfilimButton.click();

    }

    @When("user clicks {string} button on Profilim link")
    public void user_clicks_button_on_Profilim_link(String itemName) {

        BrowserUtils.waitFor(3);
        new US011LoginPage().clickMenuItemProfilimLink(itemName);

    }

}
