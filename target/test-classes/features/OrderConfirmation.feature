
Feature: Verify multiple scenarios on Order Confirmation Page
Background:
Given I open the given website
Then verify the Url


@OrderConfirmation @P1 @P1US
Scenario:Verify Payment section show following details Order total with payment options,billing email / billing name / billing address,payment details(card/paypal)
When I navigate to normal product page
Then Add to cart button is visible
When I click on cart button
When I click on Proceed to Checkout button
Then it redirects to Checkout Page
When I enter all the mandatory fields of Ship to Section
And I click on Next
And I click on Ship method Next button
When I enter all the mandatory valid information and click on Next button
Then it navigates to Complete Your Order Section
When I click on Place Order button without selecting terms and Conditions
Then it displays error message
When I select terms and conditions
And I click on Place order button
Then Order gets placed successfully
Then Payment section shows Order total with payment options,billing email / billing name / billing address,payment details

@OrderConfirmation @P1 @P1US
Scenario:Verify Order Summary has Product Code,Product details,Product price,Product price total,Price summary section
When I navigate to normal product page
Then Add to cart button is visible
When I click on cart button
When I click on Proceed to Checkout button
Then it redirects to Checkout Page
When I enter all the mandatory fields of Ship to Section
And I click on Next
And I click on Ship method Next button
When I enter all the mandatory valid information and click on Next button
Then it navigates to Complete Your Order Section
When I click on Place Order button without selecting terms and Conditions
Then it displays error message
When I select terms and conditions
And I click on Place order button
Then Order gets placed successfully
Then Order Sumaary section  has Product Code,Product details,Product price,Product price total,Price summary section

@OrderConfirmation @P1
Scenario:Verify order level discount applies on and then order total is calculated
When I navigate to customised product
And I click on Personalize button
And I close the pop up window
When I select a color of the product
Then I click on Add to Cart button
When I enter valid coupon code and click on Apply
Then Coupon code gets applied
When I click on Checkout button
Then it redirects to Checkout Page
When I enter all the mandatory fields of Ship to Section
And I click on Next
And I click on Ship method Next button
When I enter all the mandatory valid information and click on Next button
Then it navigates to Complete Your Order Section
When I click on Place Order button without selecting terms and Conditions
Then it displays error message
When I select terms and conditions
And I click on Place order button
Then Order gets placed successfully
Then order level discount applies on and then order total is calculated





