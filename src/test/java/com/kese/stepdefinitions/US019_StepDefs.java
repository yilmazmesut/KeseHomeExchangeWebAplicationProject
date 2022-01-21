package com.kese.stepdefinitions;

import com.kese.pages.LoginPage;
import com.kese.pages.SignUpPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Date;

public class US019_StepDefs {
    SignUpPage page = new SignUpPage();
    LoginPage loginPage = new LoginPage();
    Date date = new Date();

    @Given("user is on signup page {string}")
    public void userIsOnSignupPage(String SignUpPageUrl) {
        Driver.get().get(SignUpPageUrl);
    }

    @And("user types {string} to the username input on the signup page")
    public void userTypesToTheUsernameInputOnTheSignupPage(String username) {
        page.SignupUserInput.sendKeys(username+date.getTime());

    }



    @And("user types {string} to the email input on the signup page")
    public void userTypesToTheEmailInputOnTheSignupPage(String email) {
        page.SignupEmailBox.sendKeys(date.getTime()+email);
    }

    @And("user types {string} to the password input on the signup page")
    public void userTypesToThePasswordInputOnTheSignupPage(String password) {
        page.SignupPasswordBox.clear();
        page.SignupPasswordBox.sendKeys(password);
    }

    @And("user types {string} to the repassword input on the signup page")
    public void userTypesToTheRepasswordInputOnTheSignupPage(String password) {
        page.repasswordInput.clear();
        page.repasswordInput.sendKeys(password);
    }

    @And("user clicks to the checkbox on signup page")
    public void userClicksToTheCheckboxOnSignupPage() {
        page.CheckBox.click();
    }

    @And("user clicks to the kayit ol button on the signup page")
    public void userClicksToTheKayitOlButtonOnTheSignupPage() {
        page.SignupButton.click();
    }

    @And("user verifies {string} is visible")
    public void userVerifiesIsVisible(String text) {
        WebElement yazi = Driver.get().findElement(By.xpath("//*[contains(text(), '"+text+"')]"));
        System.out.println(text);
        Assert.assertTrue(yazi.isDisplayed());
    }
}
