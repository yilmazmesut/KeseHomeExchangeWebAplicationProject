package com.kese.stepdefinitions.Sprint_3;

import com.kese.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US097_ApiGetRoomListStepD {


    Response response = null;
    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri(ConfigurationReader.get("api_URI")).build();
    @Given("user connects to {string} for search homes with {string} {string} {string} {string} s")
    public void user_connects_to_for_search_homes_with_s(String endPoint, String bulundugu_sayfa, String address, String address_list, String order) {

        response = given().relaxedHTTPSValidation().contentType(ContentType.JSON)
                .spec(request)
                .queryParam("address", address)
                .queryParam("address_list", address_list)
                .queryParam("order", order)
                .pathParam("bulundugu_sayfa", bulundugu_sayfa)
                .when()
                .get(endPoint);

    }

    @Then("user verifies that status code is {int} for search homes  list s")
    public void userVerifiesThatStatusCodeIsForSearchHomesListS(int expectedStatusCode) {

        int actualStatusCode = response.statusCode();
        Assert.assertEquals(expectedStatusCode, actualStatusCode);

    }

    @Then("user verifies that response body has max {int} homes s")
    public void userVerifiesThatResponseBodyHasMaxHomesS(int expectedMaxCountInPage) {
//        Boolean actualCountInPage = false;
//        ArrayList homesList = response.jsonPath().get("list");
//
//        if (homesList.size() <= expectedMaxCountInPage) actualCountInPage = true;
//        Assert.assertTrue(actualCountInPage);

        //vNursel hanim
        List<String> roomList=response.body().jsonPath().getList("_id");
        Assert.assertEquals(expectedMaxCountInPage, roomList.size());
    }

    @Then("user verifies that homes is ordered by viewed s")
    public void userVerifiesThatHomesIsOrderedByViewedS() {
        List<Integer> actualOrderTypeList = response.body().jsonPath().getList("okunmasayisi");
        List<Integer> expectedSortedOrderTypeList = new ArrayList<>(actualOrderTypeList);
        expectedSortedOrderTypeList.sort(Collections.reverseOrder());

        Assert.assertEquals(expectedSortedOrderTypeList, actualOrderTypeList);
    }

    // @Then("user verifies that homes is ordered by {string} s")
    //    public void userVerifiesThatHomesIsOrderedBy(String orderType) {      }
}
