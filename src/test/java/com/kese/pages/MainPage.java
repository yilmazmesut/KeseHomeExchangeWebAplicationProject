package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends CommonPage{

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement logo;


    @FindBy(xpath = "(//span[text()='Kargo'])[1]")
    public WebElement CargoButton;

    @FindBy(xpath = "//span[text()='Kargo göndermek istediğiniz noktayı seçiniz']")
    public WebElement Cargomessage;

    // @FindBy(linkText = "/login")
    @FindBy(css = ".ms-3.btn.py-2.bg-white.border.d-inline")
    public  WebElement LogButton;





}
