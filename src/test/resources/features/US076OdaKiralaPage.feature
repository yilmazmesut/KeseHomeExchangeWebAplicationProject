# US_076-Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 10. stepte "Resim ve Fotoğraflar" bölümlerinde butonları ve açıklamaları görebilmeliyim.
# Acceptance Criteria
#http://test.kese.nl/new_room
#"Resim ve Fotoğraflar" başlığı görünür olmalıdır.
#"Odanızın ve evinizin ilgili alanlarının fotoğraflarını yükleyiniz. En az 2 en fazla 10 adet fotoğraf ekleyebilirsiniz." açıklaması görünür olmalıdır.
#"Resimleri Seçin" butonu aktif ve kullanılabilir olmalıdır.
#"Tüm Resimleri Kaldır" butonu aktif ve kullanılabilir olmalıdır.
#"En az 5 en fazla 10 resim yükleyebilirsiniz." açıklaması görünür olmalıdır.
#10. stepte, sayfanın üst kısmına "10 / 10" yazısı görünür olmalıdır.

Feature: US_076 Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 10. stepte "Resim ve Fotoğraflar" bölümlerinde butonları ve açıklamaları görebilmeliyim.
  Background: login
    Given user goes to "http://test.kese.nl/login" page
    And user clicks Giris Yap Button
    And user inputs "msen2020@hotmail.com" to the email input on the login page
    And user inputs "ms959095" to the password input on the login page
    And user clicks on the giris yap button one the login page
    And user clicks on Ilan Ver Button on the main page
    And user clicks on Oda Button on the main page
    And user is on the "http://test.kese.nl/new_home" new_room page
    And user chooses a House Type on the new room step one page
    And user selects Odami Kiraya vermek istiyorum from Degisim and Kirala on the new_room step one page
    And user clicks to the ilerle button on the new_room step one page
    And user chooses an address from the list in new_room step two page
    And user clicks to the checkbox on the new_room step two page
    And user clicks to the ilerle button on the new_room page
    And user inputs into the usage area on the new_room step three page
    And user clicks on the increment buttons on the new_room step three page
    And user clicks on the ilerle button on the new_room step three page
    And user selects Yas Araligi on the new_room step four page
    And user selects Cinsiyet on the new_room step four page
    And user increases Kisi Sayisi by clicking on the increment button on the new_room step four page
    And user clicks on the ilerle button on the new_room step four page
    And user select WIFI option from Ev Imkanlari on the new_room step five page
    And user clicks on the ilerle button on the new_room five page page
    And user inputs a description into the description box on the new_room step six page
    And user clicks on the ilerle button on the new_room step six page
    And user clicks on the Helal Restaurant option from Aktiviteler on the new_room step seven page
    And user clicks on the ilerle button on the new_room step seven page
    And user clicks on the all Hayir options on the new_room step eight page
    And user clicks on the ilerle button on the new_room step eight page
    And user selects the date on the new_room step nine page
    And user clicks on the ilerle button on the new_room step nine page

  Scenario: US_076 TC_001 Buttons and the descriptions should be visible
    Then user verifies that there is a "10 / 10" Page Step Number visible on the new room_step ten page
    Then user verifies that the title "Resim ve Fotograflar" should be visible on the new_room step ten page
    Then user verifies that the description of Resim ve Fotograflar should be visible on the new room_step ten page
    Then user verifies that Resimleri Secin button is active and functional on the new room_step ten page
    Then user verifies that Tum Resimleri Kaldir button is active and functional on the new room_step ten page
    Then user verifies that the description of the maximum loading pictures should be visible on the new room_step ten page