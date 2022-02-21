package com.kese.pages.API;

import com.kese.utilities.ConfigurationReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class Reference {

    public Response createNewReference(String userToken, String memberEmail){
        RequestSpecification request = new RequestSpecBuilder()
                .setBaseUri(ConfigurationReader.get("url"))
                .build();

        JSONObject requestParams = new JSONObject();
        requestParams.put("reference_member",memberEmail);

        Response response = given()
                .relaxedHTTPSValidation()
                .spec(request)
                .body(requestParams.toString())
                .queryParam("secret_token",userToken)
                .when()
                .post("/reference");


        return response;
    }
}
