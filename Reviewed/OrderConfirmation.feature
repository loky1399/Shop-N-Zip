Feature: "order confirmation" page

  Background: 
    Given I am in home page
    And I logged in
    And I have shopped some items earlier
    And I have not yet opted for shipping
    When I clicked on username drop down in header
    And selected My Items option
    Then I should be navigated to the My Items page
    When I choose an item
    And I clicked "Ship my items" in my items page
    Then I should be navigated to checkout page
    When I given recipient address and selected a payment method
    And I have completed transaction
    Then I should be redirect to "Order confirmation" page

  #Availability
  Scenario: Verifying confirmation message
    Then I should be able to see confirmation message with contact details  in "order confirmation " page

  Scenario: Verifying displayed details in "order confirmation " page
    Then I should be able to see following in page
      | Order reference number    |
      | Your email address        |
      | shipping method           |
      | number and types of items |
      | Recipient address         |
      | Shop more button          |

  Scenario: Verify availability of print option
    And I should see print order details option

  #Positive
  Scenario: verifying functionality of "Shop more" button in page
    When I clicked on "Shop more" button
    Then I should be able to redirected on "Shop now " page
    And I should be able to see list of 3rd party site links in page
