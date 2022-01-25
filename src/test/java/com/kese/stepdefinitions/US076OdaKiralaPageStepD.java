package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import com.kese.pages.LoginPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;

import static java.awt.event.KeyEvent.VK_ENTER;

public class US076OdaKiralaPageStepD extends LoginPage {

    EvDegisimiPage page = new EvDegisimiPage();

        @And("user navigates to page {int} in Room Exchange Page")
    public void userNavigatesToPageInRoomExchangePage(int sayfa) throws AWTException {
        while (true) {
            if (sayfa < 1 || sayfa > 10) {
                throw new IllegalArgumentException("Not valid page number :" + sayfa);
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
            BrowserUtils.waitFor(2);
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
            for (WebElement element : page.yesTexts) {
                element.click();
                BrowserUtils.waitFor(1 / 2);
            }
            page.nextButton.click();
            if (sayfa == 9)
                break;
            // Here you are in 9th page
            BrowserUtils.waitFor(1);
            page.selectDate.click();
            page.todaysLocator.click();
            BrowserUtils.waitFor(1 / 2);
            page.todaysLocator.click();
            page.nextButton.click();
            break;
            // Here you are in 10th page
        }

    }

    @Then("user verifies that there is a {string} Page Step Number visible on the new room_step ten page")
    public void userVerifiesThatThereIsAPageStepNumberVisibleOnTheNewRoom_stepTenPage(String arg0) {
    }

    @Then("user verifies that the title {string} should be visible on the new_room step ten page")
    public void userVerifiesThatTheTitleShouldBeVisibleOnTheNew_roomStepTenPage(String arg0) {
    }

    @Then("user verifies that the description of Resim ve Fotograflar should be visible on the new room_step ten page")
    public void userVerifiesThatTheDescriptionOfResimVeFotograflarShouldBeVisibleOnTheNewRoom_stepTenPage() {
    }

    @Then("user verifies that Resimleri Secin button is active and functional on the new room_step ten page")
    public void userVerifiesThatResimleriSecinButtonIsActiveAndFunctionalOnTheNewRoom_stepTenPage() {
    }

    @Then("user verifies that Tum Resimleri Kaldir button is active and functional on the new room_step ten page")
    public void userVerifiesThatTumResimleriKaldirButtonIsActiveAndFunctionalOnTheNewRoom_stepTenPage() {
    }

    @Then("user verifies that the description of the maximum loading pictures should be visible on the new room_step ten page")
    public void userVerifiesThatTheDescriptionOfTheMaximumLoadingPicturesShouldBeVisibleOnTheNewRoom_stepTenPage() {
    }
}
