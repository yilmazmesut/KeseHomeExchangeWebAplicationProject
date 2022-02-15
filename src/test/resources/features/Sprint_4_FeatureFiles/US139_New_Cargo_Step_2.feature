@ui
Feature: US_139 Bir kullanıcı olarak "Kargo Gönder" ilan oluşturma sayfasında, 2. stepte başlangıç, bitiş ve geçiş noktalarını seçebilmeliyim.

  Scenario: Successful connection to site and coming to step 2 in "Kargo"
    Given user is on login page "https://kese.nl/new_cargo"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 10 in Kargo

  Scenario: