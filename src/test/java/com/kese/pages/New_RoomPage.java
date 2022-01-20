package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class New_RoomPage {

    //OdaKiralaPage 4/10 Locators - Sevda
    @FindBy(xpath = "//span[text()='10-15']")
    public WebElement page4Age1;

    @FindBy(xpath = "//span[text()='16-20']")
    public WebElement page4Age2;

    @FindBy(xpath = "//span[text()='21-25']")
    public WebElement page4Age3;

    @FindBy(xpath = "//span[text()='26-35']")
    public WebElement page4Age4;

    @FindBy(xpath = "//span[text()='36-45']")
    public WebElement page4Age5;

    @FindBy(xpath = "//span[text()='46-65']")
    public WebElement page4Age6;

    @FindBy(xpath = "//span[text()='65+']")
    public WebElement page4Age7;

    @FindBy(xpath = "(//span[text()='Farketmez'])[1]")
    public WebElement page4AgeFarketmez;

    @FindBy(xpath = "//span[text()='Kadin']")
    public WebElement page4GenderKadin;

    @FindBy(xpath = "//span[text()='Erkek']")
    public WebElement page4GenderErkek;

    @FindBy(xpath = "(//span[text()='Farketmez'])[2]")
    public WebElement page4GenderFarketmez;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement page4KisiSayisiMinus;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement page4KisiSayisiPlus;
}
