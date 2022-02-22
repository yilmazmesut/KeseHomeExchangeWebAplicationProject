Feature:US_116

Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
Given user is on login page "https://kese.nl/new_bed_breakfast"
When user signed in on sign in page
| coder52@nonmail.com | 1234 |
And user navigates to page 9 in Bed & Breakfast

  Scenario:
    Given "Tarih seçmek için tıklayınız" input should be clickable
    Then verify text "Evinizin değişim için müsait olduğu tarih aralıklarını seçiniz. Birden çok tarih aralığı seçebilirsiniz." the is visible
    Then verify text "Değişim Tarihi" the is visible
    When clicks Tarih seçmek için tıklayınız input, verify date selection window is visible
    Then  verify text "9" the is visible