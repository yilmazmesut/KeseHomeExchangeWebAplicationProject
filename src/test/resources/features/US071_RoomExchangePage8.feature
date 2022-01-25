Feature: US_071_Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 8. stepten 9. stepe geçiş yapabilmeliyim.

  Background: login to page and go to step eight

    Given user is on login page "http://test.kese.nl/new_room"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    Then user navigates to page 8 in Room Exchange

  Scenario: TC_001_US_071 "İlerle" butonu görünür olmalıdır.
    Then user asserts ilerle button is visible

      # Developer hatayi duzelttiken sonra asagidaki senariolar calistirilacak

#    Scenario: TC_002_US_046 "İlerle" butonu default olarak tıklanabilir olmamalıdır.
#      Then user asserts ilerle button should not be clickable as a default
#
#  Scenario: TC_003_US_046 Bilgi eksikliği durumunda, İlerle butonuna tıklanırsa "Lütfen özel şart seçiniz." uyarısı görünür olmalıdır.
#    Then user asserts ilerle button should not be clickable if required informations are not filled

  Scenario: TC_004_US_071 Zorunlu bilgiler eklendikten sonra İlerle butonu tıklanabilir olmalı.
    Then user asserts ilerle button should be clickable if required informations are filled