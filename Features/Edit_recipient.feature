Feature: Edit recipient popup
  As a user I should be able to Edit recipient address

  Background: 
    Given I am in home page
    When I logged In
    And I clicked on my username drop-down in header
    And I selected  'My account' from drop down option
    Given I have atleast one recipient address to perform edit
    And I clicked on 'Edit' button which is displaying with recipient address
    Then I should be able to see 'Edit recipient ' popup  with cancel icon on my screen

  #Availability
  Scenario: Verify title of the 'Edit Recipient' popup
    And I should see the title of the popup as  'EDIT RECIPIENT'

  Scenario: Verifying available fields in 'Edit recipient  ' popup
    Then I should be able to see all field related recipient details   in 'Edit recipient  ' popup,which are
    And I should be able to see required(mandatory symbol with all fields)
      | First name mandatory text box                                                      |
      | Middle name text box                                                               |
      | last name mandatory text box                                                       |
      | mandatory Email address text box                                                   |
      | text box for Shipping address into two lines, address line one should be mandatory |
      | mandatory Barangay text box                                                        |
      | mandatory City text box                                                            |
      | mandatory province text box                                                        |
      | mandatory postal code text box                                                     |
      | use this as default address check box                                              |
      | Continue  buuton                                                                   |
      | cancel button                                                                      |

  Scenario: Verifying availability of details are displaying or not in all fields of previous details
    Then I should be able see all previous added details in respective boxes

  #Positive
  Scenario Outline: Verifying 'Edit Recipient' functionality with editing one field data only
    When I edited only  <field>
    And I clicked on 'Ship to this address' button
    Then I should be able to save edited value
    And I should see edit is success and confirmation message'your change is saved' is displayed

    Examples: 
      | field                                                                                                 |
      | First name mandatory text box data                                                                    |
      | Middle name text box 'name'                                                                           |
      | last name mandatory text box                                                                          |
      | mandatory Email address text box with email address                                                   |
      | changed address in text box for Shipping address into two lines, address line one should be mandatory |
      | changed Barangay mandatory Barangay text box                                                          |
      | changed city name in mandatory City text box                                                          |
      | changed province name in mandatory province text box                                                  |
      | changedpostal code in  mandatory postal code text box                                                 |

  Scenario Outline: Verifying 'Edit Recipient' functionality with editing all field with valid data
    When I edited all fields with valid data
    And I clicked on 'Ship to this address' button
    Then I should  not be able to save edited value
    And I should be able to see error  message'Please enter valid data in respective fields' on my screen

  Scenario: Verifying functionality of 'use this as my default account' check box in edit recipient popup
      Given: I entered all valid details in required fields

    When I checked 'use this as my default account' check box which
    And I clicked on 'Ship to this address' button
    Then I should be able to see this edited recipient as default recipient in my account page

  Scenario: Verifying  'cancel' icon in ediit recipient popup
    When I clicked on 'Canceled' icon of edit recipient popup
    Then edit credit card popup should be canceled
    And I should be able to see my account page on my screen

  #Negative
  Scenario: Verifying functionality of 'Edit Recipient' without making any change in any fields
    When I clicked on 'Ship to this address' button
    Then I should be able to click on 'Ship to this address' button
    And I should be able to see confirmation message ' this address is saved shipping address' on my screen

  Scenario Outline: Verifying edit functionality with editing all field with invalid data one at a time
    When I edited <invalid data>
    And I clicked on 'Ship to this address' button
    Then I should  not be able to save edited value
    And I should be able to see error  message'Please enter valid data in respective fields' on my screen

    Examples: 
      | invalid data                                                                                          |
      | First name mandatory text box with invalid name                                                       |
      | Middle name text box with invalid  name                                                               |
      | last name mandatory text box with invalid name                                                        |
      | mandatory Email address text box with invalid email address                                           |
      | changed address in text box for Shipping address into two lines, address line one should be mandatory |
      | Entered invalid Barangay mandatory Barangay text box                                                  |
      | Invalid city name in mandatory City text box                                                          |
      | Entered invalid province name  in mandatory province text box                                         |
      | Entered invalid code in  mandatory postal code text box                                               |
      |                                                                                                       |
