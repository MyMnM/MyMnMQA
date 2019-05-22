
Feature: Verify multiple scenarios on Checkout Page
Background:
Given I open the given website
Then verify the Url
When I navigate to normal product page
Then Add to cart button is visible
When I click on cart button
When I click on Proceed to Checkout button
Then it redirects to Checkout Page

@Checkout @P1 @P1US
Scenario:Verify Login link is there if User continue as a guest
Then Login link is present there

@Checkout @P1 @P1US
Scenario:Verify in ship to section error message is coming if user tries to proceed with empty fields
When I click on Next button in Ship To section with all fields empty
Then it displays all error messages

@Checkout @P1 @P1US
Scenario:Verify validation message displays for invalid zip code
When I enter invalid zip code
Then it displays zip code error Message

@Checkout @P1 @P1US
Scenario:Verify validation message displays if user enters invalid VAT number and ein id - For UK Site and US site
When I enter invalid VatId
Then it displays vatId error message

@Checkout @P1 @P1US
Scenario Outline:Verify dropdown with save address displays and is clickable - For registered user
When I click on Sign in link
And I enter username as "<email>" and password as "<password>"
And I click on Sign in button
Then dropdown with save address displays
Examples:
|email                      |password      |
|mmsuk@gmail.com            |automation@123|

@Checkout 
Scenario:Verify on clicking edit link arrival date can be changed
When I enter all the mandatory fields of Ship to Section
And I click on Next
When I click on Edit link
And I change the arrival date
Then changed date is displayed in Ship Method section

@Checkout @P1 @P1US
Scenario:Verify validation message displays for empty fields/invalid values for payment section
When I enter all the mandatory fields of Ship to Section
And I click on Next
And I click on Ship method Next button
When I click on Payment Next button with all fields empty
Then it displays error messages for all the payment fields


@Checkout @P1 @P1US
Scenario:Verify user is able to proceed further on entering valid payment details
When I enter all the mandatory fields of Ship to Section
And I click on Next
And I click on Ship method Next button
When I enter all the mandatory valid information and click on Next button
Then it navigates to Complete Your Order Section

@Checkout @P1 @P1US
Scenario:Verify user is able to check save credit card information checkbox
When I enter all the mandatory fields of Ship to Section
And I click on Next
And I click on Ship method Next button
When I click on save credit card information checkbox
Then it gets selected

@Checkout @P1 @P1US
Scenario:Verify user is able to check shipping address as billing address
When I enter all the mandatory fields of Ship to Section
And I click on Next
And I click on Ship method Next button
When I click on Billing Address Same as Shipping
Then it is selected

@Checkout @P1 @P1US
Scenario:Verify user can add new billing address
When I enter all the mandatory fields of Ship to Section
And I click on Next
And I click on Ship method Next button
When I enter the new biiling address
When I enter all the mandatory valid information and click on Next button
Then new Biling address is added

@Checkout @P1 @P1US
Scenario:Verify Subscribe option is there 
When I enter all the mandatory fields of Ship to Section
And I click on Next
And I click on Ship method Next button
Then Subscribe option is present there

@Checkout @P1 @P1US
Scenario:Validate order summary section contain Product image and Product name with item code and quantity,Price per item etc
When I enter all the mandatory fields of Ship to Section
And I click on Next
Then in Order Summary section Product image and Product name with item code and quantity,Price per item,Total price per item,Subtotal and othervalues are coming

@Checkout @P1 @P1US
Scenario:Verify user is able to place order if all mandatory fields are filled 
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

@P1FR
Scenario:Verify user is able to place order if all mandatory fields are filled for France
When I enter all the mandatory fields of Ship to Section for FR
And I click on Next for France
And I click on Ship method Next button for France
When I enter all the mandatory valid card information and click on Next button for France
When I select terms and conditions
And I click on Place order button for France
Then Order gets placed successfully for France

@P1DE
Scenario:Verify user is able to place order if all mandatory fields are filled for Dutch
When I enter all the mandatory fields of Ship to Section for Dutch
And I click on Next for Dutch
And I click on Ship method Next button for Dutch
When I enter all the mandatory valid card information and click on Next button for Dutch
When I select terms and conditions
And I click on Place order button for Dutch
Then Order gets placed successfully for Dutch

@P1GE
Scenario:Verify user is able to place order if all mandatory fields are filled for Germany
When I enter all the mandatory fields of Ship to Section for German
And I click on Next for German
And I click on Ship method Next button for German
When I enter all the mandatory valid card information and click on Next button for German
When I select terms and conditions
And I click on Place order button for German
Then Order gets placed successfully for German

@P1IT
Scenario:Verify user is able to place order if all mandatory fields are filled for Italy
When I enter all the mandatory fields of Ship to Section for Italy
And I click on Next for italy
And I click on Ship method Next button for Italy
When I enter all the mandatory valid card information and click on Next button for Italy
When I select terms and conditions
And I click on Place order button for Italy
Then Order gets placed successfully for Italy


@P1ESP
Scenario:Verify user is able to place order if all mandatory fields are filled for Spain
When I enter all the mandatory fields of Ship to Section for Spain
And I click on Next for Spain
And I click on Ship method Next button for Spain
When I enter all the mandatory valid card information and click on Next button for Spain
When I select terms and conditions
And I click on Place order button for Spain
Then Order gets placed successfully for Spain


@P1Pl
Scenario:Verify user is able to place order if all mandatory fields are filled for Poland
When I enter all the mandatory fields of Ship to Section for Poland
And I click on Next for Poland
And I click on Ship method Next button for Poland
When I enter all the mandatory valid card information and click on Next button for Poland
When I select terms and conditions
And I click on Place order button for Poland
Then Order gets placed successfully for Poland



@Checkout @P1 @P1US
Scenario:Verify checkbox for create an account displays and is working fine - For guest user
When I enter all the mandatory fields of Ship to Section
And I click on Next
And I click on Ship method Next button
When I enter all the mandatory valid information and click on Next button
Then it navigates to Complete Your Order Section
When I select terms and conditions
When I select create new Account checkBox
And I enter valid username and password
And I click on Place order button
Then Order gets placed successfully


	







