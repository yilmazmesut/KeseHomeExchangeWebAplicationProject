Feature:US147
#Nuray
  Scenario: Bir kullanıcı olarak "/api/reference/single" sayfasına "get" tipinde bağlanarak giriş yapan kullanıcının referans sayısını görebilmeliyim.
    Given user connects to "/reference/single" with endpoint
    Then user verifies the response status code is 200
    Then user verifies the referance value of sum "[100]" count