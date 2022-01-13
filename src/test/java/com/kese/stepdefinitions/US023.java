package com.kese.stepdefinitions;

import com.kese.pages.LoginPage;
import com.kese.pages.MainPage;
import com.kese.pages.SignUpPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class US023 {

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

                       @When("{string} is selected,{string} should be visible")
                        public void IsSelected(String arg0, String arg1){
                           Assert.assertTrue(mainPage.ilanVer.isSelected());
                           Assert.assertTrue(mainPage.ilanVer.isDisplayed());
                        }
                        @And("The user clicks {string} button")
                        public void ThUserClicks(String arg0){
                       mainPage.profilim.isSelected();
                       }

                       @When("{string}should be visible")
                       public void IsSelectedShouldBeVisible(String arg1) {

                          Assert.assertTrue(mainPage.profilim.isDisplayed());
                      }
                    }