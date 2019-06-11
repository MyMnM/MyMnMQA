package step_definitions;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.PageFactory;

import UIAction.ProductListAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.ConfigReader;
import helpers.GlobalUtil;
import pageobjects.CartOR;
import pageobjects.CheckoutOR;
import pageobjects.GlobalCartOR;
import pageobjects.OrderConfirmationOR;
import pageobjects.ProductDetailPageOR;
import pageobjects.homePageOR;
import pageobjects.productListOR;

public class Checkout extends GlobalUtil{
	public WebDriver driver;
	public String invalidZipCode = "asdsa";
	public String invalidVatId = "vat345";
	public String firstName = "name12";
	public String lastName = "lName12";
	public String addressLine1 = "address21";
	public String city = "city11";
	public String zipCode = "wc1n3ax";
	public String zipCodeFrance = "75006";
	public String zipCodeDutch = "1000 AA";
	public String usZipCode = "35006";
	public String phoneNumber = "2234567890";
	public String email = "asdf@gmail.com";
	public String expectedArrivalDate;
	public String cardNumber = "4111111111111111";
	public String cardName = "automationCard";
	public String cardCVVNumber = "123";
	public String billingAddressFirstName = "newName";
	
	
	
	
	
	public Checkout() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, CheckoutOR.class);
		PageFactory.initElements(driver, ProductDetailPageOR.class);
		PageFactory.initElements(driver, CartOR.class);
		PageFactory.initElements(driver, OrderConfirmationOR.class);
		
	}
	

	@Then("^Login link is present there$")
	public void login_link_is_present_there() throws Throwable {    
		Assert.assertTrue("Item image is not present" ,isWebElementPresent(driver, CheckoutOR.checkoutLogin));
	
	}
	
	@When("^I click on Next button in Ship To section with all fields empty$")
	public void i_click_on_Next_button_in_Ship_To_section_with_all_fields_empty() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.shipToNextButton);
	}
	
	@When("^I click on Proceed to Checkout button$")
	public void i_click_on_Proceed_to_Checkout_button() throws Throwable {
	    if(isWebElementPresent(driver, ProductDetailPageOR.proceedToCheckout)) {
	    	clickOnElementUsingJS(driver, ProductDetailPageOR.proceedToCheckoutButton);
	    }
	    else {
	    	/*below line is commented for US becuase now checkout funtionality is changed for Normal product.
	    	Earlier it navigates directly to Checkout page uopn clicking Add to Cart.
	    	Now it shows Global cart pop up andcheckout option*/
//	    	clickOnElementUsingJS(driver, CartOR.checkoutButton);	    	
	    	hoverMouse(homePageOR.cartIcon,driver);
	    	clickOnElementUsingJS(driver, GlobalCartOR.checkOutButton);
			executionDelay(5000);
	    }
	}


	@Then("^it displays all error messages$")
	public void it_displays_all_error_messages() throws Throwable {
		Assert.assertTrue("First name error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.firstNameErrorMessage));
		Assert.assertTrue("Last name error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.lastNameErrorMessage));
		Assert.assertTrue("Street address error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.streetAddressErrorMessage));
		Assert.assertTrue("City address error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.cityErrorMessage));
		Assert.assertTrue("Zip code error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.zipCodeErrorMessage));
		scrollIntoView(CheckoutOR.occasionValidationMessage, driver);
		Assert.assertTrue("Phone number error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.phoneNumberErrorMessage));
		Assert.assertTrue("Email error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.emailErrorMessage));
		Assert.assertTrue("Occasion error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.occasionErrorMessage));
		
		
	}
	
	@When("^I enter invalid zip code$")
	public void i_enter_invalid_zip_code() throws Throwable {
		refreshPage(driver);
		inputText(CheckoutOR.zipCodeField, invalidZipCode, driver);
		clickOnElementUsingJS(driver, CheckoutOR.shipToNextButton);
	}

	@Then("^it displays zip code error Message$")
	public void it_displays_zip_code_error_Message() throws Throwable {
		Assert.assertTrue("Zip code error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.zipCodeErrorMessage));
	}
	
	@When("^I enter invalid VatId$")
	public void i_enter_invalid_VatId() throws Throwable {
		refreshPage(driver);
		inputText(CheckoutOR.vatIdField, invalidVatId, driver);
		clickOnElementUsingJS(driver, CheckoutOR.shipToNextButton);
	}

	@Then("^it displays vatId error message$")
	public void it_displays_vatId_error_message() throws Throwable {
		Assert.assertTrue("VatId error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.vatIdErrorMessage));
	}
	
	@When("^I click on Sign in link$")
	public void i_click_on_Sign_in_link() throws Throwable {
		executionDelay(5000);
		clickOnElementUsingJS(driver, CheckoutOR.loginLink);
	}
	
	@Then("^dropdown with save address displays$")
	public void dropdown_with_save_address_displays() throws Throwable {
		if(isWebElementPresent(driver, CheckoutOR.checkoutSavedAddressDropDown)) {	
			Assert.assertTrue("VatId error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutSavedAddressDropDown));
			clickOnElementUsingJS(driver, CheckoutOR.savedAddressDropDown);	
		}
		else {
			System.out.println("in else");
			clickOnElementUsingJS(driver, CartOR.checkoutButton);	
			Assert.assertTrue("VatId error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutSavedAddressDropDown));
			clickOnElementUsingJS(driver, CheckoutOR.savedAddressDropDown);
		}
	}
	
	@When("^I enter all the mandatory fields of Ship to Section$")
	public void i_enter_all_the_mandatory_fields_of_Ship_to_Section() throws Throwable {
		executionDelay(4000);
		inputText(CheckoutOR.firstNameField, firstName, driver);
		inputText(CheckoutOR.lastNameField, lastName, driver);
		inputText(CheckoutOR.addressLine1, addressLine1, driver);
		inputText(CheckoutOR.cityField, city, driver);
		//For US site
		if(isWebElementPresent(driver, CheckoutOR.checkoutUSProvince)) {
			SelectUsingIndex(CheckoutOR.checkoutUSProvinceDropDown, 1);
			inputText(CheckoutOR.zipCodeField, usZipCode, driver);
		}
		else {
		inputText(CheckoutOR.zipCodeField, zipCode, driver);
		}
		inputText(CheckoutOR.phoneNumber, phoneNumber, driver);
		inputText(CheckoutOR.email, email, driver);
		SelectUsingIndex(CheckoutOR.occasionDropDown, 1);
		
	}

	@When("^I click on Next$")
	public void i_click_on_Next() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.shipToNextButton);
		executionDelay(7000);
	}
	
	@When("^I click on Edit link$")
	public void i_click_on_Edit_link() throws Throwable {
		clickOnElement(driver, CheckoutOR.editArrivalDateLink);
		executionDelay(3000);
	}

	@When("^I change the arrival date$")
	public void i_change_the_arrival_date() throws Throwable {
		System.out.println("expected date "+CheckoutOR.newArrivalDate.getText());
		expectedArrivalDate = CheckoutOR.newArrivalDate.getText();
		clickOnElement(driver, CheckoutOR.newArrivalDate);
		
	}

	@Then("^changed date is displayed in Ship Method section$")
	public void changed_date_is_displayed_in_Ship_Method_section() throws Throwable {
	    String dateLabel = CheckoutOR.changedArrivalDate.getText();
	    System.out.println("date label "+dateLabel);
	    int index = dateLabel.indexOf('-');
	    String actualDate = dateLabel.substring(index-2, index);
	    System.out.println("Actual date "+actualDate);	   
	    Assert.assertTrue("Selected delivery date is different from displayed date", expectedArrivalDate.equals(actualDate.toString()));
	}
	
	@Given("^I click on Ship method Next button$")
	public void i_click_on_Ship_method_Next_button() throws Throwable {
	    executionDelay(4000);
		clickOnElementUsingJS(driver, CheckoutOR.shipMethodNextButton);
	}

	@When("^I click on Payment Next button with all fields empty$")
	public void i_click_on_Payment_Next_button_with_all_fields_empty() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.paymentNextButton);
	}

	@Then("^it displays error messages for all the payment fields$")
	public void it_displays_error_messages_for_all_the_payment_fields() throws Throwable {
		Assert.assertTrue("Card number error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.cardNumberErrorMessage));
		Assert.assertTrue("card name error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.cardNameErrorMessage));
		Assert.assertTrue("card expiry error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.cardExpiryErrorMessage));
		Assert.assertTrue("card cvv error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.cardCvvErrorMessage));
		scrollIntoView(CheckoutOR.paymentNextButton, driver);		
		Assert.assertTrue("billing email error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.billingEmailErrorMessage));
	}
	
	@When("^I enter all the mandatory valid information and click on Next button$")
	public void i_enter_all_the_mandatory_valid_information_and_click_on_Next_button() throws Throwable {
		inputText(CheckoutOR.creditCardNumber, cardNumber, driver);
		inputText(CheckoutOR.cardName, cardName, driver);
		SelectUsingIndex(CheckoutOR.cardExpiryMonth, 4);
		SelectUsingIndex(CheckoutOR.cardExpiryYear, 8);
		inputText(CheckoutOR.cardCVVNumber, cardCVVNumber, driver);
		clickOnElementUsingJS(driver, CheckoutOR.paymentNextButton);
		
	   
	}

	@Then("^it navigates to Complete Your Order Section$")
	public void it_navigates_to_Complete_Your_Order_Section() throws Throwable {
		Assert.assertTrue("Place order button is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutPlaceOrder));
		
	}
	
	@When("^I click on save credit card information checkbox$")
	public void i_click_on_save_credit_card_information_checkbox() throws Throwable {
		if(!CheckoutOR.saveCCInformationCheckBox.isSelected()) {
			clickOnElementUsingJS(driver, CheckoutOR.saveCCInformationCheckBox);
			executionDelay(5000);
		}
	}

	@Then("^it gets selected$")
	public void it_gets_selected() throws Throwable {
		Assert.assertTrue("Saved CC information check box is not selected" ,CheckoutOR.saveCCInformationCheckBox.isSelected());
	}
	
	@When("^I click on Billing Address Same as Shipping$")
	public void i_click_on_Billing_Address_Same_as_Shipping() throws Throwable {
		if(!CheckoutOR.billingAddressSameAsShipping.isSelected()) {
			clickOnElementUsingJS(driver, CheckoutOR.billingAddressSameAsShipping);
			executionDelay(5000);
		}
		
	}

	@Then("^it is selected$")
	public void it_is_selected() throws Throwable {
		Assert.assertFalse("billing Address Same As Shipping not selected" ,isWebElementPresent(driver, CheckoutOR.checkoutBillingFirstName));
		
	}
	
	@When("^I enter the new biiling address$")
	public void i_enter_the_new_biiling_address() throws Throwable {
		if(CheckoutOR.billingAddressSameAsShipping.isSelected()) {
			clickOnElementUsingJS(driver, CheckoutOR.billingAddressSameAsShipping);//unchecked checkbox
			inputText(CheckoutOR.billingAddressFirstName, billingAddressFirstName, driver);
			
			
		}
			
			
	}

	@Then("^new Biling address is added$")
	public void new_Biling_address_is_added() throws Throwable {
		System.out.println("billingSummaryFirstName "+CheckoutOR.billingSummaryFirstName.getText());
		Assert.assertTrue("new billing address is not added", CheckoutOR.billingSummaryFirstName.getText().contains(billingAddressFirstName));
		Assert.assertTrue("First name error message is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutPlaceOrder));
		
	}
	
	@Then("^Subscribe option is present there$")
	public void subscribe_option_is_present_there() throws Throwable {	
		Assert.assertTrue("Subscribe option is not there" ,isWebElementPresent(driver, CheckoutOR.checkoutSubscribe));
		
	}
	
	@Then("^in Order Summary section Product image and Product name with item code and quantity,Price per item,Total price per item,Subtotal and othervalues are coming$")
	public void in_Order_Summary_section_Product_image_and_Product_name_with_item_code_and_quantity_Price_per_item_Total_price_per_item_Subtotal_and_othervalues_are_coming() throws Throwable {
		Assert.assertTrue("Item image is not displayed" ,isWebElementPresent(driver, CartOR.cartItemImage));
		Assert.assertTrue("Item name is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryItemName));
		Assert.assertTrue("Item code is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryItemCode));
		Assert.assertTrue("Item quantity is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryItemQuantity));
		Assert.assertTrue("Item price is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryItemPrice));
		Assert.assertTrue("Item price is not displayed" ,isWebElementPresent(driver, CartOR.cartItemPriceTotal));		
		Assert.assertTrue("Item subtotal is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummarySubTotal));
		Assert.assertTrue("VAT is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryVAT));
		Assert.assertTrue("Shipping and Handling is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryShippingAndHandling));
		Assert.assertTrue("Grand total is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryGrandTotal));
		
	}
	
	@When("^I click on Place Order button without selecting terms and Conditions$")
	public void i_click_on_Place_Order_button_without_selecting_terms_and_Conditions() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.placeOrderButton);
		
		
	}

	@Then("^it displays error message$")
	public void it_displays_error_message() throws Throwable {
		Assert.assertTrue("Terms and Conditions error message not displayed" ,isWebElementPresent(driver, CheckoutOR.termsAndConditionsErrorMessage));
		
	}
	
	@When("^I select terms and conditions$")
	public void i_select_terms_and_conditions() throws Throwable {		
		clickOnElementUsingJS(driver, CheckoutOR.termsAndCondition);
		
	}

	@When("^I click on Place order button$")
	public void i_click_on_Place_order_button() throws Throwable {		
		clickOnElementUsingJS(driver, CheckoutOR.placeOrderButton);
	}

	@Then("^Order gets placed successfully$")
	public void order_gets_placed_successfully() throws Throwable {
		executionDelay(4000);
		try {
			clickOnElementUsingJS(driver, OrderConfirmationOR.closePopUp);
		}
		catch(Exception ex) {
			System.out.println("Pop up is not present on Order confirmation page");
		}
		Assert.assertTrue("Order confirmation page is not displayed." ,isWebElementPresent(driver, CheckoutOR.orderConfirmationTitle));
		executionDelay(3000);
	}
	

	@When("^I select create new Account checkBox$")
	public void i_select_create_new_Account_checkBox() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.createAccountCheckBox);
	}
	
	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
		inputText(CheckoutOR.newAccountEmail, generateRandomNumber()+ConfigReader.getValue("newAccountEmail"), driver);
		inputText(CheckoutOR.newAccountPassword, ConfigReader.getValue("newAccountPassword"), driver);
		inputText(CheckoutOR.newAccountConfirmPassword, ConfigReader.getValue("newAccountPassword"), driver);
		
	}
	
	@When("^I enter all the mandatory fields of Ship to Section for FR$")
	public void i_enter_all_the_mandatory_fields_of_Ship_to_Section_for_FR() throws Throwable {
		executionDelay(4000);
		inputText(CheckoutOR.firstNameField, firstName, driver);
		inputText(CheckoutOR.lastNameField, lastName, driver);
		inputText(CheckoutOR.addressLine1, addressLine1, driver);
		inputText(CheckoutOR.cityField, city, driver);
		inputText(CheckoutOR.zipCodeField, zipCodeFrance, driver);	
		inputText(CheckoutOR.phoneNumber, phoneNumber, driver);
		inputText(CheckoutOR.email, email, driver);
		SelectUsingIndex(CheckoutOR.occasionDropDown, 1);
		
	}
	
	@Given("^I click on Next for France$")
	public void i_click_on_Next_for_France() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.shipToNext_FranceButton);
	}
	
	
	@When("^I click on Ship method Next button for France$")
	public void i_click_on_Ship_method_Next_button_for_France() throws Throwable {
		executionDelay(7000);
		clickOnElementUsingJS(driver, CheckoutOR.shippingMethod_FranceRadioButton);
		executionDelay(4000);
		clickOnElementUsingJS(driver, CheckoutOR.shipMethodNext_FranceButton);
	}

	@When("^I enter all the mandatory valid card information and click on Next button for France$")
	public void i_enter_all_the_mandatory_valid_card_information_and_click_on_Next_button_for_France() throws Throwable {
		inputText(CheckoutOR.creditCardNumber, cardNumber, driver);
		inputText(CheckoutOR.cardName, cardName, driver);
		SelectUsingIndex(CheckoutOR.cardExpiryMonth, 4);
		SelectUsingIndex(CheckoutOR.cardExpiryYear, 8);
		inputText(CheckoutOR.cardCVVNumber, cardCVVNumber, driver);
		clickOnElementUsingJS(driver, CheckoutOR.paymentNext_France_Button);
		executionDelay(5000);
	}

	@When("^I click on Place order button for France$")
	public void i_click_on_Place_order_button_for_France() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.checkoutPlaceOrder_FranceButton);
	}
	
	@Then("^Order gets placed successfully for France$")
	public void order_gets_placed_successfully_for_France() throws Throwable {
		Assert.assertTrue("Order confirmation page is not displayed." ,isWebElementPresent(driver, CheckoutOR.orderConfirmationTitle_France));
		executionDelay(3000);
	}
	
	@When("^I enter all the mandatory fields of Ship to Section for Dutch$")
	public void i_enter_all_the_mandatory_fields_of_Ship_to_Section_for_Dutch() throws Throwable {
		executionDelay(4000);
		inputText(CheckoutOR.firstNameField, firstName, driver);
		inputText(CheckoutOR.lastNameField, lastName, driver);
		inputText(CheckoutOR.addressLine1, addressLine1, driver);
		inputText(CheckoutOR.cityField, city, driver);		
		SelectUsingVisibleValue(CheckoutOR.checkoutCountryDropDown, "BE-Belgium");
		executionDelay(7000);
		inputText(CheckoutOR.zipCodeField, zipCodeFrance, driver);	
		inputText(CheckoutOR.phoneNumber, phoneNumber, driver);
		inputText(CheckoutOR.email, email, driver);
		SelectUsingIndex(CheckoutOR.occasionDropDown, 1);
	}

	@When("^I click on Next for Dutch$")
	public void i_click_on_Next_for_Dutch() throws Throwable {		
		clickOnElementUsingJS(driver, CheckoutOR.shipToNext_DutchButton);
		executionDelay(7000);
	}

	@When("^I click on Ship method Next button for Dutch$")
	public void i_click_on_Ship_method_Next_button_for_Dutch() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.shipMethodNext_DutchButton);
	}

	@When("^I enter all the mandatory valid card information and click on Next button for Dutch$")
	public void i_enter_all_the_mandatory_valid_card_information_and_click_on_Next_button_for_Dutch() throws Throwable {
		inputText(CheckoutOR.creditCardNumber, cardNumber, driver);
		inputText(CheckoutOR.cardName, cardName, driver);
		SelectUsingIndex(CheckoutOR.cardExpiryMonth, 4);
		SelectUsingIndex(CheckoutOR.cardExpiryYear, 8);
		inputText(CheckoutOR.cardCVVNumber, cardCVVNumber, driver);
		clickOnElementUsingJS(driver, CheckoutOR.paymentNext_Dutch_Button);
		executionDelay(5000);
	}

	@When("^I click on Place order button for Dutch$")
	public void i_click_on_Place_order_button_for_Dutch() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.checkoutPlaceOrder_DutchButton);
	}

	@Then("^Order gets placed successfully for Dutch$")
	public void order_gets_placed_successfully_for_Dutch() throws Throwable {
		Assert.assertTrue("Order confirmation page is not displayed." ,isWebElementPresent(driver, CheckoutOR.orderConfirmationTitle_Dutch));
		executionDelay(3000);
	}
	
	
	@When("^I enter all the mandatory fields of Ship to Section for German$")
	public void i_enter_all_the_mandatory_fields_of_Ship_to_Section_for_German() throws Throwable {
		executionDelay(4000);
		inputText(CheckoutOR.firstNameField, firstName, driver);
		inputText(CheckoutOR.lastNameField, lastName, driver);
		inputText(CheckoutOR.addressLine1, addressLine1, driver);
		inputText(CheckoutOR.cityField, city, driver);		
		//SelectUsingVisibleValue(CheckoutOR.checkoutCountryDropDown, "BE-Belgium");
		executionDelay(7000);
		inputText(CheckoutOR.zipCodeField, zipCodeFrance, driver);	
		inputText(CheckoutOR.phoneNumber, phoneNumber, driver);
		inputText(CheckoutOR.email, email, driver);
		SelectUsingIndex(CheckoutOR.occasionDropDown, 1);
	}

	@When("^I click on Next for German$")
	public void i_click_on_Next_for_German() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.shipToNext_GermanButton);
		executionDelay(7000);
	}

	@When("^I click on Ship method Next button for German$")
	public void i_click_on_Ship_method_Next_button_for_German() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.shipMethodNext_GermanButton);
		executionDelay(7000);
	}

	@When("^I enter all the mandatory valid card information and click on Next button for German$")
	public void i_enter_all_the_mandatory_valid_card_information_and_click_on_Next_button_for_German() throws Throwable {
		inputText(CheckoutOR.creditCardNumber, cardNumber, driver);
		inputText(CheckoutOR.cardName, cardName, driver);
		SelectUsingIndex(CheckoutOR.cardExpiryMonth, 4);
		SelectUsingIndex(CheckoutOR.cardExpiryYear, 8);
		inputText(CheckoutOR.cardCVVNumber, cardCVVNumber, driver);
		clickOnElementUsingJS(driver, CheckoutOR.paymentNext_German_Button);
		executionDelay(5000);
	}

	@When("^I click on Place order button for German$")
	public void i_click_on_Place_order_button_for_German() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.checkoutPlaceOrder_GermanButton);
	}

	@Then("^Order gets placed successfully for German$")
	public void order_gets_placed_successfully_for_German() throws Throwable {
		Assert.assertTrue("Order confirmation page is not displayed." ,isWebElementPresent(driver, CheckoutOR.orderConfirmationTitle_German));
		executionDelay(3000);
	}
	
	
	@When("^I enter all the mandatory fields of Ship to Section for Italy$")
	public void i_enter_all_the_mandatory_fields_of_Ship_to_Section_for_Italy() throws Throwable {
		executionDelay(4000);
		inputText(CheckoutOR.firstNameField, firstName, driver);
		inputText(CheckoutOR.lastNameField, lastName, driver);
		inputText(CheckoutOR.addressLine1, addressLine1, driver);
		inputText(CheckoutOR.cityField, city, driver);				
		inputText(CheckoutOR.zipCodeField, zipCodeFrance, driver);	
		inputText(CheckoutOR.phoneNumber, phoneNumber, driver);
		inputText(CheckoutOR.email, email, driver);
		SelectUsingIndex(CheckoutOR.occasionDropDown, 1);
	}

	@When("^I click on Next for italy$")
	public void i_click_on_Next_for_italy() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.shipToNext_ItalyButton);		
	}

	@When("^I click on Ship method Next button for Italy$")
	public void i_click_on_Ship_method_Next_button_for_Italy() throws Throwable {
		executionDelay(7000);
		clickOnElementUsingJS(driver, CheckoutOR.shipMethodNext_ItalyButton);		
	}

	@When("^I enter all the mandatory valid card information and click on Next button for Italy$")
	public void i_enter_all_the_mandatory_valid_card_information_and_click_on_Next_button_for_Italy() throws Throwable {
		inputText(CheckoutOR.creditCardNumber, cardNumber, driver);
		inputText(CheckoutOR.cardName, cardName, driver);
		SelectUsingIndex(CheckoutOR.cardExpiryMonth, 4);
		SelectUsingIndex(CheckoutOR.cardExpiryYear, 8);
		inputText(CheckoutOR.cardCVVNumber, cardCVVNumber, driver);
		clickOnElementUsingJS(driver, CheckoutOR.paymentNext_Italy_Button);		
	}

	@When("^I click on Place order button for Italy$")
	public void i_click_on_Place_order_button_for_Italy() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.checkoutPlaceOrder_ItalyButton);
	}

	@Then("^Order gets placed successfully for Italy$")
	public void order_gets_placed_successfully_for_Italy() throws Throwable {
		Assert.assertTrue("Order confirmation page is not displayed." ,isWebElementPresent(driver, CheckoutOR.orderConfirmationTitle_Italy));
		
	}
	
	
	
	@When("^I enter all the mandatory fields of Ship to Section for Spain$")
	public void i_enter_all_the_mandatory_fields_of_Ship_to_Section_for_Spain() throws Throwable {
		executionDelay(4000);
		inputText(CheckoutOR.firstNameField, firstName, driver);
		inputText(CheckoutOR.lastNameField, lastName, driver);
		inputText(CheckoutOR.addressLine1, addressLine1, driver);
		inputText(CheckoutOR.cityField, city, driver);				
		inputText(CheckoutOR.zipCodeField, zipCodeFrance, driver);	
		inputText(CheckoutOR.phoneNumber, phoneNumber, driver);
		inputText(CheckoutOR.email, email, driver);
		SelectUsingIndex(CheckoutOR.occasionDropDown, 1);
	}

	@When("^I click on Next for Spain$")
	public void i_click_on_Next_for_Spain() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.shipToNext_SpainButton);
	}

	@When("^I click on Ship method Next button for Spain$")
	public void i_click_on_Ship_method_Next_button_for_Spain() throws Throwable {
		executionDelay(7000);
		clickOnElementUsingJS(driver, CheckoutOR.shipMethodNext_SpainButton);	
	}

	@When("^I enter all the mandatory valid card information and click on Next button for Spain$")
	public void i_enter_all_the_mandatory_valid_card_information_and_click_on_Next_button_for_Spain() throws Throwable {
		inputText(CheckoutOR.creditCardNumber, cardNumber, driver);
		inputText(CheckoutOR.cardName, cardName, driver);
		SelectUsingIndex(CheckoutOR.cardExpiryMonth, 4);
		SelectUsingIndex(CheckoutOR.cardExpiryYear, 8);
		inputText(CheckoutOR.cardCVVNumber, cardCVVNumber, driver);
		clickOnElementUsingJS(driver, CheckoutOR.paymentNext_Spain_Button);	
	}

	@When("^I click on Place order button for Spain$")
	public void i_click_on_Place_order_button_for_Spain() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.checkoutPlaceOrder_SpainButton);
	}

	@Then("^Order gets placed successfully for Spain$")
	public void order_gets_placed_successfully_for_Spain() throws Throwable {
		Assert.assertTrue("Order confirmation page is not displayed." ,isWebElementPresent(driver, CheckoutOR.orderConfirmationTitle_Spain));
		
	}




	




	

	
}

	