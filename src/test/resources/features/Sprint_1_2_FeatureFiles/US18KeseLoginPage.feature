Feature: Kese Login page feature

  @smoketest
  Scenario Outline: Kese Website Login with valid username valid password
    Given user is on login page <loginPageUrl>
    When user enters valid username <userName>
    And user enters valid password <password>
    And user clicks on Login button
    Then user gets the url of the page
    And page url should be <expectedUrl>
    Examples:
      | loginPageUrl                | userName          | password | expectedUrl            |
      | "https://kese.nl/login" | "email@gmail.com" | "3344"   | "https://kese.nl/" |
  @smoketest
  Scenario Outline: Kese Website Login with valid username invalid password
    Given user is on login page <loginPageUrl>
    When user enters valid username <userName>
    And user enters invalid password <invalidPassword>
    And user clicks on Login button
    Then user should get the this message <expectederrorMessage>
    Examples:
      | loginPageUrl                | userName          | invalidPassword | expectederrorMessage        |
      | "https://kese.nl/" | "email@gmail.com" | "abcd"          | "Email ya da şifre hatalı." |

  @smoketest
  Scenario Outline: Kese Website Login with invalid username valid password
    Given user is on login page <loginPageUrl>
    When users enter invalid username <invalidUsername>
    And user enters valid password <password>
    And user clicks on Login button
    Then user should get the this message <expectederrorMessage>
    Examples:
      | loginPageUrl                | invalidUsername   | password | expectederrorMessage        |
      | "https://kese.nl/" | "zmail@yahoo.com" | "3344"   | "Email ya da şifre hatalı." |
  @smoketest
  Scenario Outline: Kese Website Login with invalid username invalid password
    Given user is on login page <loginPageUrl>
    When user enters invalid username <invalidUsername>
    And user enters invalid password <invalidPassword>
    And user clicks on Login button
    Then user should get the this message <expectederrorMessage>
    Examples:
      | loginPageUrl                | invalidUsername   | invalidPassword | expectederrorMessage        |
      | "https://kese.nl/" | "xmail@gmail.com" | "ol56"          | "Email ya da şifre hatalı." |