@smoketest
Feature:US_010 User can acces to login page and inputs of the login should be available



  Background:
    Given user is on login page "http://test.kese.nl/login"


  Scenario Outline: TC_001_US_010 "Email" input must be active and available
    And User can click to email input
    Then User can write <email> in the email input
    Examples:
      | email                  |
      | "kullanici1@gmail.com" |
      | "aliSuleyman1235"      |
      | "12345@gmail"          |

  Scenario Outline: TC_002_US_010 "Sifre" input must be active and available
    And User can click to sifre input
    Then User can write <sifre> in the sifre input
    Examples:
      | sifre       |
      | "123456"    |
      | "AjgrWou"   |
      | "158ytrn!8" |

  Scenario: TC_003_US_010 By default, the text "Email giriniz" should be included in the "Email " input
      And User can click to email input
      Then Assure the "Email giriniz" default email text

  Scenario: TC_004_US_010 By default, the text "Şifrenizi giriniz" should be included in the "Sifre" input
      And User can click to sifre input
      Then Assure the "Şifrenizi giriniz" default sifre text