package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US049EvDegisimi9PageStepDef {

    EvDegisimiPage edp=new EvDegisimiPage();



    @Then("user verify {string} shold be exist")
    public void userVerifySholdBeExist(String expectedText) {

        String actualText = edp.page9InputCalenderBox.getAttribute("placeholder");
        Assert.assertTrue(actualText.contains(expectedText));



    }

    @When("user pick a date")
    public void userPickADate() {
        edp.page9InputCalenderBox.click();
        edp.pickAnyDate.click();
        edp.pickAnyDate.click();


    }

    @Then("user verify picked date should be exist in the input")
    public void userVerifyPickedDateShouldBeExistInTheInput() {
        String actualDateText = edp.page9InputCalenderBox.getAttribute("value");
        Assert.assertTrue(actualDateText.contains("01/16/2022 - 01/16/2022"));
    }

    @Then("user verify pick date input should be enabled")
    public void userVerifyPickDateInputShouldBeEnabled() {
        boolean isCalendarDisable = edp.page9InputCalenderBox.isEnabled();
        System.out.println("takvim disbale mi:  " + isCalendarDisable);
        Assert.assertTrue(isCalendarDisable);
    }
}
