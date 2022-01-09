package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import org.openqa.selenium.By;

public class SignUpPage {

    private static final By girisYapButton = By.linkText("Giriş Yap");


    public static boolean girisYapButtonIsDisplayed(){
    return BrowserUtils.isDisplayed(girisYapButton);

    }

    public static boolean girisYapButtonIsEnabled(){
    return BrowserUtils.isEnabled(girisYapButton);

    }

    public static void clickGirisYapButton(){
        BrowserUtils.myClickMethod(girisYapButton);
    }

}
