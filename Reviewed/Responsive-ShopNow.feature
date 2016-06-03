Feature: Shop Now page

  Background: 
    Given I entered Shop N Zip url in the borwser and click on go
    And I clicked on "Hamburger" in left corner of header.
    Then I should see "Shop Now " page on my screen with its details.
    When I click on "Shop Now" link

  Scenario: Verifying availability of "Shop n Zip Deals" title with all the 3rd party links which are in tie-up with Shop N Zip
    Then I should be able to see  "Shop n Zip Deals" title with all the 3rd party links which are in tie-up with Shop N Zip
    And I should see two 3rd party links in each row.

  Scenario: Verifying availability of deals list
    Then I should be able to see list of  deals .
    And I shoud be able to see items with respective price in list.

  Scenario: Verifying the maximum number deals displayed #it needs to be finalized
    Then I should be able to see maximum 7

  Scenario: verify the availability of ad slots
    Then I should see three ad slots in the page

  #Possitive
  Scenario: Verifying functionality of 3rd party website links which are in tie-up with Shop N Zip
    When I clicked on 3rd party links which are in tie-up with Shop N Zip
    Then I should see links are not clickable

  Scenario: Verifying the functionality  deals displayed
    When I clicked on any items
    Then I should be able to redirected on respective item page
