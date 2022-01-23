Feature: Bir kullanici olarak "Ev Degisimi" ilan olsşturma sayfasinda,
  7. stepte "Aktiviteler" bilgisini girebilmeliyim

  Background: Successful connection to site and coming to step 7 in "Ev Degisimi"
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 7 in Home Exchange


  Scenario: Title, warning message and number of the page should be visible
    Then user verifies that "Aktiviteler" is visible
    Then user verifies that "Evinizin çevresinde yapılabilecek aktiviteleri belirtiniz." message is visible
    Then user verifies that number of the "7 / 10" page is visible

  Scenario: All selections should be clickable
    Then user verifies that all selections should be clickable
      | Lunapark        |
      | Plaj            |
      | Bisiklet Yolu   |
      | Müze            |
      | Balık Tutma     |
      | Kayak Yapma     |
      | Spor Salonu     |
      | Doğa Yürüyüşü   |
      | Ünlü Meydan     |
      | Çocuk Parkı     |
      | Helal Restorant |
      | AVM             |
      | Sinema          |
      | Camii & Dernek  |
