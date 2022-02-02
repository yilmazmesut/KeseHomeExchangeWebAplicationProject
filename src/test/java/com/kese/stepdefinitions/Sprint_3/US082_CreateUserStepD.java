package com.kese.stepdefinitions.Sprint_3;

import com.github.javafaker.Faker;
import com.google.gson.JsonObject;
import com.kese.pages.API.Users;
import com.kese.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;

import static io.restassured.RestAssured.given;


public class US082_CreateUserStepD {

    Users users = new Users();

    Faker faker = new Faker();
    String username = faker.name().username();
    String email = faker.internet().emailAddress();
    String password = "1234";

    Response response = null;
    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri("http://test.kese.nl/api")
            .build();

    @Given("user creates new user")
    public void user_creates_new_user() {

//        JSONObject requestParams = new JSONObject();
//        requestParams.put("email",email).put("kullanici_adi",username).put("sifre",password);
//        response = given().contentType(ContentType.JSON)
//                .spec(request)
//                .body(requestParams.toString())
//                .post("/user/account");

        response = users.createNewUser(email, username, password);

    }

    @Then("user verifies that status code is {int}")
    public void user_verifies_that_status_code_is(int expectedStatusCode) {

        int actualStatusCode = response.statusCode();
        Assert.assertEquals(expectedStatusCode, actualStatusCode);


    }

    @Then("user verifies that response body has {string} is {string}")
    public void user_verifies_that_response_body_has_sonuc_is(String responseKey, String expectedResponseSonuc) {

//        JsonPath jsonPath = response.jsonPath();
//        String actualResponseSonuc = jsonPath.getString(responseKey);


        String actualResponseSonuc = users.getValue(response, responseKey);
        Assert.assertEquals(expectedResponseSonuc, actualResponseSonuc);

    }


    @Given("user creates new user with used mail")
    public void user_creates_new_user_with_used_mail() {
//        JSONObject requestParams = new JSONObject();
//        requestParams.put("email","Aykut@mail.com").put("kullanici_adi",username).put("sifre",password);
//        response = given().contentType(ContentType.JSON)
//                .spec(request)
//                .body(requestParams.toString())
//                .post("/user/account");

        response = users.createNewUser("Aykut@mail.com", username, password);

    }

    @Given("user creates new user with used username")
    public void user_creates_new_user_with_used_username() {
//        ------------------------------------------------------------------
//        response = given().accept(ContentType.JSON)
//                .multiPart("email", email)
//                .multiPart("kullanici_adi", "Aykut")
//                .multiPart("sifre", password)
//                .when().post("/user/account");
//        ------------------------------------------------------------------------
//        JSONObject requestParams = new JSONObject();
//        requestParams.put("email",email).put("kullanici_adi","Aykut").put("sifre",password);
//        response = given().contentType(ContentType.JSON)
//                .spec(request)
//                .body(requestParams.toString())
//                .post("/user/account");


        response = users.createNewUser(email, "Aykut", password);


    }

}
