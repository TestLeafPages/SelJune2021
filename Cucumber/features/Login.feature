Feature: Login functionality of LeafTaps

Background:
Given Open the chrome browser
And Load the application url

Scenario Outline: Login with positive data
Given Enter the username as <username>
And Enter the Password as <password>
When Click login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


Scenario: Login with negative data
Given Enter the username as 'Demosalesmanager'
And Enter the Password as 'crmsfa123'
When Click login button
But Error message should be displayed



