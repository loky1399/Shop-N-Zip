Feature: My profile page

  Background: 
    Given I am in home page
    When I logged In
    And I clicked on my username drop-down in header
    And I selected  'My Profile' from drop down option
    Then I should redirected to 'My Profile' page


#Availablity
  Scenario: Verifying available details in page
    Then  I should be able to see these available details in page <Fields>.

       |Fields|
      | Profile heading with Name    |
      | Email                        |
      | phone                        |
      | country of current residence |
      | Socila sharing icons         |
      | Edit profile option          |
      
   Scenario: Verifying available fields in 'Edit profile page'
    When I clicked on 'Edit profile' link

    Then I should be able to see these fields in 'Edit profile' page<fields>
    |fields|
    |Edit Profile|
      |uneditable  Email id                              |
      | Change password option                         |
      |First  Name text box                                  |
      |Last name|
      |Address|
      | Phone number text box                          |
      |City|
      |State drop down|
      |Zip code|
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
      Scenario Outline: Verifying the validation message with invalid data in fields.
      When I entered <inalid data> in <Field>.
      Then I should validation message <Error message> for <Fields>
      Examples:
      |Field|  inalid data| Error message|
      |Phone |more than twelve digit||Not a valid phone number|
      |phone|less than ten digit|Not a valid phone number|
      | Phone|alfanumeri data should not be excepted|not be excepted|
      |Zip code|more than six digit|Not a valid Zip code|
      |Zip code|less than four digit|Not a valid Zip code|
      |Zip code|alfanumeric| Not a valid zip code|
   # Scenario Outline: Validating 'name'text box in 'Edit profile'
    #Given: I clicked on 'Edit profile' link
    #When I entered <data> in name text box
    #And click on save button
    #Then It should be <result>

   # Examples: 
    #  | data         | result      |
     # | Valid name   | Accepted    |
      #| Invalid name | notaccepted |
      
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
    And Social sharing icons <Socila sharing icon> is displaying with 'Connect' title <Icon with text connect>.
    When I clicked on 'Connect' title  below of <Socila sharing icon> when user is not logged in with respective  socila sharing sites
    Then I should be able to redirected on new popup on my screen <Result page>

    Examples: 
      | Socila sharing icon |Icon with text connect| Result page         |
      | Facebook sharing    |connect title| facebook login page |
      | Twitter sharing     |connect title| Twitterlogin page   |
      | G+ socila sharing   |connect title| G+ login page       |

 Scenario Outline: Verifying functionality of socila sharing icons in my profile page
    Given I clicked on 'Edit profile' link
    And Social sharing icons <Socila sharing icon> is displaying with 'Connect' title <Icon with text connect>.
    When I clicked on 'Connect' title  below of <Socila sharing icon> when user is logged in with respective  socila sharing sites
    Then I should be able to see new open window with 'close window' option.
    When I click on 'close window' option
    Then  I should be able to see,status is 'Disconnect'  with respective icons <Socila sharing icon>.

    Examples: 
      | Socila sharing icon |Icon with text connect| Result page        |
      | Facebook sharing    |connect title| facebook home page |
      | Twitter sharing    |connect title| Twitter home  page |
      | G+ socila sharing   |connect title| G+ home page       |
Scenario: Verify the save functionality.
 Given I clicked on 'Edit profile' link
 And I maked some changes in data(optional)
 When I click on 'save' buuton.
 Then I should see 'Successfully Updated your Profile ' message at top of the page.
 Scenario Outline: Verifying connected social sharing icons in 'my profile' page.
 Given I clicked on 'Edit profile' link
 When I check  <Social sharing icon> with 'Disconnect' title.
 And I click on 'back' button in edit profile page.
 Then I should redirected to the 'my profile' page.
 And I should see <Social sharing icon> under 'Social Profiles:'
 Examples:
 | Social sharing icon|
 |Face Book|
 |Twitter|
 |g+|
 Scenario Outline: verifying the functinality of 'Social Profiles:' icons when user  is not  logged in with social sites.
 When I click on <Social sharing icon> under 'Social Profiles:' in 'My profile' page.
 Then I should redirected on page <result>
 
Examples:
|Social sharing icon|result|
| Facebook sharing    | facebook login page |
 | Twitter sharing     | Twitterlogin page   |
| G+ socila sharing   | G+ login page       |
 Scenario Outline: verifying the functinality of 'Social Profiles:' icons when user  is   logged in with social sites.
 When I click on <Social sharing icon> under 'Social Profiles:' in 'My profile' page.
 Then I should redirected on page <result>
 Examples:
|Social sharing icon|result|
| Facebook sharing    | facebook home page|
 | Twitter sharing     | Twitter home  page  |
| G+ socila sharing   | G+ home page     |
Scenario: Verifying the 'Change password' link in edit profile page
Given I clicked on 'Edit profile' link
When I click on 'Change password' link under 'edit profile ' page.
Then I should be redirected to the 'Change password' page under 'My profile' .