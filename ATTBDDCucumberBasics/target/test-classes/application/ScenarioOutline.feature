Feature: Scenario Outline functionality

Background: 
Given the user is now on the portal page

Scenario Outline: User Should able to signup With different details
When the user enters the UserName as "<Name>"
And the user entered the Password as "<Password>"
And the User click on SignIn button for signup
Then The user is now on HomePage Module

Examples:

|Name|Password|  
|Ashutosh|Bhujbal|
|Vishnu|Soundhiya|

