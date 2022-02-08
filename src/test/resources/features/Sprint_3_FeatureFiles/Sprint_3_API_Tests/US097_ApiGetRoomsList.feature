Feature:Bir kullanıcı olarak "/api/rooms/search/ilanlistesi/{bulundugu_sayfa}" sayfasına "get" tipinde bağlandığımda ilanı sistemden kaldırabilmeliyim.

  #http://test.kese.nl/api/rooms/search/ilanlistesi/{bulundugu_sayfa}
  #En fazla 20 tane ilan listelenmelidir
  #Tarihe göre ya da görüntülenme sayısısına göre sıralı olabilmelidir
  #"Gönderilecek datalar :  swagger dökümanınde belirtilmiştir

  Scenario Outline:
    Given user connects to "/rooms/search/ilanlistesi/{bulundugu_sayfa}" for search homes with "<bulundugu_sayfaReq>" "<address>" "<address_listReq>" "<order>" s
    Then user verifies that status code is 200 for search homes  list s
    Then user verifies that response body has max 20 homes s
    Then user verifies that homes is ordered by viewed s
   # Then user verifies that homes is ordered by "<order>" s
    Examples:
      | bulundugu_sayfaReq | address                                   | address_listReq                           | #order
      | 2                  | Rue de l'Arnon, Sainte-Croix, Switzerland | Rue de l'Arnon, Sainte-Croix, Switzerland | #date