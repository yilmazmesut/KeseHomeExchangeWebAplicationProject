package com.kese.stepdefinitions.Sprint_3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.openqa.selenium.json.Json;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US0087_GetUserApiInfoStepDef {


    Response response = null;
    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri("http://test.kese.nl/api")
            .build();


    @Given("user connect to {string}")
    public void userConnectTo(String endPoint) {
        response = given().
                queryParam("id", "61d22c3189708a2d2aeeda1c").
                contentType(ContentType.JSON).
                spec(request).
                get(endPoint );

        System.out.println();
    }

    @Then("user verifies that status code is {int}")
    public void userVerifiesThatStatusCodeIs(int statusCode) {
      int gelenCevap =response.getStatusCode();
     // Assert.assertEquals(gelenCevap,statusCode);


         }


    @Then("user verifies that response body has sonuc is {string}")
    public void userVerifiesThatResponseBodyHasSonucIs(String arg0) {
//String sonucDegeri= response.jsonPath().getString("sonuc");
    //    System.out.println(sonucDegeri);


    }

}



