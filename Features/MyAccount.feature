Feature: My account page.

  Background: 
    Given I am in home page
    And I logged In
    And I clicked on my username drop-down
    And I selected  "My account" from drop down option
    Then I should be able to redirected on "My account" page
    And I should see "My account" section is highlighted

  #Availability
  Scenario Outline: Verify displaying fields in "My Account" page.
    And I should see <sections>

    Examples: 
      | sections                               |
      | My shop and Zip shipping address block |
      | Credit cards block                     |
      | My recipient shipping addresses block  |

  Scenario: Verify  that no credit card details are displayed for new user
    Given I am new user
    And I should see no credit cares are displayed

  Scenario: Verify no Recipient Address is displayed for new user
    Given I am new user
    And I should see no Recipient Address is displayed

  Scenario: Verifying "Add credit/ debit card" pop up.
    And I should see "Add credit card" link is displayed

  Scenario: Verifying "Add recipient" pop up.
    And I should see "Add credit card" link is displayed

  Scenario: Veify availability of of "Delete" button.
    And I added a credit/debit card details
    When I Select credit/debit card
    And I should see "Delete" button

  Scenario: Verifying the availability of "Edit" credit/debit card
    And I added a credit/debit card details
    When I clicked on "Edit" button.
    Then I should be able to see "Edt" Credit card option

  Scenario: Verifying availability of "Edit" recipient address
    When I added a recipient address
    Then I should see a pop up is displayed where I can update the address details

  Scenario: Verifying availability of "Mark As default"
    When I added a recipient address
    Then I should see the "Mark As default" at added reciepent address

  #Positive
  Scenario: Verify the functionality of "Add credit/ debit card"
    When I clicked on  "Add credit/ debit card" option.
    Then I should see "Add credit card" popup is displayed

  Scenario: Veifying functionality of "Delete" button.
    And I added a credit/debit card details
    When I Select credit/debit card
    And clicked on "Delete" button
    Then I should see alert message for deleting "credit card " details
    And I confirms the delete credit/debit card
    Then I should see credit/debit card is deleted

  Scenario: Verifying the functinality of "Edit" credit/debit card
    And I added a credit/debit card details
    When I clicked on "Edit" button.
    Then I should be able to see "Edt" Credit card option  popup with  card details
    And I Edit the card details
    And click on Submit button
    Then I should see the card details are updated

  Scenario: Verifying the functinality of "Add Recipient" option
    When I clicked on "Add Recipient" option .
    Then I should see "Add Recipient" popup
    When I entered valid address details
    And Click on continue
    Then I should see address is added successfully

  Scenario: Verifying functionality of "Edit" recipient address
    When I clicked on "Edit" option
    Then I should see a pop up is displayed where I can update the address details
    When I edit the address details
    And Click on submit button
    Then I should see address details are updated

  Scenario: Verifying functionality of recipient address "Mark As default"
    When I click on "Mark As default"
    Then I should see the selected address is displayed as default recipient address
    
   #Negative
    Scenario: Verify functionality of add recipient (try to add more than 3)
    Given There are no recipient addressess added so far
    When I add 3 address
    And trying to add another address
    Then I should see that I can't add more than 3 recipient addressess
