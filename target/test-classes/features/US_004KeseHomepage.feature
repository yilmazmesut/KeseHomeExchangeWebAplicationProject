Feature: As a user, when I go to the home page , I should be able to search for "Travel Together" postings.

Given user goes to homepage
And the user clicks the "Birlikte_Seyehat" button
When "Birlikte Seyehat" is selected, the text "Seyehat etmek istediğiniz yeri seçiniz" should be visible.
Then user verifies the drop down menu is clickable, under the "Seyehat etmek istediğiniz yeri seçiniz" text