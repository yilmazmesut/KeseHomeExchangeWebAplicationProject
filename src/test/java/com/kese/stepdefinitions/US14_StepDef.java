package com.kese.stepdefinitions;

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
        page.kullaniciAdi.sendKeys(kullaniciAdi);
    }

    @And("user types {string} to the email input")
    public void userTypesToTheEmailInput(String mail) {
        page.emailAlani.sendKeys(mail);
    }

    @And("user types {string} to the Sifre input")
    public void userTypesToTheSifreInput(String sifre) {
        page.sifreAlani.sendKeys(sifre);
    }

    @And("user types {string} to the Sifre Tekrari input")
    public void userTypesToTheSifreTekrariInput(String sifreTekrar) {
        page.sifreTekrarAlani.sendKeys(sifreTekrar);
    }

    @And("user click Kullanim Kosullari check box")
    public void userClickKullanimKosullariCheckBox() {
        page.kullanimKosullariCheckBox.click();
    }

    @Then("user verifies that Kayit Olustur button not be clickable")
    public void userVerifiesThatKayitOlusturButtonNotBeClickable() {
        WebElement element = page.kayitOlusturButton;
        try {
            assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            fail("Element not found: " + element);

        }
    }


}
