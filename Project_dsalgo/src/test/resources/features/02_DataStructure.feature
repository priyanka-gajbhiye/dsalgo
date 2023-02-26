Feature: The user is in the Home page after logged in

  Scenario: The user is able to navigate to Data Structure introduction page
    Given The user is in the Home page after logged in
    When The user clicks  Get Started button below the Data structures-Introduction
    Then The user should land in Data Structures- Introduction Page

  Scenario: The user is able to navigate to Time Complexity page
    Given The user is on the Data Structures Introduction after logged in
    When The user clicks Time Complexity button
    Then The user should be redirected to time complexity of Data structures-Introduction

  Scenario: check text editor
    Given The user clicks the Time Complexity page
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    And user direct to home page
