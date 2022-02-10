package com.kese.stepdefinitions.Sprint_3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.sql.SQLOutput;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US098_RoomsBenzerIlanlarAPI_StepD {

    Response response = null;
    RequestSpecification specification = new RequestSpecBuilder().setBaseUri("https://kese.nl/api").build();

    @Given("connect to home benzerilanlar with endpoint {string}  query data {string} use get")
    public void connectToHomeBenzerilanlarWithEndpointQueryDataUseGet(String id, String query) {
        response = given().relaxedHTTPSValidation().
                contentType(ContentType.JSON).
                spec(specification).get("/rooms/" + id + "/benzerilanlar" + query);
        response.prettyPrint();


    }

    @Then("user verifies that there are at most {int} benzer ilan listed")
    public void userVerifiesThatThereAreAtMostBenzerIlanListed(int numberOfIlans) {

        List<String> totalIdList = response.body().jsonPath().getList("_id");
        System.out.println(totalIdList.size());
        Assert.assertTrue(totalIdList.size() <= numberOfIlans);


    }

    @Then("user verifies that this {string} is not listed on the response")
    public void userVerifiesThatThisIsNotListedOnTheResponse(String id) {
        List<String> totalIdList = response.body().jsonPath().getList("_id");

        Assert.assertFalse(totalIdList.contains(id));

    }


    @Then("verify address information must be same as at least one of {string} and {string}")
    public void verifyAddressInformationMustBeSameAsAtLeastOneOfAnd(String town, String land) {
        JsonPath jsonPath = response.body().jsonPath();
        List<String> adressList = response.body().jsonPath().getList("address_list");
        //   System.out.println("adres Listesi " +adressList);
        //   System.out.println(adressList.size());
        for (int i = 0; i < adressList.size(); i++) {
            boolean address1Inculuded = (jsonPath.getString("address_list[" + i + "]").contains(town));
          //  System.out.println(address1Inculuded);
            boolean address2Inculuded = (jsonPath.getString("address_list[" + i + "]").contains(land));
            Assert.assertTrue(address1Inculuded  || address2Inculuded);


        }
    }
}

//    Step 4 Option "/ Benzer ilanlar gönderilen adres bilgisine sahip olmalıdır. (en az bir ortak adres)
//    @Then("user verifies that sended this address {string} should be common with responsed benzer ilanlar")
//    public void userVerifiesThatSendedThisAddressShouldBeCommonWithResponsedBenzerIlanlar(String address) {
//
//        List<ArrayList<String>> totaladdressList = response.body().jsonPath().getList("address_list");
//
//        String[] addressList= address.split(",", 3);
//
//        List<String> fixedLenghtList = Arrays.asList(addressList);
//
//        ArrayList<String> listOfString = new ArrayList<String>(fixedLenghtList);
//
//
//        boolean result=false;
//
//        for (ArrayList e: totaladdressList) {
//
//
//
//            for (int i = 0; i <listOfString.size() ; i++) {
//
//                String trrimedListelement = listOfString.get(i).trim();
//                if(e.contains(trrimedListelement) ){
//
//                    result=true;
//                    break;
//                }
//
//            }
//
//        }
//
//        Assert.assertTrue(result);
//
//
//
//    }
//}



