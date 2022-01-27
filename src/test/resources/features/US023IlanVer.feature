Feature:US023_Bir kullanıcı olarak anasayfada, giriş yaptıktan sonra sağ üstte "İlan Ver" ve "Profilim" butonlarını görebilmeliyim.


  Background:
    Given user is on login pag "http://test.kese.nl/login"


@Smoketest
  Scenario:TC001_should be visible
    When user enters valid usernam "kullanici1@gmail.com"
    And user enters valid passwor "1234"
  @Smoketest
    Scenario:TC002
    And user clicks on Login butto
    When "ilan Ver" is selected,
    When "ilan Ver" should be visible
  @Smoketest
      Scenario:TC003
    And  "Profilim" is selected
    When "Profilim" should be visibl