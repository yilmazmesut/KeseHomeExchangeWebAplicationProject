package com.kese.stepdefinitions.Sprint_4;

import com.kese.pages.KargoPage;
import com.kese.pages.MainPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US139_New_Cargo_StepD {
    MainPage mainPage = new MainPage();
    KargoPage page = new KargoPage();

    @When("user navigates to page {int} in Kargo")
    public void navigateToPageInKargo(Integer sayfa) {
        while (true) {
            if (sayfa < 1 || sayfa > 4) {
                Assert.fail("Not valid page number :" + sayfa);
            }
            // Here you are in Main page
            mainPage.dropdownMenuButton.click();
            // Ana sayfada ki Ilan Ver menusu icinde ki Bed & Breakfast secenegi
            mainPage.kargoOption.click();
            if (sayfa == 1)
                break;
            // Here you are in 1st page
            BrowserUtils.waitFor(1);
            page.step1_Zarf.click();
            page.ilerleButton.click();
            if (sayfa == 2)
                break;
            // Here you are in 2nd page
            page.step2_selectText1.click();
            page.step2_selectText1Input.sendKeys("Frankfurt, Almanya");
            BrowserUtils.waitFor(1);
            page.step2_selectText1Input.sendKeys(Keys.ENTER);
            BrowserUtils.waitFor(1);
            page.step2_selectText2.click();
            page.step2_selectText2Input.sendKeys("Köln, Almanya");
            BrowserUtils.waitFor(1);
            page.step2_selectText2Input.sendKeys(Keys.ENTER);
            BrowserUtils.waitFor(2);
            page.ilerleButton.click();
            if (sayfa == 3)
                break;
            // Here you are in 3rd page
            BrowserUtils.waitFor(1);
            page.step3_kargoBilgileriTextBox.sendKeys("A simple envelope");
            page.ilerleButton.click();
            if (sayfa == 4)
                break;
            // Here you are in 4th page
        }
    }
}
