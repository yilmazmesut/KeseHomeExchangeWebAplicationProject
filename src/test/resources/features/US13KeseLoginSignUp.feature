@adem-SignUp
  Feature: US_013 When I enter the "/signup" page as a user, the necessary inputs for registration should be available.

    Background: TC_01 "http://test.kese.nl/login" sayfasina gidilir
      Given Kullanici "http://test.kese.nl" sayfasina gider
      And Giris Yap butonua tikla
      And Kayit Ol butonuna tikla
      Then "http://test.kese.nl/signup" sayfasina gider

    Scenario:US_013_TC_02- "Kullanıcı Adı" inputu aktif ve kullanılabilir olmalıdır.
    Given Kullanici "User name" yerine "admin" yazar

    Scenario:US_013_TC_03- "Email" inputu aktif ve kullanılabilir olmalıdır.
      Given Kullanici email@gmail.com kismina admin@gmail.com girilir

    Scenario:US_013_TC_04-  "Şifre" inputu aktif ve kullanılabilir olmalıdır.
      Given Kullanici Sifre kismina Admin123.girilir

    Scenario:US_013_TC_05- "Şifre tekrarı" inputu aktif ve kullanılabilir olmalıdır.
      Given Kullanici bir onceki adimda girdigimiz sifre Admin123.buraya da girilir

    Scenario:US_013_TC_06- "Email" inputunun içerisinde default olarak "email@gmail.com" yazısı yer almalıdır.
      Given default email adresinde email@gmail.com yazili oldugunu kontrol edilir

