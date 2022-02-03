package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BedAndBreakfastPage extends CommonPage {

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[1]")
    public WebElement bedAndBreakfastp1Mustakil;
    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[1]")
    public WebElement bedAndBreakfastp1Apartman;
    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[1]")
    public WebElement bedAndBreakfastp1Studyo;
    @FindBy(xpath = "//*[text()='Odanız hangi ev türünde yer alıyor , belirtiniz.']")
    public WebElement bedAndBreakfastp1HouseTypeQuestion;
    @FindBy(xpath = "//*[text()='*Lütfen ev tipini seçiniz.']")
    public WebElement bedAndBreakfastp1HouseTypeWarning;

}
