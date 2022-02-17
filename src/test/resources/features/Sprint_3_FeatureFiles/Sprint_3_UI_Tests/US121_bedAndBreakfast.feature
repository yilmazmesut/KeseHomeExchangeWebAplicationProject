# US_121 Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 10. stepte "Resim ve Fotoğraflar" ekleyebilmeliyim.
# http://kese.nl/new_bed_breakfast
#Sayfada default olarak 4 tane resim ekleme butonu görünür olmalıdır.
#Default olarak sadece ilk buton tıklanabilir olmalı, diğerleri "disabled" olmalıdır.
#İlk resim eklenince, ikinci resim ekle butonu aktif hale gelmelidir, bu son resime kadar böyle devam etmelidir.

Feature: US_121 Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 10. stepte "Resim ve Fotoğraflar" ekleyebilmeliyim.

  Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
    Given user is on login page "http://kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 10 in Bed & Breakfast

  Scenario: TC_001
    Then user verifies that the four image add buttons are visible as default on the new room_step ten page
    Then user verifies that only the first image add buttons is clickable as default on the new room_step ten page
    Then user verifies that the rest of the image add buttons are disabled on the new room_step ten page
    When user uploads an image "file-upload1" "Room 6.jfif"
    Then user verifies that the second image button becomes active after adding an image
    When user uploads an image "file-upload2" "Room 7.jfif"
    Then user verifies that the third image button becomes active after adding an image
    When user uploads an image "file-upload3" "Room 8.jfif"
    Then user verifies that the fourth image button becomes active after adding an image