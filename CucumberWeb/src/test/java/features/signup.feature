Feature: Signup Flow

  Scenario: Register page
    Given  i launch the app
    And    All Of Us login page is opened
    And    i navigate to signup page
    When   i enter email address
    And    i enter password
    Then   i click on continue


  Scenario: Security Page
    When   all fields are entered
    And    i click on Sign Up
    Then   i check for successful signup
    And    close app