
Feature: Verify multiple scenarios on Fluid Page
Background:
Given I open the given website
Then verify the Url
When I navigate to customised product
And I click on Personalize button
And I close the pop up window

@Fluid @P1
Scenario:Verify user is able to select options and packaging
When I select a color of the product
When I click on Add ClipArt 
And I select clipArt image
When I click on Add Text
And enter the desired text
When I click on Packaging information
And I select desired packaging

@Fluid @P1
Scenario:Verify that after selection of packing user can update the minimum quantity
When I select a color of the product
When I click on Add ClipArt 
And I select clipArt image
When I click on Add Text
And enter the desired text
When I click on Packaging information
And I select desired packaging
When I update Quantity after selection of packing
Then Subtotal also gets updated

@Fluid
Scenario Outline:Verify that user can save design while clicking over save design button
When I select a color of the product
And I click on Save Design button
And I open the saved design in new tab
And I close the pop up window
Then I verify that the deign is same
When I click on Save To Account
And I enter username as "<email>" and password as "<password>"
And I click on Sign in button
Then the design gets saved successfully.

Examples:
|email                      |password      |
|mmsuk@gmail.com            |automation@123|

@Fluid @P1
Scenario:Verify that option of printing saved design is working fine, User is able to print the saved design
When I select a color of the product
When I click on Print button
Then it displays Print popUp

@Fluid @P1
Scenario:Verify that reset button functionality is working fine
When I select a color of the product
And I click on Reset button
Then it should reset it

@Fluid
Scenario:Verify that Edit customization link takes user back to design page and user can edit customization and update cart on clicking update cart button
When I select a color of the product
Then I click on Add to Cart button
Then it displays Edit Customization option
When I click on Edit Customization option
And I close the pop up window
And I edit the customisation on Design page
Then I update cart on clicking update cart button
Then it navigates to basket page




