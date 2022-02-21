package com.kese.stepdefinitions.Sprint_4;

import com.kese.pages.KargoPage;
import com.kese.pages.MainPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.And;
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
            BrowserUtils.waitAndClick(mainPage.dropdownMenuButton);
            // Ana sayfada ki Ilan Ver menusu icinde ki Bed & Breakfast secenegi
            BrowserUtils.waitAndClick(mainPage.kargoOption);
            if (sayfa == 1)
                break;
            // Here you are in 1st page
            BrowserUtils.waitAndClick(page.step1_Zarf);
            BrowserUtils.waitAndClick(page.ilerleButton);
            if (sayfa == 2)
                break;
            // Here you are in 2nd page
            BrowserUtils.waitAndClick(page.step2_selectText1);
            BrowserUtils.waitAndSendKeys(page.step2_selectText1Input,"Frankfurt, Almanya");
            BrowserUtils.waitFor(1);
            BrowserUtils.waitAndSendKeys(page.step2_selectText1Input, Keys.ENTER);
            BrowserUtils.waitAndClick(page.step2_selectText2);
            BrowserUtils.waitAndSendKeys(page.step2_selectText2Input,"Köln, Almanya");
            BrowserUtils.waitFor(1);
            BrowserUtils.waitAndSendKeys(page.step2_selectText2Input, Keys.ENTER);
            BrowserUtils.waitFor(1);
            BrowserUtils.waitAndClick(page.ilerleButton);
            if (sayfa == 3)
                break;
            // Here you are in 3rd page
            BrowserUtils.waitFor(1);
            BrowserUtils.waitAndSendKeys(page.step3_kargoBilgileriTextBox, "A simple envelope");
            BrowserUtils.waitAndClick(page.ilerleButton);
            if (sayfa == 4)
                break;
            // Here you are in 4th page
        }
    }

    @And("user asserts that starting point options must be selectable")
    public void userAssertsThatStartingPointOptionsMustBeSelectable() {
        page.step2_selectText1.click();
        page.step2_selectText1Input.sendKeys("Frankfurt, Almanya");
        BrowserUtils.waitFor(1);
        page.step2_selectText1Input.sendKeys(Keys.ENTER);

    }
}
