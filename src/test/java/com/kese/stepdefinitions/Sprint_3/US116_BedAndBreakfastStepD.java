package com.kese.stepdefinitions.Sprint_3;

import com.kese.pages.BedAndBreakfastPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class US116_BedAndBreakfastStepD {

    BedAndBreakfastPage bab =new BedAndBreakfastPage();


    @Then("verify text {string} the is visible")
    public void verifyTextTheIsVisible(String text) {
        BrowserUtils.waitFor(1);
        String locatorText = "//*[contains(text(),'"+text+"')]";
        WebElement locatedElement = Driver.get().findElement(By.xpath(locatorText));
        Assert.assertTrue(locatedElement.isDisplayed());
    }

    @Then("clicks Tarih seçmek için tıklayınız input, verify date selection window is visible")
    public void clicksTarihSeçmekIçinTıklayınızInputVerifyDateSelectionWindowIsVisible() {

        LocalDate currentDate = LocalDate.now();
        bab.page9InputCalenderBox.click();
        Assert.assertTrue(bab.page9currentMonthText.isDisplayed());
//        System.out.println(currentDate.getMonth());
//        System.out.println(bab.page9currentMonthText.getText());
        String nowMonth = String.valueOf(currentDate.getMonth());
        Assert.assertTrue(bab.page9currentMonthText.getText().toUpperCase().contains(nowMonth)); //();

    }


    @Then("verify the number of page {string} is visible")
    public void verifyTheNumberOfPageIsVisible(String pageNum) {
        String text = bab.theNumberOfPage.getText();
        System.out.println(text);
        Assert.assertEquals(pageNum, text);


    }

}
