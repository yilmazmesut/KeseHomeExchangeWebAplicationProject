package com.kese.stepdefinitions.Sprint_3;

import com.kese.pages.API.HomeDatas;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.File;

import static io.restassured.RestAssured.given;

public class US088_UserCreateNewHomeStepD {

    Response response = null;

    File photo0 = new File("C:\\MyIntelijProject\\CucumberRestAPILibrary\\src\\test\\resources\\photos\\1.jpg");
    File photo1 = new File("C:\\MyIntelijProject\\CucumberRestAPILibrary\\src\\test\\resources\\photos\\2.jpg");
    File photo2 = new File("C:\\MyIntelijProject\\CucumberRestAPILibrary\\src\\test\\resources\\photos\\3.jpg");
    File photo3 = new File("C:\\MyIntelijProject\\CucumberRestAPILibrary\\src\\test\\resources\\photos\\4.jpg");
    File photo4 = new File("C:\\MyIntelijProject\\CucumberRestAPILibrary\\src\\test\\resources\\photos\\5.jpg");



    @Given("user connects to {string} and adds a new home adds")
    public void user_connects_to_and_adds_a_new_home_adds(String endPoint) {

        response = given()

                .queryParam("secret_token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZmFmNGQ0NjYwNmNkMzg5MThhY2ViOSIsImVtYWlsIjoiY2VtYWxAZ21haWwuY29tIiwicm9sIjoia3VsbGFuaWNpIiwia3VsbGFuaWNpX2FkaSI6IkNlbWFsUUEiLCJkdXJ1bSI6MX0sImlhdCI6MTY0MzgzNjg5NiwiZXhwIjoxNjc1MzcyODk2fQ.cf9bcgMj9XcrbcrucSoX97on7cLs3gX9BKzHs78bPTY" )

                .formParams(HomeDatas.dataMap())
                .contentType(ContentType.JSON)
                //.body(hms)// bunu deneyecem
                .contentType("multipart/form-data; charset=UTF-8")



                .multiPart("photo0", photo0)
                .multiPart("photo1", photo1)
                .multiPart("photo2", photo2)
                .multiPart("photo3", photo3)
                .multiPart("photo4", photo4)

                .when()
                .post("http://test.kese.nl/api"+endPoint);



    }


    @Then("user verifies the home advertise added and status code is {int}")
    public void userVerifiesTheHomeAdvertiseAddedAndStatusCodeIs(int statusCode) {
        response.prettyPrint();
        Assert.assertEquals(statusCode, response.getStatusCode());
    }
}

