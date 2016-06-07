Feature: Add address popup
  
  As a user I should be able to add 'Reciepient Address' then I can recieve my items.

  Background: 
    Given I am in home page
    When I logged In
    And I clicked on my username drop-down in header
    And I selected  'My account' from drop down option
    Then I should be navigated to 'My Account' page
    Given I have not added more than 3 recipient address so far
    When I clicked on 'Add recipient' option beside 'My recipient shipping address' in page.
    Then I should be able to see 'Add Recipient ' popup  with cancel icon

  #Availability
  Scenario: Verify title of the 'Add Recipient' popup
    And I should see the title of the popup as  'ADD RECIPIENT'

  Scenario: Verifying available fields in 'Add Recipient ' popup.
    Then I should be able to see all field related recipient details in 'Add Recipient ' popup as below
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

  #Positive
  Scenario Outline: Verifying functionality of 'Add recipient' ( with all valid details)
    When I entered <valid data> in <respective fields>.
    And I clicked on 'Contunue' button.
    Then I should be able to add my entered recipient  address  with its details in my account page.
    And I should be able to redirected on 'my account' and  popup window should be closed.

    Examples: 
      | valid first         | First name text field     |
      | valid last name     | Last name text field      |
      | Valid email address | email address text fields |
      | valid phone number  | phone number text fields  |
      | valid address       | address text box          |
      | Valid barangay      | barangay text field       |
      | Valid postal code   | postal code text box      |
      | valid city name     | City text field           |
      | valid Province name | Province text field       |

  Scenario: Verifying functionality of 'use this as my default account' check box in add recipient popup.
    Given: I entered all valid details in required fields.

    When I checked 'use this as my default account' check box .
    And I clicked on 'Submit' button.
    Then I should be able to see this added recipient as default recipient address in my account page.

  Scenario: Verifying functionality of 'cancel' icon at popup.
    When I clicked on 'Canceled' icon of add credit card popup.
    Then add recipient popup should be canceled
    And I should be able to see my account page on my screen.

  #Negative
  Scenario: Verifying  functionality of 'Add recipient' without entering any data in fields.
    When I clicked on 'Continue' button without entered any data in fields.
    Then I submit button should not be clickable.
    And I should be able to see all required field are highlighted with red marks.
    And no action should be  performed

  Scenario: Verifying functionality of cancel button in 'Add recipient' pop up
    When I clicked on 'cancel' button without entered any data in fields.
    Then I should be able to see 'Cancel' button is in disable mode.
    And I should not be able to click on it.

  Scenario Outline: Verifying functionality of 'Add recipient' with datails to only one required filed.
    When I enter <data> in only  <required field>
    And I clicked on 'submit' button.
    Then I should be able to see <result> on my screen.
    And I should be able to see error message 'please entered all required information' on my screen.

    Examples: 
      | data                       | required field | result |
      | Baby                       | First name     |        |
      | baby.kumari@raybiztech.com | email address  |        |
      | rbt                        | address1       |        |
      |                 7205108406 | Phone number   |        |
      | Hyderabad                  | City           |        |
      |                     500081 | postal code    |        |

  Scenario Outline: validating 'First name ' text box in 'Add recipient' (with invalid data)
    When I entere<invalid data> in 'First name' text box .
    Then I should be able to see <result> on my screen.

    Examples: 
      | invalid data        | result                                  |
      | ddf65655            | it should not be expectable by text box |
      |            37928714 | it should not be expectable by text box |
      | @&jkhhd^&***jhckhvl | it should not be expectable by text box |
      | gsdjgh@hd32424      | it should not be expectable by text box |
      | baby@1233           | it should not be expectable by text box |

  Scenario Outline: Verifying 'Last name ' text box in 'Add recipient' (with invalid data)
    When I entere<invalid data> in 'Last name' text box .
    Then I should be able to see <result> on my screen.

    Examples: 
      | invalid data        | result                                  |
      | ddf65655            | it should not be expectable by text box |
      |            37928714 | it should not be expectable by text box |
      | @&jkhhd^&***jhckhvl | it should not be expectable by text box |
      | gsdjgh@hd32424      | it should not be expectable by text box |
      | baby@1233           | it should not be expectable by text box |

  Scenario Outline: Verifying 'Email address' text box 'Add recipient' (with invalid datas)
    When I entere<invalid data> in 'Email address' text box .
    Then I should be able to see <result> on my screen.

    Examples: 
      | invalid data          | result                                  |
      | ddf65655              | it should not be expectable by text box |
      |              37928714 | it should not be expectable by text box |
      | @&jkhhd^&***jhckhvl   | it should not be expectable by text box |
      | gsdjgh@hd32424        | it should not be expectable by text box |
      | baby@1233             | it should not be expectable by text box |
      | baby.kumari@ggdfk.com |                                         |

  Scenario Outline: Verifying 'Phone number ' text box in 'Add recipient' (with invalid datas)
    When I entere<invalid data> in 'phone number' text box .
    Then I should be able to see <result> on my screen.

    Examples: 
      | invalid data        | result                                  |
      | ddf65655            | it should not be expectable by text box |
      |            37928714 | it should not be expectable by text box |
      | @&jkhhd^&***jhckhvl | it should not be expectable by text box |
      | gsdjgh@hd32424      | it should not be expectable by text box |
      | baby@1233           | it should not be expectable by text box |
      |   98764716582351699 | it should not be expectable by text box |

  Scenario Outline: Verifying 'postal code ' text box in 'Add recipient' popup (with invalid datas)
    When I entere<invalid data> in 'postal code' text box .
    Then I should be able to see <result> on my screen.

    Examples: 
      | invalid data        | result                                  |
      | ddf65655            | it should not be expectable by text box |
      |            37928714 | it should not be expectable by text box |
      | @&jkhhd^&***jhckhvl | it should not be expectable by text box |
      | gsdjgh@hd32424      | it should not be expectable by text box |
      | baby@1233           | it should not be expectable by text box |
      |   98764716582351699 | it should not be expectable by text box |
      |            12356974 | it should not be expectable by text box |

  Scenario Outline: Verifying functionality of 'Add recipient'  and other valid data.
    When I entered <one one invalid data> in <Related field>
    And I entered valid datas in remaining fields.
    And I clicked on 'Submit' button.
    Then I should be able to see error message  <Result> on my screen.

    Examples: 
      | one one invalid data         | Related field             | Result                                 |
      | 476654hkljfh                 | first Name text field     | Entered name is not valid              |
      | @hkfh87                      | Last name text field      | Entered name is not valid              |
      | dkdgkf@gmail.com             | email  text field         | entered email addtress is not valid    |
      | 9876543219876543phone number | phone number is not valid |                                        |
      | 42351358dsgdl                | postal code               | postal code should not be alphanumeric |
      |                    243892370 | Postal code               | postal code should have 6 digits only  |
