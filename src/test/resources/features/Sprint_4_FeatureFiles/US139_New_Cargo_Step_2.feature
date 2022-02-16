@ui
Feature: US_139 Bir kullanıcı olarak "Kargo Gönder" ilan oluşturma sayfasında, 2. stepte başlangıç, bitiş ve geçiş noktalarını seçebilmeliyim.

  Background: Successful connection to site and coming to step 2 in "Kargo"
    Given user is on login page "https://kese.nl/new_cargo"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 2 in Kargo

  Scenario:
    Then user asserts "Kargo Güzergahı" is visible
    And user asserts "Taşıyacağınız veya göndermek istediğiniz kargonun güzergahını seçiniz. Başlangıç ve bitiş noktalarını belirtiniz. Ayrıca yolculuğunuz süresince uğrayacağınız geçiş noktalarını sırası ile belirtiniz." is visible
