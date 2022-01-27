package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US045HomeExchanePage8StepD {

    EvDegisimiPage page = new EvDegisimiPage();



    @Then("user able to see ozel Sartlar title is visible")
    public void user_able_to_see_ozel_Sartlar_title_is_visible() {
        System.out.println(page.page8OzelSartlrYazisi);
        Assert.assertTrue(page.page8OzelSartlrYazisi.isDisplayed());
    }

    @Then("user see Evinize ait ozel sartlari belirtiniz title is visible")
    public void user_see_Evinize_ait_ozel_sartlari_belirtiniz_title_is_visible() {

        System.out.println(page.pageInfoText);
        Assert.assertTrue(page.pageInfoText.isDisplayed());
    }

    @Then("user see all option titles are visible")
    public void user_see_all_option_titles_are_visible() {
        // BrowserUtils.waitFor(2);
        Assert.assertTrue(page.page8Cocuklarinizgetirebilirsiniz.isDisplayed());
        Assert.assertTrue(page.page8Evcilhayvanlarigetirebilirsiniz.isDisplayed());
        Assert.assertTrue(page.page8EvdeSigaraIcmeyeIzinVerilir.isDisplayed());
        Assert.assertTrue(page.page8ArabaDegisimiOlabilir.isDisplayed());
        Assert.assertTrue(page.page8BakilmasiGerekEvcilHayvan.isDisplayed());
        Assert.assertTrue(page.page8BakilmasiGerekenBitki.isDisplayed());

    }

    @Then("user see all choises are visible and clickable")
    public void user_see_all_choises_are_visible_and_clickable() {
        // #1
        Assert.assertTrue(page.page8CocuklarinizgetirebilirsinizEVET.isDisplayed());
        Assert.assertTrue(page.page8CocuklarinizgetirebilirsinizEVET.isEnabled());
        Assert.assertTrue(page.page8CocuklarinizgetirebilirsinizHAYIR.isDisplayed());
        Assert.assertTrue(page.page8CocuklarinizgetirebilirsinizHAYIR.isEnabled());
        //#2
        Assert.assertTrue(page.page8EvcilhayvanlarigetirebilirsinizEVET.isDisplayed());
        Assert.assertTrue(page.page8EvcilhayvanlarigetirebilirsinizEVET.isEnabled());
        Assert.assertTrue(page.page8EvcilhayvanlarigetirebilirsinizHAYIR.isDisplayed());
        Assert.assertTrue(page.page8EvcilhayvanlarigetirebilirsinizHAYIR.isEnabled());
        //#3
        Assert.assertTrue(page.page8EvdeSigaraIcmeyeIzinVerilirEVET.isDisplayed());
        Assert.assertTrue(page.page8EvdeSigaraIcmeyeIzinVerilirEVET.isEnabled());
        Assert.assertTrue(page.page8EvdeSigaraIcmeyeIzinVerilirHAYIR.isDisplayed());
        Assert.assertTrue(page.page8EvdeSigaraIcmeyeIzinVerilirHAYIR.isEnabled());
        //#4
        Assert.assertTrue(page.page8ArabaDegisimiOlabilirEVET.isDisplayed());
        Assert.assertTrue(page.page8ArabaDegisimiOlabilirEVET.isEnabled());
        Assert.assertTrue(page.page8ArabaDegisimiOlabilirHAYIR.isDisplayed());
        Assert.assertTrue(page.page8ArabaDegisimiOlabilirHAYIR.isEnabled());
        //#5
        Assert.assertTrue(page.page8BakilmasiGerekEvcilHayvanEVET.isDisplayed());
        Assert.assertTrue(page.page8BakilmasiGerekEvcilHayvanEVET.isEnabled());
        Assert.assertTrue(page.page8BakilmasiGerekEvcilHayvanHAYIR.isDisplayed());
        Assert.assertTrue(page.page8BakilmasiGerekEvcilHayvanHAYIR.isEnabled());
        //#6
        Assert.assertTrue(page.page8BakilmasiGerekenBitkiEVET.isDisplayed());
        Assert.assertTrue(page.page8BakilmasiGerekenBitkiEVET.isEnabled());
        Assert.assertTrue(page.page8BakilmasiGerekenBitkiHAYIR.isDisplayed());
        Assert.assertTrue(page.page8BakilmasiGerekenBitkiHAYIR.isEnabled());


    }

    @Then("user see current page eight is visible")
    public void user_see_current_page_eight_is_visible() {
        Assert.assertTrue(page.theNumberOfPage.isDisplayed());
    }

}
