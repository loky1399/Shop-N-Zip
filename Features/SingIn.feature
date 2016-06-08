Feature: Sign In page

  # Availability
  Scenario: Verify the Sign In link is displayed in header
    Given I am in home page
    Then I should see 'Sign In' link

  Scenario: Verify the Sign In link is displayed in About us page
    Given I am in About us page
    Then I should see 'Sign In' link

  Scenario: Verify the Sign In link is displayed in FAQ page
    Given I am in FAQ page
    Then I should see 'Sign In' link

  Scenario: Verify the Sign In link is displayed in How It Works page
    Given I am in How It Works page
    Then I should see 'Sign In' link

  Scenario: Verify the Sign In link is displayed in Shop Now page
    Given I am in Shop Now page
    Then I should see 'Sign In' link

  Scenario: Verify the Sign In link is displayed in Carousel in home page
    Given I am in home page
    Then I should see 'Sign In' link

  Scenario: Verify the Sign In button is displayed in Sing up page
    Given I am in Sing up page
    Then I should see 'Sign In' button

  Scenario Outline: Verify the titile of the 'Sign In' form
    Given I am in sign In page
    Then I should see the title of the Sign In form as <title of the sign in form>

    Examples: 
      | title of the sign in form         |
      | Sign In using your Social Network |
      | Or user your TFC credentials!     |

  Scenario: Verify 'Remember me' check box state
    Given I am in Sing in page
    Then I should see 'Remember me' check box is selected by default

  Scenario: verify the Sign in button color
    Given I am in Sing in page
    Then I should see 'Sign In' button is displayed in orange color

  Scenario Outline: Verifying availability of fields in 'Sign In' page
    Given I am in sign In page
    Then I should see <fields in sign in form>

    Examples: 
      | fields in sign in form  |
      | 'Email Id' text field   |
      | 'Pass word' text field  |
      | 'Sign in' button        |
      | 'Remember' me check box |
      | 'Forgot password' link  |

  Scenario Outline: Verify the social network icons present in login page for sign in
    Given I am in sign In page
    Then I should see <Social network icons>

    Examples: 
      | Social network icons |
      | 'Facebook' icon      |
      | 'Twitter' icon       |
      | 'Google plus' icon   |

  Scenario Outline: Verify the items displayed in the drop down list at user name
    When I logged in
    And I click on the drop dwon at user name in header
    Then I should see the option <items in the drop list> is displayed in the drop list

    Examples: Following are the items displayed in the drop down at user name
      | items in the drop list |
      | My Items               |
      | My Accounts            |
      | Track My Packages      |
      | My Profile             |
      | Logout                 |

  #Possitive Functionality
  Scenario Outline: Verify functionality of 'Sign In' using social network icons
    Given I am in sign In page
    When I clicked on <socila network icon > icon in signin page
    Then I should should see a pop up is displayed to log in with <socila network icon> credentials
    When I logged in with valid <socila network icon> log in credentials
    Then I should see log in is successful
    And I should see the user name in header

    Examples: 
      | socila network icon |
      | Facebook            |
      | Twitter             |
      | Google+             |

  Scenario: Verifying the functionality of 'remember me' check box
    # check the feasibility of automation to this scenario as there will not be any cookies saved in web browser instantiated by the webdriver
    Given I am in sign In page
    When I Entered valid email address
    And I entered correct password
    And I selected 'remember me' check box
    And click on Sign in button
    Then I should see the log in is successful
    When I logged out
    And I navigated to sign in page again
    Then I should see the Email Address is auto filled with remembered email address
    And I should see the Password field is auto filled with remembered password
      | #Email id |  | # password |

  Scenario: verifying the functionality of 'Forgot Password' link
    Given I am in sign In page
    When I clicked on forgot password link
    Then I should be be navigated to Forgot Password page

  Scenario: Verifying 'Welcomeback' popup after success logg in
    Given I am in sign In page
    When I logged in |#Email id||# password|
    Then I should see 'Welcome Back' popup
    And I should see 'Welcome back' text along with User name
    And I should see 'Your shop N zip ID' text along with ID
    And I should see 'Your Shop N Zip address' text along with shop N zip US location address
    And I should see 'My Items' button

  Scenario: Verifying the functionality of 'My Items' button in 'Welcome Back'  popup page
    Given I am in sign In page
    When I logged in |#Email id||# password|
    Then I should see 'Welcome Back' popup
    When I click on 'My Items' button
    Then I should be redicted to 'My Items' page

  Scenario: Verifying functionality of 'Sign In ' (with TFC log in credentials)
    Given I am in sign In page
    And I Logged in with TFC login credentials
    Then I should see the log in is succesful
    And I should see the user name in header

  Scenario Outline: Verify the functionality of items displayed in the drop down at user name
    When I logged in
    And I click on the drop dwon at user name in header
    Then I click on the item <items in the drop list> in drop list

    Examples: Following are the items displayed in the drop down at user name
      | items in the drop list |
      | My Items               |
      | My Accounts            |
      | Track My Packages      |
      | My Profile             |
      | Logout                 |

  #Negative Functionality
  Scenario: Verifying functionality of 'Sign In ' (without providing any data in fields)
    Given I am in sign In page
    When I clicked on 'Sign In' button
    Then I should see the log in is unsuccesful
    And I should see a validation message is displayed as 'Please fill out this field' at every field

  Scenario: Verifying functionality of 'Sign In ' (without providing password)
    Given I am in sign In page
    When I entered valid email in Email Address field #Email id
    And I left password field blank
    And I clicked on sign in button
    Then I should see the log in is unsuccesful
    And I should see a validation message is displayed as 'Please fill out this field' at password field

  Scenario: Verifying functionality of 'Sign In ' (without providing Email Address)
    Given I am in sign In page
    When I left email id field blank
    And I entered valid Password in password field #password
    And I clicked on sign in button
    Then I should see the log in is unsuccesful
    And I should see a validation message is displayed as 'Please fill out this field' at Email Address field

  Scenario: Verifying functionality of 'Sign In ' (with Invalid Email Address)
    Given I am in sign In page
    When I entered invalid Email address in Email Address field #Invalid email id
    And I entered password in password field #password
    When I clicked on sign in button
    Then I should see the log in is unsuccesful
    And I should see a validation message is displayed as 'Email Address is invalid' at Email Address field
