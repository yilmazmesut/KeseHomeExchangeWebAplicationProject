package com.kese.stepdefinitions.Sprint_3;

import com.kese.pages.BedAndBreakfastPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class US101_BedAndBreakfastPage1StepD extends BedAndBreakfastPage {


    @Then("user verifies opacity value")
    public void userVerifiesOpacityValue() {

        System.out.println("ilerleButton.getAttribute(\"opacity\") = " + ilerleButton.getCssValue("opacity"));
        Assert.assertEquals("0.65", ilerleButton.getCssValue("opacity"));


    }
}
