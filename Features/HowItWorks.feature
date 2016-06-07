Feature: How It Works

  Background: 
    Given I am in 'How It Works' page
    Then I should see 'How It Works' link is highlighted in Header

  #Availability
  Scenario: Verifying availability of 'How It works' title along with steps in page.
    Then I should be able to see steps on screen.
      | 1.Shop online    |
      | 2.Ship to Us     |
      | 3.Get your goods |

  Scenario: Verifying availablity of steps link with short definition in page.
    Then I should be able to see steps link with short definition vertically in page.
      | 1.Shop online    |
      | 2.Ship to Us     |
      | 3.Get your goods |

  Scenario: Verifying the availablity of 'Ad slot' above footer
    And I should see 'Ad slot' above footer

  Scenario: Verifying the availablity of 'Ad slot' besides the links in body
    And I should see 'Ad slot' besides the links in body