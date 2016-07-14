Feature: Change password

  Background: 
    Given I am in home page
    And I logged in
    When I click on 'my profile' under my user name drop down in header
    And I click on Edit profile link
    And click on change password link
    Then I should see 'change password' section

  # Availability
  Scenario: Verifying title
    Then I should see 'Change Password' as title

  Scenario: Verify available fields in 'Change password' field.
    Then I should be able to see these fields in page.
      | current password text box     |
      | New password text box         |
      | Re-type new password text box |
      | Submit button                 |
      | Back link                     |

  Scenario: Verifying state of 'Submit' button with empty fields.
    When I click on 'submit' button
    Then I should see 'This field is required' error text for available all fields.

  # Possitive
  Scenario: Verifying 'Change Password' functionality(with valid data)
    When I entered my current password in current password filed.
    And I entered a valid format password in new password filed.
    And I entered same text in 're-type new password' field.
    And I clicked on 'Submit' button in change password form.
    Then I should be able to change my password with confirmation message'The changes were saved.' on my screen.

  # Negative
  Scenario: verifying 'Change Password' functionality with wrong 'Current password'
    When I entered incorrect current password
    And given valid new password
    And entered password same as new password in re-type password field
    And I clicked on 'submit' button.
    Then I should see error message 'Your current password is incorrect. '

  Scenario: verifying 'Change Password' functionality with filling only 'Current password field'
    When I entered current password
    And I clicked on 'submit' button.
    Then I should see error message 'This field is required' for 'password' text field.
    And I should see error message 'This field is required' for 'retype password' text field.

  Scenario: verifying 'Change Password' functionality with filling  new password field but without filling current password field.
    When I entered new password
    And I entered same in 're-type new password' field.
    And I clicked on submit button without filling current password field.
    Then I should see  message 'This field is required' with current password field.

  Scenario Outline: Verifying  validation message for 'Enter new password' text field with invalid format texts.
    When I enter data <Invalid format data> under 'Enter new password' text field
    Then I should see validation message <Result> for the 'Enter new password' text field.

    Examples: 
      | Invalid format data        | Result                                                                                                    |
      | alfanumeric 112222jsd      | Please enter a password that is at least six characters long and contains at least one special characters |
      | numeri 124851957@          | Please enter a password that is at least six characters long and contains at least one special characters |
      | letterSpecial shfk@        | Please enter a password that is at least six characters long and contains at least one special characters |
      | numberSpecial 112@         | Please enter a password that is at least six characters long and contains at least one special characters |
      | less letterSpacial kjj@    | Please enter a password that is at least six characters long and contains at least one special characters |
      | lessAlfanumericSpeciala@b1 | Please enter a password that is at least six characters long and contains at least one special characters |

  Scenario: Verifying 'Change Password' functionality with current password and new password field but without filling 'Re-type new password' field.
    When I entered 'Current password'
    And I entered 'new password'
    And I clicked on 'Submit button' without filling 'Re-type new password' text box.
    Then I shouldsee message, 'This field is required' for 'retype password' field.

  Scenario: Verifying 'Change Password' functionality with filling different data in  re-type new password field.
    When I enter 'Current password'
    And I enter 'new password'
    And I filled 'Re-type new password filled' with different data(which is not 'new password' data) in text box.
    And I clicked on 'Submit button' .
    Then I should message, ' Fields do not match ' for 'Re-type password' field.
    And I should not be allowed to set new password.

  Scenario: verifying functionality of 'Back' option in change password filed.
    When I click on 'Back' options
    Then I should be redirected on 'My profile ' page.
