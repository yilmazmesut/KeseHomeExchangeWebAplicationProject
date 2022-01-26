package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US047_EvDegisimiPage9StepD {

    EvDegisimiPage evDegisimiPage = new EvDegisimiPage();

    @When("{string} input should be clickable")
    public void inputShouldBeClickable(String arg0) {



    }

    @And("if user clicks {string} input, the date selection window should open")
    public void ifUserClicksInputTheDateSelectionWindowShouldOpen(String arg0) {

    }

    @Then("verify if the header {string} is visible")
    public void verifyIfTheHeaderIsVisible(String header) {
        String headerLocatorText = "//h2[contains(text(),'"+header+"')]";
        WebElement headerLocator = Driver.get().findElement(By.xpath(headerLocatorText));
        Assert.assertTrue(headerLocator.isDisplayed());
    }

    @And("verify if the description {string} is visible")
    public void verifyIfTheDescriptionIsVisible(String description) {
        String descriptionLocatorText = "//p[contains(text(),'"+description+"')]";
        WebElement descriptionLocator = Driver.get().findElement(By.xpath(descriptionLocatorText));
        Assert.assertTrue(descriptionLocator.isDisplayed());

    }

    @And("verify if the number of page {string} is visible")
    public void verifyIfTheNumberOfPageIsVisible(String arg0) {
        Assert.assertTrue(evDegisimiPage.theNumberOfPage.isDisplayed());
    }

//    @Then("user verifies that {string} warning message appears at Ev Degisimi")
//    public void user_verifies_that_warning_message_appearsAtEvDegisimi(String expectedWarningMessage) {
//        String actualWarningMessageText = "//small[contains(text(), '"+expectedWarningMessage+"')]";
//        String actualWarningMessage = Driver.get().findElement(By.xpath(actualWarningMessageText)).getText();
//        Assert.assertEquals(expectedWarningMessage,actualWarningMessage);
//    }
}
