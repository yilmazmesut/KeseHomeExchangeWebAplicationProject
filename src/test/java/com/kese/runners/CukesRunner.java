package com.kese.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {"pretty","html:target/failed-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/US18KeseLoginPage.feature",
        glue = "com/kese/stepdefinitions",
        tags = "@META3-125",
        dryRun =false
)
public class CukesRunner {

}
