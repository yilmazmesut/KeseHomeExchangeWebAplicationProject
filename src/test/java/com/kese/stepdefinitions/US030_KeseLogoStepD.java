package com.kese.stepdefinitions;

import com.kese.pages.MainPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.ConfigurationReader;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class US030_KeseLogoStepD {

    String homePageTitle;
    String advertPageTitle;
    MainPage mainPage = new MainPage();
    WebDriver driver= Driver.get();

    @Given("the user should be on the homepage")
    public void the_user_should_be_on_the_homepage() {
        driver.get(ConfigurationReader.get("url"));
        homePageTitle= Driver.get().getTitle();
    }

    @When("user hits the {string} on the homepage")
    public void user_hits_the_on_the_homepage(String cardTitle) {

        String pathOfAdvert="//a[contains(text(),'"+cardTitle+"')]";
        BrowserUtils.waitForPageToLoad(5);
        WebElement advert= driver.findElement(By.xpath(pathOfAdvert));

        BrowserUtils.scrollToElement(advert);

        if(cardTitle.equals("Terborg, Hollanda")){
            WebElement cardBox= driver.findElement(By.xpath("//div[@class='col-6 col-lg-4 col-xl-3 mb-3 mb-md-4 pb-1']"));
            BrowserUtils.hover(cardBox);
        }else if(cardTitle.equals("London")){
            WebElement cardBox= driver.findElement(By.xpath("//div[@class='col-6 col-lg-4 col-xl-3 mb-3 mb-md-4 pb-1'][2]"));
            BrowserUtils.hover(cardBox);
        }

        BrowserUtils.waitForClickability(By.xpath(pathOfAdvert),3);
        advert.click();

        BrowserUtils.waitForPageToLoad(3);
        advertPageTitle= driver.getTitle();
    }

    @Then("verify the title is changed")
    public void verify_the_title_is_changed() {
        Assert.assertTrue(driver.getTitle().equals(advertPageTitle));
    }

    @When("user hits the KESE logo on the advert page")
    public void user_hits_the_KESE_logo_on_the_advert_page() {
        BrowserUtils.waitFor(2);
        mainPage.logo.click();
    }

    @Then("system should display homepage")
    public void system_should_display_homepage() {
        Assert.assertEquals(driver.getTitle(),homePageTitle);
    }

    @When("user hits the KESE logo on the homepage")
    public void user_hits_the_KESE_logo_on_the_homepage() {
        mainPage.logo.click();
    }

    @Then("the system should NOT navigate another page")
    public void the_system_should_NOT_navigate_another_page() {
        Assert.assertEquals(driver.getTitle(),homePageTitle);
    }



}
