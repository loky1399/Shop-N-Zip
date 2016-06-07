Feature: My profile page

  Background: 
    Given I am in home page
    When I logged In
    And I clicked on my username drop-down in header
    And I selected  'My Profile' from drop down option
    Then I should redirected to 'My Profile' page


#Availablity
  Scenario: Verifying available details in page
    And I should be able to see these available details in page
      | Profile heading with Name    |
      | Email                        |
      | phone                        |
      | country of current residence |
      | Socila sharing icons         |
      | Edit profile option          |
      
   Scenario: Verifying available fields in 'Edit profile page'
    And: I clicked on 'Edit profile' link

    Then I should be able to see these fields in 'Edit profile' page
      | Email id                              |
      | Change password option                         |
      | Name text box                                  |
      | Phone number text box                          |
      | Country selection drop down field              |
      | Back option                                    |
      | Manage Social profile option with social icons |
      | Save button                                    |
      
#Positive
 Scenario: Verifying functionality of 'Edit profile' option
    When I clicked on 'Edit profile' link
    Then I should be able to redirected on 'Edit profile' page
Scenario: Verifying the status of 'Email'
    Given: I clicked on 'Edit profile' link
        Then I should see it is in disable state(It should not be editable)
    
    Scenario Outline: Validating 'name'text box in 'Edit profile'
    Given: I clicked on 'Edit profile' link
    When I entered <data> in name text box
    And click on save button
    Then It should be <result>

    Examples: 
      | data         | result      |
      | Valid name   | Accepted    |
      | Invalid name | notaccepted |
      
        Scenario Outline: Validating 'Phone number'text box 'Edit profile'
    And: I clicked on 'Edit profile' link
    When I entered <data> in phone number text box
    And click on save button
    Then It should be <result>

    Examples: 
      | data         | result      |
      | Valid name   | Accepted    |
      | Invalid name | notaccepted |
      
      Scenario: Validating country dop down optin 'Edit profile'
    And: I clicked on 'Edit profile' link
    When I clicked on Country drop-down option
    Then I should be able to select country name from displaying drop down option

  Scenario: Validating use of back button 'Edit profile'
    And: I clicked on 'Edit profile' link
    When I clicked on back button
    Then I shoul be able to navigated on 'My profile' page
#Negative

  Scenario Outline: Verifying functionality of socila sharing icons in my profile page
    Given I clicked on 'Edit profile' link
    When I clicked on <Socila sharing icon> when user is not logged in with respective  socila sharing sites
    Then I should be able to redirected on <Result page>

    Examples: 
      | Socila sharing icon | Result page         |
      | Facebook sharing    | facebook login page |
      | Twitter sharing     | Twitterlogin page   |
      | G+ socila sharing   | G+ login page       |

 Scenario Outline: Verifying functionality of socila sharing icons in my profile page
    Given I clicked on 'Edit profile' link

    When I clicked on <Socila sharing icon> when user is logged in with respective  socila sharing sites
    Then I should be able to redirected on <Result page>
    And I should be able to see,status is conned with respective icons

    Examples: 
      | Socila sharing icon | Result page        |
      | Facebook sharing    | facebook home page |
      | Twitter sharing     | Twitter home  page |
      | G+ socila sharing   | G+ home page       |
