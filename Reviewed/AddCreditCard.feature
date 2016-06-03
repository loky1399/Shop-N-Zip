Feature: Add Credit card

  Background: 
    Given I am in home page
    And I logged In
    When I clicked on drop-down at user name in header
    And I selected  "My account" from drop down option
    And I clicked on "Add credi/debit card" option
    Then I shouldsee "Add Credit card "pop up is displayed

  #Availability
  Scenario: Verify available fields in "Add credi/debit card " popup.
    Then I should see following fields in "Add credi/debit card " popup and It should be mandatory field
      | Card holders info label                                                  |
      | Name on card text box                                                    |
      | card type options as Visa,Master,Amex,Discover and JCB radio buttons     |
      | Credit card number text box                                              |
      | Expiry date option with drop down icons                                  |
      | card verification number text box with card ccv image for user reference |
      | Billing Address: Address1 text field                                     |
      | Billing Address: Address2 text field                                     |
      | Billing Address: City text field                                         |
      | Billing Address: State drop down                                         |
      | Billing Address: Zipcode                                                 |
      | checkbox for default recipient address                                   |
      | use this as my default account check box                                 |
      | Submit button                                                            |
      | Cancel button                                                            |

  #Positive
  Scenario Outline: Verifying functionality with valid details.
    When I entered <valid data> in all fields.
    And I clicked on "Submit" button.
    Then I should be able to add my entered credit card with its details in my account page.
    And I should be able to redirected on "my account" and  popup window should be closed.

    Examples: 
      | Valid card holder name                 |
      | Valid card type related to card holder |
      | Valid card number                      |
      | Valid expiry date                      |
      | valid cvv number                       |

  #Negative
  Scenario: Verify "Add Credit card " functionality without entering any data in fields.
    When I clicked on "Submit" button
    Then I should see all required field are highlighted with red marks.

  Scenario: Verify functionality of cancel button in "Add Credit card " pop up
    When I click on "cancel" button without enter any data in fields.
    Then I should see pop is closed

  Scenario Outline: Verify "Add Credit card " functionality with only one required field.
    When I enter data to only  <required field> field
    And I clicked on "submit" button.
    Then I should be able to see <result>
    And I should be able to see error message "please entered all required information" on my screen.

    Examples: 
      | required field                                                           | result                            |
      | Name on card text box                                                    | error message should be displayed |
      | card type options with radio buttons                                     | error message should be displayed |
      | Credit card number text box                                              | error message should be displayed |
      | Expiry date option with drop down icons                                  | error message should be displayed |
      | card verification number text box with card ccv image for user reference | error message should be displayed |

  Scenario Outline: Verifying "Name on card" text box with invalid data
    When I entere<invalid data> in "Name on card" text box .
    Then I should be able to see <result> on my screen.

    Examples: 
      | invalid data        | result                                  |
      | ddf65655            | it should not be expectable by text box |
      |            37928714 | it should not be expectable by text box |
      | @&jkhhd^&***jhckhvl | it should not be expectable by text box |
      | gsdjgh@hd32424      | it should not be expectable by text box |
      | baby@1233           | it should not be expectable by text box |

  Scenario: Verifying functionality of "Card type" radio buttons with selecting more than two card type at a time.
    When I clicked on one card type radio button "master"
    And I clicked next card type  radio button "Discover".
    Then I should be able to see recent one option is in selected mode.
    And At a single time only one card type should be selected.

  Scenario Outline: Verify "Credit card number" text box with invalid data.
    When I entered < invalid data> in "Credit card number" text box
    Then I should be able to see <result> on my screen.

    Examples: 
      | invalid data              | result                                                                                                                                                                    |
      | 1223587983724974204678464 | it should not be accepted by text field and one error message "Card number should be 16 degites only" should be displayed on my screen                                    |
      | hsadgkagh7645495          | it should not be accepted by text field and one error message "Card number should be numeri value only" should be displayed on my screen                                  |
      | @124686792359             | it should not be accepted by text field and one error message "Card number should be numeri value only special charactor is not allowed" should be displayed on my screen |
      |             7899097972345 | it should not be accepted by text field and one error message" card number should be 16 degites only" will displayed on my screen                                         |

  Scenario Outline: Verifying  functionality of "card verification number" with invalid data.
    When I entered<Invalid data> in  "card verification number" text field.
    Then I should be able to see <result> on my screen.

    Examples: 
      | Invalid data | result                                                                                                                               |
      |    532464674 | it should not be accepted by text box , and I should be able to see error message "cvv number should be 3 digites only" on my screen |
      | ksd          | it should not be accepted by text box , and I should be able to see error message "cvv number should benumeric only" on my screen    |
      | 1jd          | it should not be accepted by text box , and I should be able to see error message "cvv number should benumeric only" on my screen    |
      | 1@3          | it should not be accepted by text box , and I should be able to see error message "cvv number should benumeric only" on my screen    |
      |           12 | I should be able to see error message "cvv number should be 3 digites only" on my screen                                             |

  Scenario Outline: Verifying "submit button"  functionality with wrong data in valid fomat
    When I entered <Data> in <fields>
    And I clicked on submit button.
    Then I should be able to see error message "entered informations are not valid, please check your details and try again" on my screen.

    Examples: 
      | Data                          | Fields                                                                   |
      | Baby kumari                   | Name on card text box                                                    |
      | Enabled "master" radio button | card type options with radio buttons                                     |
      |              1234567891234567 | Credit card number text box                                              |
      | 20/2020                       | Expiry date option with drop down icons                                  |
      |                           123 | card verification number text box with card ccv image for user reference |
      | enbled                        | checkbox for default recipient address                                   |

  Scenario: Verifying functionality of "use this as my default account" check box in add credit card popup.
    Given: I entered all valid details in required fields.

    When I checked "use this as my default account" check box which is below of cvv text box.
    And I clicked on "Submit" button.
    Then I should be able to see this added credit card as default credit card (Account) in my account page.

  Scenario: Verifying functionality of "cancel" icon of popup.
    When I clicked on "Canceled" icon of add credit card popup.
    Then add credit card popup should be canceled
    And I should be able to see my account page on my screen.

  #Negative
  Scenario: Verify functionality of add credit/debit card (try to add more than 3)
    Given There are no credit/debit card added so far
    When I add 3 credit/debit card
    And trying to add another credit/debit card
    Then I should see that I can't add more than 3 credit/debit card
