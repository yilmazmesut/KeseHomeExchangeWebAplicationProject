package com.kese.stepdefinitions.Sprint_3;

import com.kese.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

public class US096_RoomsDeleteIlanlarStepD {


    String baseUrl= "https://test.kese.nl/api";
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZjg4MDNkOGNhN2VjNDM2YzViODhhZiIsImVtYWlsIjoiYXppemkuMTRAZ21haWwuY29tIiwicm9sIjoia3VsbGFuaWNpIiwia3VsbGFuaWNpX2FkaSI6ImF6aXozNDM4IiwiZHVydW0iOjF9LCJpYXQiOjE2NDM4OTc3NDAsImV4cCI6MTY3NTQzMzc0MH0.2zWIRRSvKaVDWba0B1CsqRSHWH4r9dNGaDX5ImAFq4Y";
    Response response=null;
    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri(baseUrl)
            .build();

    @When("user connects to {string} for rooms API")
    public void userConnectsToForRoomsAPI(String endPoint) {
        response = given().queryParam("secret_token", token).relaxedHTTPSValidation().
                contentType(ContentType.JSON).
                spec(request).get(endPoint);
    }

    @Given("user deletes rooms for rooms API")
    public void userDeletesRoomsForRoomsAPI() {
        response = given().queryParam("secret_token", token).relaxedHTTPSValidation().
                contentType(ContentType.JSON).
                spec(request).
                when().
                delete("/61fe559be970093ad0e4c829");
    }


}
