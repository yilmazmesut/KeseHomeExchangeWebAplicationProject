@US11 @smoketest
Feature: Kese Login Page Buttons Validation


  Scenario: Login Page buttons should be active
    Given user goes to "http://test.kese.nl/login" page
    Then "Giriş Yap" button should be active on login page
    And "Kayıt Oluştur" button should be active on login page
    When user clicks "Kayıt Oluştur" button on login page
    Then user goes to "http://test.kese.nl/signup" page

     


    

