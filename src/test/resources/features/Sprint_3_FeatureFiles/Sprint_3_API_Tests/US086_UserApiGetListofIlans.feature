@US086
#Nursel
Feature: User API Get List of Ilans
  # Bir kullanıcı olarak "/api/user/listofilans" sayfasına
  # "get" tipinde bağlandığımda kullanıcıya ait ilan bilgilerini görebilmeliyim

  @MH-225
  Scenario: User api get list of all users ilans
    When user logs in with "nbc@gmail.com" and "jkl123" to "/user/account/login" with GET for user API
    Then user enters user's token to "/user/listofilans" to list all the ilans with GET for user API