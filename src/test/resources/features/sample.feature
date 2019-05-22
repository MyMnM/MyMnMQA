Feature: Facebook login
#Background:
#Given I open the given website
#Then verify the Url

Scenario: Verify Quick Shop functionality on every product 
When I enter all the mandatory fields of Ship to Section for Spain
And I click on Next for Spain
And I click on Ship method Next button for Spain
When I enter all the mandatory valid card information and click on Next button for Spain
And I click on Place order button for Spain
Then Order gets placed successfully for Spain