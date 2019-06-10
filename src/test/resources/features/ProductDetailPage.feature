
Feature: Verify multiple scenarios on Product Detail Page
Background:
Given I open the given website
Then verify the Url
When I navigate to Product Detail Page
Then Global Cart is visible

@PDP @P1 @P1US @P1USLive
Scenario:Verify the hyperlinks in the breadcrumbs are clickable and redirects to the respective category
When I click on home page link of breadcrumbs
Then it navigates to Home Page
When I click on category link of breadcrumbs
Then it navigates to corresponding category page 

@PDP @P1 @P1US @P1USLive
Scenario:Verify Quantity box is showing with - & + sign to increase and descrease quantity - For normal products
When I navigate to normal product page
Then Quantity box is visible with - & + sign to increase and descrease quantity

@PDP @P1
Scenario:Verify Add to cart button is working and displays for normal products
When I navigate to normal product page
Then Add to cart button is visible
When I click on it 
Then it displays Proceed to Checkout button

@PDP @P1 @P1US @P1USLive
Scenario:Verify Personalize button is clickable and redirects to fluid page and displays only for customize products
When I click on personalize button
Then it navigates to its desired webpage
When I navigate to normal product page
Then personalize button is not visible

@PDP @P1 @P1US @P1USLive
Scenario:Verify customize button does not display if inventory is zero for customize products
When I navigate to zero inventory customized product
Then personalize button is not visible



