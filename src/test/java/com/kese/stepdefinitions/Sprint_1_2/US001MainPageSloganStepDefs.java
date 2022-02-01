package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.MainPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Ma;
import org.junit.Assert;

public class US001MainPageSloganStepDefs {


    @Then("the user should see {string} message")
    public void the_user_should_see_message(String string) {

        Assert.assertTrue(new MainPage().slogan.isDisplayed());

    }
}
