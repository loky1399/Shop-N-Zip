Feature: Forgot password (Including reset password)

  #Field validations are missed out (password)
  #Availablity
  @test
  Scenario: Verify the availability of Forgot Password title
    Given I am in Sign in page
    When I clicked on 'Forgot Password'
    Then I should see forgot password title as 'Forgot Password'

  Scenario: Verifying the availability of Email Address field
    Given I am in Sign in page
    When I clicked on 'Forgot Password'
    Then I should see Email address field with water mark text as 'Email Address'

  Scenario: Verifying the availability of Reset Password button
    Given I am in Sign in page
    When I clicked on 'Forgot Password'
    Then I should see Reset Password button

  Scenario: Verifying the availability of Reset password description
    Given I am in Sign in page
    When I clicked on 'Forgot Password'
    Then I should see Reset password description under the title as 'Recover your password by entering the email address associated with your account. Check your email for the instructions on how to reset your password'

  Scenario: Verifying the displaying alert message with entering not registered email  id.
    Given I am in Sign in page
    When I clicked on 'Forgot Password'
    And I entered not registered  email id
    When I click on 'Reset Password' button
    Then I should see 'Please enter a registered e-mail address' alert message on my screen.

  Scenario: Verify the error message for with invalid email id
    Given I am in Sign in page
    When I clicked on 'Forgot Password'
    And I entered invalid email id
    When I click on 'Reset Password' button
    Then I should see 'Invalid email address' error message on my screen.

  Scenario: Verifying the confirmation message after entering registered email id.
    Given I am in Sign in page
    When I clicked on 'Forgot Password'
    And I entered valid email id
    When I click on 'Reset Password' button
    Then I should see confirmation message 'We have sent a link to reset your password to your registered e-mail address.' on my screen.
    And I should see 'Reset password' button is as not enabled.

  Scenario: Verifying availability of 'Save New Password' button
    Given I am in sign in page
    And I am a registered user
    And I clicked on 'Forgot Password' link in 'Sign In' page
    And 'Sign In' is highlighted in menu grids
    When I entered registered email address in 'Forgot password page'
    And I clicked on 'Reset password'
    Then I should get a link to reset the password to my email
    When I confirm my email
    Then I should be navigated to Reset password page
    Then I should be able to see 'Save New Password' button

  #Possitive
  Scenario: verifying the fucntionality of 'forgot password' (with valid email address)
    Given I am in Sign in page
    When I clicked on 'Forgot Password'
    And I entered registered email address
    And click on Reset Password button
    Then I should get reset password link to the specified email address
    And I clicked on the link
    And I should be redirected to Reset Password page
    And I should see 'Enter Your New Password' heading
    And I should see 'Password' text field in reset paswword page.
    And I should see 'Retypepassword' text fields
    When I enter new password
    And I enter same text in 'Retypepassword' text field.
    And Click on save New Password button
    Then I should see success message of reset password 'Your password has been reset.'
    And I should see 'To sign in with your new password, click here.' for sigin with shop n zip site.
    When I click on 'To sign in with your new password, click here.' link .
    Then I should be redirected to the sigin page of shop n zip site.

  Scenario: Verify the forgot password link exipre time(click on link after 24 hours)
    Given I am in Sign in page
    When I clicked on 'Forgot Password'
    And I entered registered email address
    And click on Reset Password button
    Then I should get reset password link to the specified email address
    When I click on the link after 24 hours
    Then I should be redirected to shop n zip application
    And I should see the message saying link is expired

  Scenario: Verifying functionality of 'Reset password' with empty 'Password' text field
    Given I am in sign in page
    And I am a registered user
    And I clicked on 'Forgot Password' link in 'Sign In' page
    And 'Sign In' is highlighted in menu grids
    When I entered registered email address in 'Forgot password page'
    And I clicked on 'Reset password'
    Then I should get a link to reset the password to my email
    When I confirm my email
    Then I should be navigated to Reset password page
    When I clicked on 'Save New Password' button
    Then I should be able to see one alert message 'Enter your password'

  Scenario: Verifying functionality of 'Password field' with more than specified character length data
    Given I am in sign in page
    And I am a registered user
    And I clicked on 'Forgot Password' link in 'Sign In' page
    And 'Sign In' is highlighted in menu grids
    When I entered registered email address in 'Forgot password page'
    And I clicked on 'Reset password'
    Then I should get a link to reset the password to my email
    When I confirm my email
    Then I should be navigated to Reset password page
    When I  enters  more than specified character length data
    Then I should not be able to enter more than specified character length data in 'Password' text field

  #Negative
  Scenario: Verifying the functionality of forgot password (without providing any email address)
    Given I am in Sign in page
    When I clicked on 'Forgot Password'
    And I Clicked on Reset Password button
    Then I should see a validation message saying email address field is required

  Scenario: Verifying the functionality of forgot password (with invalid/Unregistered email address)
    Given I am in Sign in page
    When I clicked on 'Forgot Password'
    And I entered invalid email address
    When I Clicked on Reset Password button
    Then I should see the error message
