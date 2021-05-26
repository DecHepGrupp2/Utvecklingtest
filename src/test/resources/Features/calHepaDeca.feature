Feature: As an volunteer i want to be abel to add a result so that i get a score


  Scenario Outline: Add a event and result get points
    Given In Decathlon on the event "<event>" and the result is <result>
    When I press sum
    Then My points on the event is <points> points

    Examples:
      | event      | result | points |
      | 100m       | 10.72  | 924    |
      | Long jump  | 807    | 1079   |
      | Shot put   | 16.57  | 886    |
      | Pole vault | 500    | 910    |



  Scenario Outline: Heptathlon add a event and result get points
    Given In Heptathlon on the event "<event>" and the result is <result>
    When I press count
    Then My Hepta points on the event is <points> points
    Examples:

      | event              | result      | points     |
      | 200m               | 23.73       | 1007       |
      | Long jump          | 661         | 1043       |
      | Shot put           | 13.15       | 737        |

    Scenario Outline: Invalid results
      Given In "<event>" have entered "<result>"
      When  The "<points>" are
      Then The message should be "<message>"
      Examples:
        |event|result|points|message|
        |100m    |18 |0    |"Your points is zero are you sure that you have entered a correct result?"|
        |100m    |8|1642|"Are you trying to cheat?"                                                |
        |400m    |82 |0  |"Your points is zero are you sure that you have entered a correct result?"|
        |400m    |33  |1762|  "Are you trying to cheat?"|
        |800m    |    254|0    |"Your points is zero are you sure that you have entered a correct result?"|
        |800m    |120|1116|"Are you trying to cheat?"|
        |1500m   |480|0|"Your points is zero are you sure that you have entered a correct result?"|
        |1500m   |200|1268|"Are you trying to cheat?"|
        |Pole vault| 100|0|"Your points is zero are you sure that you have entered a correct result?"|
        |Pole vault|620 |1298|"Are you trying to cheat?"|
        |High jump |    75|0 |"Your points is zero are you sure that you have entered a correct result?"|
        |High jump |      255|1349|"Are you trying to cheat?"|
        |Shot put  |         1.8|0|"Your points is zero are you sure that you have entered a correct result?"|
        |Shot put  |25       |1414|"Are you trying to cheat?"|
        |Javelin throw|      7| 0|"Your points is zero are you sure that you have entered a correct result?"|
        |Javelin throw|100|1355|"Are you trying to cheat?"|

