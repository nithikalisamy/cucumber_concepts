Feature: Open Youtube and search Cucumber contents
  
  Open Youtube Website and find contects related to Cucumber

  Scenario Outline: Youtube Search
    Given User opens youtube.com
    When The serach box is clicked
    Then Type "<course>" study material and serach
    And Take top "<number>" video links
    Examples: 
      | course   | number |
      | Cucumber |  4     |


  Scenario Outline: Youtube Search again
    Given User opens youtube.com
    When The serach box is clicked
    Then Type "<course>" study material and serach
    And Take top "<number>" video links

    Examples: 
      | course   | number |
      | Selenium |  5     |

