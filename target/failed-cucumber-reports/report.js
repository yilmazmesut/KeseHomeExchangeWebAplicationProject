$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US18KeseLoginPage.feature");
formatter.feature({
  "name": "Kese Login page feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Kese Website Login with valid username valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@main12"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page \"http://test.kese.nl/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userIsOnLoginPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username \"email@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userEntersValidUsername(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid password \"3344\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userEntersValidPassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the url of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userGetsTheUrlOfThePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page url should be \"http://test.kese.nl/\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.pageUrlShouldBe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Kese Website Login with valid username invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page \"http://test.kese.nl/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userIsOnLoginPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username \"email@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userEntersValidUsername(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid password \"abcd\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userEntersInvalidPassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get the this message \"Email ya da şifre hatalı.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userShouldGetTheThisMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Kese Website Login with invalid username valid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page \"http://test.kese.nl/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userIsOnLoginPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enter invalid username \"zmail@yahoo.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.usersEnterInvalidUsername(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid password \"3344\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userEntersValidPassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get the this message \"Email ya da şifre hatalı.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userShouldGetTheThisMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Kese Website Login with invalid username invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page \"http://test.kese.nl/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userIsOnLoginPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid username \"xmail@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userEntersInvalidUsername(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid password \"ol56\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userEntersInvalidPassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get the this message \"Email ya da şifre hatalı.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userShouldGetTheThisMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});