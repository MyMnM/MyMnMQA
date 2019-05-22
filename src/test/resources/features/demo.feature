Feature:dssd
Background:
Given I open the given website
Then verify the Url
When I navigate to product List page
    

Scenario: Verify pagination is working fine ie.page numbers and arrows
When I click on personalize button
Then it navigates to its desired webpage
When I navigate to normal product page
Then personalize button is not visible


    
    