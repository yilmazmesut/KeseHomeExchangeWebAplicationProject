@US_006
Feature: Cargo is clickable and visible and message is visible
  @META3-143
  Background:
    Given go to "http://test.kese.nl/" page

  @META3-128
  Scenario:  Cargo is clickable and visible
    Then Cargo button should be clickeable and display


  @META3-144
  Scenario: "Kargo göndermek istediğiniz noktayı seçiniz" is displayed
    And Click Cargo button
    Then "Kargo göndermek istediğiniz noktayı seçiniz" is displayed