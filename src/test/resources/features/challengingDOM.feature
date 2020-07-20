Feature: Chellinging DOM

  @run
  Scenario: Confirm that the blue' red' green button ids chance after the red button is clicked
    Given the user is on the examples page
    And the user navigates "Challenging DOM"
    When the user clicked the red button
    Then the blue, red, and green button ids change