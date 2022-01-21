Feature: Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 10. stepte en az 5 en fazla 10 tane resim ekleyebilmeliyim.

  Scenario: Successful connection to site and coming to page 10 in Home Exchange
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page ten in Home Exchange




