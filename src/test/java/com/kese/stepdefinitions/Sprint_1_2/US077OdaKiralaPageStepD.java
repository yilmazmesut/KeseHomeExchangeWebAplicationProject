package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.BedAndBreakfastPage;
import com.kese.pages.EvDegisimiPage;
import com.kese.pages.OdaKiralaPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US077OdaKiralaPageStepD {

    EvDegisimiPage homePage = new EvDegisimiPage();
    OdaKiralaPage roomPage = new OdaKiralaPage();

    @Then("user verifies that the four image add buttons are visible as default on the new room_step ten page")
    public void userVerifiesThatTheFourPictureLoadingButtonsAreVisibleAsDefaultOnTheNewRoom_stepTenPage() {

        Assert.assertTrue(OdaKiralaPage.page10FirstResimEkleIsDisplayed());
        Assert.assertTrue(OdaKiralaPage.page10SecondResimEkleIsDisplayed());
        Assert.assertTrue(OdaKiralaPage.page10ThirdResimEkleIsDisplayed());
        Assert.assertTrue(OdaKiralaPage.page10FourthResimEkleIsDisplayed());
    }

    @Then("user verifies that only the first image add buttons is clickable as default on the new room_step ten page")
    public void userVerifiesThatTheFirstPictureLoadingButtonsIsClickableAsDefaultOnTheNewRoom_stepTenPage() {
        Assert.assertFalse(OdaKiralaPage.page10FirstResimEkleIsEnabled());

    }

    @Then("user verifies that the rest of the image add buttons are disabled on the new room_step ten page")
    public void userVerifiesThatTheRestOfThePictureLoadingButtonsAreDisabledOnTheNewRoom_stepTenPage() {
        Assert.assertTrue(OdaKiralaPage.page10SecondResimEkleIsEnabled());
        Assert.assertTrue(OdaKiralaPage.page10ThirdResimEkleIsEnabled());
        Assert.assertTrue(OdaKiralaPage.page10FourthResimEkleIsEnabled());
    }

    @When("user uploads an image {string} {string}")
    public void userUploadsAnImage(String locator, String imageName) {
        OdaKiralaPage.uploadImage(By.id(locator), imageName);

    }

    @Then("user verifies that the second image button becomes active after adding an image")
    public void userVerifiesThatTheSecondImageButtonBecomesActiveAfterAddingAnImage() {
        Assert.assertFalse(OdaKiralaPage.page10SecondResimEkleIsEnabled());

    }

    @Then("user verifies that the third image button becomes active after adding an image")
    public void userVerifiesThatTheThirdImageButtonBecomesActiveAfterAddingAnImage() {
        Assert.assertFalse(OdaKiralaPage.page10ThirdResimEkleIsEnabled());

    }

    @Then("user verifies that the fourth image button becomes active after adding an image")
    public void userVerifiesThatTheFourthImageButtonBecomesActiveAfterAddingAnImage() {
        Assert.assertFalse(OdaKiralaPage.page10FourthResimEkleIsEnabled());

    }
}
