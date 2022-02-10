package com.kese.stepdefinitions.Sprint_3;

import com.kese.pages.BedAndBreakfastPage;
import com.kese.pages.CommonPage;
import com.kese.pages.LoginPage;
import com.kese.pages.MainPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class US100_BedAndBreakfastPage1StepD {
//     BedAndBreakfastPage page = new BedAndBreakfastPage();
//
//    @Given("User should see {string} title on page one of Bed and Breakfast")
//    public void userShouldSeeTitleOnPageOneOfBedAndBreakfast(String title) {
//        Assert.assertTrue(page.pageTitleText.isDisplayed());
//    }
//
//    @Then("User should see the {string} statement on page one of Bed and Breakfast")
//    public void userShouldSeeTheStatementOnPageOneOfBedAndBreakfast(String typeQuestion) {
//     Assert.assertTrue(page.bedAndBreakfastp1HouseTypeQuestion.isDisplayed());
//    }
//
//    @Then("User should see the {string} part on page one of Bed and Breakfast")
//    public void userShouldSeeThePartOnPageOneOfBedAndBreakfast(String thenumberofpage) {
//        Assert.assertTrue(page.theNumberOfPage.isDisplayed());
//    }
//
//    @And("user asserts {string} is visible and clicable on page one of Bed and Breakfast")
//    public void userAssertsIsVisibleAndClicableOnPageOneOfBedAndBreakfast(String evturu) {
//        if(evturu.equals("Mustakil Ev")){
//            Assert.assertTrue(page.bedAndBreakfastp1Mustakil.isDisplayed());
//            Assert.assertTrue(page.bedAndBreakfastp1Mustakil.isEnabled());
//        } else if(evturu.equals("Apartaman Dairesi")){
//            Assert.assertTrue(page.bedAndBreakfastp1Apartman.isDisplayed());
//            Assert.assertTrue(page.bedAndBreakfastp1Apartman.isEnabled());
//        }else{
//            Assert.assertTrue(page.bedAndBreakfastp1Studyo.isDisplayed());
//            Assert.assertTrue(page.bedAndBreakfastp1Studyo.isEnabled());
//        }
//
//    }
//
//    @Given("the user should navigate to {string} page")
//    public void theUserShouldNavigateToPage(String url1) {
//        Driver.get().get(url1);
//      WebElement email= Driver.get().findElement(By.xpath("//input[@class='form-control ']"));
//       WebElement sifre = Driver.get().findElement(By.xpath("//input[@class='form-control']"));
//       WebElement girisButton = Driver.get().findElement(By.xpath("//button[@type='submit']"));
//       BrowserUtils.waitFor(5);
//       email.sendKeys("kullanici1@gmail.com");
//        sifre.sendKeys("1234");
//        girisButton.click();
//
//
//
//
//
//    }
//
//    @Given("user navigate to {string}")
//    public void userNavigateTo(String roompage) {
//    }



    BedAndBreakfastPage page = new BedAndBreakfastPage();
    MainPage mainPage = new MainPage();




    @When("user signed in on sign in page username {string}")
    public void userSignedInOnSignInPageUsername(String username) {
        WebElement mailbox= Driver.get().findElement(By.xpath("//input[@class='form-control ']"));
        BrowserUtils.waitFor(3);
           mailbox.sendKeys(username);
    }

    @And("user signed in on sign in page password {string}")
    public void userSignedInOnSignInPagePassword(String password) {

       WebElement passwordbox = Driver.get().findElement(By.xpath("//input[@class='form-control']"));
       passwordbox.sendKeys(password);
      WebElement girisButton = Driver.get().findElement(By.xpath("//button[@type='submit']"));
      girisButton.click();
    }


    @And("user navigates to page first in Bed And Breakfast Page")
    public void userNavigatesToPageFirstInBedAndBreakfastPage() {
        mainPage.dropdownMenuButton.click();
        // Ana sayfada ki Ilan Ver menusu icinde ki Bed & Breakfast secenegi
        mainPage.bedAndBreakfastOption2.click();

    }



}

