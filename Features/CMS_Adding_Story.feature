Feature: Adding content in 'shop n zip stories'.
As a admin user I should be able to add contents in CMS for 'shop n zip stories'.
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
    Scenario: Adding new story under 'shop n zip stories' section.
    Given I am in custom table.
  When I click on  edit option of 'shop N zip stories'.
  Then I should see 'shop N zip stories' page under custom table.
  And I should see all available stories list in page with their details.
  And I should see 'New items' button in green color at top of the page.
  When I click on 'New items' button in 'shop N zip stories'.
  Then I should be redirected to the 'new item' page under 'shop n zip stories'.
  And I should see 'title' text box over there in page.
  And I should see 'image box' with 'select' option.
  And I should see 'teaser text box' field in page.
  And I should see 'Description text box' field in page.
  When I enter the customer name under 'title' text box.
 And I click on 'Select' option of image field field.
    Then I should see New  cms window  with 'upload' and 'select' option under 'shop n zip stories,new items'.
    Then I should see available images under 'media library'
    When I click on 'testing' under media library
    Then I should see all uploaded images are displaying under medial library under testing.
    When I click on related partner logo image.
    Then logo  image should be appeared in window.
    When I click on 'Select' option .
    Then I should be switched on main 'new items' window under 'shop n zip partners'
    When I enter the short description text under 'teaser text box' 
    And I enter description under 'description text box'.
    And I click on 'Save' button.
    Then I should see a message of 'the page has been saved'.
    When I click on 'Shop N Zip stories' in menu.
    Then I should be redirected to the 'Shop N Zip' page.
    And I should see the added story in stories list by their details.
    When I click on '^' arrow beside of added article.
    Then I should see added article is moving up by clicking on '^' arrow.
    When I by clicking action added article will reached at either top  1,2,3 or 4 position in list
    Then I should see the added story in fron end(home page) of the site.