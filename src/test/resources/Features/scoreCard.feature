Feature: Create a scorecard
  As an Volunteer i want to be abel to se all contestants scorecard so that i could compare the results.

  Scenario: Start a new scorecard
    Given I want to add 1 numbers of participants
    When I press enter
    Then I will have a matrix with 1 rows and 22 columns


  Scenario: Change result in scoreboard
    Given I have a scorecard for the contestant
    When I press change score
    And I get access to the column I want to change
    Then the score is changed


  Scenario: See all contestants scorecardd
    Given Scorecard with contestants results
    When I press a button to compare scores
    Then I get to see all scores from highest to lowest


  Scenario: Correct scores with decimals
    Given I am able to write scores
    When I write scores with decimals
    And I press ok
    Then Scores are added with decimals