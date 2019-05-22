
Feature: Verify multiple scenarios on Print order Page
@PrintOrder @P1
Scenario:Verify print icon is present on the right side corner of the order confirmation page and is clikable
Given I open the given website
Then verify the Url
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
And print icon is present on the right side corner of the order confirmation page and is clikable
