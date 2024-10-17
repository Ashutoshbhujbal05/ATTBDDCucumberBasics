Feature: Order functionality

Background:
Given the user is now on the portal page


Scenario: Verify ordered product
When the user entered Username as "Ashutosh123"
And the user entered Password as "Ashutosh"
And the user clicks on login button
Then the user is now logged in
And the user is now on the Home Page

When the user click on the order button
And the user click on the order product