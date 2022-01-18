package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class  ForgetPasswordPage extends CommonPage{

    @FindBy(xpath = "//input[@class='form-control ']")
    public WebElement emailInputBox;




/* @FindBy ( xpath = "//input[@placeholder='E-mail adresinizi giriniz']")
 public WebElement emailbutonu;*/

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sifremiDegistirButton;

    // @FindBy(linkText = "//*[contains(text(),'Giriş Sayfasına Git')]")

    @FindBy(xpath = "//a[@class='text-decoration-underline']")
    public WebElement girisSayfasinaYonlendirme;

    @FindBy (xpath = "//*[contains(text(),'Şifremi Unuttum')]")
    public WebElement getSifremiUnuttumButtonu;

    @FindBy(xpath = "//a[contains(text(),'Giriş Yap')]")
    public WebElement girisyapButtonu;
}
}
