@META3-125
Feature: As a user i should be able to see "Populer Ilanlar" part on the homepage

  Background:
    Given the user should be on the homepage

  @TEST_META3-121
  Scenario: User should see Populer Ilanlar part on the homepage
    Then system should display Populer Ilanlar text on the homepage

  @TEST_META3-123 @nur
  Scenario: User should see options such as "Ev Degisimi" , "Oda Kirala" , "Bed & Breakfast"
    Then system should display options on the homepage
      | Ev Değişimi     |
      | Oda Kirala      |
      | Bed & Breakfast |

  @TEST_META3-124
  Scenario Outline: User should select options such as "Ev Degisimi" , "Oda Kirala" , "Bed & Breakfast"
    When click "<options>" on the homepage
    And  system redirects from homepage to "<relevant>" pages
    Examples:
      | options         | relevant      |
      | Ev Değişimi     | /home         |
      | Oda Kirala      | /room         |
      | Bed & Breakfast | /bedbreakfast |