package com.kese.stepdefinitions.Sprint_3;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

import static io.restassured.RestAssured.form;
import static io.restassured.RestAssured.given;

public class ufukkStepD {
    //http://test.kese.nl/api     /rooms/id/benzerilanlar

    Response response = null;


    RequestSpecification specification = new RequestSpecBuilder()
            .setBaseUri("https://kese.nl/api").build();


    @Given("user send get request on benzer ilanlar page with this id {string} and this address {string}")
    public void userSendGetRequestOnBenzerIlanlarPageWithThisIdAndThisAddress(String id, String address) {

        String endPoint= "/rooms/" + id + "/benzerilanlar";
        System.out.println(endPoint);


        response = given().
                relaxedHTTPSValidation().

                queryParam("address_list", address).
                contentType(ContentType.JSON).
                spec(specification).
                get(endPoint);

    }


    @Then("user verifies that there are at most {int} benzer ilan listed")
    public void userVerifiesThatThereAreAtMostBenzerIlanListed(int ilanCount) {

        List<String> totalIdNumber = response.body().jsonPath().getList("_id");

        System.out.println("total number of size: " + totalIdNumber.size());
        System.out.println(response.prettyPrint());
        //response.prettyPrint();
        Assert.assertTrue(totalIdNumber.size()<= ilanCount && totalIdNumber.size() > 0 );
    }

    @Then("user verifies that this {string} is not listed on the response")
    public void userVerifiesThatThisIsNotListedOnTheResponse(String id) {

        List<String> totalIdList = response.body().jsonPath().getList("_id");

        for (String e: totalIdList) {
            System.out.println("tot id ler: " + e);
            Assert.assertFalse(e.contains(id));


        }
    }

    //Benzer ilanlar gönderilen adres bilgisine sahip olmalıdır. (en az bir ortak adres)
    @Then("user verifies that sended this address {string} should be common with responsed benzer ilanlar")
    public void userVerifiesThatSendedThisAddressShouldBeCommonWithResponsedBenzerIlanlar(String address) {

        List<ArrayList<String>> totaladdressList = response.body().jsonPath().getList("address_list");

        String[] addressList= address.split(",", 3);

        List<String> fixedLenghtList = Arrays.asList(addressList);

        ArrayList<String> listOfString = new ArrayList<String>(fixedLenghtList);


        boolean result=false;

        for (ArrayList e: totaladdressList) {



            for (int i = 0; i <listOfString.size() ; i++) {

                String trrimedListelement = listOfString.get(i).trim();
                if(e.contains(trrimedListelement) ){

                    result=true;
                    break;
                }

            }

        }

        Assert.assertTrue(result);



    }


}
