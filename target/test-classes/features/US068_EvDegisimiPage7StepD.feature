Feature: Bir kullanici olarak "Oda Kirala & Degisimi" ilan olusturma sayfasinda,
  7. stepte "Aktiviteler" bilgisini girebilmeliyim

  Background: Successful connection to site and coming to step 7 in "Ev Degisimi"
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |