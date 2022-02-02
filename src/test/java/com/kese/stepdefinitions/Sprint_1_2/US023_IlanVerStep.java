package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.LoginPage;
import com.kese.pages.MainPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class US023_IlanVerStep {


    MainPage mainPage = new MainPage();
    WebDriver driver= Driver.get();
    @Given("user is on login pag {string}")
    public void UserIsOnLoginPag(String loginPageUrl) {

        Driver.get().get(String.valueOf(loginPageUrl));
    }
    @When("user enters valid usernam {string}")
    public void UserEntersValidUserNam(String userName){

        LoginPage.enterUserName(userName);

    }
    @And("user enters valid passwor {string}")
    public void UserEntersValidPasswor(String password){
        LoginPage.enterPassword(password);
        BrowserUtils.waitFor(3);
    }
    @And("user clicks on Login butto")
    public void UserClicksOnLoginButton(){
        LoginPage.clickSubmitbutton();
        BrowserUtils.waitFor(3);
    }


    @When("{string} is selecte,")
    public void isSelecte(String arg0) {
      //  Assert.assertTrue(mainPage.ilanVer.isSelected());
    }

    @When("{string} should be visibl")
    public void shouldBeVisibl(String arg0) {
     //Assert.assertTrue(mainPage.ilanVer.isDisplayed());
    }

    @And("{string} is selected")
    public void isSelected(String arg0) {

    }

    @When("{string} should be visib")
    public void shouldBeVisib(String arg0) {
    }
}

