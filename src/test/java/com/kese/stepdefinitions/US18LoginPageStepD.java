package com.kese.stepdefinitions;

import com.kese.pages.LoginPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US18LoginPageStepD {

    //US18LoginPage us18LoginPage=new US18LoginPage();

    @Given("user is on login page {string}")
    public void userIsOnLoginPage(String loginPageUrl) {

        Driver.get().get(loginPageUrl);
    }

    @When("user enters valid username {string}")
    public void userEntersValidUsername(String userName) {

        LoginPage.enterUserName(userName);
    }

    @And("user enters valid password {string}")
    public void userEntersValidPassword(String password) {

        LoginPage.enterPassword(password);
    }

    @And("user clicks on Login button")
    public void userClicksOnLoginButton() {

        LoginPage.clickSubmitbutton();
    }

    @Then("user gets the url of the page")
    public void userGetsTheUrlOfThePage() {

        String currentUrl= BrowserUtils.myGetCurrentUrlMethod();

    }

    @And("page url should be {string}")
    public void pageUrlShouldBe(String expectedUrl) {


        Assert.assertTrue((Driver.get().getCurrentUrl().contains(expectedUrl)));
    }

    @And("user enters invalid password {string}")
    public void userEntersInvalidPassword(String invalidPassword) {

        LoginPage.enterPassword(invalidPassword);

    }

    @Then("user should get the this message {string}")
    public void userShouldGetTheThisMessage(String expectederrorMessage) {

        String currentErrorMessage = LoginPage.getErrorMessage();
        Assert.assertTrue(expectederrorMessage.contains(currentErrorMessage));

    }

    @When("users enter invalid username {string}")
    public void usersEnterInvalidUsername(String invalidUsername) {

        LoginPage.enterUserName(invalidUsername);
    }

    @When("user enters invalid username {string}")
    public void userEntersInvalidUsername(String invalidUsername) {

        LoginPage.enterUserName(invalidUsername);
    }
}
