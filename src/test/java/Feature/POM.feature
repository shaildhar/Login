Feature: Test POM file
  Scenario Outline: Check if it is working
    Given Browser is open
    And User is on login page
    When user enters <Uname> and <pass>
    And User clicks on login
    Then User is navigated to the login page

    Examples:
    | Uname | pass |
    | Shail  | 12345 |
    | vikram | 12345 |