Feature: US_088	Bir kullanıcı olarak "/api/homes" sayfasına "post" tipinde bağlandığımda gönderilen bilgiler ile yeni bir ev ilanı oluşturabilmeylim.
#  http://test.kese.nl/api/homes
#  Zorunlu bilgiler gönderilerek yeni bir ev ilanı oluşturulabilmelidir.
#  Kullanıcı giriş yapmış olmalıdır. (token)
#  "Gönderilecek datalar :  swagger dökümanınde belirtilmiştir"

  Scenario: user should be create new home advertise
    Given user connects to "/api/homes"
