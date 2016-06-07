Feature: Verifying  'Edit Credit card ' popup

  Background: 
    Given I am in home page
    And I logged In
    When I clicked on drop-down at username in header
    And I selected  'My account' from drop down option
    And I choose a credit/debit card
    And I clicked on 'Edit' button
    Then I should see 'Edit Credit.Debit card ' popup  with cancel icon
    And I should see fields are autofilled with existing data

  #Availability
  Scenario: Verify available fields in 'Edit credi/debit card ' popup.
    Then I should see following fields in 'Edit credi/debit card ' popup and It should be mandatory field
      | Card holders info label                                                  |
      | Name on card text box                                                    |
      | card type options as Visa,Master,Amex,Discover and JCB radio buttons     |
      | Credit card number text box                                              |
      | Expiry date option with drop down icons                                  |
      | card verification number text box with card ccv image for user reference |
      | checkbox for default recipient address                                   |
      | use this as my default account check box                                 |
      | Submit button                                                            |
      | Cancel button                                                            |

  #Positive
  Scenario: Verifying 'Edit' credit/debit card functionality (without making any change in any fields)
    When I clicked on submit button.
    Then I should see confirmation message 'Change is save'

  Scenario Outline: Verifying edit functionality with editing one field data only.
    When I edited only  <one field data>
    And I clicked on 'Submit' button.
    Then I should see card details are updated

    Examples: 
      | Name on the card         |
      | card type                |
      | Credit card number       |
      | Expiry date              |
      | card verification number |

  Scenario: Verifying  edit functionality with valid data all fields
    When I made changes for all fields with valid datails
    And clicked on 'Submit' button.
    Then I should see card details are updated

  Scenario: Verifying functionality of 'use this as my default account' check box in edit credit card popup.
    Given I am in home page
    And I logged In
    When I clicked on drop-down at username in header
    And I selected  'My account' from drop down option
    And I choose a Undefault credit/debit card
    And I clicked on 'Edit' button
    When I checked 'use this as my default account' check box
    And I clicked on 'Submit' button.
    Then I should the edited credit card is set to default credit card

  Scenario: Verifying 'cancel' icon of edit credit card  popup.
    When I clicked on 'Canceled' icon of edit credit card popup.
    Then edit credit card popup should be canceled
    And I should be able to see my account page on my screen.

  #Negative
  Scenario: Verifying  edit functionality with invalid data to all fields
    When I made changes for all fields with invalid datails
    And I clicked on 'Submit' button.
    Then I should see validation message 'Please enter valid data in respective fields'
