Feature: US_045_Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 8. stepte "Özel Şartlar" bilgisini girebilmeliyim.

  Background: login to page and go to step eight

    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    Then user navigates to page 8 in Home Exchange



  Scenario: TC_001_US_045 "Özel Şartlar" title should be visible
    Then user able to see ozel Sartlar title is visible

  Scenario: TC_002_US_045 "Evinize ait özel şartları belirtiniz." should be visible.
    Then user see Evinize ait ozel sartlari belirtiniz title is visible

  Scenario: TC_003_US_045 "Çocuklarınızı getirebilirsiniz, Evcil hayvan getirebilirsiniz,
  Evde sigara içmeye izin verilir,Araba değişimi olabilir, Bakılması gereken evcil hayvan var,
  Bakılması gereken bitki var" options should be visible.
    Then user see all option titles are visible

  Scenario: TC_004_US_045 "Çocuklarınızı getirebilirsiniz, Evcil hayvan getirebilirsiniz,
  Evde sigara içmeye izin verilir,Araba değişimi olabilir, Bakılması gereken evcil hayvan var,
  Bakılması gereken bitki var" choises should be visible and clickable.
    Then user see all choises are visible and clickable

  Scenario: TC_005_US_045 At the stept 8, at the top of page "8 / 10" should be visible.
    Then user see current page eight is visible

