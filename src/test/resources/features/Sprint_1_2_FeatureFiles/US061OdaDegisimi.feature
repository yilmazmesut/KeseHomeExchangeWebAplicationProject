Feature: Bir kullanıcı olarak "Oda Değişimi" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.


  Background:
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | hamza@gmail.com | 1234 |
    And user should click to Ilan Ver go to page 3 in Oda



  Scenario:The "ilerle" button should be visible

    Given until the user fills in the blanks on page 3 "ilerle" button should not be functional
    When the user not enters required  information, she sees "Lütfen evin yüzey alanını giriniz"
    Then After the user has entered the required information, the "ilerle" button should be clickable.