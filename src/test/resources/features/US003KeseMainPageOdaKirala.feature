Feature:  As a user, when I go to the home page , I should be able to search for "Oda Kirala" postings.

  Background:
    Given the user should be on the homepage

  Scenario:
    When the user clicks the "Oda Kirala" button
    Then "Oda Kirala" is selected, the text "Oda değişimi yapmak istediğiniz yer" should be visible.
    Then user verifies the drop down menu is clickable, under the "Oda değişimi yapmak istediğiniz yer" text