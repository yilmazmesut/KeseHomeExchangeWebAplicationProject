package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.EvDegisimiPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US049EvDegisimi9PageStepDef {

    EvDegisimiPage edp=new EvDegisimiPage();



    @Then("user verify {string} shold be exist")
    public void userVerifySholdBeExist(String expectedText) {

        String actualText = edp.page9InputCalenderBox.getAttribute("placeholder");
        System.out.println("aCTUAL TEXT FROM ui"+ actualText);
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
        System.out.println("Actual date " +actualDateText);
       Assert.assertTrue(actualDateText.contains("02/16/2022 - 02/16/2022"));
    }

    @Then("user verify pick date input should be enabled")
    public void userVerifyPickDateInputShouldBeEnabled() {
        boolean isCalendarDisable = edp.page9InputCalenderBox.isEnabled();
        System.out.println("takvim disbale mi:  " + isCalendarDisable);
        Assert.assertTrue(isCalendarDisable);
    }
}
