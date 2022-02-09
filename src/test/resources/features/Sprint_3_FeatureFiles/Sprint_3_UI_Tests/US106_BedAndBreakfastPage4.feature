Feature: Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 4. stepte "Cinsiyet, Yaş Aralığı ve Kişi Sayısı vs" bilgilerini girebilmeliyim.
#http://test.kese.nl/new_bed_breakfast
#"Detaylar" başlığı görünür olmalıdır.
#"Maksimum gelebilecek kişi sayısı, özel oda imkanı, kahvaltı durumu detaylarını giriniz.." açıklaması görünür olmalıdır.
#"Yaş Aralığı" birden fazla seçilebilmelidir.
#"Yaş Aralığı" farketmez olarak seçildiğinde, diğer yaş aralığı seçimleri kaldırılmalıdır.
#"Cinsiyet" seçimi yapılabilmelidir, birden fazla seçime izin verilmemelidir.
#"Maksimum kişi sayısı" en az 0 en fazla 15 olacak şekilde seçilebilmelidir.
#Özel Oda İmkanı, Kahvaltı, Boş Çeşit seçenekleri seçilebilir olmalıdır.
#4. stepte, sayfanın üst kısmına "4 / 10" yazısı görünür olmalıdır.

  Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
    Given user is on login page "http://test.kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 4 in Bed & Breakfast

  Scenario: US106_TC01-"Detaylar" heading should be visible
    Then user asserts "Detaylar" is visible

  Scenario: US106_TC02-"Maksimum gelebilecek kişi sayısı, özel oda imkanı, kahvaltı durumu detaylarını giriniz." explanation should be visible
    Then user asserts "Maksimum gelebilecek kişi sayısı, özel oda imkanı, kahvaltı durumu detaylarını giriniz." is visible

  Scenario: US106_TC03-"Yaş Aralığı" should be able to be selected more than one
    And user clicks on all age gaps
    Then user asserts all age gaps are selected


  Scenario: US106_TC04- When "Yaş Aralığı" is selected as "Farketmez", other age range selections should be deselected.
    And user clicks on all age gaps
    And click on Farketmez in age area
    Then assert that all age gaps are not selected


  Scenario Outline: US106_TC05- "Cinsiyet" selection should be selectable, more than one selection should not be allowed.
    And user clicks on "<GenderOption>"
    Then assert thatother gender options are not selected
    Examples:
      | GenderOption |
      | Kadin        |
      | Erkek        |
      | Farketmez    |

  Scenario: US106_TC06.1- "Maksimum kişi sayısı" should be selected maximum 15.
    And user click increment button for 16 times
    Then assert input is 15

  Scenario: US106_TC06.2- "Maksimum kişi sayısı" should be selected as minimum 0.
    And user click decrement button for 2 times
    Then assert input is 0

  Scenario: US106_TC07  Özel Oda İmkanı, Kahvaltı, Bol Çeşit options should be selectable.
    And user clicks on Özel Oda İmkanı button
    Then user verifies button is clickable
    And user clicks on Kahvaltı button
    Then user verifies Bol Cesit hayır button is visible

  Scenario:US106_TC08- In step 4, the text "4 of 10" should be visible at the top of the page.
    Then assert that four slash ten should be visible




