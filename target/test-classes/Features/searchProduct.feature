@src
Feature: Search for a product on TunisiaTech

  Background: 
    Given user is on login page
    When user enters benammaromar0@gmail.com and 00112233
    And clicks on login button
    Then user on the website

  Scenario: Navigating and Selecting Products
    When the user clicks on specific item
    And the user selects a specific product
    Then the user should be on the product page
