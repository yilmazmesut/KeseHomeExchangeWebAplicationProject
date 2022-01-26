Feature: US_048 Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 9. stepten 10. stepe geçiş yapabilmeliyim.

  Background:
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | sln@gmail.com | 1234 |
    And user navigates to page 9 in Home Exchange

  Scenario: "ilerle" button should be visible
    Then user verifies that "İlerle" button is visible at Ev Degisimi
    Then user verifies that "İlerle" button shouldn't be clickable as a default at Ev Degisimi
    When user clicks "İlerle" button without any selection at Ev Degisimi
    Then user verifies that "*Lütfen tarih seçiniz." warning message appears at Ev Degisimi

  Scenario Outline: "İlerle" button should be clickable after any selection
    When user clicks any "date" at Ev Degisimi
    Then user verifies that ilerle button should be clickable at Ev Degisimi

    Examples:
      | selection       |

