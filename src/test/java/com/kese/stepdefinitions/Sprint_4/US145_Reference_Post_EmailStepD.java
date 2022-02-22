package com.kese.stepdefinitions.Sprint_4;

import com.github.javafaker.Faker;
import com.kese.pages.API.Reference;
import com.kese.pages.API.Users;
import com.kese.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.Map;


import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

// Nursel
public class US145_Reference_Post_EmailStepD {
    Response loginAuthorResponse = null;
    Response loginMemberResponse = null;
    Response newUserResponse = null;
    Response referenceResponse = null;
    Response getSumAuthorResponse = null;


    public Faker faker = new Faker();
    public final String femail = faker.internet().emailAddress();
    public final String fusername = femail.substring(0,femail.indexOf("@"));
    public final String fpassword = "1234";

    String loginToken;


    @Given("user logs in with {string}, {string} as {string} with POST for user API")
    public void user_logs_in_with_as_with_POST_for_user_API(String email, String password, String role) {

        Users user = new Users();
        loginAuthorResponse = user.postUserLogin(email, password);
        loginToken = loginAuthorResponse.body().jsonPath().get("token").toString();


    }

    @Then("user gets token and the below results for user API")
    public void user_gets_token_and_the_below_results_for_user_API(Map<String,String> expectedValues) {

        assertNotNull(loginAuthorResponse.body().jsonPath().get("token"));
        assertEquals(Integer.parseInt(expectedValues.get("statusCode")),loginAuthorResponse.getStatusCode());
        assertEquals(Boolean.parseBoolean(expectedValues.get("sonuc")),loginAuthorResponse.body().jsonPath().get("sonuc"));
        // assertEquals(Integer.parseInt(expectedValues.get("durum"),loginResponse.body().jsonPath().get("durum")));


    }
    @Then("reference author should be authorized for reference API")
    public void reference_author_should_be_authorized_for_reference_API() {



    }

    @Then("user gets token, status code should be {int} and {string} is {string} and role is {string} for user API")
    public void user_gets_token_status_code_should_be_and_is_for_user_API(int statusCode, String responseKey, String responseValue, String role) {


        assertNotNull(loginAuthorResponse.body().jsonPath().get("token"));
        assertEquals(statusCode,loginAuthorResponse.getStatusCode());
        assertEquals(Boolean.parseBoolean(responseValue),loginAuthorResponse.body().jsonPath().get(responseKey));
        assertEquals(role,loginAuthorResponse.body().jsonPath().get("rol"));

    }


    @When("user adds a new email with POST for reference API")
    public void user_adds_a_new_email_with_post_for_reference_api() {

        Reference reference = new Reference();
        Users newUser = new Users();

        newUserResponse = newUser.createNewUser(femail, fusername, fpassword);
        referenceResponse = reference.createNewReference(loginToken, femail);
    }

    @Then("reference author should be {string} and reference member's count should be {int}")
    public void reference_author_should_be_and_reference_member_s_count_should_be(String authorEmail, Integer referenceCount) {

        assertEquals(authorEmail, referenceResponse.getBody().jsonPath().get("reference_author"));
        assertEquals(femail, referenceResponse.getBody().jsonPath().get("reference_member"));
        assertEquals(referenceCount, referenceResponse.getBody().jsonPath().get("reference_count"));

    }

    @Then("reference member's role should be {string} for reference API")
    public void reference_member_s_role_should_be_for_reference_API(String membersRole) {

        Users user = new Users();
        loginMemberResponse = user.postUserLogin(femail, fpassword);
        String refMemberRole = loginMemberResponse.getBody().jsonPath().get("rol");

        assertEquals(membersRole, refMemberRole);

    }

    @Given("{string} user is unauthorized to add an email for reference API")
    public void user_is_unauthorized_to_add_an_email_for_reference_API(String email) {
        int refSum;
        RequestSpecification request = new RequestSpecBuilder()
                .setBaseUri(ConfigurationReader.get("url"))
                .build();

        getSumAuthorResponse = given()
                .contentType(ContentType.JSON)
                .relaxedHTTPSValidation()
                .spec(request)
                .pathParam("email",email)
                .when()
                .get("/reference/check/{email}");

        refSum = getSumAuthorResponse.body().jsonPath().getList("sum").indexOf(0);

        assertTrue(refSum<2);

    }

    @When("user adds {string} with POST for reference API for herself")
    public void user_adds_with_POST_for_reference_API_for_herself(String email) {

        Reference reference = new Reference();
        referenceResponse = reference.createNewReference(loginToken, email);

    }

    @Then("message {string} should be displayed")
    public void message_should_be_displayed(String message) {

        assertEquals(referenceResponse.body().jsonPath().get("messege"),message);

    }

    @Then("status code {string} should be displayed for reference API")
    public void status_code_should_be_displayed_for_reference_API(String statusCode) {

        assertEquals(Integer.parseInt(statusCode), referenceResponse.getStatusCode());

    }


}
