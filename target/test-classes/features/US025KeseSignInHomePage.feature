@US_025
Feature:

  Background:"Profilim"

    When go to "http://test.kese.nl/" page
    And Click GirişYap Button
    And Enter email and password
    When Click Giriş Yap Button
    And  Click Profilim Button
    Then Dropdown menu show

  Scenario:
    And Click "mesajlar" button
    Then user should go to "/profile/message" page

  Scenario:
    And Click "ilanlarım" button
    Then user should go to "/profile/listofilans" page

  Scenario:
    And Click "Referans Ol" button
    Then user should go to "/profile/reference" page
