


Feature: US_098 Bir kullanıcı olarak "/api/rooms/{id}/benzerilanlar" sayfasına "get" tipinde id'sini gönderdiğim odaya ait benzer ilanlarını görebilmeliyim.
#  En fazla 5 tane ilan listelenmelidir.
#  Benzer ilan listesinde, id'si gönderilen oda listelenmeMElidir.
#  Benzer ilanlar gönderilen adres bilgisine sahip olmalıdır. (en az bir ortak adres)

  Scenario Outline: user should be verifies when get request on benzer ilanlar page

    Given connect to home benzerilanlar with endpoint "<id>"  query data "<query>" use get
    Then user verifies that there are at most 5 benzer ilan listed
    Then user verifies that this "61cf1b2389708a2d2aedcf0e" is not listed on the response
    Then verify address information must be same as at least one of "<city>" and "<country>"

    Examples:
      | id                       | query                                                                   | city   | country          |
  #| 61fe52dae970093ad0e4bef3 | ?address=Frankfurt, Almanya&address_list=Frankfurt, Almanya             | Frankfurt | Almanya          |
      | 61cf1b2389708a2d2aedcf0e | ?address=London, Birleşik Krallık&address_list=London, Birleşik Krallık | London | Birleşik Krallık |
