package com.kese.pages;

import com.kese.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BedAndBreakfastPage extends CommonPage {

    //Common Locators

    @FindBy(xpath = "//a[@id='next']")
    public WebElement ilerleButton ;

    @FindBy(xpath = "//button[@id='next']")
    public WebElement geriButton ;

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfPage;

    @FindBy(xpath = "//div[@class='px-3 py-2']/h2")
    public WebElement  pageTitleText;

    @FindBy(xpath = "(//div[@class='px-3 py-2']/p)[1]")
    public WebElement pageInfoText ;

    @FindBy (xpath = "//small[@class='ps-2']")
    public WebElement missingInfoWarningText;


    /**--------------------------------------------------------------------------------------------------------------*/
    //Page 1 by Aziz

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[1]")
    public WebElement bedAndBreakfastp1Mustakil;

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[1]")
    public WebElement bedAndBreakfastp1Apartman;

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[1]")
    public WebElement bedAndBreakfastp1Studyo;

    @FindBy(xpath = "//*[text()='Odanız hangi ev türünde yer alıyor , belirtiniz.']")
    public WebElement bedAndBreakfastp1HouseTypeQuestion;

    @FindBy(xpath = "//*[text()='*Lütfen ev tipini seçiniz.']")
    public WebElement bedAndBreakfastp1HouseTypeWarning;


    /**--------------------------------------------------------------------------------------------------------------*/
    //Page 2 by Nursel

    @FindBy(xpath = "//h2")
    public WebElement page2KonumUlasimHeadText;

    @FindBy(xpath = "//p[contains(text(), 'Evinizin')]")
    public WebElement page2EvinizinKonumuText;

    @FindBy(xpath = "//div[@class='py-3']//b")
    public WebElement page2SectinizAdresTextValue;

    @FindBy(css = ".fas.fa-check.text-success")
    public WebElement page2SectinizAdresText;

    @FindBy (id = "react-select-2-input")
    public WebElement page2AddressInputBox;

    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement page2EvOtobusInputBox;

    @FindBy(xpath = "(//input[@type='number'])[2]")
    public WebElement page2EvTrenInputBox;

    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement page2EvTramvayInputBox;

    @FindBy(id = "flexRadioDefault2")
    public WebElement page2SahsiAracCheckBox;



    /**--------------------------------------------------------------------------------------------------------------*/
    //Page 3 by Berrin

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfPage3;

    @FindBy(xpath = "//div/h2[contains(text(), 'Kullanım Alanı')]")
    public WebElement page3KullanimAlaniYazisi;

    @FindBy(xpath = "//input[@type = 'number']")
    public WebElement page3KullanimAlaniInput;

    @FindBy (xpath = "//button[text() = '+']")
    public List<WebElement> step3_incrementButtons;

    @FindBy(xpath = "//div[@class='form-group row align-items-center ']/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 mr-3']")
    public WebElement page3yatakodasieksibutonu;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][1]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 mr-3']")
    public WebElement page3banyoeksibutonu;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][2]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 mr-3']")
    public WebElement page3tuvaleteksibutonu;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][3]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 mr-3']")
    public WebElement page3oturmaodasieksibutonu;

    @FindBy(xpath = "//div[@class='form-group row align-items-center ']/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 ml-3']")
    public WebElement page3yatakodasiartibutonu;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][1]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 ml-3']")
    public WebElement page3banyoartibutonu;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][2]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 ml-3']")
    public WebElement page3tuvaletartibutonu;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][3]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 ml-3']")
    public WebElement page3oturmaodasiartibutonu;

    @FindBy(xpath = "//div[@class='form-group row align-items-center ']/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/span[@class='input-number-value']")
    public WebElement page3yatakodasisayisi;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][1]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/span[@class='input-number-value']")
    public WebElement page3banyosayisi;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][2]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/span[@class='input-number-value']")
    public WebElement page3tuvaletsayisi;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][3]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/span[@class='input-number-value']")
    public WebElement page3oturmaodasisayisi;


// @FindBy(className = "input-number-value")
// public List<WebElement> step3_AllNumbers;


    @FindBy(xpath = "//div[@class=' css-1hwfws3']")
    public WebElement adresbutonusayfa2;

    @FindBy(id = "flexRadioDefault2")
    public WebElement clickbutonusayfa2;

    @FindBy(xpath = "//div[@class='ms-2']/*[@id='next']")
    public WebElement page3ilerlebutonu;

    @FindBy(xpath = "//small[contains(text(),'kullanım alanlarını giriniz.')]")
    public WebElement page3lutfenkullnimalanigirinyazisi;

    @FindBy(xpath = "//small[contains(text(),' yüzey alanını giriniz.')]")
    public WebElement page3lutfenyuzeyalanigirinizyazisi;

    @FindBy(xpath = "//p[contains(text(), 'Odanızın')]")
    public WebElement page3OdanizinKullanimAlaniniBelirtinizYazisi;

    public void incrementFifteenTimes() {
        for (int i = 1; i <= 15; i++) {
            page3yatakodasiartibutonu.click();
            page3banyoartibutonu.click();
            page3tuvaletartibutonu.click();
            page3oturmaodasiartibutonu.click();
        }
    }




    /**--------------------------------------------------------------------------------------------------------------*/
    //Page 4 (first 3 is min requirement) by Sevda

    @FindBy(xpath = "(//span[text()='Farketmez'])[1]")
    public WebElement page4AgeFarketmez;

    @FindBy(xpath = "(//span[text()='Farketmez'])[2]")
    public WebElement page4GenderFarketmez;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement page4KisiSayisiIncrement;

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

    @FindBy(xpath = "//span[text()='Kadin']")
    public WebElement page4GenderKadin;

    @FindBy(xpath = "//span[text()='Erkek']")
    public WebElement page4GenderErkek;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement page4KisiSayisiDecrement;

    @FindBy(xpath = "(//*[text() = 'Evet'])[1]")
    public WebElement page4OzelOdaImkaniEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[1]")
    public WebElement page4OzelOdaImkaniHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[2]")
    public WebElement page4KahvaltiEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[2]")
    public WebElement page4KahvaltiHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[3]")
    public WebElement page4BolCesit4EVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[3]")
    public WebElement page4BolCesitHAYIR;



    /**--------------------------------------------------------------------------------------------------------------*/
    //Page 6 by nur

    @FindBy(xpath = "//h2")
    public WebElement page6header;

    @FindBy (xpath = "//p[@class='pt-3']")
    public List<WebElement> page6inputBoxHeaders;

    @FindBy (xpath = "//textarea[@id='room']")
    public  WebElement page6inputBoxRoom;

    @FindBy (xpath = "//textarea[@id='home']")
    public  WebElement page6inputBoxHome;

    @FindBy (xpath = "//textarea[@id='breakfast']")
    public  WebElement page6inputBoxBreakf;



    /**--------------------------------------------------------------------------------------------------------------*/
    // Page 7 by AykutC

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

    @FindBy(xpath = "//div[@id='root']//small[@class='ps-2']")
    public WebElement page7ActiviteWarningMessage;



    /**--------------------------------------------------------------------------------------------------------------*/
    //Page 8 by RejepA

    @FindBy(xpath = "(//div[@class='col-7'])[1]")
    public WebElement page8Cocuklarinizgetirebilirsiniz;

    @FindBy(xpath = "(//div[@class='col-7'])[2]")
    public WebElement page8Evcilhayvanlarigetirebilirsiniz;

    @FindBy(xpath = "(//div[@class='col-7'])[3]")
    public WebElement page8EvdeSigaraIcmeyeIzinVerilir;

    @FindBy(xpath = "(//div[@class='col-7'])[4]")
    public WebElement page8ArabaDegisimiOlabilir;

    @FindBy(xpath = "(//div[@class='col-7'])[5]")
    public WebElement page8BakilmasiGerekEvcilHayvan;

    @FindBy(xpath = "(//div[@class='col-7'])[6]")
    public WebElement page8BakilmasiGerekenBitki;

    @FindBy(xpath = "(//*[text() = 'Evet'])[1]")
    public WebElement page8CocuklarinizgetirebilirsinizEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[1]")
    public WebElement page8CocuklarinizgetirebilirsinizHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[2]")
    public WebElement page8EvcilhayvanlarigetirebilirsinizEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[2]")
    public WebElement page8EvcilhayvanlarigetirebilirsinizHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[3]")
    public WebElement page8EvdeSigaraIcmeyeIzinVerilirEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[3]")
    public WebElement page8EvdeSigaraIcmeyeIzinVerilirHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[4]")
    public WebElement page8ArabaDegisimiOlabilirEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[4]")
    public WebElement page8ArabaDegisimiOlabilirHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[5]")
    public WebElement page8BakilmasiGerekEvcilHayvanEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[5]")
    public WebElement page8BakilmasiGerekEvcilHayvanHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[5]")
    public WebElement page8BakilmasiGerekenBitkiEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[6]")
    public WebElement page8BakilmasiGerekenBitkiHAYIR;



    /**--------------------------------------------------------------------------------------------------------------*/
    // Page 9 by Selen


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



    /**--------------------------------------------------------------------------------------------------------------*/
    //Page 10 by MSen

    public static final By stepNumberPage = By.xpath("//div[@class='navbar-nav me-auto fs-3']");

    public static final By page10Resim_ve_Fotograflar = By.xpath("//h2[contains(text(),'Resim ve Fotoğraflar')]");

    public static final By page10aciklama = By.xpath("//p[contains(text(),'Ortak kullanım alanlarının, odanızın ve')]");

    public static final By page10ResimleriSecin = By.linkText(" Resimleri Seçin");

    public static final By page10tumResimleriKaldir = By.linkText(" Tüm Resimleri Kaldır");

    public static final By page10enAzBesEnFazlaOnResim = By.linkText("En az 5 en fazla 10 resim yükleyebilirsiniz.");

    public static final By page10FirstResimEkle = By.xpath("//div[@class='d-flex flex-column align-items-center']");

    public static final By page10SecondResimEkle = By.xpath("//div[@class='col-6 col-sm-4 col-md-4 col-lg-3  h-100'][2]");

    public static final By page10ThirdResimEkle = By.xpath("//div[@class='col-6 col-sm-4 col-md-4 col-lg-3  h-100'][3]");

    public static final By page10FourthResimEkle = By.xpath("//div[@class='col-6 col-sm-4 col-md-4 col-lg-3  h-100'][4]");

    public static final By resimleriKaydtButton = By.linkText("Resimleri Kaydet");


    /**--------------------------------------------------------------------------------------------------------------*/
    //Page 10 by Nuray

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


    /**--------------------------------------------------------------------------------------------------------------*/
    //Page 10 by Muhsin

    // resim eklemeye yarayançerçevelerde ki Resim Ekle
    @FindBy (xpath = "//*[contains(text(), 'Resim Ekle')]")
    public WebElement step10_addImageText;

    //all locators min request by Muhsin
    // 1st page
    @FindBy (xpath = "//*[contains(text(),'Müstakil Ev')]")
    public WebElement step1_houseButton;  //  Müstakil Ev
    // 2nd page
    @FindBy (xpath = "//*[contains(text(),'Select...')]")
    public WebElement step2_selectText;
    // 2nd page
    @FindBy (id = "react-select-2-input")
    public WebElement step2_selectTextButton;
    // 2nd page
    @FindBy(className = "form-check-input")
    public WebElement step2_checkBox;
    // 3rd page
    @FindBy (id = "size")
    public WebElement step3_sizeOfAreaUp;
    // 4th page
    @FindBy (xpath = "//*[contains(text(),'10-15')]")
    public WebElement step4_10_15AgeOption;
    // 4th page
    @FindBy (xpath = "//*[contains(text(),'Erkek')]")
    public WebElement step4_ErkekOption;
    // 4th page
    @FindBy(className = "ml-3")
    public WebElement step4_plus; //Kişi sayısı
    // 5th page
    @FindBy (xpath = "//*[contains(text(),'TV')]")
    public WebElement step5_tvText;
    // 6th page
    @FindBy (id = "room")
    public WebElement step6_roomExplanation;
    // 6th page
    @FindBy (id = "home")
    public WebElement step6_homeExplanation;
    // 6th page
    @FindBy (id = "breakfast")
    public WebElement step6_breakfastExplanation;
    // 7th page
    @FindBy (xpath = "//*[contains(text(),'Müze')]")
    public WebElement step7_museumText;
    // 8th page
    @FindBy (xpath = "//*[contains(text(),'Evet')]")
    public List<WebElement> step8_yesTexts;
    // 9th page
    @FindBy (className = "react-datepicker__input-container")
    public WebElement step9_selectDate;
    // 9th page
    @FindBy (xpath = "//*[@tabindex=0]")
    public WebElement step9_todaysLocator;

}
