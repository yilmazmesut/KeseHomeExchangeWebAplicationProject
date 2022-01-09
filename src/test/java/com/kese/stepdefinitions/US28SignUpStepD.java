package com.kese.stepdefinitions;

import com.kese.pages.SingUpPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US28SignUpStepD {
    SingUpPage singUpPage = new SingUpPage();



    @Given("Click usage")
    public void click_usage() {

        singUpPage.usage.click();

    }


    @And("Click privacy")
    public void clickPrivacy() {
        singUpPage.privacy.click();
    }


    @Then("{string} should be visible")
    public void shouldBeVisible(String tab) {
        switch (tab){

            case "/usage":
                BrowserUtils.verifyElementDisplayed(singUpPage.usage);
                break;
            case "/privacy":
                BrowserUtils.verifyElementDisplayed(singUpPage.privacy);
                break;


        }

    }
}
