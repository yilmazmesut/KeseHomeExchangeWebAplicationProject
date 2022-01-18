package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends CommonPage{


    @FindBy(xpath = "//a[@href='/usage']")
    public WebElement usage;

    @FindBy(xpath = "//a[@href='/privacy']")
    public WebElement privacy;

    @FindBy( id = "inputUsername")
    public WebElement inputUsername;

    @FindBy( id = "staticEmail")
    public WebElement inputMail;

    @FindBy( id = "sifre")
    public WebElement inputPassword;

    @FindBy( id = "sifreTekrar")
    public WebElement inputPasswordAgain;

    @FindBy( id = "flexCheckChecked")
    public WebElement privacyPolicyCheckBox;

    @FindBy ( xpath = "//button[@type='submit']")
    public WebElement signUpButton;       //Kayit olustur butonu

    @FindBy( xpath = "//button[contains(text(),'Giriş Yap')]")
    public WebElement girisYapButtonOnSignInPage;

    @FindBy( className = "btn-danger")
    public WebElement kayitOl;

    @FindBy(xpath="//input[@type='text']")
    public WebElement SignupUserInput;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement SignupEmailBox;

    @FindBy(xpath = "//input[@id='sifre']")
    public WebElement SignupPasswordBox;

    @FindBy(xpath = "//input[@id='sifreTekrar']")
    public WebElement SignupPasswordBox2;

    @FindBy(xpath = "//div[@class='d-flex justify-content-center align-items-center']")
    public WebElement SignupButton;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement CheckBox;










    private static final By girisYapButton = By.linkText("Giriş Yap");


    public static boolean girisYapButtonIsDisplayed(){
        return BrowserUtils.isDisplayed(girisYapButton);

    }

    public static boolean girisYapButtonIsEnabled(){
        return BrowserUtils.isEnabled(girisYapButton);

    }

    public static void clickGirisYapButton(){
        BrowserUtils.myClickMethod(girisYapButton);
    }

    @FindBy(xpath = "//*[@class=\"mt-2 btn btn-danger btn-block w-100 \"]")
    public WebElement registerClick;

    @FindBy(xpath = "(//*[text()=\"Kayıt Ol\"])[2]")
    public WebElement kayitOlPage;

    @FindBy(xpath = "//*[@id=\"inputUsername\"]")
    public WebElement kullaniciAdi;

    @FindBy(xpath = "//*[@id=\"staticEmail\"]")
    public WebElement emailAdres;

    @FindBy(xpath = "//*[@id=\"sifre\"]")
    public WebElement sifre;

    @FindBy(xpath = "//*[@id=\"sifreTekrar\"]")
    public WebElement sifreTekrar;

}
