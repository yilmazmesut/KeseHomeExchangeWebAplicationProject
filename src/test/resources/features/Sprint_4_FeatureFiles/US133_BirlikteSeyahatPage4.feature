@US133 @ui
Feature: Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 5. stepte "Tarih ve Saat" bilgisini girebilmeliyim

  Background: Going to Page 5 on Birlikte Seyahat
    Given user in on login page
    When user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks ilan ver menu on signed in home page
    * user clicks "Birlikte Seyehat" in ilan ver menu
    * user navigates to page 5 in Birlikte Seyahat