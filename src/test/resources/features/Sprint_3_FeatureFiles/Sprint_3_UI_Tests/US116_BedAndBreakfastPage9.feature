Feature:

  Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
    Given user is on login page "http://test.kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 9 in Bed & Breakfast

  Scenario Outline:
   Given "Tarih seçmek için tıklayınız" input should be clickable
    And if user clicks "Tarih seçmek için tıklayınız" input, the date selection window should open
    Then verify if the "<Text>" is visible
  Examples:
    | Text                                                                                                     |
    | Değişim Tarihi                                                                                           |
    | Evinizin değişim için müsait olduğu tarih aralıklarını seçiniz. Birden çok tarih aralığı seçebilirsiniz. |
    | 9                                                                                                        |




