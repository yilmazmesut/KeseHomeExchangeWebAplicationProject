package com.kese.stepdefinitions.Sprint_3;

import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US116_BedAndBreakfastStepD {



    @Then("verify if the {string} is visible")
    public void verifyIfTheIsVisible(String Text) {
        String locatorText = "//*[contains(text(),'"+Text+"')]";
        WebElement locatedElement = Driver.get().findElement(By.xpath(locatorText));
        Assert.assertTrue(locatedElement.isDisplayed());
    }
}
