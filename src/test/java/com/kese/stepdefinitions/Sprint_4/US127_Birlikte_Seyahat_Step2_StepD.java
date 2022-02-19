package com.kese.stepdefinitions.Sprint_4;

import com.kese.pages.BirlikteSeyahatPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class US127_Birlikte_Seyahat_Step2_StepD {

    BirlikteSeyahatPage birlikteSeyahatPage = new BirlikteSeyahatPage();

    @Given("user on the page two {string}")
    public void userOnThePageTwo(String expectedPageNumber) {

        Assert.assertTrue(expectedPageNumber.contains(birlikteSeyahatPage.theNumberOfThePage3.getText()));
    }

    @Then("user confirm that page title text is visible")
    public void userConfirmThatPageTitleTextIsVisible() {
        Assert.assertTrue(birlikteSeyahatPage.topText.isDisplayed());
    }

    @And("user confirm that explain section is visible")
    public void userConfirmThatExplainSectionIsVisible() {
        Assert.assertTrue(birlikteSeyahatPage.secondText.isDisplayed());
    }

    @And("user confirm that starting point is selectable")
    public void userConfirmThatStartingPointIsSelectable() {
        birlikteSeyahatPage.firstTextBox.sendKeys("Ann" + Keys.ENTER);
        birlikteSeyahatPage.chooseOption.click();
        Assert.assertTrue(birlikteSeyahatPage.firstTextBoxValidation.getText().contains("Ba"));

    }

    @And("user confirm that ending point is selectable")
    public void userConfirmThatEndingPointIsSelectable() {
        birlikteSeyahatPage.secondTextBox.sendKeys("Ba");
        birlikteSeyahatPage.chooseOption.click();
        Assert.assertTrue(birlikteSeyahatPage.secondTextValidation.getText().contains("Biti"));
    }

    @And("user confirm thar passing point is selectable")
    public void userConfirmTharPassingPointIsSelectable() {
        //There is a bug in here
        birlikteSeyahatPage.thirdTextBox.sendKeys("Fair");
        birlikteSeyahatPage.chooseOption.click();
        System.out.println(birlikteSeyahatPage.thirdTextBoxValidation.getText());
        Assert.assertTrue(birlikteSeyahatPage.thirdTextBoxValidation.getText().contains("Noktalar"));
    }

    @And("user confirm that selected passing point should be visible as a list")
    public void userConfirmThatSelectedPassingPointShouldBeVisibleAsAList() {

    }

    @And("user confirm that passing points are deletable")
    public void userConfirmThatPassingPointsAreDeletable() {
    }


}
