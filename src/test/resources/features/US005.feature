Feature:US_005 Bir kullanıcı olarak ana sayfaya girdiğimde, "Bed & Breakfast" ilanlarında arama yapabilmeliyim.

  Scenario:TC001-should be visible
    Given the user goes to "http://test.kese.nl/" url
    And The user clicks the
    And "Bed & Breakfast" is selected, "Gitmek istediğiniz Yer" should be visible
    Then user verifies the drop down menu is clickable ,under the "Gitmek istediğiniz Yer" text


