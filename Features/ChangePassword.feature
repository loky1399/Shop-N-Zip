Feature: Change password

  Background: 
    Given I am in home page
    And I logged in
    When I click on "my profile" under my user name drop down in header
    And I click on Edit profile link
    And click on change password link
    Then I should see "change password" section

  # Availability
  Scenario: Verifying title
    And I should see "Change Password" as title

  Scenario: Verify available fields in "Change password" field.
    Then I should be able to see these fields in page.
      | current password text box     |
      | New password text box         |
      | Re-type new password text box |
      | Submit button                 |
      | Back link                     |

  Scenario: Verifying state of "Submit" button with empty fields.
    And "submit" button should not be enabled.

  # Possitive
  Scenario: Verifying "Change Password" functionality(with valid data)
    When I entered my current password in current password filed.
    And I entered a valid format password in new password filed.
    And I entered same text in "re-type new password" field.
    And I clicked on "Submit" button.
    Then I should be able to change my password with confirmation message"Your password has been changed successfully please loggin with your new password" on my screen.
    And I should be able to redirected on loggin page.

  # Negative
  Scenario: verifying "Change Password" functionality with wrong "Current password"
    When I entered incorrect current password
    And given valid new password
    And entered password same as new password in re-type password field
    And I clicked on "submit" button.
    Then I should see error message "Current password is wrong"

  Scenario: verifying "Change Password" functionality with filling only "Current password field"
    When I entered current password
    And I clicked on "submit" button.
    Then I should see error message "Enter new password"

  Scenario: verifying "Change Password" functionality with filling  new password field but without filling current password field.
    When I entered new password
    And I entered same in "re-type new password" field.
    And I clicked on submit button without filling current password field.
    Then I should see  message "Enter your current password"

  Scenario: Verifying "Change Password" functionality with current password and new password field but without filling "Re-type new password" field.
    When I entered "Current password"
    And I entered "new password"
    And I clicked on "Submit button" without filling "Re-type new password" text box.
    Then I shouldsee message, "Please retype your new password "

  Scenario: Verifying "Change Password" functionality with filling different data in  re-type new password field.
    When I enter "Current password"
    And I enter "new password"
    And I filled "Re-type new password filled" with different data(which is not "new password" data) in text box.
    And I clicked on "Submit button" .
    Then I should message, "'Re-type new password' should be matched to 'new password'"
    And I should not be allowed to set new password.

  Scenario: verifying functionality of "Back" option in change password filed.
    When I click on "Back" option
    Then I should be redirected on "My profile " page.
