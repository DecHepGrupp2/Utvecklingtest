  Feature:  Add Athlets
          As an Volunteer i want to be abel to add up to 40 contestants and their names so thar I can save them

  Scenario: Add and save names

    Given I have entered number 3 of athlets
    Given I have entered nr 1 athlets name "Andreas"
    Given I have entered nr 2 athlets name "Johnny"
    Given I have entered nr 3 athlets name "Peter"
    When Im done
    Then the athlets should be saved

Scenario: add 41 athlets

    Given I have entered number 41 of athlets
    When Im done
    Then I failmessage should be shown, max 40 athlets

  Scenario:  enter more names then chossen athlets
    Given I have entered number 10 of athlets
    When I want to enter 11 names
    Then It should not be possible

    Scenario: enter letters inseed of numbers
    Given I have entered number 1 of athlets
    Given  I have entered letters  jk when I should choose numbers of athlets
    When Im done
    Then a fail message should shown

      Scenario: enter number insteed of letters
    Given I have entered number 1 of athlets
    When I entererd name 7777
    Then A failmessage should be shown

        Scenario: enter negative number
    Given I have entered number -2 of Athlets
    When Im done done
    Then A fail message shuld be shown



          Scenario: 0 Atheltes choosen
    Given I have entered number 0 of athlets
    Then I want to write a name
    Then A failmessage should be shown

Scenario: save 40 Athlets
    Given I have entered number 40 of athlets
    Given I have entered nr 1 athlets name "a"
    Given I have entered nr 2 athlets name "b"
    Given I have entered nr 3 athlets name "c"
    Given I have entered nr 1 athlets name "d"
    Given I have entered nr 2 athlets name "e"
    Given I have entered nr 3 athlets name "f"
    Given I have entered nr 1 athlets name "g"
    Given I have entered nr 2 athlets name "h"
    Given I have entered nr 3 athlets name "i"
    Given I have entered nr 1 athlets name "j"
    Given I have entered nr 2 athlets name "k"
    Given I have entered nr 3 athlets name "l"
    Given I have entered nr 1 athlets name "m"
    Given I have entered nr 2 athlets name "n"
    Given I have entered nr 3 athlets name "o"
    Given I have entered nr 1 athlets name "p"
    Given I have entered nr 2 athlets name "q"
    Given I have entered nr 3 athlets name "r"
    Given I have entered nr 1 athlets name "s"
    Given I have entered nr 2 athlets name "t"
    Given I have entered nr 3 athlets name "u"
    Given I have entered nr 1 athlets name "v"
    Given I have entered nr 2 athlets name "w"
    Given I have entered nr 3 athlets name "x"
    Given I have entered nr 1 athlets name "y"
    Given I have entered nr 2 athlets name "z"
    Given I have entered nr 3 athlets name "å"
    Given I have entered nr 2 athlets name "ä"
    Given I have entered nr 3 athlets name "ö"
    Given I have entered nr 1 athlets name "ab"
    Given I have entered nr 2 athlets name "abc"
    Given I have entered nr 3 athlets name "abcd"
    Given I have entered nr 1 athlets name "bc"
    Given I have entered nr 2 athlets name "db"
    Given I have entered nr 3 athlets name "ca"
    Given I have entered nr 2 athlets name "abc"
    Given I have entered nr 3 athlets name "abcd"
    Given I have entered nr 1 athlets name "ll"
    Given I have entered nr 2 athlets name "op"
    Given I have entered nr 3 athlets name "mm"
    When Im done
    Then the athlets should be saved


Scenario: Enter same name
    Given I have entered numbers of atlets 3
    Given I have entered name 1 "carolina"
    Given I have entered name 2 "carolina"
    Given I have entered name 3 " sara"
    When Im done
    Then a fail message should be shown


Scenario: valid inputs
    Given I have entered number 1 of athlets
    Given  I have only use letters in names fields
    When  Im done
    Then the names should be saved

Scenario: invalid inputs
    Given I have entered number 1 of athlets
    Given I have used special charecters in names fields
    When Im done
    Then Fail

Scenario: save contents
    Given I have entered number 1 of athlets
    Given I have choosen Hepathlon
    When I enter name "mycontest"
    Then The name should be saved

Scenario: emty namefield
    Given I have entered number 1 of athlets
    Given I have Choosen Decathlon
    When In name field I press enter
    Then a fail message should be shown

















