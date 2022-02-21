package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KargoPage extends CommonPage{

    @FindBy(xpath = "//*[contains(text(),'İlerle')]")
    public WebElement ilerleButton;
    // 1st page
    @FindBy(xpath = "//*[contains(text(),'Zarf')]")
    public WebElement step1_Zarf;
    // 2nd page
    @FindBy(xpath = "(//*[contains(text(),'Select...')])[1]")
    public WebElement step2_selectText1;
    // 2nd page
    @FindBy(id = "react-select-2-input")
    public WebElement step2_selectText1Input;
    // 2nd page
    @FindBy(xpath = "(//*[contains(text(),'Select...')])[2]")
    public WebElement step2_selectText2;
    // 2nd page
    @FindBy(id = "react-select-3-input")
    public WebElement step2_selectText2Input;
    // 2nd page
    @FindBy(xpath = "(//*[contains(text(),'Select...')])[3]")
    public WebElement step2_selectText3;
    // 2nd page
    @FindBy(id = "react-select-4-input")
    public WebElement step2_selectText3Input;
    // 3rd page
    @FindBy(id = "car")
    public WebElement step3_kargoBilgileriTextBox;

    @FindBy(xpath = "//small[@class='ps-2']")
    public WebElement missingInfoWarningText;

//   msen
    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement page4NumberOfTheStep;

    @FindBy(xpath = "//*[contains(text(),'Kargo Tarihi ve Zamanı')]")
    public WebElement page4KargoTarihiVeZamani;

    @FindBy(xpath = "//*[contains(text(),'Seyehat planınız ne zaman')]")
    public WebElement page4SeyehatPlaniniAciklamasi;

    @FindBy(xpath = "//*[contains(text(),'')]")
    public WebElement page4TarihSec1;








}
