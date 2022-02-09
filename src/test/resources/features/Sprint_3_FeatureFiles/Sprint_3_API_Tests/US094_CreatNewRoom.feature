Feature: Creating new room

  Background:
    Given user logged in with API

  Scenario: Creating new room Positive Testing
    When user enters required data
    Then verify status code is 202


  Scenario: Negative testing without secret_token
    When user enters all requirement data without sending secret token
    Then verify status code is 401




