package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import org.bouncycastle.pqc.jcajce.provider.qtesla.QTESLAKeyFactorySpi;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EvDegisimiPage extends CommonPage {

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



    @FindBy(xpath = "//button[contains(text(),'Geri')]")
    public WebElement geriButton;

    @FindBy(xpath = "//a[contains(text(),'İlerle')]")
    public WebElement ilerleButton;

    @FindBy(id = "react-select-2-input")
    public WebElement page2konumBelirtinizTextBox;

    @FindBy(xpath = "descendant::input[2]")
    public WebElement page2evIleOtobusDuragiArasi;

    @FindBy(xpath = "descendant::input[3]")
    public WebElement page2evIleTrenIstasyonArasi;

    @FindBy(xpath = "descendant::input[4]")
    public WebElement page2evIleTramvayDuragiArasi;

    @FindBy(xpath = "descendant::input[5]")
    public WebElement page2sahsiAracCheckButton;


    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement page10locationStepTextBox;

    @FindBy(xpath = "//h2[contains(text(),'Resim ve Fotoğraflar')]")
    public WebElement page10TitleName;

    @FindBy(xpath = "//p[contains(text(),'Evinizde müsait olan odaların ve/veya kullandırmak')]")
    public WebElement page10ExplainTextBox;

    @FindBy(xpath = "//button[normalize-space()='Resimleri Seçin']")
    public WebElement page10SelectedPictureButton;

    @FindBy(xpath = "//button[contains(text(),'Tüm Resimleri Kaldır')]")
    public WebElement page10RemoveAllPicturesButton;

    @FindBy(xpath = "//small[normalize-space()='En az 5 en fazla 10 resim yükleyebilirsiniz.']")
    public WebElement page10UploadMinimumAndMaximumImages;

    @FindBy(xpath = "//div[@class='d-flex flex-column align-items-center']//i[@class='far fa-3x fa-image']")
    public WebElement page10UploadingFirstImage;

    @FindBy(xpath = "//label[contains(@for,'file-upload2')]//i[contains(@class,'far fa-3x fa-image')]")
    public WebElement getPage10UploadingSecondImage;



}
