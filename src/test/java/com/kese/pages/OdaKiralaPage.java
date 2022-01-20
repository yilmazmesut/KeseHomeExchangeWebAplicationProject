package com.kese.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OdaKiralaPage extends CommonPage {


    /*

        * ARKADASLAR LUTFEN KENDI KODLARINIZI YAZMADAN ONCE MASTER BRANCHE DEN FETCHE YAPTIGINIZDAN VE
    KENDI BRANCHE INIZIN UPDATE OLDUGUNDAN EMIN OLALIM

        * KENDI CALISTIGIMIZ DOSYALAR HARICINDE BASKA DOSYALAR UZERINDE KI BASKALARININ YAZDIGI KODLAR
        UZERINDE DEGISIKLIK YAPMAYALIM.

        *   - FEATURE FILE ISIMLENDIRMEMIZIN --> US51KeseSignUpPage.feature
            - STEP DEFINITION CLASS IMIZINDA --> US51KeseSignUpPageStepD seklinde oldugundan emin olalim.

        * TESTLERIMIZI RUNNER CLASS TA CALISTIRMAK VE RAPOR ALMAK ISTIYORSAK KENDI RUNNER CLASSIMIZI
        OZEL OLUSTURARAK CALISTIRIP RAPORLARIMIZI GORDUKTEN SONRA HEM KENDI RUNNER CLASSIMIZI HEM DE
        OLUSAN RAPORLARI SILDIKTEN SONRA PUSH YAPALIM

        * GITHUB DONGUMUZDE KODLAMAYA BASLAMADAN ONCE REMOTE MASTER BRANCHE DAN LOCAL MASTER BRANCHEMIZE FETCH YAPARAK
        ONCE LOCAL MASTER IMIZI GUNCELLEMELI, DAHA SONRA KENDI LOCAL BRANCHE IMIZE GECEREK LOCAL BRANCHE IMIZI DE
        UPDATE ETMELI VE YENI KODLARIMIZI YAZMAYA BASLAMALI BITIRDIKTEN SONRA REMOTE BRANCHE PUSH YAPMALI VE BU DONGUYU
        PROJE BOYUNCA DEVAM ETTIRMELIYIZ.



    * */

    @FindBy(xpath = "//*[text()='Odanız hangi ev türüde yer alıyor, belirtiniz.']")
    public WebElement page1RoomOdanizHangiEvWritings;

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[1]")
    public WebElement page1RoomMustakilEv;

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[2]")
    public WebElement page1RoomApartman;

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[3]")
    public WebElement page1RoomStudyo;

    @FindBy(xpath = "//*[text()='Değişim & Kirala']")
    public WebElement page1RoomDegisimKiraTitle;

    @FindBy(xpath = "//*[text()='Odanızla ilgili tercihinizi belirtiniz. Eğer sizin için uygunsa iki seçeneği de işaretleyebilirsiniz.']")
    public WebElement page1RoomTercihWriting;

    @FindBy(xpath = "(//label[@class='form-check-label'])[1]")
    public WebElement page1RoomKiraBoxWriting;

    @FindBy(xpath = "(//label[@class='form-check-label'])[2]")
    public WebElement page1RoomDegisimBoxWriting;

    @FindBy(xpath = "(//input[@class='form-check-input'])[1]")
    public WebElement page1RoomKiraBox;

    @FindBy(xpath = "(//input[@class='form-check-input'])[2]")
    public WebElement page1RoomDegisimBox;

    @FindBy(xpath = "//img[@src='ilanver/room.png']")
    public WebElement page1RoomImage;

}
