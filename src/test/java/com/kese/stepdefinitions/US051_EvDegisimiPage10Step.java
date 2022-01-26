package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import com.kese.pages.LoginPage;
import io.cucumber.java.en.Then;


public class US051_EvDegisimiPage10Step extends LoginPage {

    EvDegisimiPage page10 = new EvDegisimiPage();

@Then("user verifty that there is a {string} Page Step Number visible on the new room_step ten page")
    public void userVeriftyThatThereIsAPageStepNumberVisibleOnTheNewRoom_stepTenPage(String arg0) {
}

    @Then("user verifty that the title {string} should be visible on the new_room step ten page")
    public void userVeriftyThatTheTitleShouldBeVisibleOnTheNew_roomStepTenPage(String arg0) {
    }

    @Then("user verifty that the description of Resim ve Fotograflar should be visible on the new room_step ten page")
    public void userVeriftyThatTheDescriptionOfResimVeFotograflarShouldBeVisibleOnTheNewRoom_stepTenPage() {
        
    }

    @Then("user verifty that Resimleri Secin button is active and functional on the new room_step ten page")
    public void userVeriftyThatResimleriSecinButtonIsActiveAndFunctionalOnTheNewRoom_stepTenPage() {
        
    }

    @Then("user verifty that Tum Resimleri Kaldir button is active and functional on the new room_step ten page")
    public void userVeriftyThatTumResimleriKaldirButtonIsActiveAndFunctionalOnTheNewRoom_stepTenPage() {
    }

    @Then("user verifty that the description of the maximum loading pictures should be visible on the new room_step ten page")
    public void userVeriftyThatTheDescriptionOfTheMaximumLoadingPicturesShouldBeVisibleOnTheNewRoom_stepTenPage() {
    }
}
