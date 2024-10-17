Feature: Home page functionality
Scenario: verify user is now on the Home page
Given the user is now on the portal page
When the user entered Username
And the user entered Password
And the user clicks on login button
Then the user is now logged in
And the user is now on the Home Page