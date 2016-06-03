Feature: Global Header
  
  As a user, I should see the header will be same for all the pages is in the application

  Background: 
    Given I entered Shop N Zip url in the borwser and click on go
    Then I should be navigated to home page of the Shop N Zip application

  Scenario: Verify availability of header
    Then I should see the header section in the home page

  Scenario: Verify logo of the applicatoin
    Then I should see the Shop N Zip logo in heade beside the menu drop down option.

  Scenario Outline: Verify availability of hamburger 
    Then I should see the hamburger is displayed in the header
 
  Scenario Outline: Verifying availability of links in Hamburger menu
    When I clicked on "Hamburger" in left corner of header.
    Then I should see <links in Hamburger>  link in drop-down option.
      | links in Hamburger |
      | How it works         |
      | Shop now             |
      | About us             |
      | FAQ                  |
      | Sign In              |

  Scenario: Verify the availability of Sign Up button in Hamburger
    When I clicked on Hamburger option in left corner of header.
    Then I should see the Sign Up button display in menu drop down option in header

  Scenario Outline: Verify the socia media icon available in Hamburger
    When I clicked on "Hamburger" in left corner of header.
    Then I should see the <social media icons> is displayed in menu drop down option in header

    Examples: 
      | social media icons |
      | Facebook icon      |
      | Twitter icon       |

  Scenario: Verify the country drop down availability in header
    Then I should see the country drop down is displayed in header

  #Possitive
  Scenario Outline: Verify the links functionality in header
    When I clicked on "Hamburger" option in left corner of header.
    Then I should see the link <links in header> is displayed in  menu drop down option in the  header
    When I click on the link <links in header>
    Then I should be navigated to the <links in header> page

    Examples: 
      | links in header |
      | How it works    |
      | Shop now        |
      | About us        |
      | FAQ             |
      | Sign In         |

  Scenario: Verify the functionality of Sign Up button in menu drop down option in  the header
    When I clicked on "Hamburger" in left corner of header.
    Then I should see the Sign Up button should display in menu drop down option in the  header
    When I click on the Sign Up button it should takes me to the Sign Up page

  Scenario Outline: Verify the functionality of socia media icon in menu drop down option in the  header
    When I clicked on "Hamburger" in left corner of header.
    Then I should see the <social media icons> is displayed in menu drop down option in the  header
    When I click on the <social media icons>
    Then I should be navigated to the Shop N Zip's <page> page

    Examples: 
      | social media icons | page     |
      | Facebook icon      | Facebook |
      | Twitter icon       | Twitter  |

  Scenario: Verifying the functionality of "Shop N Zip" logo in header section.
    When I click on "Shop N Zip" logo in  header.
    Then I should be redirected to "Shop N Zip" home page.

  Scenario: Verifying the availability of loggedin user name in menu drop down option in the  header (After logg in)
    When I Signed In
    And I clicked on Hamburger in left corner of header.
    Then I should see my shop n zip sign in user name with drop down icon  in  menu drop down option in the  header .

  Scenario: Verifying the available drop down option underneath user name(after sign In)
    When I signed In
    And I clicked  on "Hamburger" in left corner of header.
    And I clicked on drop-down option underneath user name.
    Then I should see following options .
      | My Items         |
      | My Account       |
      | Track My Package |
      | My Profile       |
      | Logout           |

  Scenario Outline: Verifying the functionality of drop-down option underneath my shop N zip user name.
    When I signed In
    And I clicked  on "menu drop-down" option in left corner of header.
    And I clicked on <drop-down options> underneath my shop N zip user name.
    Then I should be navigated to <drop-down options> page on my screen.

    Examples: 
      | drop-down options |
      | My Items          |
      | My Account        |
      | Track My Package  |
      | My Profile        |

  Scenario: Verifying the functionality of "Logout" option underneath my shop N zip user name.
    When I signed In
    And I clicked  on "menu drop-down" option in left corner of header.
    And I clicked on drop-down options underneath my shop N zip user name.
    And I clicked on "Logout" option underneath my shop N zip user name.
    Then I should be logged out from Shop N Zip site.
    And I should be navigated on Sign In page.

  #Negative
  Scenario: Verify the availability of Sign Up button in menu drop down option in the  header(After user log in)
    When I signed in
    And I clicked on "menu drop-down" option in left corner of header.
    Then I should not see the Sign Up button display in header

  Scenario: Verify the availability of Sign In link in  menu drop down option in the  header(After user log in)
    When I signed in
    And I clicked on "menu drop-down" option in left corner of header.
    Then I should not see the Sign In link display in header

  Scenario: Verify the  availability of User name in menu drop down option in the  header (Without loggedin)
    And I clicked on "menu drop-down" option in left corner of header.
    Then I should not see user name with drop down option .

  Scenario: Verifying the availability of country drop-down in header
    Then I shoud be able to see country drop-down in option in header in home page  .

  Scenario: Verifying the availability of "Sign In" button in header
    Then I should see "Sign In " button beside Shop n Zip logo  in header in <page> this page.
      | Sign In                 |
      | Forgot password         |
      | Enter your new password |
      | Sign Up                 |
