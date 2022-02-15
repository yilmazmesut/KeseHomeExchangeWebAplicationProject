Feature: US096 Bir kullanıcı olarak "/api/rooms/{id}" sayfasına "delete" tipinde bağlandığımda ilanı sistemden kaldırabilmeliyim.

  Background:
    Given user logged in with API
    When user enters required data
    Then verify status code is 202

  Scenario: The room removed from the system, should not be accessed again.
    When user deletes rooms for rooms API
    Then verify if room is deleted