package com.kese.stepdefinitions.Sprint_3;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class US085_logoutAPIStepDefs {
    Response response2= null;
    RequestSpecification spec = new RequestSpecBuilder()
            .setBaseUri("https://test.kese.nl/api")
            .build();


    @When("user connectss to {string}")
    public void user_connectss_to(String endPoint) {
        response2 = given().relaxedHTTPSValidation().contentType(ContentType.JSON)
                .and().spec(spec).get(endPoint);
        response2.prettyPrint();
    }

    @Then("verify statuss code is {int}")
    public void verify_statuss_code_is(int expectedStatusCode) {
        Assert.assertEquals(expectedStatusCode, response2.statusCode());
    }

    @Then("user verifiesss that response body has sonuc is {string}")
    public void user_verifiesss_that_response_body_has_sonuc_is(String expectedWord) {

        System.out.println("response2.path(\"sonuc\") = " + response2.path("sonuc"));
        String actualSonuc = response2.path("sonuc").toString();
        System.out.println("sonuc = " + actualSonuc);
        Assert.assertEquals(expectedWord, actualSonuc);


    }

}
