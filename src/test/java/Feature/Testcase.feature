Feature: OrangeHRM login

  Scenario: Logo presence on OrangeHRM home page
    Given I launch chrome browser
    When I enter username
      | username |
      | password |

    Then I verify that the logo present on the page
    And Close HRM