
  Feature: Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 1. stepte "Ev Tipi" bilgisini girebilmeliyim.


    Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
      Given user is on login page "https://kese.nl/new_bed_breakfast"
      When user signed in on sign in page username "coder52@nonmail.com"
      And user signed in on sign in page password "1234"
      And user navigates to page first in Bed And Breakfast Page




    Scenario:
      Given user should see the Ev Tipi


    Scenario Outline: user asserts "ilerle" is visible and clicable
      Given ilerle button must be clickable when the user clicks "<Ev Turu>"
      Examples:
        | Ev Turu           |
        | Mustakil Ev       |
        | Apartaman Dairesi |
        | Studyo Daire      |

    Scenario:
      Given user asserts "1/10" is visiblev

    Scenario:
      Given the user should see "Değişim yapmak istediğiniz evinizin türünü belirtiniz"