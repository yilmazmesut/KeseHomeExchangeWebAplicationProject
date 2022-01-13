Feature: US_0014 Bir kullanıcı olarak "/signup" sayfasına girdiğimde, kayıt oluştur butonu kullanılabilir olmalıdır.
  Email, kullanıcı adı, şifre ve şifre tekrarı bilgileri eklenmeden "Kayıt Oluştur" butonu kullanılabilir olmamalıdır!

  Background:
    Given the user goes to "http://test.kese.nl/signup" page


  Scenario Outline:Email, kullanıcı adı, şifre ve şifre tekrarı bilgileri eklenmeden "Kayıt Oluştur" butonu kullanılabilir olmamalıdır!

    And user types "<kullaniciAdi>" to the Kullanici Alani input
    And user types "<email>" to the email input
    And user types "<password>" to the Sifre input
    And user types "<passwordTekrari>" to the Sifre Tekrari input
    And user click Kullanim Kosullari check box
    Then user verifies that Kayit Olustur button not be clickable

    Examples:
      | kullaniciAdi | email          | password | passwordTekrari |
      |              | aziz@gmail.com | asdasd   | asdasd          |
      | aziz         |                | asdasd   | asdasd          |
      | aziz         | aziz@gmail.com |          | asdasd          |
      | aziz         | aziz@gmail.com | asdasd   |                 |


  Scenario Outline: Email, kullanıcı adı, şifre ve şifre tekrarı bilgileri eklenmeden "Kayıt Oluştur" butonu kullanılabilir olmamalıdır!
    And user types "<kullaniciAdi>" to the Kullanici Alani input
    And user types "<email>" to the email input
    And user types "<password>" to the Sifre input
    And user types "<passwordTekrari>" to the Sifre Tekrari input
    Then user verifies that Kayit Olustur button not be clickable

    Examples:
      | kullaniciAdi | email          | password | passwordTekrari |
      | aziz         | aziz@gmail.com | asdasd   | asdasd          |



 # Scenario: TC_001_US_014 kullanici adi girilmedi
  #  And user types "aziz" to the Kullanici Alani input
  #  And user types "aziz@gmail.com" to the email input
  #  And user types "password" to the Sifre input
  #  And user types "password" to the Sifre Tekrari input
  #  And user click Kullanim Kosullari check box
  #  Then user verifies that Kayit Olustur button not be clickable

 # Scenario: TC_002_US_014 mail girilmedi
  #  And user types "aziz" to the Kullanici Alani input
  #  And user types "password" to the Sifre input
  #  And user types "password" to the Sifre Tekrari input
  #  And user click Kullanim Kosullari check box
  #  Then user verifies that Kayit Olustur button not be clickable

 # Scenario: TC_003_US_014 Sifre girilmedi
  #  And user types "aziz" to the Kullanici Alani input
  #  And user types "aziz@gmail.com" to the email input
  #  And user types "password" to the Sifre Tekrari input
  #  And user click Kullanim Kosullari check box
  #  Then user verifies that Kayit Olustur button not be clickable

 # Scenario: TC_004_US_014 Sifre Tekrari girilmedi
  #  And user types "aziz" to the Kullanici Alani input
  #  And user types "aziz@gmail.com" to the email input
  #  And user types "password" to the Sifre input
   # And user click Kullanim Kosullari check box
   # Then user verifies that Kayit Olustur button not be clickable
