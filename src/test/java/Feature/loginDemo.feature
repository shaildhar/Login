Feature: Test login functionality
  Scenario Outline: check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When lser enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples:
    |username|password|
    |Shail   |12345   |
    | chirag | 12320  |

