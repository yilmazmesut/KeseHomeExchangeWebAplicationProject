Feature: Bir kullanici olarak "Ev Degisimi" ilan olusturma sayfasinda,
  7. stepten 8. stepe gecis yapabilmeliyim.

  Background: Successful connection to site and coming to step 7 in "Ev Degisimi"
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 7 in Home Exchange


#    This user story will be check after bug ticket is closed.
  Scenario: "ilerle" button should be visible
    Then user verifies that "İlerle" button is visible at Ev Degisimi
    Then user verifies that "İlerle" button shouldn't be clickable as a default at Ev Degisimi
    When user clicks "İlerle" button without any selection at Ev Degisimi
    Then user verifies that "*Lütfen ev tipini seçiniz." warning message appears at Ev Degisimi


  Scenario Outline: "İlerle" button should be clickable after any selection
    When user clicks any "<selection>" at Ev Degisimi
    Then user verifies that ilerle button should be clickable at Ev Degisimi

    Examples:
      | selection       |
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
