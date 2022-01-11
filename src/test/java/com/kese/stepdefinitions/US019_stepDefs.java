package com.kese.stepdefinitions;

import com.kese.pages.SignUpPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.*;

public class US019_stepDefs {

    SignUpPage page = new SignUpPage();

    @Given("user is on signup page {string}")
    public void user_is_on_signup_page(String SignUpPageUrl) {

        Driver.get().get(SignUpPageUrl);

    }

    @Given("user enters new username {string} to create a new account")
    public void user_enters_new_username_to_create_a_new_account(String username) {
        page.SignupUserInput.sendKeys(username);
    }

    @Given("user enters new email {string} to create a new account")
    public void user_enters_new_email_to_create_a_new_account(String email) {
        page.SignupEmailBox.sendKeys(email);
    }

    @Given("user enters new password {string} to create a new account")
    public void user_enters_new_password_to_create_a_new_account(String password) {
        page.SignupPasswordBox.sendKeys(password);
    }

    @Given("user enters new password {string} for second time to create a new account")
    public void user_enters_new_password_for_second_time_to_create_a_new_account(String password) {
        page.SignupPasswordBox.sendKeys(password);

    }

    @Given("user clicks checkbox button to create a new account")
    public void user_clicks_checkbox_button_to_create_a_new_account() {
        page.CheckBox.click();
    }

    @Given("user clicks on signup button")
    public void user_clicks_on_signup_button() {
        page.SignupButton.click();
    }
}
