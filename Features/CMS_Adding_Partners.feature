Feature: Adding content in custom table for 'shop n zip partners'.
  As a admin user I able to add content for 'shop n zip partners'.

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

  Scenario: Adding new partner logo under 'Shop N Zip partners' .
    Given: I am in custom table data page

    When I click on edit option of 'Shop N Zip Partners'
    Then I should see 'Shop N Zip' partners page under custom table.
    And I should see all available partners list with 'Edit' and 'Delete' button.
    And I should see 'New items' button at top of the page.
    When I click on "New items' button
    Then I should redirected to the 'New items' page.
    And I should see 'Partner name' text field in 'New items' page.
    And I should see 'Logo' box with 'Select' option in 'New items' page.
    And I should see 'Save' button in 'New items' page.
    When I enter the name of partner in 'New items' page.
    And I click on 'Select' option of logo field.
    Then I should see New  cms window  with 'upload' and 'select' option under 'shop n zip partners,new items'.
    Then I should see available images under 'media library'
    When I click on 'testing' under media library
    Then I should see all uploaded images are displaying under medial library under testing.
    When I click on related partner logo image.
    Then logo  image should be appeared in window.
    When I click on 'Select' option .
    Then I should be switched on main 'new items' window under 'shop n zip partners'.
    Then I should see image url box is fieled with selected image url.
    When I click on 'Save' button.
    Then I should see 'the page has been saved'.
    When I click on 'Shop N Zip Partners' in menu link in 'new items' page.
    Then I should be redirected on 'Shop N zip Partners' page.
    And I should see added partner name and details in 'Shop N Zip Partners' page with latest Item Id' number.
    And I should see added logo in front end of the site.
