Feature:Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 3. stepte "Kullanım Alanı" bilgilerini girebilmeliyim.




  Background:
  #Successful connection to site and coming to step 10 in "Ev Değişimi"
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 3 in Home Exchange

  Scenario:The "Kullanim Alani" input must be available.

    And  The user sees the title "kullanım alanı"
    And  The user sees description of "Evinizin kullanım alanını belirtiniz."
    And  The user clicks "yüzey alanı" button and enters the "120" of the house
    And  The user can increase or decrease the numbers by clicking the bedroom bathroom toilet living room buttons
    And  User should able to click increment button fifteen times for Kullanilabilecek Alanlar
    And user verifies that the numbers are max 15 15 15 15 on the new home page step three
    And The user can see the text ucboluon on the top of the page