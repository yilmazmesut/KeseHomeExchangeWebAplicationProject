Feature: TC_001_US_033_US_034-Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 2. stepten 3. stepe geçiş yapabilmeliyim.

  Background: user should be on the Konum ve Ulasim page
    Given user goes to "http://test.kese.nl" Page
    When "cemile@gmail.com" signed in on sign in page
    And user goes to "http://test.kese.nl/new_home" page
    And user chooses house type on the new home step one page
    And user clicks to the ilerle button on the new home page
    And user should able to see Konum ve Ulasim text

    Scenario: user should able to go next page with input mandatory fields
      And user should able to see Evinizin konumunu belirtiniz. Acik adres vermenize gerek yoktur text
      And user should able to see page number
      And user chooses "London, Birleşik Krallık" an address from the list in new home step two page
      And Ev ile otobus duragi arasi input field should be usable
      And Ev ile tren istasyonu arasi input field should be usable
      And Ev ile tramway duragi arasi input field should be usable
      And Sadece sahsi arac ile... checkbox button should be usable
      And verify if ilerle button should be clickable


  Scenario: : NEGATIVE user should not able to go next page with out input any mandatory fields
    And user verifies that ilerle button should not be clickable


  Scenario: NEGATIVE user should not able to go to next page only with input location
    And user chooses "London, Birleşik Krallık" an address from the list in new home step two page
    And user verifies that ilerle button should not be clickable

  Scenario: NEGATIVE user should not able to go to next page only with input Ev ile Otobus Duragi field
    And Ev ile otobus duragi arasi input field should be usable
    And user verifies that ilerle button should not be clickable

  Scenario: NEGATIVE user should not able to go to next page only with input Ev ile Tren Istasyonu field
    And Ev ile tren istasyonu arasi input field should be usable
    And user verifies that ilerle button should not be clickable

  Scenario: NEGATIVE user should not able to go to next page only with input Ev ile Tramvay field
    And Ev ile tramway duragi arasi input field should be usable
    And user verifies that ilerle button should not be clickable

  Scenario: NEGATIVE user should not able to go to next page only with check checkbox
    And Sadece sahsi arac ile... checkbox button should be usable
    And user verifies that ilerle button should not be clickable
