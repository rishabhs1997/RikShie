Feature: Primary Consent

  @SmokeTest
  Scenario: Primary consent flow
    Given   i launch the app
    When    All Of Us login page is opened
    And     i enter email and password
    And     i click on login
    And     i check for successful login
    And     i complete primary consent
    Then    display dashboard
    And     close app