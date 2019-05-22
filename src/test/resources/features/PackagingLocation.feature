
Feature: Verify multiple scenarios for Packaging Location
Background:
Given I open the given website
Then verify the Url

@PackagingLocation @P1
Scenario:Verify two products with different packaging location  doesnot gets added to cart
When I navigate to first different location product
Then Add to cart button is visible
When I click on it
Then product gets added to global cart
When I navigate to second different location product
Then Add to cart button is visible
When I click on it
Then it does not get added to Cart and displays Error message

@PackagingLocation @P1
Scenario:Verify two products with same packaging location gets added to cart
When I navigate to normal product page
Then Add to cart button is visible
When I click on cart button
Then product gets added to global cart
When I navigate to customised product
And I click on Personalize button
And I close the pop up window
When I select a color of the product
Then I click on Add to Cart button
Then both the products should be displaying in the cart

