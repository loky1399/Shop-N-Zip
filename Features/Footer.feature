@dailyRun
Feature: Footer  Header
  
  As a user, I should see the Footer  will be same for all the pages is in the application

  #Availability
  Background: 
    Given I am in home page

  Scenario: Verify availability of Footer
    Then I should see the footer section in the home page.

  Scenario: Verify background color  of Footer
    Then I should see the footer section in 'Black' background color.

  Scenario: Verifying the availability of Elements present in footer.
    Then I should see <Elements> in footer.
      | Elements                                      |
      | Shop N zip logo which should not be clickeble |
      | All Rights Reserved -@2015                    |
      | Provided by ABS-CBN International             |
      | Terms and conditions                          |
      | Contact Us                                    |
@test
  Scenario: Verifying the displaying elements color in footer.
    Then I should be able to see <Elements> elements in <Color> color.
      | Elements                                      | Color        |
      | Shop N zip logo which should not be clickeble | Gray color   |
      | All Rights Reserved -@2016                    | Gray color   |
      | Provided by ABS-CBN International             | Gray color   |
      | Terms and conditions                          | Orange color |
      | Contact Us                                    | Orange color |

  Scenario Outline: Verify the links available in footer
    Then I should see the <links in footer> link is displayed in the footer.

    Examples: 
      | links in footer       |
      | Tearms and Conditions |
      | Contact Us            |

  Scenario: Verifying functionality of 'Terms and Conditions ' link in footer.
    When I clicked on 'Terms and Conditions ' link in footer.
    Then I should be redirected on 'Terms and Conditions' page of Shop N Zip.


  Scenario: Verifying functionality of 'Contact Us' link in footer.
    When I clicked on 'Contact Us ' link in footer.
    Then I should be redirected on 'Contact Us' page of Shop N Zip.
