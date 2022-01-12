Feature: US_019 As a user, When I enter the "/signup" page , I should be able to register to the system

  Background:
    Given user is on signup page "http://test.kese.nl/signup"

  @Rejep_US_19
  Scenario: I should be able to register to the system.

    Given user enters new username "yenikullanic22@gmail.com" to create a new account
    And user enters new email "kullanici22@gmail.com" to create a new account
    And user enters new password "12345" to create a new account
    And user enters new password "12345" for second time to create a new account
    And user clicks checkbox button to create a new account
    And user clicks on signup button
   # Then Kayidiniz olusturuldu, giris yapma sayfasına yonlndiriliyorsunuz should be visible

  Scenario: After the record is created, the user should be redirected to the "/signup" page.

    Then user gets the url of the page
    And page url should be "http://test.kese.nl/signup"
