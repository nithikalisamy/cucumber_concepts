@select
Feature: Extract Youtube very first video
  
  Open youtube main and page wihtout signing in
  and find the name of the first video that is suggested

  Scenario: YouTube first video name
    Given youtube is open
    When videos are displayed
    Then extract the first video name in suggestions
