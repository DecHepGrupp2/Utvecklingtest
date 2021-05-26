  Feature:  Add Athlets
          As an Volunteer i want to be abel to add up to 40 contestants so that i can se them all.

  Scenario: Add and save names
    Given I have entered number 3 of athlets
    Given I have entered nr 1 athlets name "Carolina"
    Given I have entered nr 2 athlets name "Johnny"
    Given I have entered nr 3 athlets name "Belle"
    When i done
    Then the athlets should be shown

