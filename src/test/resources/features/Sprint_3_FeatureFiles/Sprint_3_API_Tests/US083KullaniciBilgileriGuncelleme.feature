Feature:API - Kullanıcı Bilgileri Guncelleme
  
  Scenario: Kullanici bilgilerini gunceller
    Given assert that user connects to "/user/account"
    Then user updates their info and verifies status code

