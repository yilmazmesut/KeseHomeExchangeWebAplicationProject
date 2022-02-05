@US009
Feature: Kese HomePage Giris Yap Button verification

  # When the user is not logged in, "Giris Yap" button should be visible and clickable
  # When the user clicks "Giris Yap" button, user should be directed to login page
  Scenario: User should see "Giris Yap" button when not logged in
    Given the user should be on the homepage
    Then Giris Yap button should be visible and clickable on home page
    When the user clicks Giris Yap button on home page
    Then page url should be "http://test.kese.nl/login"