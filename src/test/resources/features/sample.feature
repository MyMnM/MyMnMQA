Feature: Facebook login
#Background:
#Given I open the given website
#Then verify the Url

Scenario: Verify Quick Shop functionality on every product 
When I enter all the mandatory fields of Ship to Section for Poland
And I click on Next for Poland
And I click on Ship method Next button for Poland
When I enter all the mandatory valid card information and click on Next button for Poland
And I click on Place order button for Poland
Then Order gets placed successfully for Poland