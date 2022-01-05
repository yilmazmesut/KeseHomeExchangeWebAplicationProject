package com.kese.stepdefinitions;

import com.kese.utilities.ConfigurationReader;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Given;

public class MainStepDefs {
    @Given("the user goes to main page")
    public void theUserGoesToMainPage() {
        Driver.get().get(ConfigurationReader.get("url"));

    }
}
