Feature: Test Integer is accepting or not

Background: 
Given the user is now on the portal page

Scenario Outline:
When the user is entering the Username <MobileNumber>
And the user is entering the Password as <Password>
And User Clicks on signIn button
Then the user is now on the Home page module

Examples:
|MobileNumber|Password|
|7709631|12345|
|9689989|123234|
