Feature:US107 - BAB Page - Step 4 next function from Step 4 to Step 5
#Nuray
  Background: Successful connection to site and coming to step 4 in "Bed & Breakfast"
    Given the user goes to "http://test.kese.nl/" page
    And user logs in with "nbc@gmail.com" and "jkl123"
    And user navigates to page 4 in Birlikte Seyahat


    Scenario:"Cinsiyet, yaş aralığı, kişi sayısı" title should be visible
      Given "Cinsiyet, yaş aralığı, kişi sayısı" text is displayed
      And "Cinsiyet" text is dislayed
      And "Yaş Aralığı" text is displayed
      And "4 / 6"text is displayed
      Then "Birlikte seyehat yapmak istediğiniz kişi/kişilerin yaş, cinsiyet tercihlerinizi seçiniz."text is displayed

    Scenario:"Yaş Aralığı"should be able to select one more than if user select farketmez other choeses should not able to select
      Given "Yaş Aralığı" should be able to one more than
      When "Yaş Aralığı" if select farketmez other choices do not select
      Then Verify selcted only farketmez

    Scenario: User should be able to select "Cinsiyet" ,do not let one more than choices.
      Given "Cinsiyet"should be selectable only one gender
      Then verify user select only one choice

    Scenario: "Maksimum kişi sayısı" should be able to select at least 0 at most 15
      Given user should be able to select from 1 to 15 number


#https://kese.nl/new_car
#"Cinsiyet, yaş aralığı, kişi sayısı" başlığı görünür olmalıdır.
#"Birlikte seyehat yapmak istediğiniz kişi/kişilerin yaş, cinsiyet tercihlerinizi seçiniz." açıklaması görünür olmalıdır.
#"Yaş Aralığı" birden fazla seçilebilmelidir.
#"Yaş Aralığı" farketmez olarak seçildiğinde, diğer yaş aralığı seçimleri kaldırılmalıdır.
#"Cinsiyet" seçimi yapılabilmelidir, birden fazla seçime izin verilmemelidir.
#"Maksimum kişi sayısı" en az 0 en fazla 15 olacak şekilde seçilebilmelidir.
#
#4. stepte, sayfanın üst kısmına "4 / 6" yazısı görünür olmalıdır.