package com.kese.pages;

import com.kese.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US20SignupPage {
    public US20SignupPage() {
        PageFactory.initElements(Driver.get(), this);
    }

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
}
