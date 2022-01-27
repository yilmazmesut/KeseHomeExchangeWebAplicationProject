package com.kese.stepdefinitions;
import com.kese.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class US005_BedAndVreakFastStep {


        MainPage bed =new MainPage();

       // @Given("the user should be on the homepage")
       // public void userGoesToHomepage() {


      //  }

        @And("The user clicks the")
        public void theUserClicksThe() {

        }

        @And("{string} is selected, {string} should be visibl")
        public void isSelectedShouldBeVisibl(String arg0, String arg1) {
        }

        @Then("user verifies the drop down menu is clickable ,under the {string} text")
        public void userVerifiesTheDropDownMenuIsClickableUnderTheText(String arg0) {

        }

        @And("{string} is selected,")
        public void isSelected(String arg0) {
        }
    }

