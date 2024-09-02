Feature: background demo

  Background: Test demo with background
    Given user is login to application
    When user should open chrome browser
    Then user should enter url

  Scenario: checking with valid inputs
    Then user should enter username and password

  Scenario: Checking with invalid inputs
    Then user should enter invalid username and invalid password
