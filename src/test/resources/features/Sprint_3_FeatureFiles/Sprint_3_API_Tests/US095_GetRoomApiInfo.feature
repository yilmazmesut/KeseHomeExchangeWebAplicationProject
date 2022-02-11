Feature: Bir kullanıcı olarak "/api/rooms/{id}" sayfasına "get" tipinde bağlandığımda eve ait bilgileri görebilmeliyim.

  Scenario: TC_001_US_095
    Given user connects to "61ff7af7b8cdad2aca702c48" with GET request
    Then user should able to see room informations 