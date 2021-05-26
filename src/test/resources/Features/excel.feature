Feature: Open Excel
  I want to open excel to add some data.


  Scenario: Add a result to Excel
    Given I want to add my result 1096 points
    When I press save my score
    Then My points should be 1096 in Excel


  Scenario: I want to be abel to start the program where i stopped
    Given I choose Load old scoreboard
    Given I Write in the name of an old contest
    Then the program starts from where i stopped before

  Scenario: I can print out the result
    Given I have choose Quit in the menu
    Then all my result should be saved to Excel
