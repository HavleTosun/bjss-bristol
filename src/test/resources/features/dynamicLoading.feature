Feature: Dynamic Loading
  @run
  Scenario: Confirm 'Hello World!' is rendered after the loading bar disappears
    Given the user is on the examples page
    And the user navigates "Dynamic Loading"
    And the user clicked the example 2
    When the user clicked the start button and wait a certain time to load
    Then 'Hello World!' is rendered