Feature:

  Background:
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | hamza@gmail.com | 1234 |
    And user should click to Ilan Ver go to page 10 in Oda

  Scenario: User should be able to attach at least 5 images
    Given user should be able to attach at least 5 images with "Resimleri Secin" button
    And user should be able to attach at least 5 images with "Resim Ekle"
    Then verify the 5 added images












#US078_TC01_1_user is on login page "http://test.kese.nl/new_home"
#US078_TC01_2_user signed in on sign in page
#US078_TC01_3_user navigates to page 10 in Oda
#US078_TC02_1_user should be able to attach at least 5 images with "Resim Ekle"
#US078_TC02_2_user should be able to attach at least 5 images with "Resimleri Secin" button
#US078_TC03_1_user should be adding from 5 to 10 images, the "Resimleri Kaydet" button should be clickable
#US078_TC03_2_user should not be adding more than 10 images
#US078_TC03_3_user should be able to inserton ""Tüm Resimleri Kaldır" button after adding the images.
#US078_TC04_1_After adding 5 images, the "Resimleri Kaydet" button should be clickable
#US078_TC04_2_user adding less than 5 images, the "Resimleri Kaydet" button should not be clickable