
Feature: Verify multiple scenarios on Global Cart Page
Background:
Given I open the given website
Then verify the Url

@GlobalCart @P1
Scenario:Verify Your Shopping basket is empty is displaying if cart has no products   
When I hover on the cart icon
Then it displays Your Shopping basket is empty

@GlobalCart @P1
Scenario:Verify on clicking add to cart button on product detail page/quick shop page products gets added to global cart   
When I navigate to normal product page
Then Add to cart button is visible
When I click on cart button
Then product gets added to global cart

@GlobalCart
Scenario:Verify quantity / price each / price / Subtotal is displaying correct in global cart   
When I navigate to normal product page
Then Add to cart button is visible
When I click on cart button
Then quantity / price each / price / Subtotal is displaying correct in global cart
Then item level discount is applied and total is calcualated for that particular item after deducting item level discount

@GlobalCart @P1
Scenario:Verify view cart button and checkout button and save Cart is working in global cart 
When I navigate to normal product page
Then Add to cart button is visible
When I click on cart button
Then product gets added to global cart
When I click on View cart button
Then it navigates to basket page
When I click on checkout button
Then it navigates to Checkout page
When I click on Save Cart button
Then it displays login menu.

@GlobalCart @P1
Scenario Outline:Verify on clicking checkout button it redirects to checkout page - For registered user
When I click on Login icon
And I enter username as "<email>" and password as "<password>"
And I click on Sign in button
Then I am successfully logged in
When I navigate to normal product page
Then Add to cart button is visible
When I click on cart button
Then product gets added to global cart
When I click on checkout button
Then it navigates to Checkout page

    
Examples:
|email                      |password      |
|mmsuk@gmail.com            |automation@123|

