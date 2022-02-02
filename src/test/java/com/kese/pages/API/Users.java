package com.kese.pages.API;

import com.github.javafaker.Faker;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class Users {


    public Response createNewUser(String email,String username, String password  ){
        RequestSpecification request = new RequestSpecBuilder()
                .setBaseUri("http://test.kese.nl/api")
                .build();
        JSONObject requestParams = new JSONObject();
        requestParams.put("email",email).put("kullanici_adi",username).put("sifre",password);
        Response response = given().contentType(ContentType.JSON)
                .spec(request)
                .body(requestParams.toString())
                .post("/user/account");


        return response;
    }


    public String getValue(Response response, String responseKey ){

        JsonPath jsonPath = response.jsonPath();
        String actualResponseSonuc = jsonPath.getString(responseKey);

        return actualResponseSonuc;
    }



}
