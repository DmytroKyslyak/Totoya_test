#sflgl;s
@batch1
@tagLoginFeat
#@smokeTest
#  @na

Feature: Login feature
  dkfsjlsdj
  fsdlf;sdf clsvd scvdvsd

  Background:
    Given I open login page

  @smokeTest
  Scenario: Happy path
    When I put "vasya" login
    And I put "123" password
    And I press Login button
    Then I see landing page

  Scenario: Negative
    When I put "petya" login
    And I put "345" password
    And I press Login button
    Then I see incorrect login message

  Scenario Outline: Happy path multi
    When I put "<LOGIN>" login
    And I put "<PASSWORD>" password
    And I press Login button
    Then I see landing page
#    And I open login page

    @tag1
    Examples:
      | LOGIN  | PASSWORD |
      | vasya  | 123      |
      | zhora  | 345      |
      | moisha | 678      |

    @tag2
    Examples:
      | LOGIN  | PASSWORD |
      | v2asya | 123      |


  Scenario: Signup
    When I enter new user values
      | firstname | vasya      |
      | lastname  | pupkin     |
      | dob       | 11-11-2011 |
      | job       | waiter     |
    And I press Save button
    Then I see that user is created


  @testToyota1
  Scenario: Web Test
    When I open browser
    And I press button
    And I check element
    And I click button
    Then I check element block
    And I click button last page
    And I check last row

