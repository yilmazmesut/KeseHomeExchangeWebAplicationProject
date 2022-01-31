package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.LoginPage;
import com.kese.pages.MainPage;
import com.kese.pages.SignUpPage;
import com.kese.utilities.ConfigurationReader;
import com.kese.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import javax.security.auth.login.Configuration;
import javax.xml.xpath.XPath;

public class US13SignUpPageCheck {
    SignUpPage signUpPage = new SignUpPage();
    MainPage mainPage = new MainPage();

    @Given("Kullanici {string} sayfasina gider")
    public void ukullaniciSayfasinaGider(String loginPageUrl) {

        Driver.get().get(loginPageUrl);
    }

    @And("Giris Yap butonua tikla")
    public void girisYapButonuaTikla() {
        mainPage.girisYapButton.click();
    }

    @Then("{string} sayfasina gelir")
    public void sayfasinaGelir(String arg0) {
    }


    @And("Kayit Ol butonuna tikla")
    public void kayitOlButonunaTikla() {
        signUpPage.registerClick.click();
    }

    @Then("{string} sayfasina gider")
    public void sayfasinaGider(String arg0) {
        Assert.assertTrue(signUpPage.kayitOlPage.isDisplayed());
    }


    @Given("Kullanici {string} yerine {string} yazar")
    public void kullaniciYerineYazar(String arg0, String arg1) {
       signUpPage.kullaniciAdi.sendKeys(ConfigurationReader.get("kullaniciAdiKayitOlPage"));
       Assert.assertTrue("Kullanıcı Adı",signUpPage.kullaniciAdi.isDisplayed());
    }

    @Given("Kullanici email@gmail.com kismina admin@gmail.com girilir")
    public void kullaniciEmailGmailComKisminaAdminGmailComGirilir() {
        signUpPage.emailAdres.sendKeys(ConfigurationReader.get("emailadresiKayitOlPage"));
        Assert.assertTrue("email@gmail.com",signUpPage.emailAdres.isDisplayed());
    }

    @Given("Kullanici Sifre kismina Admin{int}.girilir")
    public void kullaniciSifreKisminaAdminGirilir(int arg0) {
        signUpPage.sifre.sendKeys(ConfigurationReader.get("sifreKayitOlPage"));
        Assert.assertTrue("Şifre",signUpPage.sifre.isDisplayed());
    }

    @Given("Kullanici bir onceki adimda girdigimiz sifre Admin{int}.buraya da girilir")
    public void kullaniciBirOncekiAdimdaGirdigimizSifreAdminBurayaDaGirilir(int arg0) {
        signUpPage.sifreTekrar.sendKeys(ConfigurationReader.get("sifreTekrarKayitOlPage"));
        Assert.assertTrue("Şifre tekrarı",signUpPage.sifreTekrar.isDisplayed());

    }

    @Given("default email adresinde email@gmail.com yazili oldugunu kontrol edilir")
    public void defaultEmailAdresindeEmailGmailComYaziliOldugunuKontrolEdilir() {
        Assert.assertTrue("email@gmail.com",signUpPage.emailAdres.isDisplayed());
    }
}
