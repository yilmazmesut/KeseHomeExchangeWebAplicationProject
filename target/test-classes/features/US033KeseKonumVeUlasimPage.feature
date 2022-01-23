Feature: TC_001_US_033_Bir kullanıcı olarak "Konum ve Ulaşım" ilan oluşturma sayfasında, 2. stepte "Konum ve Ulaşım" bilgilerini girebilmeliyim.

  Scenario: : user should able to go next page filling mandatory fields
    Given user goes to "http://test.kese.nl" Page
    When "cemile@gmail.com" signed in on sign in page
    And user goes to "http://test.kese.nl/new_home" page
    And user chooses house type on the new home step one page
    And user clicks to the ilerle button on the new home page
    And user should able to see Konum ve Ulasim text
    And user should able to see Evinizin konumunu belirtiniz. Acik adres vermenize gerek yoktur text
    And user should able to see page number
    And user chooses "London, Birleşik Krallık" an address from the list in new home step two page
    And Ev ile otobus duragi arasi input field should be usable
    And Ev ile tren istasyonu arasi input field should be usable
    And Ev ile tramway duragi arasi input field should be usable
    And Sadece sahsi arac ile... checkbox button should be usable

  Scenario: : NEGATIVE user should not able to go next page with out input mandatory fields
   #developper sayfadaki bug i duzeltince kodlar eklenecektir.


