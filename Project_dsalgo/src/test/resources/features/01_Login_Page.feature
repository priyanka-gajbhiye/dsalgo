@Check_login
Feature: Check login Functionality

  Scenario: Check login page
    Given user is on Home page
    When user click on Get started button
    Then user click login button

  @Check_login_03
  Scenario Outline: check login with Valid username and password
    Given user is on login page
    When user enters Valid username and password
    Then user enters login button

