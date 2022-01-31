package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US050EvDegisimPage9StepDef {

    EvDegisimiPage  edp1 = new EvDegisimiPage();

//    @Then("user verifies selected dates {string} are added under Seçtiğiniz Tarihler")
//    public void user_verifies_selected_dates_are_added_under_sectiginiz_tarihler(String expectedDate) {
//
//       String actualDate= edp1.page9SelectedDate.getText();
//
//        System.out.println(actualDate);
//
//        Assert.assertEquals(actualDate, expectedDate );
//
//
//    }
    @When("user select a date user should see  x button on the right side")
    public void user_select_a_date_user_should_see_x_button_on_the_right_side() {

        System.out.println( edp1.page9XButton.getText());
      boolean xIsDisplayed=edp1.page9XButton.isDisplayed();
        Assert.assertTrue(xIsDisplayed);

    }

    @When("user click on the x button date frame should be clear and {string} should be exist.")
    public void userClickOnTheXButtonDateFrameShouldBeClearAndShouldBeExist(String expectedText) {

        edp1.page9XButton.click();
       String actualText= edp1.page9clickOnDate.getAttribute("placeholder");
       Assert.assertEquals(actualText,expectedText);

    }

//    @When("user delete date on the frame selected date Seçtiğiniz Tarihler shouldn't be displayed")
//    public void userDeleteDateOnTheFrameSelectedDateSeçtiğinizTarihlerShouldnTBeDisplayed() {
//
//   try{
//       edp1.page9SectiginizTarihler.isDisplayed();
//
//   }catch(RuntimeException exception){
//       System.out.println("Seçtiğiniz Tarihler doesn't exist on the frame");
//        }
//
//
//
//
//    }


    @Then("user verifies selected dates {string} are added under Sectiginiz Tarihler")
    public void userVerifiesSelectedDatesAreAddedUnderSectiginizTarihler(String expectedDate) {
        String actualDate= edp1.page9SelectedDate.getText();

        System.out.println(actualDate);

        Assert.assertEquals(actualDate, expectedDate );
    }

    @When("user delete date on the frame selected date Sectiginiz Tarihler shouldn't be displayed")
    public void userDeleteDateOnTheFrameSelectedDateSectiginizTarihlerShouldnTBeDisplayed() {
        try{
            edp1.page9SectiginizTarihler.isDisplayed();

        }catch(RuntimeException exception){
            System.out.println("Seçtiğiniz Tarihler doesn't exist on the frame");
        }


    }
}
