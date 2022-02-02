# US090_APIHomesDelete
# Bir kullanıcı olarak "/api/homes/{id}" sayfasına "delete" tipinde bağlandığımda ilanı sistemden kaldırabilmeliyim.
# http://test.kese.nl/api/homes
#Sistemden kaldırılan ev ilanına tekrar ulaşılamamalıdır.
#Kullanıcı giriş yapmış olmalıdır. (token)
#"Gönderilecek datalar :  swagger dökümanınde belirtilmiştir"

  Feature: US090_APIHomesDelete TC001_Bir kullanıcı olarak "/api/homes/{id}" sayfasına "delete" tipinde bağlandığımda ilanı sistemden kaldırabilmeliyim.

    Scenario: TC001_
    User must be logged in by using a token
    User verifies the house advertisement that has been removed from the system cannot be accessed again.