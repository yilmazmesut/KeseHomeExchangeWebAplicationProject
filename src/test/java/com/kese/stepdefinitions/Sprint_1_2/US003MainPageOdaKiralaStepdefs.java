package com.kese.stepdefinitions.Sprint_1_2;

import com.kese.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US003MainPageOdaKiralaStepdefs {
    MainPage mainPage = new MainPage();
    @Given("the user clicks the Oda Kirala button")
    public void the_user_clicks_the_Oda_Kirala_button() {
        mainPage.odaKiralaButton.click();
    }



    @When("Oda Kirala is selected, the text Oda değişimi yapmak istediğiniz yer should be visible.")
    public void oda_Kirala_is_selected_the_text_Oda_değişimi_yapmak_istediğiniz_yer_should_be_visible() {
        Assert.assertTrue(mainPage.odaDegisimiYapmakIstediginizYer.isDisplayed());
    }



    @Then("user validates the drop down menu is clickable, under the Oda değişimi yapmak istediğiniz yer text")
    public void user_validates_the_drop_down_menu_is_clickable_under_the_Oda_değişimi_yapmak_istediğiniz_yer_text() {
        Assert.assertTrue(mainPage.selectDropDown.isEnabled());
    }


}
