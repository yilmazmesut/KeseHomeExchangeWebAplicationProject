Feature: Kese Login Page Validation
  @MarkBoz
  Scenario: Login page sifremi unuttum section must be visible

    Given user on the login page as this url "http://test.kese.nl/login"
    Then user should see the "Şifremi Unuttum"
    And Sifremi unuttum link should be active
    And Sifremi unuttum link should be "underline"
    When user click on the sifremi unuttum link
    Then user should be on this page url "http://test.kese.nl/forgot_password"


