
Feature: Verify multiple scenarios on Quick Shop
Background:
Given I open the given website
Then verify the Url
When I navigate to product List page
Then Global Cart is visible

@QuickShop @P1 @P1US @P1USLive
Scenario:Verify accordion on click to quickshop button
When I click on Quick Shop button
Then it displays accordion

@QuickShop @P1 @P1US @P1USLive
Scenario:Verify Expand/Collapse functionality on tabs on accordion under quickshop
When I click on Quick Shop button
Then it displays accordion
And I expand Personalization Options
And I collapse Personalization Options

@QuickShop @P1 @P1US @P1USLive
Scenario:Verify Quantity field on accordion and Quantity field updation under quickShop
When I navigate to non-customisable product listing
When I click on Quick Shop button
Then it displays Quantity field
When I click on Plus icon 
Then quantity value gets increased
When I click on minus icon 
Then quantity value gets decreased

@QuickShop @P1 @P1US @P1USLive
Scenario:Verify add to cart button on accordion under quickshop and its functionality on accordion under quickshop
When I navigate to non-customisable product listing
When I click on Quick Shop button
Then it displays Add To Cart Button
When I click on Add To Cart Button
Then it displays Global Cart

@QuickShop2 @P1
Scenario:Verify Personalize button on accordion under quickshop and its functionality on accordion under quickshop
When I navigate to Product listing
When I click on Quick Shop button
Then it displays Personalize button
When i click on Personalize button
Then it navigates to its desired webpage


@QuickShop @P1 @P1US @P1USLive
Scenario:Verify View full details hyperlink functionality
When I click on Quick Shop button
When I click View full details hyperlink
Then it navigates to desired webpage

@QuickShop @P1 @P1US @P1USLive
Scenario:Verify minimum quantity validation on accordion
When I click on Quick Shop button
Then minimum order quantity message is displayed 
When I navigate to non-customisable product listing
When I click on Quick Shop button
Then minimum order quantity message is displayed 
And minus button of Quantity box is disabled 




