Feature: Global Header
  
  As a user, I should see the header will be same for all the pages is in the application

  #Availability
  Background: 
    Given I entered Shop N Zip url in the borwser and click on go
    Then I should be navigated to home page of the Shop N Zip application

  Scenario: Verify availability of header
    Then I should see the header section in the home page

  Scenario: Verify logo of the applicatoin
    Then I should see the Shop N Zip logo in left portion of the header

  Scenario Outline: Verify the links available in header
    Then I should see the <links in header> link is displayed in the header

    Examples: 
      | links in header |
      | How it works    |
      | Shop now        |
      | About us        |
      | FAQ             |
      | Sign In         |

  Scenario: Verify the availability of Sign Up button in the header
    Then I should see the Sign Up button display in header

  Scenario Outline: Verify the socia media icon available in header
    Then I should see the <social media icons> is displayed in header

    Examples: 
      | social media icons |
      | Facebook icon      |
      | Twitter icon       |

  Scenario: Verify the country drop down availability in header
    Then I should see the country drop down is displayed in header

  Scenario: Verigy the user name displayed after user log in
    Given I am in home page
    And I logged in
    Then I should see user name is displayed
    And I should not see the sing in link in the header

  Scenario: Verigy display of Sign Up button after user log in
    Given I am in home page
    And I logged in
    Then I should not see Sign Up button is displayed in header

  Scenario: Verigy display of ad slot in header
    Given I am in home page
    And I should not see ad slot is displayed in header
    When I navigated to any page other than home page
    Then I should see ad slot is displayed in header

  #Possitive
  Scenario: Verifying the functionality of 'Shop N Zip' logo in header section.
    When I click on 'Shop N Zip' logo in  header.
    Then I should be redirected to 'Shop N Zip' home page.

  Scenario Outline: Verify the links functionality in header
    Then I should see the link <links in header> is displayed in the header
    When I click on the link <links in header>
    Then I should be navigated to the <links in header> page

    Examples: 
      | links in header |
      | How it works    |
      | Shop now        |
      | About us        |
      | FAQ             |
      | Sign In         |

  Scenario: Verify the functionality of Sign Up button in the header
    Then I should see the Sign Up button should display in header
    When I click on the Sign Up button it should takes me to the Sign Up page

  Scenario Outline: Verify the functionality of socia media icon in header
    Then I should see the <social media icons> is displayed in header
    When I click on the <social media icons>
    Then I should be navigated to the Shop N Zip's <page> page

    Examples: 
      | social media icons | page     |
      | Facebook icon      | Facebook |
      | Twitter icon       | Twitter  |

  #Negative
  Scenario: Verify the availability of Sign Up button in the header(After user log in)
    When I signed in
    Then I should not see the Sign Up button display in header

  Scenario: Verify the availability of Sign In link in the header(After user log in)
    When I signed in
    Then I should not see the Sign In link display in header
