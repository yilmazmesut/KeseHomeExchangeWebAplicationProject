@US145
  # Nursel
Feature: US 145 Reference to an account
  # Bir kullanıcı olarak "/api/reference" sayfasına
  #"post" tipinde bağlanarak istediğim email adresine referans olabilmeliyim

  Scenario: US 145
    Given user logs in with "<user email>", "<user sifre>" as "<user role>" with POST for user API
  #  Then user gets token, status code should be 200 and "sonuc" is "true" and role is "admin" for user API
  #  When user add an "<member email>" with POST for reference API
  #  Then reference author should be "<user email>" and reference email should be "<member email>"
  #  Then member should have min member count "<members count>"


   # Examples:

    #  | user email          | user sifre | user role | member email   |
    #  | fakeadmin@gmail.com | 1234       | admin     | wert@gmail.com |



