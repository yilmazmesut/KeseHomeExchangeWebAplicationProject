Feature: US092
#As a user, I should be able to see similar advertisements of the house whose id of type "get" I sent to the "/api/homes/{id}/benzerilanlar" page.
 Background:
   Given connect to home benzerilanlar with get

  Scenario: US092_TC01 A maximum of 5 advertisements should be listed.
    Then verify the response includes maximum of 5 advertisements

  Scenario: US092_TC02 The house whose id is sent should not be listed in the similar listings list.
    Then verify the id list should not include sent id "61fe52dae970093ad0e4bef3"

  Scenario : US092_TC03 Similar advertisements must have the address information sent. (at least one common address)
    Then verify address information must be same as at least one of "Frankfurt" and "Almanya"
