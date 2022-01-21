Feature: Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 10. stepte en az 5 en fazla 10 tane resim ekleyebilmeliyim.

  Background: Successful connection to site and coming to page 10 in Home Exchange
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 1 in Home Exchange

  Scenario: It should be able to add at least 5 and at most 10 images in step 10 on the "Ev Değişimi" ad creation page.
    Then user shouldn't save the pictures without adding minimum five pictures
    And user asserts the Resimleri Kaydet button should be clickable after adding five images
    Then user asserts that a maximum of ten pictures can upload

  Scenario:


