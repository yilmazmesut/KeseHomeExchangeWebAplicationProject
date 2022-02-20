@wip
  Feature: US085
Scenario: User should logout
When user connectss to "/user/account/logout"
Then verify statuss code is 200
And user verifiesss that response body has sonuc is "true"