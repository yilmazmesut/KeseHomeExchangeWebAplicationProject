package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

public class US043_EvDegisimiPage7StepD {

    EvDegisimiPage evDegisimiPage = new EvDegisimiPage();


    @Then("user verifies that {string} is visible")
    public void userVerifiesThatIsVisible(String expectedTitle) {
        String actualTitle = evDegisimiPage.page7aktivitelerText.getText();
        BrowserUtils.verifyElementDisplayed(evDegisimiPage.page7aktivitelerText);
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("user verifies that {string} message is visible")
    public void user_verifies_that_message_is_visible(String expectedInfoText) {
        String actualInfoText = evDegisimiPage.page7InfoText.getText();
        BrowserUtils.verifyElementDisplayed(evDegisimiPage.page7InfoText);
        Assert.assertEquals(expectedInfoText,actualInfoText);
    }


    @Then("user verifies that number of the {string} page is visible")
    public void userVerifiesThatNumberOfThePageIsVisible(String expectedNumberOfPage) {
        String actualNumberOfPage = evDegisimiPage.theNumberOfPage7.getText();
        Assert.assertEquals(expectedNumberOfPage,actualNumberOfPage);
    }

    @Then("user verifies that all selections should be clickable")
    public void user_verifies_that_all_selections_should_be_clickable(List<String> selections) {

        for (String selection : selections) {
            Assert.assertTrue(evDegisimiPage.clickable(selection));

        }

    }

}
