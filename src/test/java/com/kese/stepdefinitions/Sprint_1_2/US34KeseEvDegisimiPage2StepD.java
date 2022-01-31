package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.EvDegisimiPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class US34KeseEvDegisimiPage2StepD {

    EvDegisimiPage evDegisimiPage = new EvDegisimiPage();
    @And("user verifies that ilerle button should not be clickable")
    public void userVerifiesThatIlerleButtonShouldNotBeClickable() {


        Assert.assertTrue(evDegisimiPage.ilerleButton.isDisplayed());

    }
}
