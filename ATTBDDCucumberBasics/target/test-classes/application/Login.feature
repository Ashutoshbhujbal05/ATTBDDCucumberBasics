Feature: Login Functionality

Scenario: Test the login functionality
Given the user is now on the login page
When the user entered Username
And the user entered Password
And the user clicks on login button
Then the user is now logged in

Scenario: Test the Add to cart button
Given the user is logged in to the application
When the user clicks on the mobile product
And the user clicks on add to cart button
Then the user is now on the payment page