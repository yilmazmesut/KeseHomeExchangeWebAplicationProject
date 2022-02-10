Feature: US096 Bir kullanıcı olarak "/api/rooms/{id}" sayfasına "delete" tipinde bağlandığımda ilanı sistemden kaldırabilmeliyim.

  Scenario: The room removed from the system, should not be accessed again.
    When user connects to "/rooms" for rooms API
    Given user deletes rooms for rooms API