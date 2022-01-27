package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class US011LoginPage extends CommonPage {

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginPageBelowGirisYapButton;

    @FindBy (xpath = "//a[@href='/signup']")
    public WebElement loginPageKayitOlButton;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement loginPageEmailInput;

    @FindBy (xpath = "//input[@name='sifre']")
    public WebElement loginPagePasswordInput;

    

    //nrs
    public void login (String email, String password) {
        BrowserUtils.waitFor(1);
        loginPageEmailInput.sendKeys(email);
        loginPagePasswordInput.sendKeys(password);
        loginPageBelowGirisYapButton.click();

    }
    public void clickMenuItemProfilimLink(String itemName) {

        String menuItemLocator = "//a[.=' " + itemName + "']";

        BrowserUtils.waitForClickability(By.xpath(menuItemLocator), 2);
        WebElement menuElement = Driver.get().findElement(By.xpath(menuItemLocator));

        menuElement.click();

    }

    }





