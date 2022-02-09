@mainPage

Feature: ForgotPassword


#   @wip
  Scenario: "Home Change" button should be clickable and visible
    Given User is on login page
    Then The user sees the home change button
    And User clicks on the home change button


  Scenario: When house change is selected, the text "Where you want to change house" should be visible.
    Given The user should be able to see the text "Ev değişimi yapmak istediğiniz yer"