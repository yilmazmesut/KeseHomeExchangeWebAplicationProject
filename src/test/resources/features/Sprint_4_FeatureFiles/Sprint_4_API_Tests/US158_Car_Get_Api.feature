Feature: US_158	As a user, when I connect to the "/api/cars/{id}" page with "get" type, I should be able to see the information about the ad.


  Scenario: user should be create new car birlikte seyahat advertise
    Given user connects to "/cars" and adds
    Then user I should be able to see the information "202"