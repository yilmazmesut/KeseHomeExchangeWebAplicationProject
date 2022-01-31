package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.LoginPage;
import com.kese.pages.SignUpPage;
import com.kese.pages.US011LoginPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US011LoginPageStepD {

    US011LoginPage loginPage = new US011LoginPage();

    @Then("{string} button should be active on login page")
    public void button_should_be_active_on_login_page(String buttonType) {

        BrowserUtils.waitFor(2);
       if(buttonType.equals("Giriş Yap")) {

           Assert.assertTrue(loginPage.loginPageBelowGirisYapButton.isDisplayed());
           Assert.assertTrue(loginPage.loginPageBelowGirisYapButton.isEnabled());
       }
       else if (buttonType.equals("Kayıt Oluştur")) {

           Assert.assertTrue(loginPage.loginPageKayitOlButton.isDisplayed());
           Assert.assertTrue(loginPage.loginPageKayitOlButton.isEnabled());

        }

    }

    @When("user clicks {string} button on login page")
    public void user_clicks_button_on_login_page(String string) {

        BrowserUtils.waitFor(2);
        loginPage.loginPageKayitOlButton.click();

    }
}
