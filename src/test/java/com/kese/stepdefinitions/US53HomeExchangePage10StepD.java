package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import com.kese.pages.LoginPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import java.awt.*;
import java.util.List;

import static java.awt.event.KeyEvent.VK_ENTER;

public class US53HomeExchangePage10StepD {
    EvDegisimiPage page = new EvDegisimiPage();
    @When("user signed in on sign in page")
    public void userSignedInOnSignInPage(DataTable table) {
        List<List<String>> rows = table.asLists(String.class); // I didn't get just list here then I get list of list
        List<String> row = rows.get(0);
        LoginPage.enterUserName(row.get(0));
        LoginPage.enterPassword(row.get(1));
        LoginPage.clickSubmitbutton();
        BrowserUtils.waitForPageToLoad(5);
    }

    @And("user navigates to page {int} in Home Exchange")
    public void userNavigatesToPageInHomeExchange(int sayfa) throws AWTException {
        while(true){
            if( sayfa < 1 || sayfa > 10 ){
                throw new IllegalArgumentException("Not valid page number :"+sayfa);
            }
            // Here you are in Main page
            page.dropdownMenuButton.click();
            page.homeExchangeOption.click();
            if (sayfa == 1)
                break;
            // Here you are in 1st page
            BrowserUtils.waitFor(1);
            page.houseButton.click();
            page.nextButton.click();
            if (sayfa == 2)
                break;
            // Here you are in 2nd page
            page.selectText.click();
            page.selectTextButton.sendKeys("Frankfurt, Almanya");
            BrowserUtils.waitFor(1);
            Robot robot = new Robot();
            robot.keyPress(VK_ENTER);
            BrowserUtils.waitFor(1);
            page.checkBox.click();
            page.nextButton.click();
            if (sayfa == 3)
                break;
            // Here you are in 3rd page
            BrowserUtils.waitFor(1);
            page.sizeOfAreaUp.sendKeys("50");
            page.nextButton.click();
            if (sayfa == 4)
                break;
            // Here you are in 4th page
            BrowserUtils.waitFor(1);
            page.plus.click();
            page.nextButton.click();
            if (sayfa == 5)
                break;
            // Here you are in 5th page
            BrowserUtils.waitFor(1);
            page.tvText.click();
            page.nextButton.click();
            if (sayfa == 6)
                break;
            // Here you are in 6th page
            BrowserUtils.waitFor(1);
            page.homeExplanation.sendKeys("My home, sweet home.");
            page.nextButton.click();
            if (sayfa == 7)
                break;
            // Here you are in 7th page
            BrowserUtils.waitFor(1);
            page.museumText.click();
            page.nextButton.click();
            if (sayfa == 8)
                break;
            // Here you are in 8th page
            for(WebElement element:page.yesTexts){
                element.click();
                BrowserUtils.waitFor(1/2);
            }
            page.nextButton.click();
            if (sayfa == 9)
                break;
            // Here you are in 9th page
            BrowserUtils.waitFor(1);
            page.selectDate.click();
            page.todaysLocator.click();
            BrowserUtils.waitFor(1/2);
            page.todaysLocator.click();
            page.nextButton.click();
            break;
            // Here you are in 10th page
        }
    }

    @Then("user shouldn't save the pictures without adding minimum five pictures")
    public void user_shouldn_t_save_the_pictures_without_adding_minimum_five_pictures() {

    }

    @Then("user asserts the Resimleri Kaydet button should be clickable after adding five images")
    public void user_asserts_the_Resimleri_Kaydet_button_should_be_clickable_after_adding_five_images() {

    }

    @Then("user asserts that a maximum of ten pictures can upload")
    public void user_asserts_that_a_maximum_of_ten_pictures_can_upload() {

    }
}
