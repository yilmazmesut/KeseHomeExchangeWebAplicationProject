Feature: US_073 Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 9. stepten 10. stepe geçiş yapabilmeliyim.

  Background:
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | sln@gmail.com | 1234 |
    And user should click to Ilan Ver go to page 9 in Oda

    Scenario: