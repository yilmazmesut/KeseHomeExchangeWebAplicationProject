# US_130 Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.
# https://kese.nl/new_car
# "İlerle" butonu görünür olmalıdır.
# "İlerle" butonu default olarak tıklanabilir olmalı ancak tıklandığında bir sonraki stepe geçmemelidir.
# "İlerle" butonunun default olarak opacity (saydamlık) değeri 0.65 olmalıdır.
# Koltuk bilgisi seçili olmadığında ya da açıklama bilgisi girilmediğinde, İlerle butonuna tıklanırsa "Lütfen zorunlu bilgileri giriniz." uyarısı görünür olmalıdır.
# Başlangıç noktası ve bitiş noktası seçildiğinde, İlerle butonu tıklanabilir olmalı.
#  QA MSEN

Feature: US_130 Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.

  Background: Going to Page 2 on Birlikte Seyahat
    Given user in on login page
    When user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks ilan ver menu on signed in home page
    * user clicks "Birlikte Seyehat" in ilan ver menu
    * user navigates to page 3 in Birlikte Seyahat

  Scenario: US_130_TC001
    Then user verifies that "İlerle" button is visible
    Then user verifies that the "ilerle" button should be clickable by default, but should not move to the next step when clicked.
    Then user verifies that the opacity value of the "Next" button should be 0.65 by default
    Then user verifies that If the seat information is not selected or the description information is not entered, if the Next button is clicked, "Please enter the required information." warning should be visible.
    Then user verifies that When the start point and end point are selected, the Next button should be clickable.
