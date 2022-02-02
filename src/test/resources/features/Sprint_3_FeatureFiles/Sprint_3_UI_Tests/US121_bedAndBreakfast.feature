# US_121 Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 10. stepte "Resim ve Fotoğraflar" ekleyebilmeliyim.
# http://test.kese.nl/new_bed_breakfast
#Sayfada default olarak 4 tane resim ekleme butonu görünür olmalıdır.
#Default olarak sadece ilk buton tıklanabilir olmalı, diğerleri "disabled" olmalıdır.
#İlk resim eklenince, ikinci resim ekle butonu aktif hale gelmelidir, bu son resime kadar böyle devam etmelidir.

  Feature: US_121 Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 10. stepte "Resim ve Fotoğraflar" ekleyebilmeliyim.

    Scenario: TC_001
    User verifies that there are 4 image add buttons should be visible on the page by default
    By default, only the first button should be clickable, the others should be "disabled".
    Once the first image is added, the add second image button should become active, and so on until the last image.
