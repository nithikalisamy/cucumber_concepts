@search
Feature: Open Youtube and search provided contents
  
  Open Youtube Website and find contects related to the topics provided

  Background: 
    Given User opens youtube.com
    When The serach box is clicked

  Scenario: Youtube Search
    Then Type "Cucumber" study material and serach
    And Take top 4 video links

  Scenario Outline: Youtube Search again
    Then Type "<course>" study material and serach
    And Take top "<number>" video links

    Examples: 
      | course   | number |
      | Selenium |      5 |
      | RESP API |      2 |

  Scenario: Youtube sports videos
    Then Type sportsname and serach
      | sportsName |
      | Basketball |
      | Volleyball |
    And Take top 1 video links
