package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import org.openqa.selenium.By;
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

    //nrsl

    @FindBy (css = "#dropdownMenuButton")
    public WebElement ilanVerDropdownMenu;



    public void clickItemIlanVerDropdownMenu(String itemName) {

        String ilanVerItemLocator = "//a[.=' " + itemName + "' and @class='dropdown-item']";
        BrowserUtils.waitForClickability(By.xpath(ilanVerItemLocator), 2);
        Driver.get().findElement(By.xpath(ilanVerItemLocator)).click();

    }

    public void clickItemProfilimDropdownMenu(String itemName) {

        String profilimItemLocator = "//a[.=' " + itemName + " and @class='dropdown-item1']";

        BrowserUtils.waitForClickability(By.xpath(profilimItemLocator), 2);
        WebElement profilimMenuElement = Driver.get().findElement(By.xpath(profilimItemLocator));

        profilimMenuElement.click();

    }






}
