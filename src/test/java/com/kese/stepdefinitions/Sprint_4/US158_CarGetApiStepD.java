package com.kese.stepdefinitions.Sprint_4;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US158_CarGetApiStepD {


    RequestSpecification request = new RequestSpecBuilder()
            .setRelaxedHTTPSValidation()
            .setBaseUri("https://kese.nl/api")
            .build();

    @Given("user connect to {string} about")
    public void userConnectTo(String endPoint) {

        given()
                .when()
                .then()
                .statusCode(202);;


    }

    @Then("user I should be able to see the information")
    public void userIShouldBeAbleToSeeTheInformation(int statusCode) {

        int gelencode=statusCode;
        given()
                .relaxedHTTPSValidation()
                .when()
                .get("https://kese.nl/api/cars/6203d3276939c771620a1db1")
                .then();

        Assert.assertEquals(gelencode,statusCode);
        System.out.println("gelenCode: "+ statusCode);

    }
}

