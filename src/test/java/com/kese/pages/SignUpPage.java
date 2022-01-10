package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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



}
