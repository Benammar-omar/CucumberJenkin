@add
Feature: Adding a Product to the Cart

  Background: 
    Given user is on login page
    When user enters benammaromar0@gmail.com and 00112233
    And clicks on login button
    Then user on the website
    When the user clicks on specific item
    And the user selects a specific product
    Then the user should be on the product page

  Scenario: Add a Product to the Cart
    When the user add the product to the Cart
    Then the cart should contain the added product
