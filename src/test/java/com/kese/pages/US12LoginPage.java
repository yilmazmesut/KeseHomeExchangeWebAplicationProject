package com.kese.pages;

import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import org.openqa.selenium.By;

public class US12LoginPage {

    private static final By emailBox = By.name("email");
    private static final By passwordBox = By.name("sifre");
    private static final By submitButton = By.xpath("//button[contains(text(),'Giriş Yap')]");
    private static final By errorMessage = By.xpath("//div[@class='form-group text-center py-1']/small");

    private static final By sifremiUnuttumText = By.xpath("//a[contains(text(),'Şifremi Unuttum')]");


    public static String getMyPageUrl(){

        String myUrl = Driver.get().getCurrentUrl();
        return myUrl;
    }


    public static void clickMySifremiUnuttumButton(){

        Driver.get().findElement(sifremiUnuttumText).click();
    }

    public static String getMyCss() {
        String myCssValue = Driver.get().findElement(sifremiUnuttumText).getCssValue("text-decoration");
        return myCssValue;
    }

    public static boolean isMyElementDisplayed(){

         return Driver.get().findElement(sifremiUnuttumText).isDisplayed();
    }

    public static String getMyText(){

    String myTextMessage = Driver.get().findElement(sifremiUnuttumText).getText();
    return myTextMessage;

}

    public static void enterUserName(String userName)  {

        BrowserUtils.mySendKeysMethod(emailBox, userName);

    }
    public static void enterPassword(String password){

        BrowserUtils.mySendKeysMethod(passwordBox, password );

    }

    public static void clickSubmitbutton(){

        BrowserUtils.myClickMethod(submitButton);
    }

    public static String getErrorMessage(){

        return BrowserUtils.getSingleElementText(errorMessage);

    }

}
