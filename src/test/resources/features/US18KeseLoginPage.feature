Feature: Kese Login page feature

  @main1
  Scenario: Kese Website Login with valid username valid password
    Given user is on login page "http://test.kese.nl/login"
    When user enters valid username "email@gmail.com"
    And user enters valid password "3344"
    And user clicks on Login button
    Then user gets the url of the page
    And page url should be "http://test.kese.nl/"

  Scenario: Kese Website Login with valid username invalid password
    Given user is on login page "http://test.kese.nl/login"
    When user enters valid username "email@gmail.com"
    And user enters invalid password "abcd"
    And user clicks on Login button
    Then user should get the this message "Email ya da şifre hatalı."


  Scenario: Kese Website Login with invalid username valid password
    Given user is on login page "http://test.kese.nl/login"
    When users enter invalid username "zmail@yahoo.com"
    And user enters valid password "3344"
    And user clicks on Login button
    Then user should get the this message "Email ya da şifre hatalı."

  Scenario: Kese Website Login with invalid username invalid password
    Given user is on login page "http://test.kese.nl/login"
    When user enters invalid username "xmail@gmail.com"
    And user enters invalid password "ol56"
    And user clicks on Login button
    Then user should get the this message "Email ya da şifre hatalı."