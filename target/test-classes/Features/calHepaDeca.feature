Feature: As an volunteer i want to be abel to add a result so that i get a score


 Scenario Outline: Add a event and result get points
    Given In Decathlon on the event "<event>" and the result is <result>
    When I press sum
    Then My points on the event is <points> points
   Examples:
     | event              | result      | points     |
     | 100m               | 10.72       | 924        |
     | Long jump          | 807         | 1079       |
     | Shot put           | 16.57       | 886        |
     | Pole vault         | 500         | 910        |
     | 100m               |10          | 85          |

  Scenario Outline: Heptathlon add a event and result get points
    Given In Heptathlon on the event "<event>" and the result is <result>
    When I press count
    Then My Hepta points on the event is <points> points
    Examples:
      | event              | result      | points     |
      | 200m               | 23.73       | 1007       |
      | Long jump          | 661         | 1043       |
      | Shot put           | 13.15       | 737        |

    Scenario: Slow running time
      Given I have entered 18 sec that is a slow running time
      When  The points are 0
      Then The result should be "Your points is zero are you sure that you have entered a correct result?"