# US_143-Bir kullanıcı olarak "Kargo Gönder" ilan oluşturma sayfasında, 4. stepte açıklama bilgisi ekleyebilmeliyim.
# https://kese.nl/new_cargo
# 1.stepte, sayfanın üst kısmında "4 / 4" yazısı görünür olmalıdır.
# "Kargo Tarihi ve Zamanı" başlığı görünür olmalıdır.
# "Kargoyu tasiyabilecegiz tarihi ve zamanını belirtiniz
# .Kargo gonderme tarihini ve zamanini  belirtiniz." açıklaması görünür olmalıdır.
# "Tarih seçmek için tıklayınız" inputu aktif ve kullanılabilir olmalıdır.
# Saat seçme inputuna tıklayınca, saat seçme penceresi açılmalıdır,
# saat seçimi yapılabilmelidir.

#
  # QA ENGINEER MSEN

Feature: US_143-Bir kullanıcı olarak "Kargo Gönder" ilan oluşturma sayfasında, 4. stepte açıklama bilgisi ekleyebilmeliyim.

  Background: Successful connection to site and coming to step 3 in "Kargo"
    Given user is on login page "https://kese.nl/new_cargo"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 4 in Kargo

  Scenario: TC_01 user adds explanation in step 4
    Then ilerle button should be visible on kargo page
    But ilerle button should not be clickable on kargo page
    And ilerle button opacity should be 0.65 on kargo page
    When user clicks to the ilerle button on kargo page
    Then warning message "*Lütfen açıklama giriniz." should be displayed on kargo page
    When user enters "Kargo 4 kg" to aciklamalar on kargo page
    And ilerle button should be clickable on kargo page
