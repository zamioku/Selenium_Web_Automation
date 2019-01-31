@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given I can login with "userName"
    And I can login

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with the '<name>' name
    When I check for the step number <value>
    Then I verify the "<status>" status of the step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | Success |
      | name2 |     7 | Fail    |

    @special
    Examples: 
      | name    | value | status  |
      | special |    10 | Success |
