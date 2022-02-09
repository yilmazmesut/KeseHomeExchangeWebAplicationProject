package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends CommonPage {

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement logo;

    @FindBy(xpath = "(//span[text()='Kargo'])[1]")
    public WebElement CargoButton;

    @FindBy(xpath = "//span[text()='Kargo göndermek istediğiniz noktayı seçiniz']")
    public WebElement Cargomessage;


  // @FindBy(css = ".ms-3.btn.py-2.bg-white.border.d-inline")
   // public  WebElement LogButton;


    @FindBy(xpath = "//h2[text()='Popüler İlanlar']")
    public WebElement headerPopIlan;

    @FindBy(xpath = "//div[@class='tab-pane  active show']//a")
    public WebElement activeTab;






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
    @FindBy(xpath = "//span[text()='Birlikte Seyehat']")
    public WebElement BirlikteSeyehat;

    @FindBy(xpath = "//span[@class='d-block text-gray-1 font-weight-normal text-left mb-0']")
    public WebElement SeyehatEtmekIstediginizYeriSeciniz;

    @FindBy(xpath = "//div[@class=' css-tlfecz-indicatorContainer']")
    public WebElement selectDropDown;

    @FindBy(xpath = "(//span[@class='tabtext mt-2 mt-md-0 font-weight-semi-bold'])[4]")
    public WebElement bed;

    @FindBy(xpath = "//span[@class='d-block text-gray-1 font-weight-normal text-left mb-0']")
    public WebElement gitmek;
    @FindBy(linkText = "//i[@class='fas fa-home mr-1']")
    public WebElement ilanVer;
    @FindBy(xpath = "//a[@class='border d-flex align-items-center btn btn-white py-2  ']")
    public WebElement profilim;





    @FindBy(xpath = "(//span[text()='Oda Kirala'])[1]")
    public WebElement odaKiralaButton;

    @FindBy(xpath = "//span[text()='Oda değişimi yapmak istediğiniz yer']")
    public WebElement odaDegisimiYapmakIstediğinizYer;

    public void clickPopulerMenu (String menuTitle){

        String menuTitleLocatorText = "//span[text()='"+ menuTitle +"']";

        WebElement menuTitleLocator = Driver.get().findElement(By.xpath(menuTitleLocatorText));

        menuTitleLocator.click();



    }

    @FindBy   (xpath = "//a[contains(text(),'Giriş Yap')]")
    public WebElement girisyapButtonu;

    @FindBy (xpath="//li[@class='nav-item']/a[@style='cursor: pointer;']")
    public WebElement getHomechangeButton;



    @FindBy  (xpath = "//span[.='Ev değişimi yapmak istediğiniz yer']")

    public WebElement EvDegisimiYeriButton;


    @FindBy (id = "dropdownMenuButton")
    public WebElement dropdownMenuButton;

    @FindBy (css = "*[href='/new_bed_breakfast']")
    public WebElement bedAndBreakfastOption;

}



