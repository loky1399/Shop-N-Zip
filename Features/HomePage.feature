#Author: lokesh.aakasapu@raybiztech.com
Feature: Verifying the section displayed in the home page

  Background: 
    Given I am in Home Page

  #Availability
  Scenario: Verify the availability of auto slide "Carousel"
    Then I should see a auto slide carousel below the header with five slides

  Scenario: Verify the availability of "Get Started" block
    Then I should see "Get Started" block with 3 stpes

  Scenario: Verify the availability of "Track your package" block
    Then I should see "Track your packag" block with text are to enter package tracking ID

  Scenario: Verify the availability of "Shipping Cost Calculator" block
    Then I should see "Shipping Cost Calculator" block to the estimated cost of the shipment

  Scenario: Verify the availability of "Shop N Zip Deals" block
    Then I should see "Shop N Zip Deals" block that will display the third party shopping sites that are tie up with Shop N Zip

  Scenario Outline: Verify the availability of "Ad block"
    Then I should see "Ad block" <ad blocks>

    Examples: 
      | ad blocks                            |
      | above the track package section      |
      | Below the real stories               |
      | Besides the Shipping Cost Calculator |

  Scenario: Verify the availability of "Real stories" block
    Then I should see "Real stories" block with 4 stories

  Scenario Outline: Verify the availability of "Sign Up" button (when user is not singed in)
    Then I should see "Sign Up" button at <Sign up blocks>

    Examples: 
      | Sign up blocks                 |
      | Carousel                       |
      | Map                            |
      | Below Shop N Zip deals section |
      | Below the Real stories         |

  Scenario Outline: Verify the availability of "Sign Up" button (when user is singed in)
    Then I should not see "Sign Up" button at <Sign up blocks>

    Examples: 
      | Sign up blocks                 |
      | Carousel                       |
      | Map                            |
      | Below Shop N Zip deals section |
      | Below the Real stories         |

  Scenario: Verify the availability of "view deals" button under "shop n zip deals!"
    Then I should see the "view deals" button under "shop n zip deals!"

  #Positive
  Scenario: Verify the functionality of "view deals" button under "shop n zip deals!"
    Then I should see the "view deals" button under "shop n zip deals!"
    When I click on the "view deals" button
    Then I should be redirected to the "Shop Now" page
