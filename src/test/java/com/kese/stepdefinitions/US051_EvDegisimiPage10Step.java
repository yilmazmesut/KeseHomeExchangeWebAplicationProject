package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import com.kese.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class US051_EvDegisimiPage10Step extends LoginPage {

    EvDegisimiPage page10 = new EvDegisimiPage();

   // @When("user signed in on sign in page")
   // public void userSignedInOnSignInPage() {
   // }

    @And("user navigates to page {int} in home Page")
    public void userNavigatesToPageInHomePage(int arg0) {
    }

    @Then("user verifty that there is a {string} Page Step Number visible on the new home_step ten page")
    public void userVeriftyThatThereIsAPageStepNumberVisibleOnTheNewHome_stepTenPage(String arg0) {

    }

    @Then("user verifty that the title {string} should be visible on the home_room step ten page")
    public void userVeriftyThatTheTitleShouldBeVisibleOnTheHome_roomStepTenPage(String arg0) {

    }

    @Then("user verifty that the description of Resim ve Fotograflar should be visible on the new home_step ten page")
    public void userVeriftyThatTheDescriptionOfResimVeFotograflarShouldBeVisibleOnTheNewHome_stepTenPage() {

    }

    @Then("user verifty that Resimleri Secin button is active and functional on the new home_step ten page")
    public void userVeriftyThatResimleriSecinButtonIsActiveAndFunctionalOnTheNewHome_stepTenPage() {

    }

    @Then("user verifty that Tum Resimleri Kaldir button is active and functional on the new home_step ten page")
    public void userVeriftyThatTumResimleriKaldirButtonIsActiveAndFunctionalOnTheNewHome_stepTenPage() {

    }

    @Then("user verifty that the description of the maximum loading pictures should be visible on the new home_step ten page")
    public void userVeriftyThatTheDescriptionOfTheMaximumLoadingPicturesShouldBeVisibleOnTheNewHome_stepTenPage() {
    }

    @And("user navigates to page {int} in Home Exchange")
    public void userNavigatesToPageInHomeExchange(int arg0) {
    }
}