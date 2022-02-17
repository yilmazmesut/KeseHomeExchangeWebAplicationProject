Feature: 3rd step should be able to select the starting seat information


  Background: Going to Page 4 on Birlikte Seyahat
    Given user in on login page
    When user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks ilan ver menu on signed in home page
    * user clicks "Birlikte Seyehat" in ilan ver menu
    * user navigates to page 3 in Birlikte Seyahat


    Scenario:US129_TC_001 As a user, I should be able to select the 3rd step starting, seat information, and enter explanations about the trip.

      Then user verifty that there is a "Araç/Seyehat Bilgileri" Page title visible on the Birlikte Seyahat ten pag
      Then user verifty that there is a "Seyehattaki koltuk tecihinizi veya müsait olan koltuk durumunuzu belirtiniz?" Page  visible on the Birlikte Seyahat ten page
      Then user verifty that there is a "3 / 6" Page Step Number visible on the Birlikte Seyahat ten page