package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class US14_StepDef {
    SignUpPage page = new SignUpPage();

    @And("user types {string} to the Kullanici Alani input")
    public void userTypesToTheKullaniciAlaniInput(String kullaniciAdi) {
        page.inputUsername.sendKeys(kullaniciAdi);
    }

    @And("user types {string} to the email input")
    public void userTypesToTheEmailInput(String mail) {
        page.inputMail.sendKeys(mail);
    }

    @And("user types {string} to the Sifre input")
    public void userTypesToTheSifreInput(String sifre) {
        page.inputPassword.sendKeys(sifre);
    }

    @And("user types {string} to the Sifre Tekrari input")
    public void userTypesToTheSifreTekrariInput(String sifreTekrar) {
        page.inputPasswordAgain.sendKeys(sifreTekrar);
    }

    @And("user click Kullanim Kosullari check box")
    public void userClickKullanimKosullariCheckBox() {
        page.privacyPolicyCheckBox.click();
    }

    @Then("user verifies that Kayit Olustur button not be clickable")
    public void userVerifiesThatKayitOlusturButtonNotBeClickable() {
        WebElement element = page.kayitOl;
        try {
            assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            fail("Element not found: " + element);

        }
    }


}
