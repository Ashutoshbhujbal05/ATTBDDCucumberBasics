Feature: Profile picture Functionality

Scenario: upload profile picture
Given the user is on application WebPage
When the current user logs in
And the user click on upload profile pic element
And the user select the picture
And the user click on submit buttom element
Then the user shows success msg element
