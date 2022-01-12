Feature:US023_Bir kullanıcı olarak anasayfada, giriş yaptıktan sonra sağ üstte "İlan Ver" ve "Profilim" butonlarını görebilmeliyim.


  Background:
    Given user is on login pag "http://test.kese.nl/login"



  Scenario:TC001_should be visible
    When user enters valid usernam "kullanici1@gmail.com"
    And user enters valid passwor "1234"
    And user clicks on Login butto
    When "ilan Ver" is selected, "ilan Ver" should be visible
    And The user clicks "Profilim" button
    When "Profilim" should be visible