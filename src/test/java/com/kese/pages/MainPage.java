package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends CommonPage {

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement logo;



    //is Displayed method
    public static boolean linkTextIsDisplayed(String link) {
        By linkText = By.linkText(link);
        return BrowserUtils.isDisplayed(linkText);

    }

    //click method
    public static void clickLinktext(String link) {
        By element = By.linkText(link);
        BrowserUtils.myClickMethod(element);

    }


}