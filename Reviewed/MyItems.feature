Feature: My items page

  Background: 
    Given I am in home page
    And I logged In
    When I clicked on my username drop-down in header
    And I selected  "My items" from drop down option
    Then I should be able to redirected on "My Items" page on my screen

  Scenario: Verifying  available elements when user have no items
    Given I am a new user and I have no itmes purchased yet
    Then I should be able to see "You have no items to reviewStart shopping at your favorite online retailers and get them at your doorstep in no time with shop N zip"
    And I should be able to click "Shop Now" button in "My items" page

  Scenario: Verifying functionality of "Shop Now" button in "my items" page when user have no items
    Given I am a new user and I have no itmes purchased yet
    When I clicked on "Shop Now" button in "My items" page
    Then I should be able redirects to a page where list of 3rd party site links will be displayed

  Scenario: Verifying  available elements in "My Items" page when user have item(s)
    Given I have itmes in my "My Items" section
    Then I should be able to see list of items based on Shipping Method those are once received by the warehouse allready  and needs booking confirmation
    And I should be able to see  details related items in table
      | Description of item       |
      | Date received             |
      | Quantity                  |
      | weight                    |
      | Merchant tracking details |
      | Shipping cost             |
      | Select all check box      |
      | I aggree check box        |
      | ship my items button      |
    And I should be able to see following shipping methods options
      | Air | Sea |

  Scenario: Verifying the functionality of Air radio button
    Given I have itmes in my "My Items" section
    When I am selecting "Air" radio button
    And Items should be displayed based on Shipping Method
    And I should see "Ship via Air" option beside cost details in page

  Scenario: Verifying functionality of check boxes which are displaying  along with the items
    Given I have itmes in my "My Items" section
    When I have selectec more than one check boxes of items
    Then I should see selected items number count beside
    And based on these cost for selected items in page
    And I should see the the cost of the item for shipping

  Scenario: Verifying functinality of agreement check box
    Given I have itmes in my "My Items" section
    When I selected shipment method Air/Sea
    And I have selectec one check boxe of any item
    And Uncheck the check box
    Then I should see "Ship my items" button should not be enabled

  Scenario: Verifying functionality of "agree with tearms ans conditions of using the Shop N Zip service" check box when it is selected
    Given I have itmes in my "My Items" section
    When I selected shipment method Air/Sea
    And I have selectec one check boxe of any item
    And check the check box
    Then I should see "Ship my items" button should be enabled
    
  Scenario: Verifying functionality of "Ship my items" button
     Given I have itmes in my "My Items" section
    When I selected shipment method Air/Sea
    And I have selectec one check boxe of any item
    And check the check box

    And I clicked on "Ship my items" button
    Then I should be able to  redirected on  check out page cost summary will be displayed

  Scenario: Verifying the functionality of "Sea" radio button
    Given I have itmes in my "My Items" section
    When I selected "Sea" radio button
    Then I should see Items displayed are based on Shipping Method is selected
    And I should be able to see "Ship via Sea" option beside cost details in page
    And I should be able to see  related " Box" dimension details (height,width,length) along with their cost in same row

  Scenario Outline: Verifying functionality of "+' and "-" along with "box"
    Given I clicked on "Ship my items" button
    When I click on <icon>
    Then I should be able to <change> the boxes

    Examples: 
      | icon | change           |
      | +    | increases(add)   |
      | -    | decrease(reduse) |

  Scenario: Verifying availability of "Order History" section  with "back to current order" below of "Ship my items" button in page
    Then I should be able to see "Order History" section  with "back to current order" below of "Ship my items" button in page
    And I should be able to see all order history with items details in page(maximum how long and how many-need confirmation)

  Scenario: Verifying functionality of "back to current order" link in page
    When I clicked on " Back to current  order" order link in page
    Then I should be able to redirected on  my "current orders" details in my items page
