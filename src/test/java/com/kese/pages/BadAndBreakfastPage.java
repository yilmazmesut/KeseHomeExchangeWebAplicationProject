package com.kese.pages;

import com.kese.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BadAndBreakfastPage extends CommonPage {












































































































/*******PAGE10*********/

    @FindBy(xpath = "//*[contains(text(), 'Resimleri Kaydet')]")
    public WebElement page10ResimleriKaydetButton;

    @FindBy (xpath = "//*[contains(text(), 'İlanı Yayınla')]")
    public WebElement page10publishAdButton; // ilani yayinla butonu

    @FindBy(xpath = "//button[contains(text(),'Tüm Resimleri Kaldır')]")
    public WebElement page10RemoveAllPicturesButton;

    @FindBy(xpath = "//h2[contains(text(),'Resim ve Fotoğraflar')]")
    public WebElement page10TitleName;

    @FindBy(xpath = "//p[contains(text(),'En fazla 10 adet fotoğraf ekleyebilirsiniz')]")
    public WebElement page10ExplainTextBox;

    @FindBy(xpath = "//button[contains(text(),'Resimleri Seçin')]")
    public WebElement page10ResimleriSecinButton;

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement page10StepTextBox;

    public void pictureLoaded(int pictureNum) {
        String pictureLoadedLocator = "(//div[@class = 'rounded '])[" + pictureNum + "]";
        WebElement page10PictureLocator = Driver.get().findElement(By.xpath(pictureLoadedLocator));
    }
    public void pictureFrame(int frameNum) {
        String pictureFrameLocator = "//label[@for='file-upload"+frameNum+"']";
        WebElement page10PictureFrameLocator = Driver.get().findElement(By.id(pictureFrameLocator));
    }


}


