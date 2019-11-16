@Reqres_API
Feature: Cutomer_Feature
  This feature is used to test dummy API

  @List_User
  Scenario Outline: List all users in specific page
    When I send Get request
    Then I verify status code is <statusCode>
    And email in response consists "<email>"

    Examples: 
      | statusCode | email                    |
      |        200 | michael.lawson@reqres.in |

  @CreateUser
  Scenario Outline: Create New User
    When I have JSON
    And I send Post request
    Then I verify status code is <statusCode>
    And response consists name "<name>" and job "<job>"

    Examples: 
      | statusCode | name | job |
      |        201 | appu | QA  |
