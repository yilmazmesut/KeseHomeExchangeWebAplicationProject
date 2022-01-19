package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class  ForgetPasswordPage extends CommonPage{

    @FindBy(xpath = "//input[@class='form-control ']")
    public WebElement emailInputBox;


}
