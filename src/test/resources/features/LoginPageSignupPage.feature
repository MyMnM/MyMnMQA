
Feature: Verify multiple scenarios on Login pageSign up Page
Background:
Given I open the given website
Then verify the Url

@LoginSignUp @P1
Scenario:Verify validation message displays for empty/invalid details on Sign Up
When I click on Login icon
And I click on Create an Account
And I click on Sign Up button
Then it displays the error messages
When I enter email id in wrong format on Sign up page
And I click on Sign Up button
Then it should display appropriate error message
When I enter Password and ReEnter Password with different values
And I click on Sign Up button
Then it should display password error message

@LoginSignUp @P1
Scenario Outline:Verify sign up form for already registered user
When I click on Login icon
And I click on Create an Account
When I input username as "<username>" password as "<password>" and Re-enter password as "<password>"
And I click on Sign Up button
Then it should display already existing account error message
Examples:
|username                      |password      |
|mmsuk@gmail.com               |automation@123|
