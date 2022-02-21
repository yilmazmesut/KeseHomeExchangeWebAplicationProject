@US132
# Nursel
Feature: From 4. step to 5. Step Passing Feature in Birlikte Seyahat
# Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında,
# 4. stepten 5. stepe geçiş yapabilmeliyim.

  Background: Going to Page 4 on Birlikte Seyahat
    Given user in on login page
    When user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks ilan ver menu on signed in home page
    * user clicks "Birlikte Seyehat" in ilan ver menu
    * user navigates to page 4 in Birlikte Seyahat


  Scenario: Step 4 Ilerle Button Not Clickability By Default on Birlikte Seyahat
    Then ilerle button should be visible on bs page
    But ilerle button should not be clickable on bs page
    And ilerle button opacity should be 0.65 on bs page
    When user clicks to the ilerle button on bs page
    Then warning message "*Lütfen cinsiyet, yaş aralığı ve kişi sayısı seçiniz." should be displayed on step "4 / 6" on bs page
