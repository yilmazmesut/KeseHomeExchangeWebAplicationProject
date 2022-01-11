# TEST CASE US_024
# -Bir kullanıcı olarak anasayfada, giriş yaptıktan sonra
# sağ üstte "İlan Ver" butonu yardımıyla ilan oluşturma sayfalarına gidebilmeliyim.
# Acceptance Criteria
# http://test.kese.nl/
# Ev Değişimi linki görünür olmalıdır, tıklandığında "/new_home" sayfasına gidilmelidir.
# Oda linki görünür olmalıdır, tıklandığında "/new_room" sayfasına gidilmelidir.
# Bed & Breakfast linki görünür olmalıdır, tıklandığında "/new_bed_breakfast" sayfasına gidilmelidir.
# Birlikte Seyehat linki görünür olmalıdır, tıklandığında "/new_car" sayfasına gidilmelidir.
# Kargo linki görünür olmalıdır, tıklandığında "/new_cargo" sayfasına gidilmelidir.

@signup
Feature:US_024-Bir kullanıcı olarak anasayfada, giriş yaptıktan sonra sağ üstte "İlan Ver" butonu yardımıyla ilan oluşturma sayfalarına gidebilmeliyim.

  Background:
    Given the user goes to "http://test.kese.nl/" page
    Given user is on login page "http://test.kese.nl/login"
    When user enters valid username "email@gmail.com"
    And user enters valid password "3344"
    And user clicks on Login button

  Scenario:TC_001_US_024 The Giris Yap Button should be visible and enabled
    Given the user clicks "Giriş Yap" button
    Then the user is on the "http://test.kese.nl/login" page

  Scenario:TC_002_US_024 The user should be able to go "http://test.kese.nl/login" when clicks the Giris Yap Button
  Given