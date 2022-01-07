package com.kese.pages;

import com.kese.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingUpPage {
    public SingUpPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[@href='/usage']")
    public WebElement usage;

    @FindBy(xpath = "//a[@href='/privacy']")
    public WebElement privacy;



}
