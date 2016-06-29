Feature: Verifying FAQs page.

  Background: This is common for all scenarios.
    Given I am in FAQ page
    Then I should see FAQ link is highlited in header

  #Availability
  Scenario Outline: Verify categories availabile in FAQs page
    Then I should see <Category> category below of 'Shop N Zip FAQs' title.

    Examples: 
      | Category                       |
      | "General Questions"            |
      | "My Account"                   |
      | "My Items"                     |
      | "General Shipping Information" |
      | "Returns"                      |

  @test
  Scenario: Verifying availability of 'Contact Us' link
    Then I should be able to see 'Contact Us' link in page

  Scenario: Verify availablity of ad slots
    And I should see there are three ad slots displayed in the page

  #Possitive
  Scenario Outline: Verify functionality of categories links
    When I clicked on <Each Link> category
    Then I should be moved to the <Each Link> area within the FAQ page

    Examples: 
      | Each Link                    |
      | General Questions            |
      | My Account                   |
      | My Items                     |
      | General Shipping Information |
      | Returns                      |

  Scenario: Verifying functionality of 'Contact Us' link
    When I clicked on 'Contact Us' link
    Then I should be navigated to 'Contact Us' page where I can ask FAQs
