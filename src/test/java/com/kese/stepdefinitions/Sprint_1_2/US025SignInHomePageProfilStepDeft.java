package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.SignedInHomePage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US025SignInHomePageProfilStepDeft {

    SignedInHomePage kese =new SignedInHomePage();

    @When("Click GirişYap Button")
    public void click_GirişYap_Button() {
        BrowserUtils.waitForPageToLoad(3);
        kese.LogButton.click();
    }

    @When("Enter email and password")
    public void enter_email_and_password() {
        kese.EmailBox.sendKeys("ekay62682@gmail.com");
        kese.passwordBox.sendKeys("e991521k");
    }

    @When("Click Giriş Yap Button")
    public void click_Giriş_Yap_Button() {
        kese.LoginButton.click();

    }


    @And("Click Profilim Button")
    public void clickProfilimButton() {
        kese.ProfilimButton.click();

    }







    @Then("Dropdown menu show")
    public void dropdown_menu_show() {

        Assert.assertTrue(kese.Dropdown.isDisplayed());

    }

    @Then("Click {string} button")
    public void click_button(String buttonName) {


        //  Driver.get().findElement(By.xpath("//span[.='"+buttonName+"']")).click();

        BrowserUtils.waitFor(5);
        WebElement myButton;
        switch (buttonName) {

            case "mesajlar": {
                myButton = kese.message;
                myButton.click();
                break;
            }
            case "ilanlarım": {
                myButton = kese.ads;
                myButton.click();
                break;
            }

            case "Referans Ol": {
                myButton = kese.referance;
                myButton.click();
                break;
            }

        }
    }

    @Then("user should go to {string} page")
    public void user_should_go_to_page(String buttonName) {
        //  Driver.get().findElement(By.xpath("//span[.='"+buttonName+"']")).click();

        BrowserUtils.waitFor(5);
        WebElement myButton;
        switch (buttonName) {

            case "/profile/message": {
                String expected="/profile/message";
                String actual=Driver.get().getCurrentUrl();
                Assert.assertTrue(actual.contains(expected));
                break;

            }
            case "/profile/listofilans": {
                String expected="/profile/listofilans";
                String actual=Driver.get().getCurrentUrl();
                Assert.assertTrue(actual.contains(expected));

                break;
            }

            case "/profile/reference": {
                String expected="/profile/reference";
                String actual= Driver.get().getCurrentUrl();
                Assert.assertTrue(actual.contains(expected));
                break;
            }


        }
    }



}
