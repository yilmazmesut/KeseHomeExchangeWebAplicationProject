package com.kese.stepdefinitions.Sprint_4;

import com.kese.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US147_API_ReferenceSum_GetStepD {
    Response response=null;
    RequestSpecification request = new RequestSpecBuilder()
            .setRelaxedHTTPSValidation()
            .setBaseUri("https://kese.nl/api")
            .build();


    @Given("user connects to {string} with endpoint")
    public void userConnectsToWithEndpoint(String endPoint) {

        response = given().
                queryParam("secret_token", ConfigurationReader.get("secret_token")).
                contentType(ContentType.JSON).
                spec(request).
                get(endPoint);

        response.prettyPrint();
    }

    @Then("user verifies the response status code is {int}")
    public void userVerifiesTheResponseStatusCodeIs(int statusCode) {

            Assert.assertEquals(statusCode, response.getStatusCode());
        }



    @Then("user verifies the referance value of sum {string} count")
    public void userVerifiesTheReferanceValueOfSumCount(String sum) {
        String actualSum=response.jsonPath().getString("sum");
        System.out.println(actualSum);
        Assert.assertEquals(sum,actualSum);
    }
}

