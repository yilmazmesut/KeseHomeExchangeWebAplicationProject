@US_006
Feature: Cargo is clickable and visible and message is visible

  Background:
    Given go to "http://test.kese.nl/" page


  Scenario:  Cargo is clickable and visible
    Then Cargo button should be clickeable and display



  Scenario: "Kargo göndermek istediğiniz noktayı seçiniz" is displayed
    And Click Cargo button
    Then "Kargo göndermek istediğiniz noktayı seçiniz" is displayed