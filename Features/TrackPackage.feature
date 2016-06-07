Feature: Track package
  
  As a user I want to track my package then I can know the status of my package in shipping

  #Availability
  Scenario: verify availability of "Track Package" option in home page
    Given I am in home page
    Then I should see "Track your Package" block in home page

  Scenario: verify availability of "Track Package" option in User name drop down in header
    Given I am in home page
    And I signed In
    When I click on User name drop down in header
    Then I should see "Track your Package" option displayed in the dorp down menu

  Scenario: Verifying state of "track now" button of "track your package" section in home page
    Given I am in home page
    Then I should see "Track now" button should is enabled
    
    Scenario: Verify the availabile details of an order in "Track Package" page
   Given I am in home page
    And I signed In
    And I have plcaced an order before 
    When I click on User name drop down in header
    Then I should see "Track your Package" option displayed in the dorp down menu
    And I should see the following details
    |Order Placed date|
    |Order details|
    |Order details: Date shipped|
    |Order details: Method of shipment|
    |Order details: Weight|
    |Order details: Status|
    |Order Reference number|
    |Track Package button|

  #Positive
  Scenario: Verifying  functionality of "track your package" with valid tracking ID (without log in)
    Given I am in home page
    When I entered valid Order/Tracking number
    And I clicked on "Track Now" button
    Then I should be navigated to "Track Package" page
    And Order details should be displayed as below
      | Tracking information ID |
      | Order details heading   |
      | Packaging size          |
      | weight                  |
      | Method of shipping      |
      | Status                  |
    And I should see log in option
    And I should not see Tracking in graphical view

  Scenario: Verifying  functionality of "track your package" (with log in) from home page
    Given: I am in home page

    And I logged in
    When I entered valid "Id"
    And I clicked on "Track Now" button
    Then I should be able to redirected on "Track package" page
    And I should be able to see items  details which are yet to be delivered with shipment details as well
    And I should be able to see tracking package status in graphical view

  Scenario: Verifying  functionality of "track your package" (with log in) from My Items option in user menu
    Given: I am in home page

    And I logged in
    When I Click on My Items option in user drop down in header
    Then I should be redircted to list of items page
    When I clicked on "Track Now" button
    Then I should be able to redirected on "Track package" page
    And I should be able to see items  details which are yet to be delivered with shipment details as well
    And I should be able to see tracking package status with "status bar" on my screen

  Scenario: Verifying functionality of "track package" button in track package page
    Given I am in home page
    And I logged in
    And I should have at least 1 item
    When I Click on My Items option in user drop down in header
    And I clicked on "Track your package" drop down option under my user name in menu grids
    When I clicked on "Track package" button in "track package" page
    Then I should be able to redirected on "track package" page where tracking information of respective items should be displayed with shipment details in pahe

  #Negative
  Scenario: Verifying  functionality of "track your package" with invalid tracking ID (without log in)
    Given I am in home page
    When I entered invalid Order/Tracking number
    And I clicked on "Track Now" button
    Then I should be able to see error message "Not found! Shop N Zip could not locate the tracking information for your request  Please verify your trackig number and  try again later" in text box in red color
