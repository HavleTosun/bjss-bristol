Feature: Update Data

  @run
  Scenario: Update employee data and and verify that successfully updated
    Given the user connected with example api
    When the user update employee data
    Then status code should be 204