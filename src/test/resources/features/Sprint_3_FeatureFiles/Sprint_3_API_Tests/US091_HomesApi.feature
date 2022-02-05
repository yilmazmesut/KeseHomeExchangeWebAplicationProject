Feature: Bir kullanıcı olarak "/api/homes/search/ilanlistesi/{bulundugu_sayfa}" sayfasına "delete" tipinde bağlandığımda ilanı sistemden kaldırabilmeliyim.

  Background:
    Given user makes the necessary settings for a secure connection
    |email        |coder52@nonmail.com                           |
    |password     |1234                                          |
    |address      |Lorton, Virginia, Amerika Birleşik Devletleri |
    |address_list |Lorton, Virginia, Amerika Birleşik Devletleri |
    |order        |                                              |
    |url          |http://test.kese.nl/api/homes/search/ilanlistesi/ |
    |page         |                                                  |

  Scenario: En fazla 20 tane ilan listelenmelidir.
    Given GET advertisements from the "1". page of the "http://test.kese.nl/api/homes/search/ilanlistesi/"
#    When user will post new ads, if the number of ads is less than "20"
#      | coder52@nonmail.com | 1234 |
#    Then GET advertisements from the "1". page of the "http://test.kese.nl/api/homes/search/ilanlistesi/"
#      |address            |address_list       |order|
#      |Frankfurt, Almanya |Frankfurt, Almanya |     |
#    And user asserts that number of advertisements aren't more than "20"
#
#  Scenario: It should be sorted by date.
#    Given GET advertisements from the "1". page of the "http://test.kese.nl/api/homes/search/ilanlistesi/"
#      |address            |address_list       |order|
#      |Frankfurt, Almanya |Frankfurt, Almanya |date |
#    And user asserts whether the advertisements are in "date" order
#
#  Scenario: It should be in order according to the number of views.
#    Given GET advertisements from the "1". page of the "http://test.kese.nl/api/homes/search/ilanlistesi/"
#      |address            |address_list       |order  |
#      |Frankfurt, Almanya |Frankfurt, Almanya |viewed |
#    And user asserts whether the advertisements are in "viewed" order
#
#  Scenario: The ad should be able to be deleted from the system by connecting in the Delete type.
#    Given GET secret_token for authorized user
#      | coder52@nonmail.com | 1234 |
#    And DELETE an advertisement from "http://test.kese.nl/api/homes/search/ilanlistesi/" with secret_token
#    Then GET home info by home id
#    And user asserts that whether the home deleted



