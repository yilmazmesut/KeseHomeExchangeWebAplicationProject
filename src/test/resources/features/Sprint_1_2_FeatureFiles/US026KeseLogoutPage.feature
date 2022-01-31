@US26 @smoketest
Feature: Logout Functionality Validation

  Background:
    Given the user goes to "http://test.kese.nl/" page

  Scenario:
    Given user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks Profilim link on signed in page
    When user clicks "Çıkış Yap" button on Profilim link
    Then Giris Yap button should be visible and clickable on home page




