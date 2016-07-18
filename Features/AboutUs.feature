@dailyRun
Feature: About Us
  
  As a user I should be able to navigate to 'About Us' page and check the details there

  Background: 
    Given I am in 'About Us' page
    Then I should see 'About Us' link is highlighted in header

  Scenario: Verifying the availability of banner below of header
    Then I should be able to see banner image below of header

  Scenario: Verifying availability of 'About Us' title with contents below of banner in the page.
    Then I should be able to see 'About Us' title with contents below of banner in the page

  Scenario: Verify the availability of rectangular 'Ad Block'
    Then I should see the rectangular 'Ad Block' above the footer


  Scenario: Verify the availability of square 'Ad Block'
    Then I should see the square 'Ad Block' above the footer
