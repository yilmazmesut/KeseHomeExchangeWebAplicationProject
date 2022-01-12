package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends CommonPage{

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement logo;

    @FindBy(xpath = "//h2[text()='Popüler İlanlar']")
    public WebElement headerPopIlan;

    @FindBy(xpath = "//div[@class='tab-pane  active show']//a")
    public WebElement activeTab;
}
