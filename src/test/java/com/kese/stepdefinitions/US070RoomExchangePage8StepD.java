package com.kese.stepdefinitions;

import com.kese.pages.OdaKiralaPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US070RoomExchangePage8StepD {

    OdaKiralaPage page = new OdaKiralaPage();
    @Then("user navigates to page {int} in Room Exchange")
    public void userNavigatesToPageInRoomExchange(int j) throws InterruptedException, AWTException {
        page.dropdownMenuButton.click();
        page.roomExchangeOption.click();
        do{
            // 1.Sayfa
            page.houseButton.click();
            page.nextButton.click();
            if (j == 2)
                break;
            //2.sayfa
            page.selectText.click();
            page.selectTextButton.sendKeys("Frankfurt, Almanya");
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            page.nextButton.click();
            if (j == 3)
                break;
            //3. sayfa
            page.sizeOfAreaUp.sendKeys("50");
            page.nextButton.click();
            if (j == 4)
                break;
            // 4.sayfa
            page.YasAraligi1015.click();
            page.CinsiyetKadin.click();
            page.Kisisayisiartir.click();
            page.nextButton.click();
            if (j == 5)
                break;
            //5. sayfa
            page.tvText.click();
            page.nextButton.click();
            if (j == 6)
                break;
            //6. sayfa
            page.roomExplanation.sendKeys("My home, sweet home.");
            page.nextButton.click();
            if (j == 7)
                break;
            //7.sayfa
            page.museumText.click();
            page.nextButton.click();
            if (j == 8)
                break;
            //8. sayfa
            for (WebElement element : page.yesTexts) {
                element.click();
            }
            page.nextButton.click();
            if (j == 9)
                break;
            //9. sayfa
            page.selectDate.click();
            page.todaysLocator.click();
            page.todaysLocator.click();
            page.nextButton.click();
            if (j == 10)
                break;
        }while(true);
    }
}
