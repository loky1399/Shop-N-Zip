#Author: lokesh.aakasapu@raybiztech.com
Feature: Verigy the functionality of Shipping cost Calculator
  
  Shipping cost Calculator will be used to calculate the cost of the service either by Air or Sea

#Covered upto availabilty only.Functional scenario will be added later. 
  Background: 
    Given I am in home page
    Then I should see the 'Shipping Cost Calculator' section

  Scenario: Verigy the availability of destination drop down
    Then I should see the destination drop down in the Shipping cost Calculator secion

  Scenario Outline: Verify the availability of Shipping methods
    Then I should see the shipping method <shipping methods> in the Shipping cost Calculator

    Examples: 
      | shipping methods |
      | Air              |
      | Sea              |

  Scenario Outline: Verify the availability of Item sizes
    Then I should see the shipping method <Item sizes> in the Shipping cost Calculator

    Examples: 
      | Item sizes |
      | Regular    |
      | Odd        |

  Scenario: Verigy the availability of Calculate button
    Then I should see the Calculate button in the Shipping cost Calculator secion

  Scenario: Verigy the availability of 'Type of Product' text field
    Then I should see the 'Type of Product' text field in the Shipping cost Calculator secion

  Scenario: Verify availability of dimentions label (shipping method Air and item size is Regular)
    When I selected Shipping method as Air
    And I selected Item size as Regular
    Then I should see a label 'Weight'
    And I should see a text area to enter weight of the item

  Scenario: Verify availability of dimentions label (shipping method Air and item size is odd)
    When I selected Shipping method as Air
    And I selected Item size as Odd
    Then I should see a label 'Dimentions'
    And I should see 'Length,Width and Hight fields' at dimentions label

  Scenario: Verify availability of dimentions label (shipping method sea and item size is odd)
    When I select Shipping method as Sea
    And I selected Item size as Odd
    Then I should see a option 'Dimentions'
    And I should see 'Length,Width and Hight fields' at dimentions label

  Scenario: Verify availability of Estimated Boxes drop down (shipping method sea and item size is Regular)
    When I select Shipping method as Sea
    And I selected Item size as Regular
    Then I should see a Estimated Boxes drop down
