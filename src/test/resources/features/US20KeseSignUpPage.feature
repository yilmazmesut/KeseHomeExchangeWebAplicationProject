Feature: US_20 Bir kullanıcı olarak "/signup" sayfasına girdiğimde, yeni bir kullanıcıyı sadece benzersiz email ve kullanıcı adı ile oluşturabilmeliyim.

  Background: Successful connection to site and sign up
    Given user is on login page "http://test.kese.nl/signup"
    When user creates a random credentials and signup

  Scenario Outline: TC_001_US_20 signup block because of repeated email or username
    And user tries to use the same "<credentialPart>" for signup again
    Then user verifies "<text>" and can't signup on signup page
    Examples:
      |credentialPart|text                                                         |
      |email         |Bu mail adresi zaten kullanılıyor.                           |
      |username      |Bu kullanıcı adı alınmıştır. Başka bir kullanıcı adı giriniz.|

