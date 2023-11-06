@log
Feature: User log into this account

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <email> and <password>
    And clicks on login button
    Then user on the website

    Examples: 
      | email                   | password |
      | benammaromar0@gmail.com | 00112233 |

  Scenario Outline: Verify login failed with invalid credentials
    Given user is on login page
    When user try to enters <email> and <password>
    And clicks on login button
    Then user can not navigated to home page

    Examples: 
      | email         | password |
      | test@test.com | test0011 |
