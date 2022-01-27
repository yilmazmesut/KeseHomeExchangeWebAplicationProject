package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import com.kese.pages.OdaKiralaPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class US33KeseKonumVeUlasimPageStepD extends OdaKiralaPage {
    EvDegisimiPage evDegisimiPage = new EvDegisimiPage();

    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement step2_EvOtobusInput;

    @FindBy (xpath = "(//input[@type='number'])[2]")
    public WebElement step2_EvTrenInput;

    @FindBy (xpath = "(//input[@type='number'])[3]")
    public WebElement step2_EvTramwayInput;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement step2_AddressInput;


    @Given("user goes to {string} Page")
    public void userGoesToPage(String url) {
        Driver.get().get(url);
        WebElement girisButton = Driver.get().findElement(By.xpath("//a[@class=\"ms-3 btn py-2 bg-white border d-inline\"]"));
        girisButton.click();

    }

    @When("{string} signed in on sign in page")
    public void signedInOnSignInPage(String user) {
        BrowserUtils.waitForPageToLoad(3);
        Driver.get().findElement(By.name("email")).sendKeys(user);
        Driver.get().findElement(By.name("sifre")).sendKeys("1234");
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.xpath("//button[@type=\"submit\"]")).click();
        BrowserUtils.waitFor(3);
    }

    @And("user chooses house type on the new home step one page")
    public void userChoosesHouseTypeOnTheNewHomeStepOnePage() {

        BrowserUtils.waitForClickability(Driver.get().findElement(By.xpath("//i[@class='fas fa-2x flaticon-home']")), 3).click();

    }

    @And("user should able to see Konum ve Ulasim text")
    public void userShouldAbleToSeeKonumVeUlasimText() {
        String actual = Driver.get().findElement(By.xpath("//h2[contains(text(), 'Konum')]")).getText();
        System.out.println("actual = " + actual);
        String expected = "Konum ve Ulaşım";
        Assert.assertEquals(actual, expected);
    }

    @And("user should able to see Evinizin konumunu belirtiniz. Acik adres vermenize gerek yoktur text")
    public void userShouldAbleToSeeEvinizinKonumunuBelirtinizAcikAdresVermenizeGerekYokturText() {
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

    @And("Ev ile otobus duragi arasi input field should be usable")
    public void evIleOtobusDuragiArasiInputFieldShouldBeUsable() {
        step2_EvOtobusInput.clear();
        step2_EvOtobusInput.sendKeys("4");
        String value = step2_EvOtobusInput.getAttribute("value");
        Assert.assertEquals(value,"4");

    }

    @And("Ev ile tren istasyonu arasi input field should be usable")
    public void evIleTrenIstasyonuArasiInputFieldShouldBeUsable() {
        step2_EvTrenInput.clear();
        step2_EvTrenInput.sendKeys("3");
        String value = step2_EvTrenInput.getAttribute("value");
        Assert.assertEquals(value,"3");

    }

    @And("Ev ile tramway duragi arasi input field should be usable")
    public void evIleTramwayDuragiArasiInputFieldShouldBeUsable() {
        step2_EvTramwayInput.clear();
        step2_EvTramwayInput.sendKeys("5");
        String value = step2_EvTramwayInput.getAttribute("value");
        Assert.assertEquals(value,"5");
    }

    @And("Sadece sahsi arac ile... checkbox button should be usable")
    public void sadeceSahsiAracIleCheckboxButtonShouldBeUsable() {
        step2_CheckBox.click();
        Assert.assertTrue(step2_CheckBox.isSelected());
    }


    @And("user verifies that ilerle button should not be clickable")
    public void userVerifiesThatIlerleButtonShouldNotBeClickable() {

    }
}
