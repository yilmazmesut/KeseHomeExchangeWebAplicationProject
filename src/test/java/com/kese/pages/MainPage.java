package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends CommonPage{

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement logo;
}
