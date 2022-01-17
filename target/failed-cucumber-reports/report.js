$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US001KeseMainPage.feature");
formatter.feature({
  "name": "Kese HomePage Slogan verification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@homepageSlogan"
    }
  ]
});
formatter.scenario({
  "name": "User should see the slogan of the Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@homepageSlogan"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see \"Seyahatin Tadını Çıkartın!\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US001MainPageSloganStepDefs.the_user_should_see_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US003KeseMainPageOdaKirala.feature");
formatter.feature({
  "name": "As a user, when I go to the home page , I should be able to search for \"Oda Kirala\" postings.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "\"Oda Kirala\" verification",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the Oda Kirala button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US003MainPageOdaKiralaStepdefs.the_user_clicks_the_Oda_Kirala_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Oda Kirala is selected, the text Oda değişimi yapmak istediğiniz yer should be visible.",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US003MainPageOdaKiralaStepdefs.oda_Kirala_is_selected_the_text_Oda_değişimi_yapmak_istediğiniz_yer_should_be_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the drop down menu is clickable, under the Oda değişimi yapmak istediğiniz yer text",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US003MainPageOdaKiralaStepdefs.user_validates_the_drop_down_menu_is_clickable_under_the_Oda_değişimi_yapmak_istediğiniz_yer_text()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US004KeseMainPage.feature");
formatter.feature({
  "name": "As a user, when I go to the home page , I should be able to search for \"Birlikte Seyehat\" postings.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "\"Birlikte Seyehat\" verification",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \"Birlikte_Seyehat\" button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US04MainPageStepDefinitions.theUserClicksTheButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Birlikte Seyehat\" is selected, the text \"Seyehat etmek istediğiniz yeri seçiniz\" should be visible.",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US04MainPageStepDefinitions.isSelectedTheTextShouldBeVisible(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the drop down menu is clickable, under the \"Seyehat etmek istediğiniz yeri seçiniz\" text",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US04MainPageStepDefinitions.userValidatesTheDropDownMenuIsClickableUnderTheText(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US005.feature");
formatter.feature({
  "name": "US_005 Bir kullanıcı olarak ana sayfaya girdiğimde, \"Bed \u0026 Breakfast\" ilanlarında arama yapabilmeliyim.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC001-should be visible",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to \"http://test.kese.nl/\" url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user clicks the",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Bed \u0026 Breakfast\" is selected, \"Gitmek istediğiniz Yer\" should be visible",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user verifies the drop down menu is clickable ,under the \"Gitmek istediğiniz Yer\" text",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US009KeseMainPage.feature");
formatter.feature({
  "name": "Kese HomePage Giris Yap Button verification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US009"
    }
  ]
});
formatter.scenario({
  "name": "User should see \"Giris Yap\" button when not logged in",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US009"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Giris Yap button should be visible and clickable",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US009MainPageStepDefs.giris_Yap_button_should_be_visible_and_clickable()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Giris Yap button on HomePage",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US009MainPageStepDefs.the_user_clicks_Giris_Yap_button_on_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page url should be \"http://test.kese.nl/login\"",
  "keyword": "Then "
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
formatter.uri("file:src/test/resources/features/US010KeseLoginPage.feature");
formatter.feature({
  "name": "US_010    User can acces to login page and inputs of the login should be available",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC_001_US_010 \"Email\" input must be active and available",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User can click to email input",
  "keyword": "And "
});
formatter.step({
  "name": "User can write \u003cemail\u003e in the email input",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "\"kullanici1@gmail.com\""
      ]
    },
    {
      "cells": [
        "\"aliSuleyman1235\""
      ]
    },
    {
      "cells": [
        "\"12345@gmail\""
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "TC_001_US_010 \"Email\" input must be active and available",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User can click to email input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanClickToEmailInput()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can write \"kullanici1@gmail.com\" in the email input",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanWriteInTheEmailInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "TC_001_US_010 \"Email\" input must be active and available",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User can click to email input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanClickToEmailInput()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can write \"aliSuleyman1235\" in the email input",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanWriteInTheEmailInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "TC_001_US_010 \"Email\" input must be active and available",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User can click to email input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanClickToEmailInput()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can write \"12345@gmail\" in the email input",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanWriteInTheEmailInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_002_US_010 \"Sifre\" input must be active and available",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User can click to sifre input",
  "keyword": "And "
});
formatter.step({
  "name": "User can write \u003csifre\u003e in the sifre input",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "sifre"
      ]
    },
    {
      "cells": [
        "\"123456\""
      ]
    },
    {
      "cells": [
        "\"AjgrWou\""
      ]
    },
    {
      "cells": [
        "\"158ytrn!8\""
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "TC_002_US_010 \"Sifre\" input must be active and available",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User can click to sifre input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanClickToSifreInput()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can write \"123456\" in the sifre input",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanWriteInTheSifreInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "TC_002_US_010 \"Sifre\" input must be active and available",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User can click to sifre input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanClickToSifreInput()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can write \"AjgrWou\" in the sifre input",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanWriteInTheSifreInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "TC_002_US_010 \"Sifre\" input must be active and available",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User can click to sifre input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanClickToSifreInput()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can write \"158ytrn!8\" in the sifre input",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanWriteInTheSifreInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "TC_003_US_010 By default, the text \"Email giriniz\" should be included in the \"Email \" input",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User can click to email input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanClickToEmailInput()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Assure the \"Email giriniz\" default email text",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.assureTheDefaultEmailText(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "TC_004_US_010 By default, the text \"Şifrenizi giriniz\" should be included in the \"Sifre\" input",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User can click to sifre input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.userCanClickToSifreInput()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Assure the \"Şifrenizi giriniz\" default sifre text",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US010loginPageStepDef.assureTheDefaultSifreText(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US014.feature");
formatter.feature({
  "name": "US_0014 Bir kullanıcı olarak \"/signup\" sayfasına girdiğimde, kayıt oluştur butonu kullanılabilir olmalıdır.",
  "description": "  Email, kullanıcı adı, şifre ve şifre tekrarı bilgileri eklenmeden \"Kayıt Oluştur\" butonu kullanılabilir olmamalıdır!",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Email, kullanıcı adı, şifre ve şifre tekrarı bilgileri eklenmeden \"Kayıt Oluştur\" butonu kullanılabilir olmamalıdır!",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user types \"\u003ckullaniciAdi\u003e\" to the Kullanici Alani input",
  "keyword": "And "
});
formatter.step({
  "name": "user types \"\u003cemail\u003e\" to the email input",
  "keyword": "And "
});
formatter.step({
  "name": "user types \"\u003cpassword\u003e\" to the Sifre input",
  "keyword": "And "
});
formatter.step({
  "name": "user types \"\u003cpasswordTekrari\u003e\" to the Sifre Tekrari input",
  "keyword": "And "
});
formatter.step({
  "name": "user click Kullanim Kosullari check box",
  "keyword": "And "
});
formatter.step({
  "name": "user verifies that Kayit Olustur button not be clickable",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "kullaniciAdi",
        "email",
        "password",
        "passwordTekrari"
      ]
    },
    {
      "cells": [
        "",
        "aziz@gmail.com",
        "asdasd",
        "asdasd"
      ]
    },
    {
      "cells": [
        "aziz",
        "",
        "asdasd",
        "asdasd"
      ]
    },
    {
      "cells": [
        "aziz",
        "aziz@gmail.com",
        "",
        "asdasd"
      ]
    },
    {
      "cells": [
        "aziz",
        "aziz@gmail.com",
        "asdasd",
        ""
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to \"http://test.kese.nl/signup\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserGoesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Email, kullanıcı adı, şifre ve şifre tekrarı bilgileri eklenmeden \"Kayıt Oluştur\" butonu kullanılabilir olmamalıdır!",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user types \"\" to the Kullanici Alani input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheKullaniciAlaniInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"aziz@gmail.com\" to the email input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheEmailInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"asdasd\" to the Sifre input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheSifreInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"asdasd\" to the Sifre Tekrari input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheSifreTekrariInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Kullanim Kosullari check box",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userClickKullanimKosullariCheckBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that Kayit Olustur button not be clickable",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userVerifiesThatKayitOlusturButtonNotBeClickable()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to \"http://test.kese.nl/signup\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserGoesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Email, kullanıcı adı, şifre ve şifre tekrarı bilgileri eklenmeden \"Kayıt Oluştur\" butonu kullanılabilir olmamalıdır!",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user types \"aziz\" to the Kullanici Alani input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheKullaniciAlaniInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"\" to the email input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheEmailInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"asdasd\" to the Sifre input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheSifreInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"asdasd\" to the Sifre Tekrari input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheSifreTekrariInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Kullanim Kosullari check box",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userClickKullanimKosullariCheckBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that Kayit Olustur button not be clickable",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userVerifiesThatKayitOlusturButtonNotBeClickable()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to \"http://test.kese.nl/signup\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserGoesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Email, kullanıcı adı, şifre ve şifre tekrarı bilgileri eklenmeden \"Kayıt Oluştur\" butonu kullanılabilir olmamalıdır!",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user types \"aziz\" to the Kullanici Alani input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheKullaniciAlaniInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"aziz@gmail.com\" to the email input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheEmailInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"\" to the Sifre input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheSifreInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"asdasd\" to the Sifre Tekrari input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheSifreTekrariInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Kullanim Kosullari check box",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userClickKullanimKosullariCheckBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that Kayit Olustur button not be clickable",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userVerifiesThatKayitOlusturButtonNotBeClickable()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to \"http://test.kese.nl/signup\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserGoesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Email, kullanıcı adı, şifre ve şifre tekrarı bilgileri eklenmeden \"Kayıt Oluştur\" butonu kullanılabilir olmamalıdır!",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user types \"aziz\" to the Kullanici Alani input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheKullaniciAlaniInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"aziz@gmail.com\" to the email input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheEmailInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"asdasd\" to the Sifre input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheSifreInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"\" to the Sifre Tekrari input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheSifreTekrariInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Kullanim Kosullari check box",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userClickKullanimKosullariCheckBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that Kayit Olustur button not be clickable",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userVerifiesThatKayitOlusturButtonNotBeClickable()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Email, kullanıcı adı, şifre ve şifre tekrarı bilgileri eklenmeden \"Kayıt Oluştur\" butonu kullanılabilir olmamalıdır!",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user types \"\u003ckullaniciAdi\u003e\" to the Kullanici Alani input",
  "keyword": "And "
});
formatter.step({
  "name": "user types \"\u003cemail\u003e\" to the email input",
  "keyword": "And "
});
formatter.step({
  "name": "user types \"\u003cpassword\u003e\" to the Sifre input",
  "keyword": "And "
});
formatter.step({
  "name": "user types \"\u003cpasswordTekrari\u003e\" to the Sifre Tekrari input",
  "keyword": "And "
});
formatter.step({
  "name": "user verifies that Kayit Olustur button not be clickable",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "kullaniciAdi",
        "email",
        "password",
        "passwordTekrari"
      ]
    },
    {
      "cells": [
        "aziz",
        "aziz@gmail.com",
        "asdasd",
        "asdasd"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to \"http://test.kese.nl/signup\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserGoesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Email, kullanıcı adı, şifre ve şifre tekrarı bilgileri eklenmeden \"Kayıt Oluştur\" butonu kullanılabilir olmamalıdır!",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user types \"aziz\" to the Kullanici Alani input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheKullaniciAlaniInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"aziz@gmail.com\" to the email input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheEmailInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"asdasd\" to the Sifre input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheSifreInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"asdasd\" to the Sifre Tekrari input",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userTypesToTheSifreTekrariInput(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that Kayit Olustur button not be clickable",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US14_StepDef.userVerifiesThatKayitOlusturButtonNotBeClickable()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US015MainPage.feature");
formatter.feature({
  "name": "US_015-Bir kullanıcı olarak \"/signup\" sayfasına girdiğimde,\"Giriş Yap\" butonu görünür olmalıdır.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@signup"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to \"http://test.kese.nl/signup\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserGoesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_001_US_015 The Giris Yap Button should be visible and enabled",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@signup"
    }
  ]
});
formatter.step({
  "name": "the user asserts The Giris Yap Button is visible and enabled",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserAssertsTheGirisYapButtonIsVisibleAndEnabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Giriş Yap button",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserClicksButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user asserts that he is able to go \"http://test.kese.nl/login\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserAssertsThatHeIsAbleToGoPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US016KeseForgetPassPageEmailButton.feature");
formatter.feature({
  "name": "As a user, when I go to the \"/forgot_password\" page, email button should be used.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on forget password page \"http://test.kese.nl/forgot_password\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US016ForgetPassPageEmailButtonStepdefs.theUserIsOnForgetPasswordPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the email input box should be clickable",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US016ForgetPassPageEmailButtonStepdefs.theEmailInputBoxShouldBeClickable()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate if the \"E-mail adresinizi giriniz\" is there as a default in the input box",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US016ForgetPassPageEmailButtonStepdefs.validateIfTheIsThereAsADefaultInTheInputBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US023.feature");
formatter.feature({
  "name": "US023_Bir kullanıcı olarak anasayfada, giriş yaptıktan sonra sağ üstte \"İlan Ver\" ve \"Profilim\" butonlarını görebilmeliyim.",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login pag \"http://test.kese.nl/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US023.UserIsOnLoginPag(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC001_should be visible",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enters valid usernam \"kullanici1@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US023.UserEntersValidUserNam(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid passwor \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US023.UserEntersValidPasswor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login butto",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US023.UserClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"ilan Ver\" is selected, \"ilan Ver\" should be visible",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user clicks \"Profilim\" button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US023.ThUserClicks(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"Profilim\" should be visible",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US28SignUpStepD.shouldBeVisible(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US024MainPage.feature");
formatter.feature({
  "name": "US_024-Bir kullanıcı olarak anasayfada, giriş yaptıktan sonra sağ üstte \"İlan Ver\" butonu yardımıyla ilan oluşturma sayfalarına gidebilmeliyim.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@signup1"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC_001_US_024 Kullanici İlan Ver\" butonu yardımıyla ilan oluşturma sayfalarına gider",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user asserts that The \"\u003clink\u003e\" link is visible",
  "keyword": "Then "
});
formatter.step({
  "name": "the user clicks The \"\u003clink\u003e\" link it redirects to page",
  "keyword": "When "
});
formatter.step({
  "name": "the user verifies that he can go to the \"\u003cpage\u003e\" page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "link",
        "page"
      ]
    },
    {
      "cells": [
        "Ev Değişimi",
        "/new_home"
      ]
    },
    {
      "cells": [
        "Oda",
        "/new_room"
      ]
    },
    {
      "cells": [
        "Bed \u0026 Breakfast",
        "/new_bed_breakfast"
      ]
    },
    {
      "cells": [
        "Birlikte Seyehat",
        "/new_car"
      ]
    },
    {
      "cells": [
        "Kargo",
        "/new_cargo"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserGoesToPage(java.lang.String)"
});
formatter.result({
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
  "name": "the user clicks The \"İlan Ver\" link it redirects to page",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserClicksTheLinkItRedirectsToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_001_US_024 Kullanici İlan Ver\" butonu yardımıyla ilan oluşturma sayfalarına gider",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@signup1"
    }
  ]
});
formatter.step({
  "name": "the user asserts that The \"Ev Değişimi\" link is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserAssertsThatTheLinkIsVisible(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks The \"Ev Değişimi\" link it redirects to page",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserClicksTheLinkItRedirectsToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user verifies that he can go to the \"/new_home\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserVerifiesThatHeCanGoToThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserGoesToPage(java.lang.String)"
});
formatter.result({
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
  "name": "the user clicks The \"İlan Ver\" link it redirects to page",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserClicksTheLinkItRedirectsToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_001_US_024 Kullanici İlan Ver\" butonu yardımıyla ilan oluşturma sayfalarına gider",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@signup1"
    }
  ]
});
formatter.step({
  "name": "the user asserts that The \"Oda\" link is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserAssertsThatTheLinkIsVisible(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks The \"Oda\" link it redirects to page",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserClicksTheLinkItRedirectsToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user verifies that he can go to the \"/new_room\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserVerifiesThatHeCanGoToThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserGoesToPage(java.lang.String)"
});
formatter.result({
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
  "name": "the user clicks The \"İlan Ver\" link it redirects to page",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserClicksTheLinkItRedirectsToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_001_US_024 Kullanici İlan Ver\" butonu yardımıyla ilan oluşturma sayfalarına gider",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@signup1"
    }
  ]
});
formatter.step({
  "name": "the user asserts that The \"Bed \u0026 Breakfast\" link is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserAssertsThatTheLinkIsVisible(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks The \"Bed \u0026 Breakfast\" link it redirects to page",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserClicksTheLinkItRedirectsToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user verifies that he can go to the \"/new_bed_breakfast\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserVerifiesThatHeCanGoToThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserGoesToPage(java.lang.String)"
});
formatter.result({
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
  "name": "the user clicks The \"İlan Ver\" link it redirects to page",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserClicksTheLinkItRedirectsToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_001_US_024 Kullanici İlan Ver\" butonu yardımıyla ilan oluşturma sayfalarına gider",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@signup1"
    }
  ]
});
formatter.step({
  "name": "the user asserts that The \"Birlikte Seyehat\" link is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserAssertsThatTheLinkIsVisible(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks The \"Birlikte Seyehat\" link it redirects to page",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserClicksTheLinkItRedirectsToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user verifies that he can go to the \"/new_car\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserVerifiesThatHeCanGoToThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US015MainPage_stepDefs.theUserGoesToPage(java.lang.String)"
});
formatter.result({
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
  "name": "the user clicks The \"İlan Ver\" link it redirects to page",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserClicksTheLinkItRedirectsToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_001_US_024 Kullanici İlan Ver\" butonu yardımıyla ilan oluşturma sayfalarına gider",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@signup1"
    }
  ]
});
formatter.step({
  "name": "the user asserts that The \"Kargo\" link is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserAssertsThatTheLinkIsVisible(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks The \"Kargo\" link it redirects to page",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserClicksTheLinkItRedirectsToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user verifies that he can go to the \"/new_cargo\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US024MainPageStepDefs.theUserVerifiesThatHeCanGoToThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US07KesePopulerIlan.feature");
formatter.feature({
  "name": "As a user i should be able to see \"Populer Ilanlar\" part on the homepage",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@META3-125"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should see Populer Ilanlar part on the homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@META3-125"
    },
    {
      "name": "@TEST_META3-121"
    }
  ]
});
formatter.step({
  "name": "system should display Populer Ilanlar text on the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US07PopulerIlanStepD.system_should_display_Populer_Ilanlar_text_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should see options such as \"Ev Degisimi\" , \"Oda Kirala\" , \"Bed \u0026 Breakfast\"",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@META3-125"
    },
    {
      "name": "@TEST_META3-123"
    },
    {
      "name": "@nur"
    }
  ]
});
formatter.step({
  "name": "system should display options on the homepage",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US07PopulerIlanStepD.system_should_display_options_on_the_homepage(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User should select options such as \"Ev Degisimi\" , \"Oda Kirala\" , \"Bed \u0026 Breakfast\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TEST_META3-124"
    }
  ]
});
formatter.step({
  "name": "click \"\u003coptions\u003e\" on the homepage",
  "keyword": "When "
});
formatter.step({
  "name": "system redirects from homepage to \"\u003crelevant\u003e\" pages",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "options",
        "relevant"
      ]
    },
    {
      "cells": [
        "Ev Değişimi",
        "/home"
      ]
    },
    {
      "cells": [
        "Oda Kirala",
        "/room"
      ]
    },
    {
      "cells": [
        "Bed \u0026 Breakfast",
        "/bedbreakfast"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should select options such as \"Ev Degisimi\" , \"Oda Kirala\" , \"Bed \u0026 Breakfast\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@META3-125"
    },
    {
      "name": "@TEST_META3-124"
    }
  ]
});
formatter.step({
  "name": "click \"Ev Değişimi\" on the homepage",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US07PopulerIlanStepD.click_on_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system redirects from homepage to \"/home\" pages",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US07PopulerIlanStepD.system_redirects_from_homepage_to_pages(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should select options such as \"Ev Degisimi\" , \"Oda Kirala\" , \"Bed \u0026 Breakfast\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@META3-125"
    },
    {
      "name": "@TEST_META3-124"
    }
  ]
});
formatter.step({
  "name": "click \"Oda Kirala\" on the homepage",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US07PopulerIlanStepD.click_on_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system redirects from homepage to \"/room\" pages",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US07PopulerIlanStepD.system_redirects_from_homepage_to_pages(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should select options such as \"Ev Degisimi\" , \"Oda Kirala\" , \"Bed \u0026 Breakfast\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@META3-125"
    },
    {
      "name": "@TEST_META3-124"
    }
  ]
});
formatter.step({
  "name": "click \"Bed \u0026 Breakfast\" on the homepage",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US07PopulerIlanStepD.click_on_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system redirects from homepage to \"/bedbreakfast\" pages",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US07PopulerIlanStepD.system_redirects_from_homepage_to_pages(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US12KeseLoginPage.feature");
formatter.feature({
  "name": "Kese Login Page Validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login page sifremi unuttum section must be visible",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MarkBoz"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on the login page as this url \"http://test.kese.nl/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US12LoginPageStepD.user_on_the_login_page_as_this_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the \"Şifremi Unuttum\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US12LoginPageStepD.user_should_see_the(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sifremi unuttum link should be active",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US12LoginPageStepD.sifremi_unuttum_link_should_be_active()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sifremi unuttum link should be \"underline\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US12LoginPageStepD.sifremi_unuttum_link_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the sifremi unuttum link",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US12LoginPageStepD.user_click_on_the_sifremi_unuttum_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on this page url \"http://test.kese.nl/forgot_password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US12LoginPageStepD.user_should_be_on_this_page_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US18KeseLoginPage.feature");
formatter.feature({
  "name": "Kese Login page feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Kese Website Login with valid username valid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on login page \u003cloginPageUrl\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters valid username \u003cuserName\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user enters valid password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "user gets the url of the page",
  "keyword": "Then "
});
formatter.step({
  "name": "page url should be \u003cexpectedUrl\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "loginPageUrl",
        "userName",
        "password",
        "expectedUrl"
      ]
    },
    {
      "cells": [
        "\"http://test.kese.nl/login\"",
        "\"email@gmail.com\"",
        "\"3344\"",
        "\"http://test.kese.nl/\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Kese Website Login with valid username valid password",
  "description": "",
  "keyword": "Scenario Outline"
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
formatter.scenarioOutline({
  "name": "Kese Website Login with valid username invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on login page \u003cloginPageUrl\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters valid username \u003cuserName\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user enters invalid password \u003cinvalidPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should get the this message \u003cexpectederrorMessage\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "loginPageUrl",
        "userName",
        "invalidPassword",
        "expectederrorMessage"
      ]
    },
    {
      "cells": [
        "\"http://test.kese.nl/login\"",
        "\"email@gmail.com\"",
        "\"abcd\"",
        "\"Email ya da şifre hatalı.\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Kese Website Login with valid username invalid password",
  "description": "",
  "keyword": "Scenario Outline"
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
formatter.scenarioOutline({
  "name": "Kese Website Login with invalid username valid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on login page \u003cloginPageUrl\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "users enter invalid username \u003cinvalidUsername\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user enters valid password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should get the this message \u003cexpectederrorMessage\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "loginPageUrl",
        "invalidUsername",
        "password",
        "expectederrorMessage"
      ]
    },
    {
      "cells": [
        "\"http://test.kese.nl/login\"",
        "\"zmail@yahoo.com\"",
        "\"3344\"",
        "\"Email ya da şifre hatalı.\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Kese Website Login with invalid username valid password",
  "description": "",
  "keyword": "Scenario Outline"
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
formatter.scenarioOutline({
  "name": "Kese Website Login with invalid username invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on login page \u003cloginPageUrl\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters invalid username \u003cinvalidUsername\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user enters invalid password \u003cinvalidPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should get the this message \u003cexpectederrorMessage\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "loginPageUrl",
        "invalidUsername",
        "invalidPassword",
        "expectederrorMessage"
      ]
    },
    {
      "cells": [
        "\"http://test.kese.nl/login\"",
        "\"xmail@gmail.com\"",
        "\"ol56\"",
        "\"Email ya da şifre hatalı.\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Kese Website Login with invalid username invalid password",
  "description": "",
  "keyword": "Scenario Outline"
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
formatter.uri("file:src/test/resources/features/US20KeseSignUpPage.feature");
formatter.feature({
  "name": "US_20 Bir kullanıcı olarak \"/signup\" sayfasına girdiğimde, yeni bir kullanıcıyı sadece benzersiz email ve kullanıcı adı ile oluşturabilmeliyim.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC_001_US_20 signup block because of repeated email or username",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user tries to use the same \"\u003ccredentialPart\u003e\" for signup again",
  "keyword": "And "
});
formatter.step({
  "name": "user verifies \"\u003ctext\u003e\" and can\u0027t signup on signup page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "credentialPart",
        "text"
      ]
    },
    {
      "cells": [
        "email",
        "Bu mail adresi zaten kullanılıyor."
      ]
    },
    {
      "cells": [
        "username",
        "Bu kullanıcı adı alınmıştır. Başka bir kullanıcı adı giriniz."
      ]
    }
  ]
});
formatter.background({
  "name": "Successful connection to site and sign up",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page \"http://test.kese.nl/signup\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userIsOnLoginPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user creates a random credentials and signup",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US20SignUpPageStepDef.signUpWithRandomCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_001_US_20 signup block because of repeated email or username",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user tries to use the same \"email\" for signup again",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US20SignUpPageStepDef.userTriesToUseTheSameForSignupAgain(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies \"Bu mail adresi zaten kullanılıyor.\" and can\u0027t signup on signup page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US20SignUpPageStepDef.userVerifiesAndCanTSignupOnSignupPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Successful connection to site and sign up",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page \"http://test.kese.nl/signup\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userIsOnLoginPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user creates a random credentials and signup",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US20SignUpPageStepDef.signUpWithRandomCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_001_US_20 signup block because of repeated email or username",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user tries to use the same \"username\" for signup again",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US20SignUpPageStepDef.userTriesToUseTheSameForSignupAgain(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies \"Bu kullanıcı adı alınmıştır. Başka bir kullanıcı adı giriniz.\" and can\u0027t signup on signup page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US20SignUpPageStepDef.userVerifiesAndCanTSignupOnSignupPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US28KeseSignUpPage.feature");
formatter.feature({
  "name": "As a user I should be see and access \"/usage\" and \"/privacy\"",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@signUp28"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page \"http://test.kese.nl/signup\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userIsOnLoginPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "\"/usage\" should be visible",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@signUp28"
    }
  ]
});
formatter.step({
  "name": "\"/usage\" should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US28SignUpStepD.shouldBeVisible(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page \"http://test.kese.nl/signup\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userIsOnLoginPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "\"/privacy\" should be visible",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@signUp28"
    }
  ]
});
formatter.step({
  "name": "\"/privacy\" should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US28SignUpStepD.shouldBeVisible(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page \"http://test.kese.nl/signup\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userIsOnLoginPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "\"/usage\" page should be accessible",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@signUp28"
    }
  ]
});
formatter.step({
  "name": "Click usage",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US28SignUpStepD.click_usage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page url should be \"http://test.kese.nl/usage\"",
  "keyword": "Then "
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
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page \"http://test.kese.nl/signup\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US18LoginPageStepD.userIsOnLoginPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "\"/privacy\" page should be accessible",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@signUp28"
    }
  ]
});
formatter.step({
  "name": "Click privacy",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US28SignUpStepD.clickPrivacy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page url should be \"http://test.kese.nl/privacy\"",
  "keyword": "Then "
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
formatter.uri("file:src/test/resources/features/US29KeseSignUpPage.feature");
formatter.feature({
  "name": "US_29 Bir kullanıcı olarak \"/signup\" sayfasına girdiğimde, kullanım koşulları ve gizlilik politikası kabul edilebilir olmalıdır.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "US_29_TC_001 terms of use and privacy policy check box on signup page must be visible, enable, and not selected as default",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to \"http://test.kese.nl/signup\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US20SignUpPageStepDef.userGoesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user asserts \"check box on signup page\" is visible and enabled",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US29SignUpPageStepDef.userAssertsIsVisibleAndEnabled(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user asserts \"check box on signup page\" is \"not selected\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US29SignUpPageStepDef.userAssertsIsNotSelected(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US30KeseLogo.feature");
formatter.feature({
  "name": "US30_TestExecution",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@META3-76"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US30_TC02_The system should navigate homepage after clicking KESE logo on advert page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@META3-76"
    },
    {
      "name": "@TEST_META3-74"
    }
  ]
});
formatter.step({
  "name": "user hits the \"London\" on the homepage",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.user_hits_the_on_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hits the KESE logo on the advert page",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.user_hits_the_KESE_logo_on_the_advert_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system should display homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.system_should_display_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US30_TC03_The system should NOT navigate different page when clicking KESE logo on homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@META3-76"
    },
    {
      "name": "@TEST_META3-75"
    }
  ]
});
formatter.step({
  "name": "user hits the KESE logo on the homepage",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.user_hits_the_KESE_logo_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system should NOT navigate another page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_system_should_NOT_navigate_another_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "US30_TC01_System should display the advert page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TEST_META3-72"
    }
  ]
});
formatter.step({
  "name": "user hits the \"\u003cCardTitle\u003e\" on the homepage",
  "keyword": "When "
});
formatter.step({
  "name": "verify the title is changed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "CardTitle"
      ]
    },
    {
      "cells": [
        "Terborg, Hollanda"
      ]
    },
    {
      "cells": [
        "London"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US30_TC01_System should display the advert page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@META3-76"
    },
    {
      "name": "@TEST_META3-72"
    }
  ]
});
formatter.step({
  "name": "user hits the \"Terborg, Hollanda\" on the homepage",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.user_hits_the_on_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the title is changed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.verify_the_title_is_changed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.the_user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US30_TC01_System should display the advert page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@META3-76"
    },
    {
      "name": "@TEST_META3-72"
    }
  ]
});
formatter.step({
  "name": "user hits the \"London\" on the homepage",
  "keyword": "When "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.user_hits_the_on_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the title is changed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US30KeseLogoStepD.verify_the_title_is_changed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US_006_KeseCargo.feature");
formatter.feature({
  "name": "Cargo is clickable and visible and message is visible",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US_006"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "go to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US_006_KeseCargo.go_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cargo is clickable and visible",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US_006"
    }
  ]
});
formatter.step({
  "name": "Cargo button should be clickeable and display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US_006_KeseCargo.cargo_button_should_be_clickeable_and_display()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "go to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US_006_KeseCargo.go_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "\"Kargo göndermek istediğiniz noktayı seçiniz\" is displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US_006"
    }
  ]
});
formatter.step({
  "name": "Click Cargo button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US_006_KeseCargo.click_Cargo_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Kargo göndermek istediğiniz noktayı seçiniz\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US_006_KeseCargo.is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US_008.feature");
formatter.feature({
  "name": "US_008 I log in the home page as a user, I should be able to see the pictures and information of the posts",
  "description": "  in the \"Popular Posts\"  section.",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Pictures of all listings in the \"Ev Degisimi\" section must be visible.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Able to see Ev Degisimi section",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.ableToSeeEvDegisimiSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if all the posts pictures are visible under the Ev Degisimi section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.checkIfAllThePostsPicturesAreVisibleUnderTheEvDegisimiSection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "House type of all ads under the \"Ev Degisimi\" section must be visible",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Able to see Ev Degisimi section",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.ableToSeeEvDegisimiSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if all the house types are visible under the Ev Degisimi section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.checkIfAllTheHouseTypesAreVisibleUnderTheEvDegisimiSection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The owners\u0027 names of all posts under the Ev Degisimi section must be visible",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Able to see Ev Degisimi section",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.ableToSeeEvDegisimiSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if all the posts owners\u0027 names are visible under the Ev Degisimi section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.checkIfAllThePostsOwnersNamesAreVisibleUnderTheEvDegisimiSection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The titles of all posts under the \"Ev Degisimi\" section must be visible",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Able to see Ev Degisimi section",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.ableToSeeEvDegisimiSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if all the posts title are visible under the Ev Degisimi section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.checkIfAllThePostsTitleAreVisibleUnderTheEvDegisimiSection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Pictures of all posts in the \"Oda Kirala\" section must be visible and clickable",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Able to see Oda Kirala section.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.ableToSeeOdaKiralaSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Oda Kiralama button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.clickOdaKiralamaButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if all the posts pictures are visible under the Oda Kiralama section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.checkIfAllThePostsPicturesAreVisibleUnderTheOdaKiralamaSection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "House type of all posts under the \"Oda Kiralama\" section must be visible and clickable",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Able to see Oda Kirala section.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.ableToSeeOdaKiralaSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Oda Kiralama button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.clickOdaKiralamaButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if all the posts\u0027 house types are visible under the Oda Kiralama section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.checkIfAllThePostsHouseTypesAreVisibleUnderTheOdaKiralamaSection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The owners\u0027 names of all ads under the \"Oda Kiralama\" section must be visible and clickable",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Able to see Oda Kirala section.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.ableToSeeOdaKiralaSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Oda Kiralama button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.clickOdaKiralamaButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if all the posts owners names are visible under the Oda Kiralama section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.checkIfAllThePostsOwnersNamesAreVisibleUnderTheOdaKiralamaSection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The titles of all posts under the \"Oda Kiralama\" section must be visible and clickable.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Able to see Oda Kirala section.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.ableToSeeOdaKiralaSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Oda Kiralama button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.clickOdaKiralamaButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if all the posts\u0027 titles are visible under the Oda Kiralama section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.checkIfAllThePostsTitlesAreVisibleUnderTheOdaKiralamaSection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Pictures of all listings in the \"Bed \u0026 Breakfast\" section must be visible and clickable",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Able to see Bed \u0026 Breakfast section",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.ableToSeeBedBreakfastSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Bed \u0026 Breakfast button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.clickBedBreakfastButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if all the posts\u0027 pictures are visible under the Bed \u0026 Breakfast section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.checkIfAllThePostsPicturesAreVisibleUnderTheBedBreakfastSection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "House type of all posts under the \"Bed \u0026 Breakfast\" section must be visible and clickable.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Able to see Bed \u0026 Breakfast section",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.ableToSeeBedBreakfastSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Bed \u0026 Breakfast button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.clickBedBreakfastButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if all the posts\u0027 house types are visible under the Bed \u0026 Breakfast section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.checkIfAllThePostsHouseTypesAreVisibleUnderTheBedBreakfastSection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The owners\u0027 names of all posts under the \"Bed \u0026 Breakfast\" section must be visible and clickable.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Able to see Bed \u0026 Breakfast section",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.ableToSeeBedBreakfastSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Bed \u0026 Breakfast button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.clickBedBreakfastButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if all the posts owners names are visible under the Bed \u0026 Breakfast section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.checkIfAllThePostsOwnersNamesAreVisibleUnderTheBedBreakfastSection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"http://test.kese.nl/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The titles of all posts under the \"Bed \u0026 Breakfast\" section must be visible and clickable",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Able to see Bed \u0026 Breakfast section",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.ableToSeeBedBreakfastSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Bed \u0026 Breakfast button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.clickBedBreakfastButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check if all the ads\u0027 titles are visible under the Bed \u0026 Breakfast section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US008_stepDefs.checkIfAllTheAdsTitlesAreVisibleUnderTheBedBreakfastSection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US_019.feature");
formatter.feature({
  "name": "US_019 As a user, When I enter the \"/signup\" page , I should be able to register to the system",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on signup page \"http://test.kese.nl/signup\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US019_stepDefs.user_is_on_signup_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I should be able to register to the system.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Rejep_US_19"
    }
  ]
});
formatter.step({
  "name": "user enters new username \"yenikullanic22@gmail.com\" to create a new account",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US019_stepDefs.user_enters_new_username_to_create_a_new_account(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters new email \"kullanici22@gmail.com\" to create a new account",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US019_stepDefs.user_enters_new_email_to_create_a_new_account(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters new password \"12345\" to create a new account",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US019_stepDefs.user_enters_new_password_to_create_a_new_account(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters new password \"12345\" for second time to create a new account",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US019_stepDefs.user_enters_new_password_for_second_time_to_create_a_new_account(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks checkbox button to create a new account",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US019_stepDefs.user_clicks_checkbox_button_to_create_a_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signup button",
  "keyword": "And "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US019_stepDefs.user_clicks_on_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on signup page \"http://test.kese.nl/signup\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.kese.stepdefinitions.US019_stepDefs.user_is_on_signup_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "After the record is created, the user should be redirected to the \"/signup\" page.",
  "description": "",
  "keyword": "Scenario"
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
  "name": "page url should be \"http://test.kese.nl/signup\"",
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
});