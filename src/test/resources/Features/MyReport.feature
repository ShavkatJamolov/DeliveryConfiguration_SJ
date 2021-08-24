@MyReports
  Feature: My Reports
    Scenario: My Reports
      Given I am on the web main page
      And I click to File Center module
      Then I make sure there is no "Myreports" module
      Then I click to user icon
      And I click to "Start Impersonating"
      Then I add "Bob Backline" as an username in box
      And I click to "Start Impersonating" button
      Then I click to Myreports button
      And Im on the Myreports module
      #Then I should be redirected to the Client Center Data Source page
      #And  I click on MyReports button


@AdvancedSearch
  Scenario: Advanced Search
    When I click on Advanced Search
    #And I click on "Status"
    #Then I select "Ready"
    And I select date range From "06/01/2021"
    And I select date range To "08/01/2021"
    Then I click on apply button
   Then My reports should display results for searched criteria







