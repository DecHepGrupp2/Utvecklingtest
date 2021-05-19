Feature: Create a scorecard
  As an Volunteer i want to be abel to se all contestants scorecard so that i could compare the results.

  Scenario: Start a new scorecard
    Given I want to add 1 numbers of participants
    When I press enter
    Then I will have a matrix with 1 rows and 22 columns

