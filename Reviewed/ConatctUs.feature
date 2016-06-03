Feature: Contact us

  Background: 
    Given I am in home page

  #Availability
  Scenario: Verify the availability of "Contact Us" link in the footer
    Then I should see the "Contact Us" link in the footer

  Scenario: Verifying available sections in contact us page
    When I clicked on "contact us" option in page
    Then I should see the following sections
      | Live chat with us                   |
      | Send us your feedback bout the site |

  #Functionality
  Scenario: Verifying functionality of "contact us" link in footer
    When I click on "contact us" in footer
    Then I should be able to redirected on " Contact us" page

  Scenario: Verifying  functionality of "Chat now"  in live chat with us
    When I clicked on "chat now" button under "live chat with us option"
    Then I should be able to see a window where I can do chat

  Scenario: Verifying  functionality of "send your feedback"  in live chat with us option in reloading page
    When I clicked on "send your feedback " button under "send your feedback about site"
    Then I should be able to see a window where I can send my feedback about the site
