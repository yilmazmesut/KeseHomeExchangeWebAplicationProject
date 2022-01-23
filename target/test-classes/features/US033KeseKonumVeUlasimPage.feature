Feature: TC_001_US_033_Bir kullanıcı olarak "Konum ve Ulaşım" ilan oluşturma sayfasında, 2. stepte "Konum ve Ulaşım" bilgilerini girebilmeliyim.

  Scenario: : login
    Given user goes to "http://test.kese.nl/login" page
    When "hamza@gmail.com" signed in on sign in page
    And user goes to "http://test.kese.nl/new_home" page
    And user chooses house type on the new home step one page
    And user clicks to the ilerle button on the new home page
    And user should able to see Konum ve Ulaşım text
    And user should able to see Evinizin konumunu belirtiniz. Açık adres vermenize gerek yoktur text
    And user should able to see page number
    And Ev ile otobüs durağı arası input field should be useable
    And Ev ile tren istasyonu arası input field should be useable
    And Ev ile tramway durağı arası input field should be useable
    And Sadece şahsi araç ile... checkbox button should be useable



