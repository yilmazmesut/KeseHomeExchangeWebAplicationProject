Feature: As a user, when I go to the "/forgot_password" page, email button should be used.

  Scenario:
    Given the user is on forget password page "http://test.kese.nl/forgot_password"
    And the email input box should be clickable
    Then Validate if the "E-mail adresinizi giriniz" is there as a default in the input box