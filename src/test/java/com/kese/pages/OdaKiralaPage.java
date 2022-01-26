package com.kese.pages;

import com.kese.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    // Page 1

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

    // Page 2:
    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfPage2;

    @FindBy(xpath = "//p[contains(text(), 'Evinizin')]")
    public WebElement page2EvinizinKonumunuBelirtinizYzisi;

    @FindBy (id = "react-select-2-input")
    public WebElement page2AddressInput;

    @FindBy (xpath = "//*[@class = ' css-26l3qy-menu']")
    public WebElement step2_AddressList;

    @FindBy (id = "flexRadioDefault2")
    public WebElement step2_CheckBox;

    @FindBy(xpath = "//h6[contains(text(), 'Eviniz')]")
    public WebElement page2EvinizIleToplutasimaYzisi;

    @FindBy(xpath = "//div[@class='col-7 px-0' and text()='Ev ile otobüs durağı arası : ']")
    public WebElement page2EvIleOtobus;

    @FindBy(xpath = "//div[@class='col-7 px-0' and text()='Ev ile tren istasyonu arası : ']")
    public WebElement page2EvIleTren;

    @FindBy(xpath = "//div[@class='col-7 px-0' and text()='Ev ile tramway durağı arası : ']")
    public WebElement page2EvIleTramway;



    // Page 3:
    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfPage3;

    @FindBy(xpath = "//div/h2[contains(text(), 'Kullanım Alanı')]")
    public WebElement page3KullanimAlaniYazisi;

    @FindBy(xpath = "//input[@type = 'number']")
    public WebElement page3KullanimAlaniInput;

    @FindBy(xpath = "//p[contains(text(), 'Evinizin')]")
    public WebElement page3EvinizinKullanimAlaniBelirtinizYazisi;

    @FindBy(xpath = "//p[contains(text(), 'Evinizde')]")
    public WebElement page3EvinizdeKullaniabileceginizAlanlarYazisi;

    @FindBy(xpath = "//span[contains(text(), 'Yatak')]")
    public WebElement page3YatakOdasi;

    @FindBy(xpath = "//span[contains(text(), 'Banyo')]")
    public WebElement page3Banyo;

    @FindBy(xpath = "//span[contains(text(), 'Tuvalet')]")
    public WebElement page3Tuvalet;

    @FindBy(xpath = "//span[contains(text(), 'Oturma')]")
    public WebElement page3OturmaOdasi;

    @FindBy (xpath = "//button[text() = '+']")
    public List<WebElement> step3_incrementButtons;

    @FindBy (xpath = "//button[text() = '−']")
    public List<WebElement> step3_decrementButtons;

    @FindBy(xpath = "//a[@id='next']")
    public WebElement page3IlerleButton;

    @FindBy(xpath = "//button[@id='next']")
    public WebElement page3GeriButton;

    // Page4 Room

    @FindBy(xpath = "//span[text()='10-15']")
    public WebElement page4Age1;

    @FindBy(xpath = "//span[text()='16-20']")
    public WebElement page4Age2;

    @FindBy(xpath = "//span[text()='21-25']")
    public WebElement page4Age3;

    @FindBy(xpath = "//span[text()='26-35']")
    public WebElement page4Age4;

    @FindBy(xpath = "//span[text()='36-45']")
    public WebElement page4Age5;

    @FindBy(xpath = "//span[text()='46-65']")
    public WebElement page4Age6;

    @FindBy(xpath = "//span[text()='65+']")
    public WebElement page4Age7;

    @FindBy(xpath = "(//span[text()='Farketmez'])[1]")
    public WebElement page4AgeFarketmez;

    @FindBy(xpath = "//span[text()='Kadin']")
    public WebElement page4GenderKadin;

    @FindBy(xpath = "//span[text()='Erkek']")
    public WebElement page4GenderErkek;

    @FindBy(xpath = "(//span[text()='Farketmez'])[2]")
    public WebElement page4GenderFarketmez;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement page4KisiSayisiMinus;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement page4KisiSayisiPlus;


    // Page 5:
    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='TV']")
    public WebElement page5TV;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Eve ait özel garaj']")
    public WebElement page5EveAitOzelGaraj;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Wi-Fi']")
    public WebElement page5WIFI;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Bulaşık Makinesi']")
    public WebElement page5BulasikMakinesi;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Kurutma Makinesi']")
    public WebElement page5KurutmaMakinesi;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Çamaşır Makinesi']")
    public WebElement page5CamasirMakinesi;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Microdalga Fırın']")
    public WebElement page5Mikrodalga;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Asansör']")
    public WebElement page5Asansor;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Bebek arabası']")
    public WebElement page5BebekArabasi;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Bilgisayar']")
    public WebElement page5Bilgisayar;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Bahçe']")
    public WebElement page5Bahce;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Mangal/Barbekü']")
    public WebElement page5Mangal;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Klima']")
    public WebElement page5Klima;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Ücretsiz Park Alanı']")
    public WebElement page5UcretsizPark;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Ücretli Park Alanı']")
    public WebElement page5UcretliPark;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Bisiklet']")
    public WebElement page5Bisiklet;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Çocuk Bisikleti']")
    public WebElement page5CocukBisikleti;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Oyun konsolu']")
    public WebElement page5OyunKonsolu;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Balkon']")
    public WebElement page5Balkon;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Teras']")
    public WebElement page5Teras;


    // Page 6:
    @FindBy(xpath = "//a[@href='/']")
    public WebElement page6KeseLogo;

    @FindBy(xpath = "//h2")
    public WebElement page6AciklamaHeader;

    @FindBy (xpath = "//p")
    public WebElement page6Parag;

    @FindBy(css = "#home")
    public WebElement page6textArea;

    @FindBy(xpath = "//a[text()='İlanlarım']")
    public WebElement page6IlanLink;

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement page6PageNum;

    // Page 7:
    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfPage7;

    @FindBy(xpath = "//div[@class='px-3 py-2']/h2")
    public WebElement page7aktivitelerText;

    @FindBy(xpath = "//div[@class='px-3 py-2']/p")
    public WebElement page7InfoText;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-roller-coaster']")
    public WebElement page7LunaPark;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-vacations']")
    public WebElement page7Plaj;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-bike-1']")
    public WebElement page7BisikletYolu;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-museum']")
    public WebElement page7Muze;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-fishing']")
    public WebElement page7BalikTutma;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-ski']")
    public WebElement page7KayakYapma;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-dumbbell']")
    public WebElement page7SporSalonu;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-hiking']")
    public WebElement page7DogaYuruyusu;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-times-square']")
    public WebElement page7UnluMeydan;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-slider']")
    public WebElement page7CocukParki;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-halal']")
    public WebElement page7HelalRestorant;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-mall']")
    public WebElement page7Avm;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-cinema']")
    public WebElement page7Sinema;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-mosque']")
    public WebElement page7CamiiDernek;


    //Page 8
    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement page8navigationBar;

    @FindBy(xpath = "//div/h2[contains(text(), 'Özel Şartlar')]")
    public WebElement page8OzelSartlrYazisi;

    @FindBy(xpath = "//*[contains(text(),'Odanıza ait')]")
    public WebElement page8OdanizaAitOzelSartalrYazisi;

    @FindBy(xpath = "//div[contains(text(), 'Çocuklarınızı getir')]")
    public WebElement page8Cocuklarinizgetirebilirsiniz;

    @FindBy(xpath = "//div[contains(text(), 'Evcil hayvan getir')]")
    public WebElement page8Evcilhayvanlarigetirebilirsiniz;

    @FindBy(xpath = "//div[contains(text(), 'Evde sigara içme')]")
    public WebElement page8EvdeSigaraIcmeyeIzinVerilir;

    @FindBy(xpath = "//div[contains(text(), 'Araba değişimi')]")
    public WebElement page8ArabaDegisimiOlabilir;

    @FindBy(xpath = "//div[contains(text(), 'Bakılması')]")
    public WebElement page8BakilmasiGerekEvcilHayvan;

    @FindBy(xpath = "//div[contains(text(), 'Bakılması gereken bitki var.')]")
    public WebElement page8BakilmasiGerekenBitki;

    @FindBy(xpath = "//div[@class = 'badge rounded-pill px-2 py-1 bg-success text-white']")
    public WebElement page8CocuklarinizgetirebilirsinizEVET;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]")
    public WebElement page8CocuklarinizgetirebilirsinizHAYIR;

    @FindBy(xpath = "//div[contains(@class,'row mx-0')]//div[2]//div[2]//div[1]//div[1]")
    public WebElement page8EvcilhayvanlarigetirebilirsinizEVET;

    @FindBy(xpath = "//div[contains(@class,'row mx-0')]//div[2]//div[2]//div[1]//div[2]")
    public WebElement page8EvcilhayvanlarigetirebilirsinizHAYIR;

    @FindBy(xpath = "//div[3]//div[2]//div[1]//div[1]")
    public WebElement page8EvdeSigaraIcmeyeIzinVerilirEVET;

    @FindBy(xpath = "//div[3]//div[2]//div[1]//div[2]")
    public WebElement page8EvdeSigaraIcmeyeIzinVerilirHAYIR;

    @FindBy(xpath = "//div[4]//div[2]//div[1]//div[1]")
    public WebElement page8ArabaDegisimiOlabilirEVET;

    @FindBy(xpath = "//div[4]//div[2]//div[1]//div[2]")
    public WebElement page8ArabaDegisimiOlabilirHAYIR;

    @FindBy(xpath = "//div[5]//div[2]//div[1]//div[1]")
    public WebElement page8BakilmasiGerekEvcilHayvanEVET;

    @FindBy(xpath = "//div[5]//div[2]//div[1]//div[2]")
    public WebElement page8BakilmasiGerekEvcilHayvanHAYIR;

    @FindBy(xpath = "//div[6]//div[2]//div[1]//div[1]")
    public WebElement page8BakilmasiGerekenBitkiEVET;

    @FindBy(xpath = "//div[6]//div[2]//div[1]//div[2]")
    public WebElement page8BakilmasiGerekenBitkiHAYIR;



    // Page 9

    //    Same Locators
//    @FindBy(xpath = "//a[@id='next']")
//    public WebElement ilerleButton ;
//
//    @FindBy(xpath = "//button[@id='next']")
//    public WebElement geriButton ;
//
//    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
//    public WebElement theNumberOfPage ;
//
//    @FindBy(xpath = "//div[@class='px-3 py-2']/h2")
//    public WebElement  pageTitleText;
//
//    @FindBy(xpath = "(//div[@class='px-3 py-2']/p)[1]")
//    public WebElement pageInfoText ;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement page9InputCalenderBox ;

    @FindBy(xpath = "//div[@class='react-datepicker__day-name' and text()='Su']")
    public WebElement page9CalendarPageSu ;

    //    Seçtiğiniz Tarihler
    @FindBy(xpath = "(//div[@class='px-3 py-2']/p)[2]")
    public WebElement page9BookedDate ;

    @FindBy(xpath = "//div[@class='col-12 px-0']")
    public WebElement page9BookedDateSummary ;

    @FindBy(xpath = "//button[@class='btn btn-danger rounded px-2 py-1 ']")
    public WebElement page9CancelButton ;

    // Page 10:

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


    //sevda

    @FindBy (xpath = "//h2[text()='Cinsiyet, Yaş Aralığı ve Kişi Sayısı']")
    public WebElement page4HeadMain;

    @FindBy (xpath = "//*[text()='Hangi yaş aralığındaki ve cinsiyetteki kişiyi evinizde ağırlamak istersiniz.']")
    public WebElement page4AgeGapP;

    @FindBy (className = "input-number-value")
    public WebElement page4kisiSayisi;

    @FindBy (xpath = "//small[text()='*Lütfen cinsiyet ve yaş aralığı seçiniz.']")
    public WebElement page4DefaultWarning;



}
