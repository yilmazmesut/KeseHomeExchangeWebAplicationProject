package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US044_EvDegisimiPage7StepD {

    EvDegisimiPage evDegisimiPage = new EvDegisimiPage();

    @Then("user verifies that {string} button is visible")
    public void user_verifies_that_button_is_visible(String expectedButton) {
        String actualButton=evDegisimiPage.ilerleButton.getText();
        BrowserUtils.verifyElementDisplayed(evDegisimiPage.ilerleButton);
        Assert.assertEquals(expectedButton,actualButton);

    }



    @Then("user verifies that {string} button shouldn't be clickable as a default")
    public void user_verifies_that_button_shouldn_t_be_clickable_as_a_default(String link) {
//        Assert.assertFalse(BrowserUtils.waitUntilVisibilityOf(By.linkText(link)).isEnabled());
    }

    @When("user clicks {string} button without any selection")
    public void user_clicks_button_without_any_selection(String link) {
        BrowserUtils.myClickMethod(By.linkText(link));
    }

    @Then("user verifies that {string} warning message appears")
    public void user_verifies_that_warning_message_appears(String expectedWarningMessage) {
//        String actualWarningMessage = evDegisimiPage.page7ActiviteWarningMessage.getText();
//        Assert.assertEquals(expectedWarningMessage,actualWarningMessage);

    }

    @When("user clicks any {string}")
    public void user_clicks_any(String selection) {
        evDegisimiPage.clickAnySelection(selection);
    }


    @Then("user verifies that ilerle button should be clickable")
    public void userVerifiesThatIlerleButtonShouldBeClickable() {
        Assert.assertTrue(evDegisimiPage.ilerleButton.isEnabled());
    }
}
