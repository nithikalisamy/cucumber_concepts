@search
Feature: Open Youtube and search Cucumber contents
  
  Open Youtube Website and find contects related to Cucumber
  
  Background:
    Given User opens youtube.com
    When The serach box is clicked
    
  Scenario: Youtube Search
    Then Type "Cucumber" study material and serach
    And Take top "4" video links

  Scenario Outline: Youtube Search again
    Then Type "<course>" study material and serach
    And Take top "<number>" video links

    Examples: 
      | course   | number |
      | Selenium |      5 |
      | RESP API |      2 |
