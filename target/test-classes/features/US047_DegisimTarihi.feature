Feature: US_053	Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 10. stepte en az 5 en fazla 10 tane resim ekleyebilmeliyim.
  Background: login
    Given user goes to "http://test.kese.nl/login" page
    When user enters valid username "hamza@gmail.com"
    And user enters valid password "1234"
    And user clicks on Login button
    And user goes to "http://test.kese.nl/new_home" page
#    And user chooses house type on the new home step one page
#    And user clicks to the ilerle button on the new home page
#    And user chooses an address from the list in new home step two page
#    And user clicks to the checkbox on the new home step two page
#    And user clicks to the ilerle button on the new home page
#    And user types usage area to the input on the new home step three page
#    And user clicks on the increment buttons on the new home step three page
#    And user clicks to the ilerle button on the new home page
#    And user clicks on the increment button of tek kisilik yatak on the new home step four page
#    And user clicks to the ilerle button on the new home page
#    And user clicks on the tv option on the new home step five page
#    And user clicks to the ilerle button on the new home page
#    And user types a description to the input on the new home step six page
#    And user clicks to the ilerle button on the new home page
#    And user clicks to the lunapark on the new home step seven page
#    And user clicks to the ilerle button on the new home page


  Scenario: TC_001_US_053_i should be able to add up to ten photos
    When user clicks to the all hayir options on the new home step eight page
    And user clicks to the ilerle button on the new home page
