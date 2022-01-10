package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends CommonPage {


    @FindBy(xpath = "//a[@href='/usage']")
    public WebElement usage;

    @FindBy(xpath = "//a[@href='/privacy']")
    public WebElement privacy;

    @FindBy(css = "input#inputUsername")
    public WebElement kullaniciAdi;

    @FindBy(css = "input#staticEmail")
    public WebElement emailAlani;

    @FindBy(css = "input#sifre")
    public WebElement sifreAlani;

    @FindBy(css = "input#sifreTekrar")
    public WebElement sifreTekrarAlani;

    @FindBy(xpath = "/html//input[@id='flexCheckChecked']")
    public WebElement kullanimKosullariCheckBox;

    @FindBy(xpath = "/html//div[@id='root']/section//form/div[6]")
    public WebElement kayitOlusturButton;

    private static final By girisYapButton = By.linkText("Giriş Yap");


    public static boolean girisYapButtonIsDisplayed() {
        return BrowserUtils.isDisplayed(girisYapButton);

    }

    public static boolean girisYapButtonIsEnabled() {
        return BrowserUtils.isEnabled(girisYapButton);

    }

    public static void clickGirisYapButton() {
        BrowserUtils.myClickMethod(girisYapButton);
    }


}
