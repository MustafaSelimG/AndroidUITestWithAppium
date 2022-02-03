Feature: Favorite Case

  Scenario: verify product on favorites
    When I open the real estate
    And I open the residential
    And I open the daily rentals
    And I open the flats
    And I filter the threePlusOne flats
    And I sort by higher price
    And I open the first product
    And I add product the favorites
    And I open the hamburger menu
    And I open the Special To Me section
    And I open the Favorite Ads
    Then product name should be seen