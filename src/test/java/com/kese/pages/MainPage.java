package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends CommonPage {

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement logo;

    @FindBy(xpath = "//h1[text()='Seyahatin Tadını Çıkartın!']")
    public WebElement slogan;

    @FindBy(xpath = "//a[text()='Giriş Yap']")
    public WebElement girisYapButton;



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


    //US04 e ait locatorlar
    @FindBy(xpath = "//a[@class='nav-link font-weight-medium active border-0 rounded-3 bg-success  pl-md-5 pl-3']")
    public WebElement BirlikteSeyehat;

    @FindBy(xpath = "//span[@class='d-block text-gray-1 font-weight-normal text-left mb-0']")
    public WebElement SeyehatEtmekIstediginizYeriSeciniz;

    @FindBy(xpath = "//div[@class=' css-tlfecz-indicatorContainer']")
    public WebElement selectDropDown;
}