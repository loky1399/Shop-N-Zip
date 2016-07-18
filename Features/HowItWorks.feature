@dailyRun
Feature: How It Works

  Background: 
    Given I am in 'How It Works' page
    Then I should see 'How It Works' link is highlighted in Header

  #Availability
  Scenario Outline: Verifying availability of 'How It works' title along with steps in page.
    Then I should be able to see <steps> steps on screen.

    Examples: 
      | steps            |
      | 1.Shop online    |
      | 2.Ship to Us     |
      | 3.Get your goods |

  Scenario Outline: Verifying availablity of steps link with short definition in page.
    Then I should be able to see steps link with short definition <short definition of steps> vertically in page.

    Examples: 
      | short definition of steps                                                                                                                                                                                                          |
      | Sign up to the Shop n Zip website. Shop at any U.S. online store or any online merchant that delivers to the U.S. and have your items delivered to our California warehouse. We'll send you an e-mail when we receive your item/s. |
      | 2.Ship to Us                                                                                                                                                                                                                       |
      | 3.Get your goods                                                                                                                                                                                                                   |

  Scenario: Verifying the availablity of 'Ad slot' above footer
    And I should see 'Ad slot' above footer

  Scenario: Verifying the availablity of 'Ad slot' besides the links in body
    And I should see 'Ad slot' besides the links in body
