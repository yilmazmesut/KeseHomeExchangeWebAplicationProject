package com.kese.stepdefinitions;

import com.kese.pages.EvDegisimiPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class US122_BedAndBreakfastPage10StepD {
    EvDegisimiPage page = new EvDegisimiPage();
    @And("user navigates to page {int} in Bed & Breakfast")
    public void userNavigatesToPageInBedBreakfast(int sayfa) {
        while(true){
            if( sayfa < 1 || sayfa > 10 ){
                Assert.fail("Not valid page number :"+sayfa);
            }
            // Here you are in Main page
            page.dropdownMenuButton.click();
            // Ana sayfada ki Ilan Ver menusu icinde ki Bed & Breakfast secenegi
            Driver.get().findElement(By.xpath("//*[contains(text(),' Bed & Breakfast')]")).click();
            if (sayfa == 1)
                break;
            // Here you are in 1st page
            BrowserUtils.waitFor(1);
            page.houseButton.click();
            page.nextButton.click();
            if (sayfa == 2)
                break;
            // Here you are in 2nd page
            page.selectText.click();
            page.selectTextButton.sendKeys("Frankfurt, Almanya");
            BrowserUtils.waitFor(1);
            page.selectTextButton.sendKeys(Keys.ENTER);
            BrowserUtils.waitFor(1);
            page.checkBox.click();
            BrowserUtils.waitFor(2);
            page.nextButton.click();
            if (sayfa == 3)
                break;
            // Here you are in 3rd page
            BrowserUtils.waitFor(1);
            page.sizeOfAreaUp.sendKeys("50");
            page.nextButton.click();
            if (sayfa == 4)
                break;
            // Here you are in 4th page
            BrowserUtils.waitFor(1);
            // Yas araligi opsiyonunlarindan 10-15 araligi
            Driver.get().findElement(By.xpath("//*[contains(text(),'10-15')]")).click();
            // Cinsiyet opsiyonlarindan Erkek
            Driver.get().findElement(By.xpath("//*[contains(text(),'Erkek')]")).click();
            page.plus.click();
            page.nextButton.click();

            if (sayfa == 5)
                break;
            // Here you are in 5th page
            BrowserUtils.waitFor(1);
            page.tvText.click();
            page.nextButton.click();
            if (sayfa == 6)
                break;
            // Here you are in 6th page
            BrowserUtils.waitFor(1);
            // Kullandirilacak Oda hakkinda bilgi
            Driver.get().findElement(By.id("room")).sendKeys("Large and spacious");
            // Ev hakkinda bilgi
            page.homeExplanation.sendKeys("My home, sweet home.");
            //Kahvalti hakkinda bilgi
            Driver.get().findElement(By.id("breakfast")).sendKeys("Cheese, bread, tea.");
            page.nextButton.click();
            if (sayfa == 7)
                break;
            // Here you are in 7th page
            BrowserUtils.waitFor(1);
            page.museumText.click();
            page.nextButton.click();
            if (sayfa == 8)
                break;
            // Here you are in 8th page
            for(WebElement element:page.yesTexts){
                element.click();
                BrowserUtils.waitFor(1/2);
            }
            page.nextButton.click();
            if (sayfa == 9)
                break;
            // Here you are in 9th page
            BrowserUtils.waitFor(1);
            page.selectDate.click();
            page.todaysLocator.click();
            BrowserUtils.waitFor(1/2);
            page.todaysLocator.click();
            page.nextButton.click();
            break;
            // Here you are in 10th page
        }
    }
}
