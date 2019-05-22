
Feature: Verify multiple scenarios on Cart Page
Background:
Given I open the given website
Then verify the Url


@Cart @P1
Scenario:Verify product image and product name is displaying in cart page
When I navigate to normal product page
Then Add to cart button is visible
When I click on cart button
Then product gets added to global cart
When I click on View cart button
Then it navigates to basket page
Then product image and product name is displaying in cart page


@Cart @P1
Scenario:Verify Item / Quantity / Price / Item Total/Subtotal/Total fields and Product code is displaying in cart page
When I navigate to normal product page
Then Add to cart button is visible
When I click on cart button
Then product gets added to global cart
When I click on View cart button
Then it navigates to basket page
Then Item / Quantity / Price / Item Total/Subtotal/Total fields are displaying in cart page

@Cart @P1
Scenario:Verify Product code is present under every product present in cart page
When I navigate to normal product page
Then Add to cart button is visible
When I click on cart button
Then product gets added to global cart
When I click on View cart button
Then it navigates to basket page
Then Product code is present under every product present in cart page

@Cart @P1 @P1US
Scenario:Verify edit customization showing for customized products
When I navigate to customised product
And I click on Personalize button
And I close the pop up window
When I select a color of the product
Then I click on Add to Cart button
Then it displays Edit Customization option


@Cart @P1 @P1US
Scenario:Verify preview link visible and clickable for customize products
When I navigate to customised product
And I click on Personalize button
And I close the pop up window
When I select a color of the product
Then I click on Add to Cart button
Then it displays Preview link

@Cart @P1
Scenario:Verify on increasing/decreasing the quantity of the product will also update the total price 
When I navigate to customised product
And I click on Personalize button
And I close the pop up window
When I select a color of the product
Then I click on Add to Cart button
When I increment the quantity by clicking on plus sign
Then Item total gets increased accordingly
When I decrement the quantity by clicking on minus sign
Then Item total gets decreased accordingly


@Cart @P1 @P1US
Scenario:Verify there should be text written Tax & Shipping Calculated at Checkout written above total and subtotal
When I navigate to customised product
And I click on Personalize button
And I close the pop up window
When I select a color of the product
Then I click on Add to Cart button
Then Tax & Shipping Calculated at Checkout is present


@Cart @P1 @P1US
Scenario:Verify remove link displays and user is able to remove particular product from cart
When I navigate to customised product
And I click on Personalize button
And I close the pop up window
When I select a color of the product
Then I click on Add to Cart button
When I click on Remove link
Then item gets removed from the cart

@Cart @P1 @P1US
Scenario:Verify the coupon code field displays with apply button and is working fine
When I navigate to customised product
And I click on Personalize button
And I close the pop up window
When I select a color of the product
Then I click on Add to Cart button
When I enter valid coupon code and click on Apply
Then Coupon code gets applied
When I click on Remove link to remove coupon code
Then coupon code applied is removed

@Cart @P1 @P1US
Scenario:Verify error messeges displays if user enters wrong/invalid coupon code 
When I navigate to customised product
And I click on Personalize button
And I close the pop up window
When I select a color of the product
Then I click on Add to Cart button
When I enter invalid coupon Code
Then it displays appropriate error message

@Cart @P1 @P1US
Scenario:Validate checkout button is working and redirect user to Checkout screen
When I navigate to customised product
And I click on Personalize button
And I close the pop up window
When I select a color of the product
Then I click on Add to Cart button
When I click on Checkout button
Then it redirects to Checkout Page

@Cart @P1 @P1US
Scenario:Validate continue shopping button is working fine
When I navigate to customised product
And I click on Personalize button
And I close the pop up window
When I select a color of the product
Then I click on Add to Cart button
When I click on Continue Shopping button
Then it navigates to Home Page

@Cart
Scenario:Verify coupon discount applied at Cart page is showing at summary section of Checkout Page
When I navigate to customised product
And I click on Personalize button
And I close the pop up window
When I select a color of the product
Then I click on Add to Cart button
When I enter valid coupon code and click on Apply
Then Coupon code gets applied
And I fetch order level discount at Cart page
When I click on Checkout button
Then it redirects to Checkout Page
Then Order level discount should match with cart page discount











