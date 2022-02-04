package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.ForgetPasswordPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US016ForgetPassPageEmailButtonStepdefs {
    ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage();

    @Given("the user is on forget password page {string}")
    public void theUserIsOnForgetPasswordPage(String ForgetPasswordPageUrl) {
        Driver.get().get(ForgetPasswordPageUrl);
    }


    @And("the email input box should be clickable")
    public void theEmailInputBoxShouldBeClickable() {
        Assert.assertTrue(forgetPasswordPage.emailInputBox.isEnabled());
    }


    @Then("Validate if the {string} is there as a default in the input box")
    public void validateIfTheIsThereAsADefaultInTheInputBox(String text) {
        String attributeText =  forgetPasswordPage.emailInputBox.getAttribute("placeholder");
        Assert.assertEquals(attributeText,text);
    }
}
