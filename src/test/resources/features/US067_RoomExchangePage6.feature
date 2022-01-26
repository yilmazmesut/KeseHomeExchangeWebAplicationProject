Feature: As a user, I should be able to switch from step 6 to step 7 on the "Home Exchange" ad creation page.

  Background:
    Given user is on login page "http://test.kese.nl/new_room"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 6 in Home Exchange

  Scenario: US042_TC01_user should see the "Ilerle" button on the 6th page
    Then system displays Ilerle button on the 6th page


  Scenario: US042_TC02_As a default "Ilerle" Button should NOT be clickable
    Then verify Ilerle button is NOT enable on 6th page


  Scenario: US042_TC03_after providing min requirement of the page the "Ilerle" button should be clickable
    When user enters "N" explanation to the inputbox on the 6th page
    Then verify Ilerle button is active on 6th page


  Scenario: US042_TC04_before providing min requirement of the page clicking "Ilerle" button
    When user enters "" explanation to the inputbox on the 6th page
    And user clicks Ilerle button on the 6th page
    Then verify user sees "*Lütfen eviniz ile ilgili açıklama giriniz." text near to Ilerle button on the 6th page


  Scenario: US042_TC05_user should navigate 6th page to 7th page
    When user enters "N" explanation to the inputbox on the 6th page
    And user clicks Ilerle button on the 6th page
    Then verify user is on the "7 / 10" page
