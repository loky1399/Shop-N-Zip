@dailyRun
Feature: Shop Now page

  Background: 
    Given I am in 'Shop Now' page
    Then I should see 'Shop Now' is highlighted in header
  #Availablity

  Scenario: Verifying availability of 'Shop n Zip Deals' title all the 3rd party links which are in tie-up with Shop N Zip
    Then I should be able to see  'Shop n Zip Deals' title with all the 3rd party links which are in tie-up with Shop N Zip

  Scenario: Verifying availability of deals list
    Then I should be able to see list of  deals

  Scenario: Verifying the maximum number deals displayed #it needs to be finalized
    Then I should be able to see maximum 7
  
  Scenario: verify the availability of ad slots
    Then I should see two ad slots in the page

  #Possitive

  Scenario: Verifying functionality of 3rd party website links which are in tie-up with Shop N Zip
    When I clicked on 3rd party links which are in tie-up with Shop N Zip
    Then I should see links are not clickable
  @MyTest
  Scenario: Verifying the functionality  deals displayed
    When I clicked on any items
    Then I should be able to redirected on respective item page
  #Negative
  
   Scenario: Verifying functionality of 3rd party website links which are in tie-up with Shop N Zip
    When I clicked on 3rd party links which are in tie-up with Shop N Zip
    Then I should see links are not clickable
