package com.kese.stepdefinitions.Sprint_4;

import com.google.gson.internal.bind.util.ISO8601Utils;
import com.kese.pages.API.Breakfast;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.kese.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import static io.restassured.RestAssured.given;


public class US156_Admin_Patch_Aproval_StatusStepD {

    Response response = null;
    JsonPath jspath;
    Breakfast breakfast=new Breakfast("620c98db44c42508ff30d35f", 2);


    @Given("user connects to {string} and change the exist ads status")
    public void user_connects_to_and_change_the_exist_ads_status(String endPoint) {
        System.out.println(breakfast.patchMap());
        response = given().
                relaxedHTTPSValidation().
                queryParam("secret_token", breakfast.adminToken).

                body(breakfast).
                //formParams(breakfast.patchMap()).
                contentType("application/json; charset=UTF-8").
                when().
                patch(ConfigurationReader.get("kese_URI") +endPoint);

    }

    @Then("user verifies the bedbreakfasts advertise status changed and status code is {int}")
    public void user_verifies_the_bedbreakfasts_advertise_status_changed_and_status_code_is(int statusCode) {

        response.prettyPrint();

        Assert.assertEquals(statusCode, response.getStatusCode());

    }
}
