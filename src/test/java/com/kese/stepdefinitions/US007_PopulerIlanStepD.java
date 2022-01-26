package com.kese.stepdefinitions;


import com.kese.pages.MainPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US007_PopulerIlanStepD {

    WebDriver driver= Driver.get();
    MainPage mainPage= new MainPage();

    @Then("system should display Populer Ilanlar text on the homepage")
    public void system_should_display_Populer_Ilanlar_text_on_the_homepage() {
        String text = mainPage.headerPopIlan.getText();
        System.out.println("text = " + text);
        Assert.assertEquals("Popüler İlanlar",text);
    }

    @Then("system should display options on the homepage")
    public void system_should_display_options_on_the_homepage(List<String> expectedOptions) {
        System.out.println("expectedOptions = " + expectedOptions);

        List<String> actualOptions= new ArrayList<>();

        for(int i=0; i<expectedOptions.size(); i++) {
            WebElement element;
                element= driver.findElement(By.xpath("//span[@class='tabtext font-weight-semi-bold'][.='"+expectedOptions.get(i)+"']"));
                String textOfOp= element.getText();
                actualOptions.add(textOfOp);
            }

        System.out.println("actualOptions = " + actualOptions);
    }



    @When("click {string} on the homepage")
    public void click_on_the_homepage(String option) {
        String path= "//span[@class='tabtext font-weight-semi-bold'][.='"+option+"']";
        driver.findElement(By.xpath(path)).click();

    }

    @When("system redirects from homepage to {string} pages")
    public void system_redirects_from_homepage_to_pages(String partOfUrl) {
        String hrefOfTab= mainPage.activeTab.getAttribute("href");
        Assert.assertTrue(hrefOfTab.contains(partOfUrl));

    }

}
