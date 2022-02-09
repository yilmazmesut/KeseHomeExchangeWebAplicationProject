package com.kese.stepdefinitions.Sprint_3;

import com.kese.pages.BedAndBreakfastPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US106_BedAndBreakfastP4StepD {
    BedAndBreakfastPage page=new BedAndBreakfastPage();

    @And("user clicks on Özel Oda İmkanı button")
    public void userClicksOnÖzelOdaİmkanıButton() {
        page.page4OzelOdaImkaniHAYIR.click();
        page.page4OzelOdaImkaniEVET.click();
    }

    @Then("user verifies button is clickable")
    public void userVerifiesButtonIsClickable() {
        Assert.assertTrue(page.page4OzelOdaImkaniEVET.isSelected());

    }

    @And("user clicks on Kahvaltı button")
    public void userClicksOnKahvaltıButton() {
        page.page4KahvaltiHAYIR.click();
        page.page4KahvaltiEVET.click();
    }

    @Then("user verifies Bol Cesit hayır button is visible")
    public void userVerifiesBolCesitHayırButtonIsVisible() {
        if(page.page4KahvaltiEVET.isSelected()){
            Assert.assertTrue(page.page4BolCesitHAYIR.isDisplayed());
            Assert.assertTrue(page.page4BolCesitHAYIR.isDisplayed());
        }
    }
}

