# TEST CASE US_015-
# Bir kullanıcı olarak "/signup" sayfasına girdiğimde,"Giriş Yap" butonu görünür olmalıdır.
#Acceptance Criteria
#http://test.kese.nl/signup
#"Giriş Yap" butonu aktif ve görünür olmalıdır.
#Giris Yap Butonuna tıklandğında "http://test.kese.nl/login" sayfasına gidilebilmelidir.

@smoke
Feature:US_015-Bir kullanıcı olarak "/signup" sayfasına girdiğimde,"Giriş Yap" butonu görünür olmalıdır.
  Background:
    Given the user goes to "http://test.kese.nl/signup" page

  @smoke
  Scenario:TC_001_US_015 The Giris Yap Button should be visible and enabled
    And the user asserts The Giris Yap Button is visible and enabled
    When the user clicks Giriş Yap button
    Then the user asserts that he is able to go "http://test.kese.nl/login" page


