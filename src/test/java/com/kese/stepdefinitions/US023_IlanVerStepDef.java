package com.kese.stepdefinitions;

import com.kese.pages.LoginPage;
import com.kese.pages.MainPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class US023_IlanVerStepDef {

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

  @When("{string} is selected, {string} should be visible")
    public void is_selected_should_be_visible(String string, String string2) {
      Assert.assertTrue(mainPage.ilanVer.isSelected());
      Assert.assertTrue(mainPage.ilanVer.isDisplayed());
    }



    @When("{string} is selected, {string} should be")
    public void isSelectedShouldBe(String arg0, String arg1) {
    }

    @And("The user clicks Login button")
    public void theUserClicksLoginButton() {

    }


    @When("{string} should be visibl")
    public void shouldBeVisibl(String arg0) {
        Assert.assertTrue(mainPage.profilim.isDisplayed());
    }

    @And("{string} is selected")
    public void isSelected(String arg0) {
        Assert.assertTrue(mainPage.profilim.isSelected());
    }
}