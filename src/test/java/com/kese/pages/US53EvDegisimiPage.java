package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US53EvDegisimiPage extends CommonPage{

    @FindBy (xpath = "//*[contains(text(), 'Resimleri Kaydet')]")
    public WebElement step10_ResimleriKaydetButton;

    @FindBy (xpath = "//*[contains(text(), 'İlanı Yayınla')]")
    public WebElement step10_publishAdButton; // ilani yayinla butonu

    @FindBy (xpath = "//*[contains(text(), 'Resim Ekle')]")
    public WebElement step10_addImageFrame; // resim ekle cercevelerinin ortak locatoru.
                                            // bu cerceve yoksa resim ekleyemiyoruz
}
