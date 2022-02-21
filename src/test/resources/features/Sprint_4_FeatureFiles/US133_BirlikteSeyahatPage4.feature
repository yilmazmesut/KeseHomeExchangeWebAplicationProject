@US133 @ui
Feature: US133_Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 5. stepte "Tarih ve Saat" bilgisini girebilmeliyim
#selen
  Background: Going to Page 5 on Birlikte Seyahat
    Given user in on login page
    When user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks ilan ver menu on signed in home page
    * user clicks "Birlikte Seyehat" in ilan ver menu
    * user navigates to page 5 in Birlikte Seyahat
    
    Scenario:
      When "Tarih seçmek için tıklayınız" input should be clickable on BS page
      And if user clicks "Tarih seçmek için tıklayınız" input, the date selection window should open on BS page
      And if user clicks trip hour input, the trip hour selection window should open on BS page
      Then verify if the header "Yolculuk Tarihi ve Zamanı" is visible on BS page
      And verify if the description "Yapacağınız veya yapmak istediğiniz yolcuğun tahmini tarih aralığını ve olası başlangıç saatini belirtiniz." is visible on BS page