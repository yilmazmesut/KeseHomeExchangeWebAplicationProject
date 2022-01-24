package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import com.kese.pages.OdaKiralaPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;

import static java.awt.event.KeyEvent.VK_ENTER;

public class US078_OdailanVerPage10StepD {
    OdaKiralaPage page1 = new OdaKiralaPage();
    EvDegisimiPage page = new EvDegisimiPage();

    @And("user should click to Ilan Ver go to page {int} in Oda")
    public void userShouldClickToIlanVerGoToPageInOda(int sayfa) throws AWTException {
        while (true) {
            if (sayfa < 1 || sayfa > 10) {
                throw new IllegalArgumentException("Not valid page number :" + sayfa);
            }
            // Here you are in Main page
            page1.dropdownIlanVerButton.click();
            page1.dropDownOda.click();
            if (sayfa == 1)
                break;
            // Here you are in 1st page
            BrowserUtils.waitFor(1);
            page1.page1RoomMustakilEv.click();
            page1.page1RoomKiraBox.click();
            page.ilerleButton.click();
            if (sayfa == 2)
                break;
            // Here you are in 2nd page
            page.selectText.click();
            page.selectTextButton.sendKeys("London, Birleşik Krallık");
            BrowserUtils.waitFor(1);
            Robot robot = new Robot();
            robot.keyPress(VK_ENTER);
            BrowserUtils.waitFor(1);
            page1.step2_CheckBox.click();
            page.ilerleButton.click();
            if (sayfa == 3)
                break;
            // Here you are in 3rd page
            BrowserUtils.waitFor(1);
            page1.page3KullanimAlaniInput.sendKeys("50");
            for (WebElement e : page1.step3_incrementButtons) {
                e.click();
            }
            page.ilerleButton.click();
            if (sayfa == 4)
                break;
            // Here you are in 4th page
            BrowserUtils.waitFor(1);
            page1.page4AgeFarketmez.click();
            page1.page4GenderFarketmez.click();
            page1.page4KisiSayisiPlus.click();
            page.ilerleButton.click();
            if (sayfa == 5)
                break;
            // Here you are in 5th page
            BrowserUtils.waitFor(1);
            page1.page5WIFI.click();
            page.ilerleButton.click();
            if (sayfa == 6)
                break;
            // Here you are in 6th page
            BrowserUtils.waitFor(1);
            page1.page6roomExplanation.sendKeys("Home home sweet home");
            page.ilerleButton.click();
            if (sayfa == 7)
                break;
            // Here you are in 7th page
            BrowserUtils.waitFor(1);
            page1.page7Plaj.click();
            page.ilerleButton.click();
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
            page1.page9InputCalenderBox.click();
            page.todaysLocator.click();
            BrowserUtils.waitFor(1 / 2);
            page.todaysLocator.click();
            page.ilerleButton.click();
            break;
            // Here you are in 10th page
        }
    }
    @And("user should be able to attach at least {int} images with {string}")
    public void userShouldBeAbleToAttachAtLeastImagesWith(int numOfPicture, String arg1) {
        page.page10RemoveAllPicturesButton.click();
        WebElement step10_FileUpload;
        for(int i=1;i<=numOfPicture;i++){ // it must be five pictures in pictures folder
            step10_FileUpload = Driver.get().findElement(By.id("file-upload"+i));
            step10_FileUpload.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/"+(i%5+1)+".jpg");
        }

    }

    @Given("user should be able to attach at least {int} images with {string} button")
    public void userShouldBeAbleToAttachAtLeastImagesWithButton(int arg0, String arg1) {

        // page.page10SelectedPictureButton.click();
        page.step10_FileUpload1.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/1.jpg");
        ///  page.page10SelectedPictureButton.click();
        page.step10_FileUpload2.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/2.jpg");
        //   page.page10SelectedPictureButton.click();
        page.step10_FileUpload3.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/3.jpg");
        //  page.page10SelectedPictureButton.click();
        page.step10_FileUpload4.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/4.jpg");
        //  page.page10SelectedPictureButton.click();
        page.step10_FileUpload5.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/5.jpg");


    }

    @Then("verify the {int} added images")
    public void verifyTheAddedImages(int numOfPicture) {
        Assert.assertTrue(page1.step10_FileUploaded1.isDisplayed());
        Assert.assertTrue(page1.step10_FileUploaded2.isDisplayed());
        Assert.assertTrue(page1.step10_FileUploaded3.isDisplayed());
        Assert.assertTrue(page1.step10_FileUploaded4.isDisplayed());
        Assert.assertTrue(page1.step10_FileUploaded5.isDisplayed());


    }
}

