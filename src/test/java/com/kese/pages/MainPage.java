package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends CommonPage {

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement logo;

    private static final By ilanVerButton = By.linkText(" İlan Ver");
    private static final By evDegisimiButton = By.linkText("new_home");
    private static final By odaButton = By.linkText("new_room");
    private static final By bedAndBreakfastButton = By.linkText("new_bed_breakfast");
    private static final By birlikteSeyahatButton = By.linkText("[href='/new_car']");
    private static final By kargoButton = By.linkText("new_cargo");


    public static boolean ilanVerButtonIsDisplayed() {
        return BrowserUtils.isDisplayed(ilanVerButton);

    }

    public static boolean EvDegisimilinkIsDisplayed() {
        return BrowserUtils.isDisplayed(evDegisimiButton);

    }

    public static boolean odalinkIsDisplayed() {
        return BrowserUtils.isDisplayed(odaButton);

    }

    public static boolean bedandBreakfastlinkIsDisplayed() {
        return BrowserUtils.isDisplayed(bedAndBreakfastButton);
    }

    public static boolean birlikteSeyehatlinkIsDisplayed() {
        return BrowserUtils.isDisplayed(birlikteSeyahatButton);

    }

    public static boolean kargolinkIsDisplayed() {
        return BrowserUtils.isDisplayed(kargoButton);

    }

    public static boolean ilanVerButtonIsEnabled() {
        return BrowserUtils.isEnabled(ilanVerButton);

    }

    public static void clickIlanVerButton() {
        BrowserUtils.myClickMethod(ilanVerButton);

    }

    public static void clickEvDegisimiButton() {
        BrowserUtils.myClickMethod(evDegisimiButton);
    }

    public static void clickOdaButton() {
        BrowserUtils.myClickMethod(odaButton);
    }

    public static void clickBedAndBreakfastButton() {
        BrowserUtils.myClickMethod(bedAndBreakfastButton);
    }

    public static void clickBirlikteSeyahatButton() {
        BrowserUtils.myClickMethod(birlikteSeyahatButton);
    }

    public static void clickCargoButton() {
        BrowserUtils.myClickMethod(kargoButton);
    }

}