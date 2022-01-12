package com.kese.pages;

import com.kese.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class CommonPage {
    public CommonPage(){
        PageFactory.initElements(Driver.get(),this);
    }
}
