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



}
