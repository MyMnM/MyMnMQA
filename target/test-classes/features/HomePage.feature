
Feature: Verify multiple scenarios on Home Page
Background:
Given I open the given website
Then verify the Url

   @HomePage @P1 @P1US  @P1UKLive
   Scenario:Verify click on logo of the website is working and redirect on home page        
    When I click on logo of the website 
    Then  it redirects me to the Home Page
    
    @HomePage @P1 @P1US  @P1UKLive
  	Scenario Outline:Verify search bar is working and give auto suggestions for what user types eg:product name   
    When I enter the value "<search>"in Search bar
    Then  give auto suggestions for what user types
    
    Examples:
    |search   |
    |dispenser|
    
    
    @HomePage @P1
    Scenario:Verify flag icon is clickable and on clicking any country it redirects to specific country site    
    When I click on flag icon
    Then it redirects to specific country site
    
    @HomePage @P1 @P1US  @P1UKLive
    Scenario: Verify lite Login icon is clickable and working fine    
    When I click on Login icon
    Then it opens new Shopper Window
    
    
    @HomePage @P1 @P1US  @P1UKLive
    Scenario:Verify cart icon is present and on hovering icon should show the items present in cart    
    When I hover on the cart icon
    Then it shows the cart contents
    
    @HomePage @P1 @P1US  @P1UKLive
    Scenario:Verify Design your own button redirects to fluid page    
    When I click on Design your own button
    Then it redirects to fluid page
    
    @HomePage @P1 @P1US
    Scenario:Verify all the parent categories are visible and redirects to specific page   
    When I click on shopByCategory menu
    Then it redirects to shopByCategory page
    When I click on inspiration menu
    Then it redirects to inspiration page
    When I click on experienceM&M menu
    Then it redirects to experienceM page
    When I click on forYourBusiness menu
    Then it redirects to forYourBusiness page
    
    @HomePage @P1 @P1US
    Scenario:Verify Sub-categories under parent categories are visible and redirects to specific page   
    When I click on gifts sub category under Shop By Category
    Then it redirects to its specific page
    
    @HomePage @P1 @P1US
    Scenario:Verify all footer links are working and on clicking links user is redirected to specific page
    When I click on Contact us
    Then it redirects to Contact us page
    When I click on Order Status
    Then it redirects to Order Status page
    When I click on FAQ
    Then it redirects to FAQ page
    When I click on site Map
    Then it redirects to site Map page
    
    @HomePage @P1 @P1US  @P1UKLive
    Scenario:Verify in footer social icons are visible and on clicking redirects to specific social page 
    When I click on Facebook link
    Then it redirects to Facebook page
    
    When I click on Twitter link
    Then it redirects to Twitter page
    
    When I click on Youtube link
    Then it redirects to Youtube page
    
    When I click on PinInterest link
    Then it redirects to PinInterest page
    
    When I click on Instagram link
    Then it redirects to Instagram page
    
    @HomePage @P1 @P1US  @P1UKLive
    Scenario Outline:Verify sign up form is visible in footer and on filling valid email it redirects to email sign up page
    When I fill valid email as "<email>" and click on sign up in footer
    Then it redirects to email sign up page
    
    Examples:
    |email            |
    |test141@gmail.com|
    
    
    @HomePage @P1 @P1US  @P1UKLive
    Scenario Outline:Verify login is working and user is able to login
    When I click on Login icon
    And I enter username as "<email>" and password as "<password>"
    And I click on Sign in button
    Then I am successfully logged in 
    
    Examples:
    |email                      |password      |
    |mmsuk@gmail.com            |automation@123|
    
    @HomePage @P1 @P1US  @P1UKLive
    Scenario Outline:Verify user is able to register and subscribe from new shopper in login lite
    When I click on Login icon
    And I click on Create an Account
    And I enter username as "<username>" password as "<password>" and Re-enter password as "<password>"
    And I click on email subscribe check box
    And I click on Sign Up button
    Then My Account title is visible
    
    Examples:
    |username                      |password      |
    |asdef@gmail.com               |automation@123|
    
    @HomePage @P1 @P1US  @P1UKLive
    Scenario:Verify forgot password is working in lite login screen  
    When I click on Login icon
    When I click on Forgot your Password
    Then it redirects to page having Forgot your password heading
    
    @HomePage @P1 @P1US  @P1UKLive
    Scenario:Verify All the validation error message is coming in lite login if put wrong data in fields or for empty fields  
    When I click on Login icon
    And I click on Sign in button
    Then it should display the validation error message
    When I enter email id in wrong format
    And I click on Sign in button
    Then it should display appropriate error message
    When I enter incorrect password for valid email id
    And I click on Sign in button
    Then appropriate error message should be displayed
    When I enter correct password for invalid email id
    And I click on Sign in button
    Then respective error message should be displayed
    
    @HomePage @P1 @P1US  @P1UKLive
    Scenario Outline:Verify login is working and user is able to login
    When I click on Login icon
    And I enter username as "<email>" and password as "<password>"
    And I click on Sign in button     
    When I click on logout 
    Then it logged out successfully
    
    Examples:
    |email                      |password      |
    |mmsuk@gmail.com            |automation@123|
    
    
    
    

    
    
    
    
    
    
    
    
    
    
