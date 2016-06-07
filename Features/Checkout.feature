Feature: Checkout page.

  Background: 
    Given I am in home page
    And I logged In
    And I navigated to 'My Items' page
    And I selected Method of shipment
    And I selected an item to ship
    And I clicked on 'Ship My Item' button
    Then I should be redirected on 'checkout' page.

  #Availability
  Scenario: Verify availability of sections in 'Checkout' page.
    Then I should be able to see 'COST SUMMARY' section
    And I should be able to see 'RECIPIENT' section
    And I should be able to see 'PAYMENT INFO' section

  Scenario: Verify available details within 'COST SUMMARY' section.
    And I should see 'Method of shipment' with type of method selected
    And I should see 'shipng to' with city name where it will be shipped to
    And I should see 'Packaging' with type of packaging
    And I should see 'Weight' with actual shipment weight
    And I should see 'Promo code text field' with apply button
    And I should see 'Subtotal' with value after applying promo code if any
    And I should see 'Handling fee '
    And I should see 'Total' with value after adding handling fee to subtotal

  Scenario: Verify available details within 'RECIPIENT' section.
    And I should see 'First Name' field
    And I should see 'Middle Name' field
    And I should see 'Last Name' field
    And I should see 'Continue' button

  Scenario: Verifying available section in under 'payment info' section.
    Then I should be able to see 2 modes of payment options available with continue buttons..
      | Paypal       |
      | Card payment |

  Scenario: Verifying entered card details are displaying within payment info or not.
    And I given recipient address
    When I clicked on 'Continue' button under card payment method in checkout page.
    And I should be able to redirected on payment info page under which I should be able to enter card related details in page.
    Then I should be able to see all entered card details within payment info in page.

  Scenario: Verifying availability of 'EDIT'  and 'CHANGE PAYMENT METHOD' options
    And I given recipient address
    When I clicked on 'Continue' button under card payment method in checkout page.
    Then I should see 'EDIT' and 'CHANGE PAYMENT METHOD' options

  Scenario: Verifying availability of 'Pay Now' button underneath payment info in page.
    And I given recipient address
    When I clicked on 'Continue' button under card payment method in checkout page.
    And I should be able to redirected on payment info page under which I should be able to enter card related details in page.
    Then I should be able to see 'Pay Now' button underneath payment info in page.

  Scenario: Verifying entered paypal  details are displaying within payment info or not.
    And I given recipient address
    When I clicked on 'Continue' button under paypal payment method in checkout page.
    And I should be able to redirected on payment info page under which I should be able to enter paypal related details in page.
    Then I should be able to see all entered paypal details within payment info in page.

  Scenario: Verifying availability of 'CHANGE PAYMENT METHOD' option after card details in page.
    And I given recipient address
    When I clicked on 'Continue' button under paypal payment method in checkout page.
    And I should be able to redirected on payment info page under which I should be able to enter paypal related details in page.
    Then I should be able to see 'CHANGE PAYMENT METHOD' option  with some information in page.

  Scenario: Verifying availability of 'Pay Now' button underneath payment info in page.
    And I given recipient address
    When I clicked on 'Continue' button under paypal payment method in checkout page.
    And I should be able to redirected on payment info page under which I should be able to enter paypal related details in page.
    Then I should be able to see 'Pay Now' button underneath payment info in page.

  #Positive
  Scenario: Verifying functionality of 'promo Code' (without promo code).
    When I clicked on  'Apply' button
    Then It should ask me that promo code should be entered

  Scenario: Verifying functionality of 'promo Code' (with valid promo code).
    When I enter valid 'promo Code'
    And I clicked on  'Apply' button
    Then I should see that promo code is successfully applied

  Scenario: Verify validation message displayed when click on continue button without reciepens details
    When I clicked on 'continue' button at reciepens section.
    Then It should display error message saying fields are mandatory

  Scenario: Verify the functionality of edit recipient address
    When I entered all the mandatory fields under recipient section with valid details
    And click on Continue button
    Then I should see the edit button is appeared after page reload
    When I click on the edit button
    Then It should take me back to fields where I can edit the address details

  Scenario: Verifying state of the 	'Continue' button under payment options(without recipient address)
    Then I should see 'Continue' buttons at Payment Info section are is disabled(both paypal and credit card)

  Scenario: Verifying state of the 	'Continue' button under payment options(with recipient address)
    When I given recipient address
    Then I should see 'Continue' buttons at Payment Info section are is enabled(both paypal and credit card)

  Scenario: Verify the navigation to paypal page
    When I given recipient address
    Then I should see 'Continue' buttons at Payment Info section are is enabled(both paypal and credit card)
    When I click on 'Continue' button of paypal payment type
    Then I should be redirected to paypal payment page

  Scenario: Verify the navigation to credit card payment page
    When I given recipient address
    Then I should see 'Continue' buttons at Payment Info section are is enabled(both paypal and credit card)
    When I click on 'Continue' button of pay using credit card payment type
    Then I should be redirected to credit card payment page

  Scenario: Verifying the functionality of 'Edit' option.
    And I given recipient address
    When I clicked on 'Continue' button under card payment method
    Then I should be redirected on payment page
    When I clicked on 'Edit' option.
    Then I should be redirected on 'Edit credit card' popup.

  Scenario: Verify the functionality of 'CHANGE PAYMENT METHOD' option.
    And I given recipient address
    When I clicked on 'Continue' button under card payment method in checkout page.
    And I should be able to redirected on payment info page under which I should be able to enter card related details in page.
    When I clicked on 'CHANGE PAYMENT METHOD' option.
    Then I should be redirected on payment info option in checkout page.

  Scenario: Verifying functionality of 'Pay Now' button underneath payment info in page.
    And I given recipient address
    When I clicked on 'Continue' button under card payment method in checkout page.
    And I should be able to redirected on payment info page under which I should be able to enter card related details in page.
    When I clicked on 'Pay Now' button underneath payment info in page.
    Then I should be able to redirected on 'Order Confirmation' message (page).

  Scenario: Verifying the functionality of 'CHANGE PAYMENT METHOD' option.
    And I given recipient address
    When I clicked on 'Continue' button under paypal payment method in checkout page.
    And I should be able to redirected on payment info page under which I should be able to enter paypal related details in page.
    When I clicked on 'CHANGE PAYMENT METHOD' option.
    Then I should be redirected on payment info option in checkout page.

  Scenario: Verifying functionality of 'Pay Now' button underneath payment info in page.
    And I given recipient address
    When I clicked on 'Continue' button under paypal payment method in checkout page.
    And I should be able to redirected on payment info page under which I should be able to enter paypal related details in page.
    When I clicked on 'Pay Now' button underneath payment info in page.
    Then I should be able to redirected on 'Order Confirmation' message (page).

  #Negative
  Scenario: Verifying functionality of 'promo Code' (with invalid promo code).
    When I enter invalid 'promo Code'
    And I clicked on  'Apply' button
    Then I should see error message saying enter valid Promo code

  Scenario: Verify validation message for First Name field under Recipients section
    When I provided valid deatails to all fields except First Name
    And I clicked on 'continue' button at reciepens section.
    Then It should display error message saying field is mandatory

  Scenario: Verify validation message for Last Name field under Recipients section
    When I provided valid deatails to all fields except Last Name
    And I clicked on 'continue' button at reciepens section.
    Then It should display error message saying field is mandatory
    #  Scenario: Verifying the functionality of 'Change recipient' option below of recipient details in page.
    Given I filled all required details in recipient section.
    And I clicked on 'continue' button under recipient.
    When I clicked on 'Change recipient' option below of recipient details in page.
    Then I should be able to redirected to 'Change recipient'  option.
    Then I should be able to click on 'Continue' button(Button should be enabled).
