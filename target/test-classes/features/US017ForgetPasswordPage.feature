@ForgotPasswordPage

Feature: When I enter the "forgot_password" page as a user, the change password button should be available

  Scenario:The Change "My Password" button should be active and visible
    Given User goes to test.kese url
    Then User clicks on Login button
    And The user clicks the "ForgotPassword" button
    And User enters valid e-mail address




  Scenario: The button should contain the text "Change My Password"
    Given User goes to test.kese url
    Then User clicks on Login button
    And The user clicks the "ForgotPassword" button
    And The user sees the "Change my password" button
    And User enters valid e-mail address
    And User clicks on Change Password button
    And User sees change my password text