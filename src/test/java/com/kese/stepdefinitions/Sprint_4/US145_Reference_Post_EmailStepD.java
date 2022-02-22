package com.kese.stepdefinitions.Sprint_4;

import com.kese.pages.API.Reference;
import com.kese.pages.API.Users;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.*;

// Nursel
public class US145_Reference_Post_EmailStepD {
    Response loginResponse = null;
    Response referenceResponse = null;


    @Given("user logs in with {string}, {string} as {string} with POST for user API")
    public void user_logs_in_with_as_with_POST_for_user_API(String email, String password, String role) {

        Users user = new Users();
        loginResponse = user.postUserLogin(email, password);

    }

    @Then("user gets token, status code should be {int} and {string} is {string} and role is {string} for user API")
    public void user_gets_token_status_code_should_be_and_is_for_user_API(int statusCode, String responseKey, String responseValue, String role) {


        assertNotNull(loginResponse.body().jsonPath().get("token"));
        assertEquals(statusCode,loginResponse.getStatusCode());
        assertEquals(Boolean.parseBoolean(responseValue),loginResponse.body().jsonPath().get(responseKey));
        assertEquals(role,loginResponse.body().jsonPath().get("rol"));

    }


    @When("user add an {string} with POST for reference API")
    public void user_add_an_for_reference_with_post_for_reference_api(String memberEmail) {

        Reference reference = new Reference();
        String token = loginResponse.body().jsonPath().get("token").toString();

        System.out.println("loginResponse = " + loginResponse.body().jsonPath().get());
        System.out.println("token = " + token);
        System.out.println("memberEmail = " + memberEmail);

        referenceResponse = reference.createNewReference(token, memberEmail);

        referenceResponse.prettyPrint();


    }
    @Then("reference author should be {string} and reference email should be {string}")
    public void reference_author_should_be_and_reference_email_should_be(String authorEmail, String referenceEmail) {

        assertEquals(authorEmail, referenceResponse.getBody().jsonPath().get("reference_author"));
        assertEquals(referenceEmail, referenceResponse.getBody().jsonPath().get("reference_member"));

    }


    @Then("member should have min member count {string}")
    public void member_should_have_min_member_count(String memberCount) {

        assertEquals(Optional.of(Integer.parseInt(memberCount)), referenceResponse.getBody().jsonPath().get("reference_count"));

    }

    @When("user create a new reference with POST for reference API")
    public void user_create_a_new_reference_with_POST_for_reference_API() {

    }

}
