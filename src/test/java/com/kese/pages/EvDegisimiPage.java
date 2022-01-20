package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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



    //Page 1:
    @FindBy(xpath = "//img[@src='/assets/img/logo/keselogo_kisa.png']") //COMMON
    public WebElement page1KeseAmblem;

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")   // COMMON
    public WebElement page1oneSlashTenWriting;

    @FindBy(xpath = "//*[text()='Ev Tipi']")      //COMMON
    public WebElement page1EvTipiTitle;

    @FindBy(xpath = "//*[text()='Değişim yapmak istediğiniz evinizin türünü belirtiniz']")
    public WebElement page1HomeDegisimEvTuruWriting;

    @FindBy(xpath = "//div[@class='border py-3 rounded border-warning text-warning ']")
    public WebElement page1HomeMustakilEv;

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[1]")
    public WebElement page1HomeApartman;

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[2]")
    public WebElement page1HomeStudyo;

    @FindBy(xpath = "//img[@src='ilanver/home.png']")
    public WebElement page1HomeImage;



    //  @FindBy(xpath = "//a[@id='dropdownMenuButton']")
//    public WebElement homePageIlanButton;
//
//    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
//    public WebElement homePageEvDegisimDropDown;
//
//    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
//    public WebElement homePageOdaDropDown;


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

    //----------------------------------------------------------------------
    // Page 4 Titles

    @FindBy(xpath = "//h2[contains(text(),'Yatak Sayısı')]")
    public WebElement page4YatakSayısıTitle;

    @FindBy(xpath = "//p[contains(text(),'Evinizdeki kullanılabilir yatak sayısını belirtiniz.')]")
    public WebElement page4Text;

    @FindBy(xpath = "//span[contains(text(),'Tek Kişilik')]")
    public WebElement page4TekKişilikTitle;

    @FindBy(xpath = "//span[contains(text(),'İki Kişilik')]")
    public WebElement page4İkiKişilikTitle;

    @FindBy(xpath = "//span[contains(text(),'Çocuk Yatağı')]")
    public WebElement page4ÇocukYatağıTitle;

    @FindBy(xpath = "//span[contains(text(),'Bebek Yatağı')]")
    public WebElement page4BebekYatağıTitle;

    @FindBy(xpath = "//span[contains(text(),'Yer Yatağı (Tekli)')]")
    public WebElement page4YerYatağıTekliTitle;

    @FindBy(xpath = "//span[contains(text(),'Yer Yatağı (İkili)')]")
    public WebElement page4YerYatağıİkiliTitle;

    @FindBy(xpath = "//span[contains(text(),'Yer Yatağı (Çocuk)')]")
    public WebElement page4YerYatağıÇocukTitle;

    @FindBy(xpath = "//span[contains(text(),'Beşik')]")
    public WebElement page4BeşikTitle;


    //page 4 Decrease

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[1]")
    public WebElement page4TekKişilikDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[2]")
    public WebElement page4İkiKişilikDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[3]")
    public WebElement page4ÇocukYatağıDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[4]")
    public WebElement page4BebekYatağıDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[5]")
    public WebElement page4YerTekliYatağıDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[6]")
    public WebElement page4YerYatağıİkiliDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[7]")
    public WebElement page4YerYatağıÇocukDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[8]")
    public WebElement page4BeşikDecrease;


    //4page increase

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[1]")
    public WebElement page4TekKişilikİncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[2]")
    public WebElement page4İkiKişilikİncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[3]")
    public WebElement page4ÇocukYatağıİncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[4]")
    public WebElement page4BebekYatağıİncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[5]")
    public WebElement page4YerYatağıTekliİncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[6]")
    public WebElement page4YerYatağıİkiliİncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[7]")
    public WebElement page4YerYatağıÇocukİncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[8]")
    public WebElement page4Beşikincrease;

    //page4 Yatak Sayısı

    @FindBy(xpath = "(//span[@class='input-number-value'])[1]")
    public WebElement page4TekKişilikYatakSayısı;

    @FindBy(xpath = "(//span[@class='input-number-value'])[2]")
    public WebElement page4İkiKişilikYatakSayısı;

    @FindBy(xpath = "(//span[@class='input-number-value'])[3]")
    public WebElement page4ÇocukYatağıSayısı;

    @FindBy(xpath = "(//span[@class='input-number-value'])[4]")
    public WebElement page4BebekYatağıSayısı;

    @FindBy(xpath = "(//span[@class='input-number-value'])[5]")
    public WebElement page4TerYatağıTekliSayısı;

    @FindBy(xpath = "(//span[@class='input-number-value'])[6]")
    public WebElement page4YerYatağıİkiliSayısı;

    @FindBy(xpath = "(//span[@class='input-number-value'])[7]")
    public WebElement page4YerYatağıÇocukSayısı;

    @FindBy(xpath = "(//span[@class='input-number-value'])[8]")
    public WebElement page4BeşikSayısı;

    //ileri tuşu
    @FindBy(xpath = "//a[@class='btn py-1 bg-light']")
    public WebElement page4İleriTuşu;

    //geri Tuşu
    @FindBy(xpath = "//button[@class='btn btn-light py-1']")
    public WebElement page4GeriTuşu;

    // 4/10 yazısı

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement page4SayfaNumber;

    //__________________________________________________________

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









}
