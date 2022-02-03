package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BedAndBreakfastPage extends CommonPage {

    @FindBy(xpath = "//h2[contains(text(),'Resim ve Fotoğraflar')]")
    public WebElement ResimVeFotograf;


}
