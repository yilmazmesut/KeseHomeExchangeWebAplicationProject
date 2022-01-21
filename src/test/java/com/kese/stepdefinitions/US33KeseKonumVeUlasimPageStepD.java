package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import com.kese.pages.LoginPage;
import com.kese.pages.OdaKiralaPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class US33KeseKonumVeUlasimPageStepD extends OdaKiralaPage {
    EvDegisimiPage evDegisimiPage = new EvDegisimiPage();

    @And("user chooses house type on the new home step one page")
    public void userChoosesHouseTypeOnTheNewHomeStepOnePage() {
        page1RoomMustakilEv.click();

    }

    @And("user clicks to the ilerle button on the new home page")
    public void userClicksToTheIlerleButtonOnTheNewHomePage() {
        evDegisimiPage.nextButton.click();

    }


    @And("{string} input field should be useable")
    public void inputFieldShouldBeUseable(String text) {
        Driver.get().findElement(By.xpath("(//div[@class='col-2 px-0 py-0'])[1]")).sendKeys("1");
        String inputValue = Driver.get().findElement(By.xpath("(//div[@class='col-2 px-0 py-0'])[1]")).getText();
        Assert.assertTrue(Integer.parseInt(inputValue) > 0);
        //Assert.assertNotNull(Driver.get().findElement(By.xpath("(//div[@class='col-2 px-0 py-0'])[1]")));

        Driver.get().findElement(By.xpath("(//div[@class='col-2 px-0 py-0'])[2]")).sendKeys("1");
        String inputValue2 = Driver.get().findElement(By.xpath("(//div[@class='col-2 px-0 py-0'])[2]")).getText();
        Assert.assertTrue(Integer.parseInt(inputValue2) > 0);

        Driver.get().findElement(By.xpath("(//div[@class='col-2 px-0 py-0'])[3]")).sendKeys("1");
        String inputValue3 = Driver.get().findElement(By.xpath("(//div[@class='col-2 px-0 py-0'])[3]")).getText();
        Assert.assertTrue(Integer.parseInt(inputValue3) > 0);

    }


    @When("{string} signed in on sign in page")
    public void signedInOnSignInPage(String user) throws InterruptedException {

        Driver.get().findElement(By.name("email")).sendKeys(user);
        Driver.get().findElement(By.name("sifre")).sendKeys("1234");
        Driver.get().findElement(By.xpath("//button[contains(text(),'Giriş Yap')]")).click();

        Thread.sleep(3000);


    }

    @And("user should able to see Konum ve Ulaşım text")
    public void userShouldAbleToSeeKonumVeUlaşımText() {
        String actual = Driver.get().findElement(By.xpath("//h2[contains(text(), 'Konum')]")).getText();
        System.out.println("actual = " + actual);
        String expected = "Konum ve Ulaşım";
        Assert.assertEquals(actual, expected);

    }

    @And("user should able to see Evinizin konumunu belirtiniz. Açık adres vermenize gerek yoktur text")
    public void userShouldAbleToSeeEvinizinKonumunuBelirtinizAçıkAdresVermenizeGerekYokturText() {

        String actualEvKonumuYazisi = page2EvinizinKonumunuBelirtinizYzisi.getText();
        System.out.println("actualEvKonumuYazisi = " + actualEvKonumuYazisi);
        String expectedEvKonumuYazisi = "Evinizin konumunu belirtiniz. Açık adres vermenize gerek yoktur";
        Assert.assertEquals(actualEvKonumuYazisi, expectedEvKonumuYazisi);
    }


    @And("user should able to see page number")
    public void userShouldAbleToSeePageNumber() {
        String actualNumberOfpage = theNumberOfPage2.getText();
        System.out.println("actualNumberOfpage = " + actualNumberOfpage);
        String expectedNumerOfPage = "2";
        Assert.assertTrue(actualNumberOfpage.contains(expectedNumerOfPage));

    }

    @And("Ev ile otobüs durağı arası input field should be useable")
    public void evIleOtobüsDurağıArasıInputFieldShouldBeUseable() throws InterruptedException {


        BrowserUtils.waitForPageToLoad(3);

        Driver.get().findElement(By.xpath("(//input[@name='flexRadioDefault'])[1]")).click();
        Driver.get().findElement(By.xpath("(//input[@name='flexRadioDefault'])[1]")).clear();
        Driver.get().findElement(By.xpath("(//input[@name='flexRadioDefault'])[1]")).sendKeys("5");
        Assert.assertNotNull(Driver.get().findElement(By.xpath("(//input[@name='flexRadioDefault'])[1]")));

        String inputValue = String.valueOf(Driver.get().findElement(By.xpath("(//input[@name='flexRadioDefault'])[1]")).getSize());
        System.out.println("inputValue = " + inputValue);
        BrowserUtils.waitForPageToLoad(3);

        Assert.assertFalse(inputValue.isEmpty());
    }

    @And("Ev ile tren istasyonu arası input field should be useable")
    public void evIleTrenIstasyonuArasıInputFieldShouldBeUseable() {

        Driver.get().findElement(By.xpath("(//input[@name='flexRadioDefault'])[2]")).clear();
        Driver.get().findElement(By.xpath("(//input[@name='flexRadioDefault'])[2]")).sendKeys("19");
        String inputValue2 = String.valueOf(Driver.get().findElement(By.xpath("(//input[@name='flexRadioDefault'])[1]")).getSize());
        Assert.assertNotNull(Driver.get().findElement(By.xpath("(//input[@name='flexRadioDefault'])[2]")));
        System.out.println("inputValue2 = " + inputValue2);
        Assert.assertFalse(inputValue2.isEmpty());
    }

    @And("Ev ile tramway durağı arası input field should be useable")
    public void evIleTramwayDurağıArasıInputFieldShouldBeUseable() {

        Driver.get().findElement(By.xpath("(//input[@name='flexRadioDefault'])[3]")).clear();
        Driver.get().findElement(By.xpath("(//input[@name='flexRadioDefault'])[3]")).sendKeys("123");
        String inputValue3 = String.valueOf(Driver.get().findElement(By.xpath("(//input[@name='flexRadioDefault'])[3]")).getSize());
        Assert.assertNotNull(Driver.get().findElement(By.xpath("(//input[@name='flexRadioDefault'])[3]")));
        System.out.println("inputValue3 = " + inputValue3);
        Assert.assertFalse(inputValue3.isEmpty());
    }

    @And("Sadece şahsi araç ile... checkbox button should be useable")
    public void sadeceŞahsiAraçIleCheckboxButtonShouldBeUseable() {

        step2_CheckBox.click();
        Assert.assertTrue(step2_CheckBox.isSelected());

    }
}
