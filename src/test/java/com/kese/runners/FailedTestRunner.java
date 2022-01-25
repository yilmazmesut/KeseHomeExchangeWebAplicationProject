package com.kese.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-report"},
        features = "src/test/resources/features/US055_EvDegisimiPageStepD.feature",
        glue = "com/kese/stepdefinitions",
        dryRun = false
)

public class FailedTestRunner {
}