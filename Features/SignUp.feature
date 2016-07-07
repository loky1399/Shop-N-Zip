Feature: Registration to Shop N Zip application
  
  As a user I should be able to regiter to Shop N Zip application from wherever it is possible accross all the pages

  # Missed out writing field validations
  #Availability
  Scenario: Verify the Sign Up button is displayed in header
    Given I am in home page of shopNzip
    Then I should see 'Sign Up' button in header

  Scenario: Verify the Sign Up button is displayed in About us page
    Given I am in About us page
    Then I should see 'Sign Up' button

  Scenario: Verify the Sign Up button is not displayed in About us page (when user logged in)
    Given I am in About us page
    And I logged in
    Then I should not see the sign up button in the current page

  Scenario: Verify the Sign Up button is displayed in FAQ page
    Given I am in FAQ page
    Then I should see 'Sign Up' button

  Scenario: Verify the Sign Up button is not displayed in FAQ page (when user logged in)
    Given I am in FAQ page
    And I logged in
    Then I should not see the sign up button in the current page

  Scenario: Verifying the Sign Up button is displayed in How It Works page
    Given I am in How It Works page
    Then I should see 'Sign Up' button

  Scenario: Verifying the Sign Up button is not displayed in How It Works page (when user logged in)
    Given I am in How It Works page
    And I logged in
    Then I should not see the sign up button in the current page

  Scenario: Verifying the Sign Up button is displayed in Shop Now page
    Given I am in Shop Now page
    Then I should see 'Sign Up' button

  Scenario: Verifying the Sign Up button is not displayed in Shop Now page (when user logged in)
    Given I am in Shop Now page
    And I logged in
    Then I should not see the sign up button in the current page

  Scenario: Verifying the Sign Up button is displayed in Carousel in home page
    Given I am in home page
    Then I should see 'Sign Up' button

  Scenario: Verifying the Sign Up button is not displayed in Carousel in home page (when user logged in)
    Given I am in home page
    And I logged in
    Then I should not see the sign up button in the current page

  Scenario: Verify the title of sign up form as 'Or Creat a new TFC account!'
    Given I am in home page
    And I should see 'Sign Up' button in header
    When I click on 'Sign Up' button
    Then I should see 'Or Creat a new TFC account!' heading at Sign Up form

  Scenario Outline: Verifying the availability of fields in Sign Up form
    Given I am in Sign Up page
    Then I should see <Field>

    Examples: 
      | Field                                  |
      | Name field                             |
      | Last name field                        |
      | Country of current residence drop down |
      | Email address field                    |
      | Phone number field                     |
      | Password field                         |
      | Re-type password field                 |
      | Address text field                     |
      | City text field                        |
      | State selection drop down              |
      | Register Now button                    |
      | Agree check box                        |
      | Terms and condition link               |
      | Privacy Policy link                    |

  Scenario Outline: Verifying the availability of mandatory fields in Sign Up form
    Given I am in Sign Up page
    Then I should see <Field> as mendatory

    Examples: 
      | Field                                  |
      | Name field                             |
      | Last name field                        |
      | Country of current residence drop down |
      | Email address field                    |
      | Phone number field                     |
      | Password field                         |
      | Re-type password field                 |

  #Possitive
  Scenario Outline: Verify functionality of Sign Up using social network icons.
    Given I am in Sign Up page
    When I clicked on <social network icon> icon in signup page.
    Then I should see a pop for <respective social network icon> login is appeared
    When I loged in with my <signin with social network> credintials
    Then I should see Name field in the sign up from is auto filled
    And I should see Country of current resident field in the sign up from is auto filled
    And I should see Email Address field in the sign up from is auto filled
    And I should see Phone Number field in the sign up from is auto filled

    Examples: 
      | social network icon | respective social network icon | signin with social network |
      | Facebook            | Facebook pop up                | Signin with facebook       |
      | Twitter             | Twitter poup                   | Signin with twitter        |
      | Google+             | Google+                        | Signin with google+        |

  Scenario: Verifying the functionality of Sign Up(with valid details)
    Given I am in Sign Up page
    And Registered with valid details
    Then I should see Registration is successful

  Scenario: verify the 'welcome' pop up after successful sign up
    Given I am in Sign Up page
    And I completed sign up
    Then I should see a welcome pop up
    And I should see 'Thank you for registering with us' text along with User name
    And I should see 'Your shop N zip ID' text along with ID
    And I should see 'Your Shop N Zip address' text along with shop N zip US location address
    And I should see 'Start shopping' button

  Scenario: Verify the Sign In verification link exipre time
    Given I am in sign up page
    And I completed sign up
    Then I should get verification link to the specified email address
    And It should be valid upto one year

  Scenario: verify the Sign in verification link functionality
    Given I am in sign up page
    And I completed sign up
    Then I should get verification link to the specified email address
    When I click on the verifiction link
    Then I should be navigated to shop N zip application
    And I should see verification is successful

  Scenario: verify the Sign in verification link functionality(of verified link)
    Given I am in sign up page
    And I completed sign up
    Then I should get verification link to the specified email address
    When I click on the verifiction link
    Then I should be navigated to shop N zip application
    And I should see verification is successful
    When I logged out
    And click on same verficatoin link again in email
    Then I should be redirected to shop n zip application
    And I should see a message saying 'Your email is already been verified'

  Scenario: verify the Sign in verification link functionality(of not a verified link after one year)
    Given I am in sign up page
    And I completed sign up
    Then I should get verification link to the specified email address
    When I click on verficatoin link in email after one year
    Then I should be redirected to shop n zip application
    And I should see a message saying 'Your link is either incorrect or expired'

  #Negative
  Scenario: Verifying the functionality of Sign Up (without Entering any of the fields)
    Given I am in Sign Up page
    And I clicked on 'Register now' button
    Then it should see registration is unsuccessful

  Scenario: Verifying the functionality of Sign Up (without Entering details to Name field)
    Given I am in Sign Up page
    And I tried to Registered without giving details to Name field
    Then I should see registration is unsuccessful

  Scenario: Verifying the functionality of Sign Up (without selecting anything in Country of current residence field)
    Given I am in Sign Up page
    And I tried to Registered without selecting anything in Country of current residence field
    Then I should see registration is unsuccessful
      | 

  Scenario: Verifying the functionality of Sign Up (without Entering details to Email Address field)
    Given I am in Sign Up page
    And I tried to Registered without giving details to Email Address field
    Then I should see registration is unsuccessful

  Scenario: Verifying the functionality of Sign Up (without Entering details to Phone Number field)
    Given I am in Sign Up page
    And I tried to Registered without giving details to Phone Number field
    Then I should see registration is unsuccessful

  Scenario: Verifying the functionality of Sign Up (without Entering details to Password field)
    Given I am in Sign Up page
    And I tried to Registered without giving details to Password field
    Then I should see registration is unsuccessful

  Scenario: Verifying the functionality of Sign Up (without Entering details to re-type Password field)
    Given I am in Sign Up page
    And I tried to Registered without giving details to re-type Password field
    Then I should see registration is unsuccessful

  Scenario: Verifying the functionality of Sign Up (Click on sign up button without user details)
    Given I am in Sign Up page
    And I Click on sign up button
    Then I should see registration is unsuccessful
    And I should see the validation messages are displayed
