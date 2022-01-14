package com.kese.pages;

import com.kese.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingUpPage extends CommonPage{

    @FindBy(xpath = "//a[@href='/usage']")
    public WebElement usage;

    @FindBy(xpath = "//a[@href='/privacy']")
    public WebElement privacy;

    @FindBy(xpath = "//*[@class=\"mt-2 btn btn-danger btn-block w-100 \"]")
    public WebElement registerClick;

    @FindBy(xpath = "(//*[text()=\"Kayıt Ol\"])[2]")
    public WebElement kayitOlPage;

    @FindBy(xpath = "//*[@id=\"inputUsername\"]")
    public WebElement kullaniciAdi;

    @FindBy(xpath = "//*[@id=\"staticEmail\"]")
    public WebElement emailAdres;

    @FindBy(xpath = "//*[@id=\"sifre\"]")
    public WebElement sifre;

    @FindBy(xpath = "//*[@id=\"sifreTekrar\"]")
    public WebElement sifreTekrar;


}
