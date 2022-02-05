Feature: US_087	As a user, I should be able to see user information when I connect to the "/api/user/information" page in the "get" type.
#  http://test.kese.nl/api/homes
#  Kullanıcı giriş yapmış olmalıdır. (token)
#  "Gönderilecek datalar :  swagger dökümanınde belirtilmiştir"

  Scenario: user should be able to see user information
    Given user connect to "/api/user"
    Then  user verifies that status code is 200
   # Then user verifies that response body has sonuc is "true"

