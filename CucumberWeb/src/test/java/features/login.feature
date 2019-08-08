Feature: Login Page

  Background: Open All of us Login
    Given  i launch the app
    And   All Of Us login page is opened


  @Correct
  Scenario: Check Login Page Process
    When   i enter email and password
    And    i click on login
    Then   i check for successful login
    And    close app


  @Error
  Scenario Outline: Check error for various usernames
    When   i enter for "<username>" and "<password>"
    But    username is wrong
    Then   display error messages for "<username>"


    Examples:
      | username       | password |
      | vignet         |          |
      |                |          |
      | vig24568@gmail | x##      |


