package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.EvDegisimiPage;
import com.kese.pages.LoginPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.awt.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    public void userNavigatesToPageInHomeExchange(int sayfa) {
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
            page.selectTextButton.sendKeys(Keys.ENTER);
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

    @Then("user shouldn't save the pictures without adding minimum {int} pictures")
    public void minimumPicturesDestruction(int numberOfPicture) {
        WebElement step10_FileUpload;
        for(int i=1;i<numberOfPicture;i++){ // it must be five pictures in pictures folder
            step10_FileUpload = Driver.get().findElement(By.id("file-upload"+i));
            step10_FileUpload.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/"+(i%5+1)+".jpg");
            page.step10_ResimleriKaydetButton.click();
            WebElement publishAdButton = page.step10_publishAdButton;
            //  'İlanı Yayınla' button mustn't be display here then throws exception
            Assert.assertThrows(org.openqa.selenium.NoSuchElementException.class, publishAdButton::isDisplayed);
        }

    }

    @When("user adds {int} pictures on the home change page")
    public void uploadImages(int numberOfImages) {
        // For the code to work, there must be pictures folder in the directory.
        // and it must be minimum five pictures in pictures folder
        String originDirectory = System.getProperty("user.dir") + "/src/test/resources/pictures";
        // Get all names of files from origin Directory
        File originDir = new File(originDirectory);
        File[] listOfFiles = originDir.listFiles();
        // There must be file in folder
        assert listOfFiles != null;
        // It's time to send paths of files
        WebElement step10_FileUpload;
        for(int i=1;i<=numberOfImages;i++){
            // path of file
            Path pathOfFile = Paths.get(originDir.getPath()).resolve(listOfFiles[i%listOfFiles.length].getName());
            step10_FileUpload = Driver.get().findElement(By.id("file-upload"+i));
            step10_FileUpload.sendKeys(pathOfFile.toString());
        }

    }

    @Then("user asserts that it can't be upload more images")
    public void maximunPicturesDestriction() {
        // add image frame shouldn't display and throw exeption
        WebElement addImageText = page.step10_addImageText;
        // 'Resim Ekle' frame mustn't be display here then throws exception
        Assert.assertThrows(org.openqa.selenium.NoSuchElementException.class, addImageText::isDisplayed);
    }

    @Then("user asserts that the Resimleri Kaydet button is clickable")
    public void savePicturesButtonMustClickableAfterImageUpload() {
        WebElement savePicturesButton = page.step10_ResimleriKaydetButton;
        Assert.assertTrue(savePicturesButton.isDisplayed());
        Assert.assertTrue(savePicturesButton.isEnabled());
    }
}
