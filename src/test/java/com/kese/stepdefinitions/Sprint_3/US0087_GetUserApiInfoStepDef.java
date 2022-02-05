package com.kese.stepdefinitions.Sprint_3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class US0087_GetUserApiInfoStepDef {


    Response response = null;
    RequestSpecification request = new RequestSpecBuilder()
                                 .setBaseUri("http://test.kese.nl/api")
                                 .build();

    @Given("user connect to {string}")
    public void userConnectToWith(String endPoint) {
        response = given().
                queryParam("secret_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZmQzYzI4NjYwNmNkMzg5MTkzZGE2NyIsImVtYWlsIjoiYXNsYW5AZ21haWwuY29tIiwicm9sIjoia3VsbGFuaWNpIiwia3VsbGFuaWNpX2FkaSI6Im1laG1ldDEyMyIsImR1cnVtIjoxfSwiaWF0IjoxNjQzOTg2MDEwLCJleHAiOjE2NzU1MjIwMTB9.SbaamCjKLtHlUnaWU6AXz7cDntnDjJwRKqO8ilP7opQ").
                contentType(ContentType.JSON).
                spec(request).
                get(endPoint);

        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }

    @Then("user verifies that status code is {int}")
    public void userVerifiesThatStatusCodeIs(int arg0) {


    }

    @Then("user verifies that response body has sonuc is {string}")
    public void userVerifiesThatResponseBodyHasSonucIs(String arg0) {
    }


//    @When("I add a book to my reading list")
//    public void i_add_a_book_to_my_reading_list() {
//
//        RestAssured.baseURI = BASE_URL;
//        RequestSpecification request = RestAssured.given();
//        request.header("Authorization", "Bearer " + token)
//                .header("Content-Type", "application/json");
//
//        response = request.body("{ \"userId\": \"" + USER_ID + "\", " +
//                        "\"collectionOfIsbns\": [ { \"isbn\": \"" + bookId + "\" } ]}")
//                .post("/BookStore/v1/Books");
//
//    }
}