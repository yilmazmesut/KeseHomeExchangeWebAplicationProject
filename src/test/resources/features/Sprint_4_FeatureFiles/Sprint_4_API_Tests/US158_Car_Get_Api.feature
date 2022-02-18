Feature: US_158	As a user, when I connect to the "/api/cars/{id}" page with "get" type, I should be able to see the information about the ad.
#  http://test.kese.nl/api/homes
#  Kullanıcı giriş yapmış olmalıdır. (token)
#  "Gönderilecek datalar :  swagger dökümanınde belirtilmiştir"

  Scenario:US158_TC0001 user I should be able to see the information about the ad
    Given user connect to "/api/cars" about
    Then user I should be able to see the information