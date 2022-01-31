package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.LoginPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class US010loginPageStepDef {

        WebElement emailBoxInput = Driver.get().findElement(LoginPage.emailInputBox);
        WebElement sifreBoxInput = Driver.get().findElement(LoginPage.passwordInputBox);


        @And("User can click to email input")
        public void userCanClickToEmailInput() {
                emailBoxInput.click();
                Assert.assertTrue(emailBoxInput.isEnabled());
        }

        @Then("User can write {string} in the email input")
        public void userCanWriteInTheEmailInput(String email) {
                emailBoxInput.sendKeys(email);
                Assert.assertTrue(emailBoxInput.isDisplayed());
        }

        @And("User can click to sifre input")
        public void userCanClickToSifreInput() {
                sifreBoxInput.click();
                Assert.assertTrue(sifreBoxInput.isEnabled());
        }

        @Then("User can write {string} in the sifre input")
        public void userCanWriteInTheSifreInput(String sifre) {
                sifreBoxInput.sendKeys(sifre);
                Assert.assertTrue(sifreBoxInput.isDisplayed());
        }

        @Then("Assure the {string} default email text")
        public void assureTheDefaultEmailText(String emailText) {
                System.out.println(emailBoxInput.getAttribute("placeholder"));//Email giriniz
                BrowserUtils.waitFor(2);
                String attributeText =emailBoxInput.getAttribute("placeholder");
                //Assert.assertEquals(attributeText,emailText);
                Assert.assertTrue(attributeText.contains(emailText));
        }

        @Then("Assure the {string} default sifre text")
        public void assureTheDefaultSifreText(String text) {
                System.out.println(sifreBoxInput.getAttribute("placeholder"));//Şifrenizi giriniz
                BrowserUtils.waitFor(2);
                String attributeText =sifreBoxInput.getAttribute("placeholder");
                Assert.assertEquals(attributeText,text);
              // Assert.assertTrue(attributeText.contains(text));
        }














/*
        public void elementIsEnable(String str){
                String path = "//a[@href ='/" +str+ "']";
                Assert.assertTrue(Driver.getDriver().findElement(By.xpath(path)).isEnabled());

        }

        public void elementIsDisplayed(String str){
                String path = "//a[@href ='/" +str+ "']";
                Assert.assertTrue(Driver.getDriver().findElement(By.xpath(path)).isDisplayed());

        }
@FindBy(xpath = "//span[@class='tabtext font-weight-semi-bold'][.='Ev Değişimi']")
    public WebElement homeExchangeButtonUnderPopularPosting;
    @FindBy(xpath = "//span[@class='tabtext font-weight-semi-bold'][.='Oda Kirala']")
    public WebElement roomRentalButtonUnderPopularPosting;
public WebElement choosePosting(String postingModule) {

        return Driver.getDriver().findElement
                (By.xpath("//span[@class='tabtext font-weight-semi-bold'][.='"+postingModule+"']"));

    }


*/








}

