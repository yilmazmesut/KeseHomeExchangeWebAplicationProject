Feature:API - Kullanıcı Bilgileri Guncelleme

  Scenario: Kullanici bilgilerini gunceller
    Given assert that user connects to "/user/account"
    Then user updates their info and verifies status code

  Scenario: NEGATIVE invalid kullanici token
    Given assert that user connects with invalid credential and verifies status code

    Scenario: NEGATIVE invalid email adresi ile patch
      Given assert that can not patch with invalid email address