Feature: Product order/cancel order functionality

@regression
Scenario: order functionality
Given user on the login page
When user get logged in
Then user on the home page
When ser click on order link
And user on the order page
Then user shows order details

@sanity
Scenario: Order Cancel functionality
Given user on the login page
When user get logged in
Then user on the home page
When ser click on order link
And user on the order page
Then user shows order details
When the user clicks cancel button
Then order Should cancel

