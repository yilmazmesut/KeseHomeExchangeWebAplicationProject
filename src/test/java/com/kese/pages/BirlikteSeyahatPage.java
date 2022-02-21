package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BirlikteSeyahatPage extends CommonPage{

    //Common Locators

    @FindBy(xpath = "//button[text()='İlerle']")
    public WebElement ilerleButton;

    @FindBy(xpath = "//button[text()='Geri']")
    public WebElement geriButton;

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfPage;

    @FindBy(xpath = "//div[@class='px-3 py-2']/h2")
    public WebElement pageTitleText;

    @FindBy(xpath = "(//div[@class='px-3 py-2']/p)[1]")
    public WebElement pageInfoText;

    @FindBy(xpath = "//small[@class='ps-2']")
    public WebElement missingInfoWarningText;

    /**
     * --------------------------------------------------------------------------------------------------------------
     */
    // Nursel - Mandatory locators for skip method to go step by step
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement page2TripStartPointMenu;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement page2TripEndPointMenu;

    @FindBy(xpath = "//textarea")
    public WebElement page3CarInfoTextarea;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement page4MaxKisiPlusButton;

    @FindBy(xpath = "(//div[@class='react-datepicker__input-container'])[1]")
    public WebElement page5TripDateInput;

    @FindBy(xpath = "//p[@class='pt-3']//following::div[@class='react-datepicker__input-container']//input[@type='text']")
    public WebElement page5TripHourMenu;

    @FindBy(xpath = "(//li[@class='react-datepicker__time-list-item '])[5]")
    public WebElement page5TripHour1AMOption;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__portal')]//span[contains(@class,'next')]")
    public WebElement page5TripNextMonthIcon;

    @FindBy(css = ".react-datepicker__day.react-datepicker__day--001")
    public WebElement page5TripNextMonthDay1Icon;

    @FindBy(css = ".react-datepicker__day.react-datepicker__day--007")
    public WebElement page5TripNextMonthDay7Icon;

    public void setPage1CarType(String carType) {
        Driver.get().findElement(By.xpath("//small[text()='" + carType + "']")).click();
    }

    public void setPage2TripStartPoint(String address) {
        page2TripStartPointMenu.sendKeys(address + Keys.ENTER);
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.cssSelector("[id$='-option-0']")).click();
    }

    public void setPage2TripEndPoint(String address) {
        page2TripEndPointMenu.sendKeys(address + Keys.ENTER);
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.cssSelector("[id$='-option-0']")).click();
    }

    public void setPage3CarSeatOption(String carOption) {
        String carLocator = "//span[.='" + carOption + "']";
        Driver.get().findElement(By.xpath(carLocator)).click();
    }

    public void setPage4MaxPerson(Integer maxPerson) {
        for (int i = 0; i < maxPerson; i++)
            page4MaxKisiPlusButton.click();
    }

    public void setPage4AgeOptions(String age) {
        String ageLocator = "//span[.='" + age + "']";
        Driver.get().findElement(By.xpath(ageLocator)).click();
    }

    public void setPage4GenderOption(String gender) {
        String genderLocator = "//span[text()='" + gender + "']";
        Driver.get().findElement(By.xpath(genderLocator)).click();
    }

    public void setPage5TripDates() {
        JavascriptExecutor executor = (JavascriptExecutor) Driver.get();

        page5TripDateInput.click();
        BrowserUtils.waitFor(1);
        executor.executeScript("arguments[0].click();", page5TripNextMonthIcon);
        BrowserUtils.waitFor(1);
        executor.executeScript("arguments[0].click();", page5TripNextMonthDay1Icon);
        BrowserUtils.waitFor(1);
        executor.executeScript("arguments[0].click();", page5TripNextMonthDay7Icon);
    }

    private void setPage5TripHour() {
        BrowserUtils.waitFor(1);
        page5TripHourMenu.click();
        BrowserUtils.waitFor(1);
        page5TripHour1AMOption.click();
        BrowserUtils.waitFor(1);
    }

    public void navigateToPageInBirlikteSeyahat(int sayfa) {
        while (true) {
            if (sayfa < 1 || sayfa > 10) {
                Assert.fail("Not valid page number :" + sayfa);
            }
            if (sayfa == 1)
                break;

            // 1. PAGE
            BrowserUtils.waitFor(1);
            setPage1CarType("Taksi");
            ilerleButton.click();
            if (sayfa == 2)
                break;

            // 2. PAGE
            setPage2TripStartPoint("Litvanya");
            setPage2TripEndPoint("Amsterdam, Hollanda");
            BrowserUtils.waitFor(2);
            ilerleButton.click();
            if (sayfa == 3)
                break;

            // 3. PAGE
            BrowserUtils.waitFor(1);
            setPage3CarSeatOption("Ön Koltuk");
            page3CarInfoTextarea.sendKeys("Sigara İçilmemiş");
            ilerleButton.click();
            if (sayfa == 4)
                break;

            // 4. PAGE
            BrowserUtils.waitFor(1);
            setPage4AgeOptions("Farketmez");
            setPage4GenderOption("Kadin");
            setPage4MaxPerson(3);
            ilerleButton.click();
            if (sayfa == 5)
                break;

            // 5. PAGE
            BrowserUtils.waitFor(1);
            setPage5TripDates();
            setPage5TripHour();
            ilerleButton.click();
            if (sayfa == 6)
                break;

        }
    }



    //Page 4 Nuray

        public boolean isDisplayedText(String text) {
            String buttonLocatorText = "//*[contains(text(),'" + text + "')]";
            WebElement textLocator = Driver.get().findElement(By.xpath(buttonLocatorText));
            return textLocator.isDisplayed();

        }
        public void clickPage4AgeRange(int ageRange) {
            String ageLocator = "(//div[@class='pt-1 d-flex flex-wrap'][1]//div[@class='pr-2 pb-2'])["+ageRange+"]";
            BrowserUtils.waitFor(1);
            Driver.get().findElement(By.xpath(ageLocator)).click();
      }
       public boolean isDisplayedPage4AgeRange(int ageRange) {
        String ageLocator = "(//div[@class='pt-1 d-flex flex-wrap'][1]//div[@class='pr-2 pb-2'])["+ageRange+"]";
        BrowserUtils.waitFor(1);
        WebElement ageRangeLocator= Driver.get().findElement(By.xpath(ageLocator));
        return ageRangeLocator.isDisplayed();
      }

        public boolean greenPage4AgeRangeDisplayed(int ageRange) {
        String ageLocator = "(//span[@class='p-2 px-3 badge rounded-pill text-light bg-success'])["+ageRange+"]";
            WebElement greenAgeRange= Driver.get().findElement(By.xpath(ageLocator));
            return greenAgeRange.isDisplayed();
      }

        public void clickPage4Gender(String text,String num) {
           String genderLocator = "(//span[text()='"+text+"'])["+num+"]";
           Driver.get().findElement(By.xpath(genderLocator)).click();
    }
    public boolean enablePage4Gender(String text,String num) {
        String genderLocator = "(//span[text()='"+text+"'])["+num+"]";
        WebElement enableGender= Driver.get().findElement(By.xpath(genderLocator));
        return enableGender.isEnabled();
    }

    public boolean displayedGreenPage4Gender(String text,String num) {
        String genderLocator = "(//span[@class='p-2 px-3 badge rounded-pill text-light bg-success' and text()='"+text+"'])["+num+"]";
        WebElement displayedGreeenGender=Driver.get().findElement(By.xpath(genderLocator));
        return displayedGreeenGender.isDisplayed();
    }



    @FindBy(xpath = "(//span[text()='Farketmez'])[1]")
    public WebElement page4AgeFarketmez;

    @FindBy(xpath = "(//span[text()='Farketmez'])[2]")
    public WebElement page4GenderFarketmez;

    @FindBy(xpath = "(//span[@class='p-2 px-3 badge rounded-pill text-light bg-success'])[1]")
    public WebElement greenpage4GenderFarketmez;

    @FindBy(xpath = "//button[text()='+']")
    public WebElement page4KisiSayisiIncrement;

    @FindBy(xpath = "//span[text()='Kadin']")
    public WebElement page4GenderKadin;

    @FindBy(xpath = "//span[text()='Erkek']")
    public WebElement page4GenderErkek;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement page4KisiSayisiDecrement;

    @FindBy(xpath = "//span[@class='input-number-value']")
    public WebElement page4KisiSayisiValue;


    }


