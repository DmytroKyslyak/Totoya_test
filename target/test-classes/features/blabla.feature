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

  @testCombobox
  Scenario: File-03-Task01
    When I open browser as "admin"
    And I set combobox "10"
    And I corresponding number

  @testEditLastPayment
  Scenario: File-03-Task05
    When I open browser as "admin"
    And I press button last page
    And I click button Payment
    Then I edit Payment Info
    And I click button Update
    And I click button last page
    And I verify record

  @testCreateNewPayment
  Scenario: File-03-Task02-03
    When I open browser as "admin"
    And I create new payment
    And I click button last page
    And I verify record
    And I verify record with DB

  @testDB
  Scenario: DB
    When I receive all customers
    And I receive info about all payments
    And I receive customer name with sum "800"
    And I receive last row payment

  @testRest
  Scenario: Task-07
    When I receive all customers api