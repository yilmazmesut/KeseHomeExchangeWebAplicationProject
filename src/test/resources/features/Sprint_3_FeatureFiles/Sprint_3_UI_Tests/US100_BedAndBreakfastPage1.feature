
  Feature: Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 1. stepte "Ev Tipi" bilgisini girebilmeliyim.

    Scenario:
     # Given user on the login page as this url "http://test.kese.nl/login"
      Given the user should navigate to "https://kese.nl/login" page
      Given user navigate to "https://kese.nl/new_bed_breakfast"
      Given User should see "Ev Tipi" title on page one of Bed and Breakfast
      Then  User should see the "Odanız hangi ev türünde yer alıyor , belirtiniz." statement on page one of Bed and Breakfast
      And user asserts "Ev Turu" is visible and clicable on page one of Bed and Breakfast
      Then User should see the "1 / 10" part on page one of Bed and Breakfast