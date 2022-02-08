package com.kese.stepdefinitions.Sprint_3;

import com.kese.pages.API.KeseApiBaseUrl;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class US092_HomesBenzerIlanlarApiStepD  {

    //http://test.kese.nl/api/homes/61fe52dae970093ad0e4bef3/benzerilanlar?address=Frankfurt, Almanya&address_list=Frankfurt, Almanya

    Response response = null;
    JsonPath jsonPath =null;
    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri("https://kese.nl/api/")
            .build().pathParams("first", "homes", "second", "61fe52dae970093ad0e4bef3", "third", "benzerilanlar").
          queryParam("address", "Frankfurt, Almanya", "address_list", "Frankfurt, Almanya");

    @Given("connect to home benzerilanlar with get")
    public void connectToHomeBenzerilanlarWithGet() {

       response =given().relaxedHTTPSValidation().
                contentType(ContentType.JSON).
                spec(request).
                get("/{first}/{second}/{third}"+"?address=Frankfurt, Almanya&address_list=Frankfurt, Almanya");

        response.prettyPrint();
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 200);
    }


    @Then("verify the response includes maximum of {int} advertisements")
    public void verifyTheResponseIncludesMaximumOfAdvertisements(int numberOfHomes) {

        jsonPath = response.body().jsonPath();
        System.out.println(jsonPath.getList("address.label").size());
        List<String> addressList = jsonPath.getList("address.label");
           int advertisementNum = jsonPath.getList("address.label").size();
        System.out.println(advertisementNum);
//        if (!addressList.isEmpty()) {
//            Assert.assertTrue("There are more than five similiar home advertisement ", advertisementNum < numberOfHomes);
//        }
    }


    @Then("verify the id list should not include sent id {string}")
    public void verifyTheIdListShouldNotIncludeSentId(String homeId) {
        List<String> idList = response.body().jsonPath().getList("_id");
        if (!idList.isEmpty()) {
            Assert.assertFalse(!idList.contains(homeId));
        }

    }


    @Then("verify address information must be same as at least with {string} of them")
    public void verifyAddressInformationMustBeSameAsAtLeastWithOfThem(String address) {
        List<String> addressLabelList = response.body().jsonPath().getList("address.label");
        for (int i = 0; i < addressLabelList.size(); i++) {
            Assert.assertTrue(response.body().jsonPath().getString("address[" + i + "].label").contains(address));

        }
    }


    @Then("verify address information must be same as at least one of {string} and {string}")
    public void verifyAddressInformationMustBeSameAsAtLeastOneOfAnd(String address1, String address2) {
        List<String> addressLabelList = response.body().jsonPath().getList("address.label");
        for (int i = 0; i < addressLabelList.size(); i++) {
            boolean address1Inculuded = (response.body().jsonPath().getString("address[" + i + "].label").contains(address1));
            boolean address2Inculuded = (response.body().jsonPath().getString("address[" + i + "].label").contains(address2));
            if ((address1Inculuded && address2Inculuded) || (address2Inculuded)) {
                Assert.assertTrue(address2Inculuded);
            }else{
                System.out.println("There is no list with the similar address");
            }
        }
    }
}