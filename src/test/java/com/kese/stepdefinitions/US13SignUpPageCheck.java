package com.kese.stepdefinitions;

import com.kese.pages.LoginPage;
import com.kese.pages.MainPage;
import com.kese.pages.SingUpPage;
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
    SingUpPage singUpPage = new SingUpPage();
    MainPage mainPage = new MainPage();

    @Given("Kullanici {string} sayfasina gider")
    public void ukullaniciSayfasinaGider(String loginPageUrl) {

        Driver.get().get(loginPageUrl);
    }

    @And("Giris Yap butonua tikla")
    public void girisYapButonuaTikla() {
        mainPage.loginClick.click();
    }

    @Then("{string} sayfasina gelir")
    public void sayfasinaGelir(String arg0) {
    }


    @And("Kayit Ol butonuna tikla")
    public void kayitOlButonunaTikla() {
        singUpPage.registerClick.click();
    }

    @Then("{string} sayfasina gider")
    public void sayfasinaGider(String arg0) {
        Assert.assertTrue(singUpPage.kayitOlPage.isDisplayed());
    }


    @Given("Kullanici {string} yerine {string} yazar")
    public void kullaniciYerineYazar(String arg0, String arg1) {
       singUpPage.kullaniciAdi.sendKeys(ConfigurationReader.get("kullaniciAdiKayitOlPage"));
       Assert.assertTrue("Kullanıcı Adı",singUpPage.kullaniciAdi.isDisplayed());
    }

    @Given("Kullanici email@gmail.com kismina admin@gmail.com girilir")
    public void kullaniciEmailGmailComKisminaAdminGmailComGirilir() {
        singUpPage.emailAdres.sendKeys(ConfigurationReader.get("emailadresiKayitOlPage"));
        Assert.assertTrue("email@gmail.com",singUpPage.emailAdres.isDisplayed());
    }

    @Given("Kullanici Sifre kismina Admin{int}.girilir")
    public void kullaniciSifreKisminaAdminGirilir(int arg0) {
        singUpPage.sifre.sendKeys(ConfigurationReader.get("sifreKayitOlPage"));
        Assert.assertTrue("Şifre",singUpPage.sifre.isDisplayed());
    }

    @Given("Kullanici bir onceki adimda girdigimiz sifre Admin{int}.buraya da girilir")
    public void kullaniciBirOncekiAdimdaGirdigimizSifreAdminBurayaDaGirilir(int arg0) {
        singUpPage.sifreTekrar.sendKeys(ConfigurationReader.get("sifreTekrarKayitOlPage"));
        Assert.assertTrue("Şifre tekrarı",singUpPage.sifreTekrar.isDisplayed());

    }

    @Given("default email adresinde email@gmail.com yazili oldugunu kontrol edilir")
    public void defaultEmailAdresindeEmailGmailComYaziliOldugunuKontrolEdilir() {
        Assert.assertTrue("email@gmail.com",singUpPage.emailAdres.isDisplayed());
    }
}
