package com.kese.stepdefinitions.Sprint_3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class deneme {

    Response response = null; // bağlantıdan (request) gelen cevap
    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri("http://test.kese.nl/api")
            .build();

    @Given("user connects to {string}")
    public void userConnectsToWith(String endPoint) {
        response = given().
                queryParam("secret_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZDIyYzMxODk3MDhhMmQyYWVlZGExYyIsImVtYWlsIjoia3VsbGFuaWNpMUBnbWFpbC5jb20iLCJyb2wiOiJrdWxsYW5pY2kiLCJrdWxsYW5pY2lfYWRpIjoia3VsbGFuaWNpMSIsImR1cnVtIjoxfSwiaWF0IjoxNjQzMzk4MTU4LCJleHAiOjE2NzQ5MzQxNTh9.iMhXsQxv9ZqMVbRndKjzvsz7uJIhXaywBZ-PCBIRil0").
                contentType(ContentType.JSON).
                spec(request).
                get(endPoint);
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
