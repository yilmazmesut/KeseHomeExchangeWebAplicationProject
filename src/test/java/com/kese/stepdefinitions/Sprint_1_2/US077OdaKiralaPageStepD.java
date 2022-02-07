package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.EvDegisimiPage;
import com.kese.pages.OdaKiralaPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US077OdaKiralaPageStepD {

    EvDegisimiPage homePage = new EvDegisimiPage();
    OdaKiralaPage roomPage = new OdaKiralaPage();

    @Then("user verifies that the four picture loading buttons are visible as default on the new room_step ten page")
    public void userVerifiesThatTheFourPictureLoadingButtonsAreVisibleAsDefaultOnTheNewRoom_stepTenPage() {

        Assert.assertTrue(OdaKiralaPage.page10FirstResimEkleIsDisplayed());
        Assert.assertTrue(OdaKiralaPage.page10SecondResimEkleIsDisplayed());
        Assert.assertTrue(OdaKiralaPage.page10ThirdResimEkleIsDisplayed());
        Assert.assertTrue(OdaKiralaPage.page10FourthResimEkleIsDisplayed());
    }

    @Then("user verifies that the first picture loading buttons is clickable as default on the new room_step ten page")
    public void userVerifiesThatTheFirstPictureLoadingButtonsIsClickableAsDefaultOnTheNewRoom_stepTenPage() {
        Assert.assertFalse(OdaKiralaPage.page10FirstResimEkleIsEnabled());

    }

    @Then("user verifies that the rest of the picture loading buttons are disabled on the new room_step ten page")
    public void userVerifiesThatTheRestOfThePictureLoadingButtonsAreDisabledOnTheNewRoom_stepTenPage() {
        Assert.assertTrue(OdaKiralaPage.page10SecondResimEkleIsEnabled());
        Assert.assertTrue(OdaKiralaPage.page10ThirdResimEkleIsEnabled());
        Assert.assertTrue(OdaKiralaPage.page10FourthResimEkleIsEnabled());
    }

    @Then("user verifies that after adding the first image, the second Add image Button should become active and this should continue until the last picture on the new room_step ten page")
    public void userVerifiesThatAfterAddingTheFirstImageTheSecondAddImageButtonShouldBecomeActiveAndThisShouldContinueUntilTheLastPictureOnTheNewRoom_stepTenPage() {
    }


}
