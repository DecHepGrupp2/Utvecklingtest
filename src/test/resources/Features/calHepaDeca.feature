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
      | event     | result | points |
      | 200m      | 23.73  | 1007   |
      | Long jump | 661    | 1043   |
      | Shot put  | 13.15  | 737    |
      | Test      |        |        |