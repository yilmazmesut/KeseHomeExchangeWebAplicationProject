@MH-59
Feature: US_082 Bir kullanici olarak "/api/user/account" sayfasina "post"   tipinde baglandigimda gonderdigimm bilgiler ile kullanici olusturulmalidir.

  @TEST_MH-56 @TESTSET_UH-52
  Scenario: US_82_TC_01 user creates new user with post request and "/user/account" endpoint
    Given user creates new user
    Then user verifies that status code is 201
    Then user verifies that response body has "sonuc" is "true"

  @TEST_MH-57 @TESTSET_UH-52
  Scenario: US_082_TC_02 user tries to create a new user with used email
    Given user creates new user with used mail
    Then user verifies that status code is 200
    Then user verifies that response body has "sonuc" is "email"

  @TEST_MH-58 @TESTSET_UH-52
  Scenario: US_082_TC_03 user tries to create a new user with used username
    Given user creates new user with used username
    Then user verifies that status code is 200
    Then user verifies that response body has "sonuc" is "hata"


  Scenario Outline: US_082_TC_04 user tries to create a new user with invalid data
    Given user creates new user with invalid "<email>", "<username>" and "<password>"
    Then user verifies that status code is 200
    Then user verifies that response body has "message" is "error"

    Examples:
      | email           | username | password |
      |                 | aykut    | 1234     |
      | aykut@email.com |          | 1234     |
      | aykut@email.com | aykut    |          |
      |                 |          |          |

