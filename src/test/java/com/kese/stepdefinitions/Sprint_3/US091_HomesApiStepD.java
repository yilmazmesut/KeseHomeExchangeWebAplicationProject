package com.kese.stepdefinitions.Sprint_3;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import javax.sound.midi.Soundbank;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class US091_HomesApiStepD {
    String email;
    String password;
    String address;
    String address_list;
    String order;

    @Given("user makes the necessary settings for a secure connection")
    public void userMakesTheNecessarySettingsForASecureConnection(DataTable table) {
        Map<String, String> map = table.asMap(String.class, String.class);
        email = map.get(email);
        password = map.get(password);
        address = map.get(address);
        address_list = map.get(address_list);
        order = map.get(order);

    }

    @Given("GET advertisements from the {string}. page of the {string}")
    public void getAdvertisementsFromThePageOfThe(String page, String apiUrl, DataTable table) {
        int c = given()
                .log().uri()
                .param("address_list", "Frankfurt, Almanya")
                .when()
                .get(apiUrl+page)
                .then()
                .log().body()
                .statusCode(200)
                .extract().jsonPath().getInt("count")
        ;
        System.out.println();
        System.out.println( "Number of ads are " + c );
    }


}
