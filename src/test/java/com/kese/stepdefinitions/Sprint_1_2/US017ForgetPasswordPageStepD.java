package com.kese.stepdefinitions.Sprint_1_2;
import com.kese.pages.ForgetPasswordPage;
import com.kese.pages.LoginPage;
import com.kese.pages.MainPage;
import com.kese.pages.ForgetPasswordPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.ConfigurationReader;
import com.kese.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US017ForgetPasswordPageStepD {

    ForgetPasswordPage forgotPasswordPage =new ForgetPasswordPage();

   /* @Given("The user logs in to urlforgotpassword")
    public void the_user_logs_in_to_forgot_password() {

    }*/

    @Given("User goes to test kese url")
    public void user_goes_to_test_kese_url() {
        Driver.get().get(ConfigurationReader.get("url"));
        // BrowserUtils.waitFor(3000);
    }

    @Then("User clicks on Login button")
    public void user_clicks_on_Login_button() {
        forgotPasswordPage.girisyapButtonu.click();
    }



    @Then("The user clicks the {string} button")
    public void the_user_clicks_the_button(String string) {
        forgotPasswordPage.getSifremiUnuttumButtonu.click();

    }


    @Then("User enters valid e-mail address")
    public void user_enters_valid_e_mail_address() {

        WebElement emailbox=Driver.get().findElement(By.xpath("//input[@class='form-control ']"));
        emailbox.sendKeys("kullanici1@gmail.com");
    }



    @Then("User clicks on Change Password button")
    public void user_clicks_on_Change_Password_button() {
        forgotPasswordPage.sifremiDegistirButton.click();

    }

    @Then("The user sees the {string} button")
    public void the_user_sees_the_button(String string) {
        Assert.assertTrue(forgotPasswordPage.sifremiDegistirButton.isEnabled());

    }



    @Given("User sees change my password text")
    public void user_sees_change_my_password_text() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(forgotPasswordPage.girisSayfasinaYonlendirme.isDisplayed());

        forgotPasswordPage.girisSayfasinaYonlendirme.click();



    }



}