Feature: Verify multiple scenarios on MyAccount Page
Background:
Given I open the given website
Then verify the Url

@MyAccount @P1
Scenario Outline:Verify user is able to navigate to account settings after logging with valid credentials
When I click on Login icon
And I enter username as "<email>" and password as "<password>"
And I click on Sign in button
Then I am successfully logged in
And click on Account Settings
Then it navigates to Account settings page

Examples:
|email                      |password      |
|mmsuk@gmail.com            |automation@123|

@MyAccount @P1
Scenario Outline:Verify validation message displays for empty or on entering invalid details in my information and edit information
When I click on Login icon
And I click on Create an Account
And I enter username as "<username>" password as "<password>" and Re-enter password as "<password>"
And I click on email subscribe check box
And I click on Sign Up button
Then My Account title is visible
When I click on edit link
And I click on Save button with all fields empty
Then it should display the validation error message
#When I enter email id in invalid format
#And I click on Save button
#Then it should display appropriate error message
When I update firstName as "<firstName>",lastName as "<lastName>" and email as "<Email>"
And I click on Save button
Then it should gets updated

Examples:
|username                         |password      |firstName |lastName|Email             |
|asdefghi@gmail.com               |automation@123|first     |last    |newEmail@gmail.com|


@MyAccount @P1
Scenario Outline:Verify validation message displays for empty or on entering invalid details in address book
When I click on Login icon
And I enter username as "<email>" and password as "<password>"
And I click on Sign in button
Then I am successfully logged in
And click on Account Settings
Then My Account title is visible
When I click on edit link on My Address Book
And I click on Save with all mandatory fields empty
Then it should display all the appropriate error messages    
Examples:
|email                         |password      |firstName |lastName|Email             |
|mmsuk@gmail.com               |automation@123|first     |last    |newEmail@gmail.com|

@MyAccount @P1
Scenario Outline:Verify user is able to add new address,edit and delete it
When I click on Login icon
And I enter username as "<email>" and password as "<password>"
And I click on Sign in button
Then I am successfully logged in
And click on Account Settings
Then My Account title is visible
When I click on Add new address button
And I enter all the valid values in all the mandatory fields
And I click on Save button
Then it should display new Addresss
When i click on Edit button
And edit the Address
And I click on Save button
Then it should display the updated address
When I click on Delete Address
Then it should delete the address
Examples:
|email                         |password      | 
|mmsuk@gmail.com               |automation@123|


@MyAccount @P1
Scenario Outline:Verify change pasword is working 
When I click on Login icon
And I click on Create an Account
And I enter username as "<username>" password as "<password>" and Re-enter password as "<password>"
And I click on email subscribe check box
And I click on Sign Up button
Then My Account title is visible
When I click on Change Password
And I change the old password as "<old Password>" with  new passowrd as "<new Password>"
And I click on Save button
Then it should display password change success message
And I logout of the application
When I log in again using new password
Then I am successfully logged in

Examples:
|username                         |password      |old Password  |new Password|
|asdefghi@gmail.com               |automation@123|automation@123|newPass     |


@MyAccount @P1
Scenario Outline:Verify on clicking detail link in recent order it opens detail for that particular order
When I click on Login icon
And I enter username as "<email>" and password as "<password>"
And I click on Sign in button
Then I am successfully logged in
And click on Account Settings
Then it navigates to Account settings page
When I click on Order Details
Then it opens detail for that particular order
Examples:
|email                      |password      |
|mmsuk@gmail.com            |automation@123|

@MyAccount @P1
Scenario Outline:Verify on clicking product name in detail section of order it redirects to product page
When I click on Login icon
And I enter username as "<email>" and password as "<password>"
And I click on Sign in button
Then I am successfully logged in
And click on Account Settings
Then it navigates to Account settings page
When I click on Order Details
When i click on product name in detail section
Then it redirects to specific Product page

Examples:
|email                      |password      |
|mmsuk@gmail.com            |automation@123|


@MyAccount @P1
Scenario Outline:Verify save design is working and user is able to save designs for customized products
When I click on Login icon
And I enter username as "<email>" and password as "<password>"
And I click on Sign in button
Then I am successfully logged in
When I navigate to customised product
And I click on Personalize button
And I close the pop up window
When I select a color of the product
And I click on Save Design button
When I click on Save To Account
Then the design gets saved successfully.
When I click on My Account icon
And I click on Saved Design
Then saved design should be present in saved designs panel


Examples:
|email                      |password      |
|mmsuk@gmail.com            |automation@123|






