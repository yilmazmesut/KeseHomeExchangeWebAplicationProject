package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US53EvDegisimiPage extends CommonPage{

    @FindBy (xpath = "//*[contains(text(), 'Resimleri Kaydet')]")
    public WebElement step10_ResimleriKaydetButton;

    @FindBy (xpath = "//*[contains(text(), 'İlanı Yayınla')]")
    public WebElement step10_publishAdButton; // ilani yayinla butonu

    @FindBy (xpath = "//*[contains(text(), 'Resim Ekle')]")
    public WebElement step10_addImageText; // resim ekle yazisinin ortak locatoru.

    @FindBy (css = ".border div.rounded")
    public List<WebElement> step10_loadedImages;   // Tum yuklenmis resimlerin listesi

    @FindBy (css = "div.col-6 div")
    public List<WebElement>  step10_imageFrames;    // Resim ekleme cerceveleri
}
