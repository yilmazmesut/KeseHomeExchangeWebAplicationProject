# US_076 Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 10. stepte "Resim ve Fotoğraflar" bölümlerinde butonları ve açıklamaları görebilmeliyim.
# http://test.kese.nl/new_room
# Sayfada default olarak 4 tane resim ekleme butonu görünür olmalıdır.
# Default olarak sadece ilk buton tıklanabilir olmalı, diğerleri "disabled" olmalıdır.
# İlk resim eklenince, ikinci resim ekle butonu aktif hale gelmelidir, bu son resime kadar böyle devam etmelidir.


Feature: US_076 Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 10. stepte "Resim ve Fotoğraflar" bölümlerinde butonları ve açıklamaları görebilmeliyim.

    Background: Successful connection to site and coming to step 10 in "Ev Değişimi"
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 10 in Room Exchange Page

  Scenario: US_076 TC_001 Buttons and the descriptions should be visible
    Then user verifies that the four picture loading buttons are visible as default on the new room_step ten page
    Then user verifies that the first picture loading buttons is clickable as default on the new room_step ten page
    Then user verifies that the rest of the picture loading buttons are disabled on the new room_step ten page
    Then user verifies that after adding the first image, the second Add image Button should become active and this should continue until the last picture on the new room_step ten page