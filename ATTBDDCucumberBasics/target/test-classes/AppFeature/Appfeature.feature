Feature: Amazon Application

Scenario: Verify the title of the page
Given user is now on the amazon page
Then the title should contains the text "Shopping"

Scenario: Verify Add to cart button present on the page
Given user is now on the amazon page
Then the add to cart button should be present

Scenario: Verify the sign in functionality of amazon
Given user is now on the amazon page
When user perform mouse hover on the signInHover element
And user click on the SignInBtnAfterHover element
And user add the username as "+917709631644"
And user add the password as "7709631644"
And user click on continue button
And user click on sign in button
Then User login Successfully
