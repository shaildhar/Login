Feature: Check login functionality
  Scenario:
    Given User is on L.P.
    When User enters valid username and password
    And Clicks on L button
    Then User is navigated to the home page
