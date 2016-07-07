Feature: Adding content in CMS for 'Shop N Zip Steps".
As a admin user I should be able to add contents for 'Shop N Zip Steps" in CMS.
Background: 
    Given I entered 'cms url' in browser and click on go.
    When I Entered my cms user name in 'user name' text field.
    And I Entered my cms admin password in 'password' text field.
    And I clicked on login
    Then I should see 'shopnzip' dashboard on my screen.

  Scenario Outline: Verify the available icons on the dashboard.
    Then I should see <icons> icons in page.

    Examples: 
      | icons             |
      | Pages             |
      | custom table data |
      | Media library     |

  Scenario: Verify the functionality of 'custom table data' icon in dash board.
    When I click on  'custom table data' icon on dash board.
    Then I should see the 'custom table data' with edit option page on my screen.
 And I should see 'List of page items' in 'custom table data' page.
 Scenario: Adding Step under 'Shop N zip steps' page in custom table.
 Given I am in  custom table.
 When I click on edit option of 'Shop N Zip steps' in custom table.
 Then I should be redirected to the 'Shop N Zip steps' page under custom table.
 And I should see list of all available steps with their details.
 And I should see 'New items' button in green color at top of the 'Shop N zip steps' page.
 When I click on 'New items' button of the 'Shop N zip steps' page.
 Then I should be redirected to the 'New items' page under the 'Shop N zip steps' page
 And I should see 'Step title' text box in  'Shop N zip steps , new items' page.
 And I should see 'Step teaser text box'in  'Shop N zip steps , new items' page.
 And I should see 'Step description text box' in  'Shop N zip steps , new items' page.
 And I should see 'step order' box with up and down arrow in  'Shop N zip steps , new items' page.
 And I should see 3 'title color radio button' in  'Shop N zip steps , new items' page.
 When I enter the step title in 'steps title' text box.
 And I enter short description in 'Step teaser text' box.
 And I enter Description of step under 'Description' text box.
 And I select order as '1' by arrow.
 And I selects 'cadetblue' as  title color by radio button.
 And I click on 'save' button.
 Then I should see a message 'the page has been saved' on my screen.
 When I click on 'Shop N zip steps' in  menu.
 Then I should redirected on 'Shop N Zip steps' page.
 When I click on edit button of  the article which will be having '1' order in list.
 Then I should be redirected to the edit page of respective step.
 When I select '4' as order by up arroe.
 And I click on 'Save' button.
 Then I Should see a message 'the  edit page has been saved'
 Then I should see the added step in fron end of the site.