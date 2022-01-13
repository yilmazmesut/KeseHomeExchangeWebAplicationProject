package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignedInHomePage extends CommonPage {

    @FindBy(css = ".ms-3.btn.py-2.bg-white.border.d-inline")
    public  WebElement LogButton;

    @FindBy(xpath = "//input[@placeholder='Email giriniz']")
    public WebElement EmailBox;

    @FindBy(xpath = "//input[@placeholder='Şifrenizi giriniz']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement LoginButton;

    @FindBy(id = "dropdownMenuButton1")
    public WebElement ProfilimButton;

    @FindBy(css = ".dropdown-menu.show")
    public WebElement Dropdown;

    @FindBy(xpath = "(//i[@class='fas fa-caret-right'])[6]")
    public WebElement message;

    @FindBy(xpath = "(//i[@class='fas fa-caret-right'])[7]")
    public WebElement ads;

    @FindBy(xpath = "(//i[@class='fas fa-caret-right'])[8]")
    public WebElement referance;

    @FindBy (css = ".text-primary.d-none.d-md-block")
    public WebElement undo;


}
