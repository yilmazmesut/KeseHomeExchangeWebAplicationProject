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

    @And("user navigates to page ten in Home Exchange")
    public void userNavigatesToPageInHomeExchange() throws AWTException {
        // Main page
        page.dropdownMenuButton.click();
        page.homeExchangeOption.click();
        // 1st page
        BrowserUtils.waitFor(1);
        page.houseButton.click();
        page.nextButton.click();
        // 2nd page
        page.selectText.click();
        page.selectTextButton.sendKeys("Frankfurt, Almanya");
        BrowserUtils.waitFor(1);
        Robot robot = new Robot();
        robot.keyPress(VK_ENTER);
        BrowserUtils.waitFor(1);
        page.checkBox.click();
        page.nextButton.click();
        // 3rd page
        BrowserUtils.waitFor(1);
        page.sizeOfAreaUp.sendKeys("50");
        page.nextButton.click();
        // 4th page
        BrowserUtils.waitFor(1);
        page.plus.click();
        page.nextButton.click();
        //5th page
        BrowserUtils.waitFor(1);
        page.tvText.click();
        page.nextButton.click();
        //6th page
        BrowserUtils.waitFor(1);
        page.homeExplanation.sendKeys("My home, sweet home.");
        page.nextButton.click();
        //7th page
        BrowserUtils.waitFor(1);
        page.museumText.click();
        page.nextButton.click();
        //8th page
        for(WebElement element:page.yesTexts){
            element.click();
            BrowserUtils.waitFor(1/2);
        }
        page.nextButton.click();
        //9th page
        BrowserUtils.waitFor(1);
        page.selectDate.click();
        page.todaysLocator.click();
        BrowserUtils.waitFor(1/2);
        page.todaysLocator.click();
        page.nextButton.click();
    }
}
