#Author:Baby Kumari
Feature: Add contents from CMS master page.
  As a admin user I should be able to add data(contents) in cms.

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

  Scenario: Verify the functionality of page icon in dash board.
    When I click on  page icon on dash board.
    Then I should see the master page on my screen.
    And I should see 'shop N zip' in tree section.

  Scenario Outline: Verifying the available sections under master page tree.
    When I click on '+' icon with 'shop N zip' brach
    Then I should see these <sections> sections under master page tree.

    Examples: 
      | sections               |
      | Home with '+'          |
      | How It works           |
      | Shop Now               |
      | About Us               |
      | FAQ with '+'           |
      | Sign In                |
      | Sign Up                |
      | Social media with '+'  |
      | Special pages with '+' |
      | User with '+'          |
      | page new               |
      | Old tree with '+'      |

  Scenario Outline: Verifying the available headings (menu items)in master page.
    Then I should see <menu items> menu item in reloading page.

    Examples: 
      | menu items           |
      | Page                 |
      | Design               |
      | Form                 |
      | Master page          |
      | properties drop down |
      | Analytics drop down  |

  Scenario Outline: Verifying available button in mater page
    Then I should see these  <buttons> button in mater page.

    Examples: 
      | buttons     |
      | Save button |
      | Archive     |
      | Spell check |

  Scenario: adding carousel image in home page
    When I clicked on 'Home' in content tree
    And I click on '+' icon at top of the content tree
    Then I should see 'new shop N zip carousel' page is opening.

  Scenario Outline: verifying available fields in 'new shop N zip carousel' page.
    Then I should see this <fields> field in 'new shop n zip carousel' page.

    Examples: 
      | fields                             |
      | Mandatory title box                |
      | Image Url box                      |
      | Select option with image title box |
      | Publish from box with calendar     |
      | now option with calendar           |
      | Publish to box with from  calendar |
      | Now option with  to calendar       |
      | Save button                        |
      | Save and create another button     |
      | Spell check button                 |

  Scenario: Verifying the adding  carousel functionality.
    Given I am in 'new shop n zip carousel' page.
    When I enter Title of carousel in 'Title' text box
    When I click on 'select' option of image url
    Then I should see New  cms window  with 'upload' and 'select' option.
    Then I should see available images under 'media library'
    When I click on 'testing' under media library
    Then I should see all uploaded images are displaying under medial library under testing.
    When I click on related carousel image.
    Then carousel image should be appeared in window.
    When I click on 'Select' option .
    Then I should be switched on main 'new shop n zip carousel' window.
    Then I should see image url box is fieled with selected image url.
    When I select from date by calendar
    And I select to date from calendar.
    And I clicked on 'Save' button
    Then I should see 'publish' button in menu
    When I click on 'publish ' button
    Then I should see 'Reject' button instead of publish button in menu.
    And I should see one confirmation message 'the page has been published'.
    And I should see respective added carousel name is displaying with 'green yes' mark in content tree.
    And I should see the added carousel in fron end of the page.

  Scenario: Verifying the red cross mark for unpublished carousel.
    Given I am in 'new shop n zip carousel' page.
    When I enter Title of carousel in 'Title' text box
    When I click on 'select' option of image url
    Then I should see New  cms window  with 'upload' and 'select' option.
    Then I should see available images under 'media library'
    When I click on 'testing' under media library
    Then I should see all uploaded images are displaying under medial library under testing.
    When I click on related carousel image.
    Then carousel image should be appeared in window.
    When I click on 'Select' option .
    Then I should be switched on main 'new shop n zip carousel' window.
    Then I should see image url box is fieled with selected image url.
    When I select from date by calendar
    And I select to date from calendar.
    And I clicked on 'Save' button
    Then I should see  respective added carousel name is displaying with 'red cross' mark in content tree.

  Scenario: Verifying adding carousel functionality without entering title
    Given I am in 'new shop n zip carousel' page.
    When I click on 'select' option of image url
    Then I should see New  cms window  with 'upload' and 'select' option.
    Then I should see available images under 'media library'
    When I click on 'testing' under media library
    Then I should see all uploaded images are displaying under medial library under testing.
    When I click on related carousel image.
    Then carousel image should be appeared in window.
    When I click on 'Select' option .
    Then I should be switched on main 'new shop n zip carousel' window.
    Then I should see image url box is fieled with selected image url.
    When I select from date by calendar
    And I select to date from calendar.
    And I clicked on 'Save' button
    Then I should see 'The entered values cannot be saved. Please see the fields below for details.Title: Please enter a value.' message on my screen.

  Scenario: Verifying adding carousel functionality without entering image url
    Given I am in 'new shop n zip carousel' page.
    When I enter Title of carousel in 'Title' text box
    When I select from date by calendar
    And I select to date from calendar.
    And I clicked on 'Save' button
    Then I should see 'The entered values cannot be saved. Please see the fields below for details.Image Url: Please enter a value.' message on my screen.

  Scenario: Verifying steps to adding contents in FAQs.
    Given I am in master page.
    When I click on 'FAQ'  in content tree.
    And I click on '+' in top of the content tree.
    Then I should see 'new shop n zip FAQ category' page
    Then I should see 'save' button
    And I should see 'save and create another' button.
    And I should see 'spell check' button.
    And I should see 'name' mandatory text box in page
    And I should see  from date by calendar
    And I should see published to calendar.
    When I enter the name in 'name ' text box
    And I click on 'Save' button
    Then I should see 'Published' button on menu.
    When I click on 'publish' button
    Then I should see 'the page has been published'.
    And I should see 'reject' button in place of 'published' button.
    And I should see added FAQ name in content tree under the 'FAQ'
    And I should see added FAQ with green yes mark.

  Scenario: Adding questions under FAQ links.
    Given I created one FAQ link type 'Sample'
    When I click on 'Sample'
    And I click on '+' symbol above the content tree
    Then I should see a page with 'Please select new page type ' heading.
    And I should see 'Shop N Zip FAQ' link option under 'Please select new page type ' heading.
    When I clicked on 'Shop N Zip FAQ' under 'Please select new page type ' heading.
    Then I should see 'new shop n zip FAQs' page with its contens.
    And I should see 'Title' text box.
    And I should see 'Content' text box
    And I should see 'Publish from' calendar option
    And I should see 'Publish to' calendar option.
    When I Enter FAQs title under 'title text box'
    And I Enter Contents in 'Content' text box.
    And I click on 'Save' button.
    Then I should see 'publish' button appearing on screen.
    When I click on 'publish' button
    Then I should see successful message 'the page has been published' .
    And I should see 'reject' option instead of 'publish' option.
    And I should see added faq title under 'sample' with green yes mark.

  Scenario: Verifying the FAQ adding functionality without title entering title.
    Given I created one FAQ link type 'Sample'
    When I click on 'Sample'
    And I click on '+' symbol above the content tree
    Then I should see a page with 'Please select new page type ' heading.
    And I should see 'Shop N Zip FAQ' link option under 'Please select new page type ' heading.
    When I clicked on 'Shop N Zip FAQ' under 'Please select new page type ' heading.
    Then I should see 'new shop n zip FAQs' page with its contens.
    And I should see 'Title' text box.
    And I should see 'Content' text box
    And I should see 'Publish from' calendar option
    And I should see 'Publish to' calendar option.
    When I Enter Contents in 'Content' text box.
    And I click on 'Save' button.
    Then I should see a message 'The entered values cannot be saved. Please see the fields below for details.Title:Please enter a value.' on screen.

  Scenario: Verifying FAQ under content tree without publishing it.
    Given I created one FAQ link type 'Sample'
    When I click on 'Sample'
    And I click on '+' symbol above the content tree
    Then I should see a page with 'Please select new page type ' heading.
    And I should see 'Shop N Zip FAQ' link option under 'Please select new page type ' heading.
    When I clicked on 'Shop N Zip FAQ' under 'Please select new page type ' heading.
    Then I should see 'new shop n zip FAQs' page with its contens.
    And I should see 'Title' text box.
    And I should see 'Content' text box
    And I should see 'Publish from' calendar option
    And I should see 'Publish to' calendar option.
    When I Enter FAQs title under 'title text box'
    And I Enter Contents in 'Content' text box.
    And I click on 'Save' button.
    Then I should see  created FAQ is displaying under 'sample' with red cross mark.
