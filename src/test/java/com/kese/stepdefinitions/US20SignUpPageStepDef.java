package com.kese.stepdefinitions;

import com.kese.pages.SignUpPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US20SignUpPageStepDef {
    SignUpPage page = new SignUpPage();

    @Given("user goes to {string} page")
    public void userGoesToPage(String url) {
        Driver.get().get(url);
    }

    String username;
    String password = "1234";
    String email;
    @When("user creates a random credentials and signup")
    public void signUpWithRandomCredentials() {
        username = getRandomString(4);
        email = getRandomString(4)+"@nonmail.com";

        page.inputUsername.sendKeys(username);
        page.inputMail.sendKeys(email);
        page.inputPassword.sendKeys(password);
        page.inputPasswordAgain.sendKeys(password);
        page.privacyPolicyCheckBox.click();
        page.signUpButton.click();
        BrowserUtils.waitForPageToLoad(5);
        WebElement signInButtonElement= page.girisYapButtonOnSignInPage;
        Assert.assertTrue(signInButtonElement.isDisplayed());
        page.kayitOl.click();
    }

    @And("user tries to use the same {string} for signup again")
    public void userTriesToUseTheSameForSignupAgain(String arg0) {
        switch (arg0){
            case "email": // email didn't change
                username = getRandomString(4);
                break;
            case "username": // password didn't change
                email = getRandomString(5)+"@nonmail.com";
                break;
        }
        page.inputUsername.sendKeys(username);
        page.inputMail.sendKeys(email);
        page.inputPassword.sendKeys(password);
        page.inputPasswordAgain.sendKeys(password);
        page.privacyPolicyCheckBox.click();
        page.signUpButton.click();
    }

    @Then("user verifies {string} and can't signup on signup page")
    public void userVerifiesAndCanTSignupOnSignupPage(String arg0) {
        // Sign In page mustn't be display
        WebElement signInButtonElement= page.girisYapButtonOnSignInPage;
        Assert.assertThrows(org.openqa.selenium.NoSuchElementException.class, signInButtonElement::isDisplayed);
        // Error message will display
        WebElement textElement = Driver.get().findElement(By.xpath("//*[contains(text(),'"+arg0+"')]"));
        Assert.assertTrue(textElement.isDisplayed());
    }

    /**
     * This method creates a random string
     *
     * @param length number of letters in string
     * @return random string
     */

    private String getRandomString(int length) {
        String possibleLetters = "abcdefgijklmopqrstuvwxyz";
        char[] rndWord = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * possibleLetters.length());
            rndWord[i] = possibleLetters.charAt(rand);
        }
        return new String(rndWord);
    }
}