Feature: Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 9. stepte "Değişim Tarihi"
  bilgisini girmek için ilgili inputu kullanabilmeliyim.

  Background:
Scenario:US118_TC001
    Given user is on login page "http://test.kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 9 in HomeExchange

  Scenario:US118_TC002
  İnput içerisinde default olarak "Tarih seçmek için tıklayınız" yazısı yer almalıdır.
    Then user verify "Tarih seçmek için tıklayınız" should be exist

  Scenario: US118_TC003
  Seçtiğim tarih aralığı input içerisinde yer almalıdır.
    When user pick a date
    Then user verify to pick a date should be exist in the input

  Scenario:US118_TC004
  Tarih seçme inputu aktif ve kullanılabilir olmalıdır.
    Then user verify pick a date and input should be enabled

