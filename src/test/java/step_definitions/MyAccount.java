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
import pageobjects.MyAccountOR;
import pageobjects.OrderConfirmationOR;
import pageobjects.ProductDetailPageOR;
import pageobjects.homePageOR;
import pageobjects.productListOR;

public class MyAccount extends GlobalUtil{
	public WebDriver driver;
	public String wrongFormatEmail = "wrong";
	public String firstName;
	public String lastName;
	public String email;
	public String productName;
	
	public String addressFirstName = "name12";
	public String addressLastName = "lName12";
	public String addressLine1 = "address21";
	public String city = "city11";
	public String zipCode = "wc1n3ax";
	public String phoneNumber = "2234567890";
	
	public String newPassword;
	public String userName;
	
	public MyAccount() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, MyAccountOR.class);
		PageFactory.initElements(driver, CheckoutOR.class);
		PageFactory.initElements(driver, homePageOR.class);
		PageFactory.initElements(driver, ProductDetailPageOR.class);
		
		
	}	
	
	@Given("^click on Account Settings$")
	public void click_on_Account_Settings() throws Throwable {
		clickOnElementUsingJS(driver, MyAccountOR.accountSettingsLink);
		
	}

	@Then("^it navigates to Account settings page$")
	public void it_navigates_to_Account_settings_page() throws Throwable {
		executionDelay(4000);
		verifyWebsiteURL(driver, ConfigReader.getValue("myAccountSettingsURL"));
	}
	
	@When("^I click on edit link$")
	public void i_click_on_edit_link() throws Throwable {
		clickOnElementUsingJS(driver, MyAccountOR.editLink);
	}

	@When("^I click on Save button with all fields empty$")
	public void i_click_on_Save_button_with_all_fields_empty() throws Throwable {
		inputText(MyAccountOR.email, "", driver);
		clickOnElementUsingJS(driver, MyAccountOR.saveButton);
	}

	@When("^I enter email id in invalid format$")
	public void i_enter_email_id_in_invalid_format() throws Throwable {
	    inputText(MyAccountOR.email, wrongFormatEmail, driver);
	}

	@When("^I click on Save button$")
	public void i_click_on_Save_button() throws Throwable {
		clickOnElementUsingJS(driver, MyAccountOR.saveButton);
		executionDelay(3000);
	}
	
	@When("^I update firstName as \"([^\"]*)\",lastName as \"([^\"]*)\" and email as \"([^\"]*)\"$")
	public void i_update_firstName_as_lastName_as_and_email_as(String fName, String lName, String emailID) throws Throwable {
		firstName = generateRandomNumber()+fName;
		lastName = generateRandomNumber()+lName;
		email = generateRandomNumber()+emailID;
		inputText(MyAccountOR.firstName, firstName, driver);
		inputText(MyAccountOR.lastName, lastName, driver);
		inputText(MyAccountOR.email, email, driver);
		executionDelay(5000);
		
	}

	@Then("^it should gets updated$")
	public void it_should_gets_updated() throws Throwable {
	    executionDelay(5000);
		verifyUIText(driver, MyAccountOR.displayName, firstName+" "+lastName);
	    verifyUIText(driver, MyAccountOR.displayEmail, email);
	}
	
	
	@When("^I click on edit link on My Address Book$")
	public void i_click_on_edit_link_on_My_Address_Book() throws Throwable {
		clickOnElementUsingJS(driver, MyAccountOR.addressBookEditLink);
	}

	@When("^I click on Save with all mandatory fields empty$")
	public void i_click_on_Save_with_all_mandatory_fields_empty() throws Throwable {
		inputText(CheckoutOR.firstNameField, "", driver);
		inputText(CheckoutOR.lastNameField, "", driver);
		inputText(CheckoutOR.addressLine1, "", driver);
		inputText(CheckoutOR.cityField, "", driver);
		inputText(CheckoutOR.zipCodeField, "", driver);
		inputText(CheckoutOR.phoneNumber, "", driver);
		clickOnElementUsingJS(driver, MyAccountOR.saveButton);		
		
	}

	@Then("^it should display all the appropriate error messages$")
	public void it_should_display_all_the_appropriate_error_messages() throws Throwable {
		Assert.assertTrue("First name error message is not displayed" ,isWebElementPresent(driver, MyAccountOR.firstNameErrorMessage));
		Assert.assertTrue("Last name error message is not displayed" ,isWebElementPresent(driver, MyAccountOR.lastNameErrorMessage));
		Assert.assertTrue("Street address error message is not displayed" ,isWebElementPresent(driver, MyAccountOR.streetAddressErrorMessage));
		Assert.assertTrue("City address error message is not displayed" ,isWebElementPresent(driver, MyAccountOR.cityErrorMessage));
		Assert.assertTrue("Zip code error message is not displayed" ,isWebElementPresent(driver, MyAccountOR.zipCodeErrorMessage));
		Assert.assertTrue("Phone number error message is not displayed" ,isWebElementPresent(driver, MyAccountOR.phoneNumberErrorMessage));
		
	}
	
	@When("^I click on Add new address button$")
	public void i_click_on_Add_new_address_button() throws Throwable {
		clickOnElementUsingJS(driver, MyAccountOR.addNewAddressButton);
	}

	@When("^I enter all the valid values in all the mandatory fields$")
	public void i_enter_all_the_valid_values_in_all_the_mandatory_fields() throws Throwable {
		firstName = generateRandomNumber()+addressFirstName;
		lastName = generateRandomNumber()+addressLastName;
		inputText(CheckoutOR.firstNameField, firstName, driver);
		inputText(CheckoutOR.lastNameField, lastName, driver);
		inputText(CheckoutOR.addressLine1, addressLine1, driver);
		inputText(CheckoutOR.cityField, city, driver);
		inputText(CheckoutOR.zipCodeField, zipCode, driver);
		inputText(CheckoutOR.phoneNumber, phoneNumber, driver);
	}

	@Then("^it should display new Addresss$")
	public void it_should_display_new_Addresss() throws Throwable {
		executionDelay(3000);
		verifyUIText(driver, MyAccountOR.addressBookDisplayNameDetails, firstName+" "+lastName);
	}
	
	@When("^i click on Edit button$")
	public void i_click_on_Edit_button() throws Throwable {
		clickOnElementUsingJS(driver, MyAccountOR.newAddressEditLink);
	}

	@When("^edit the Address$")
	public void edit_the_Address() throws Throwable {
		firstName = generateRandomNumber()+addressFirstName;
		lastName = generateRandomNumber()+addressLastName;
		inputText(CheckoutOR.firstNameField, firstName, driver);
		inputText(CheckoutOR.lastNameField, lastName, driver);
	}

	@Then("^it should display the updated address$")
	public void it_should_display_the_updated_address() throws Throwable {
		executionDelay(4000);
		System.out.println("edit name "+MyAccountOR.addressBookDisplayNameDetails.getText());
		System.out.println("edit name 2"+firstName+" "+lastName);
		verifyUIText(driver, MyAccountOR.addressBookDisplayNameDetails, firstName+" "+lastName);
	}

	@When("^I click on Delete Address$")
	public void i_click_on_Delete_Address() throws Throwable {
	    clickOnElementUsingJS(driver, MyAccountOR.deleteAddressLink);
	    clickOkOnDialogBox(driver);
	}

	@Then("^it should delete the address$")
	public void it_should_delete_the_address() throws Throwable {
	    executionDelay(4000);
		Assert.assertFalse("Address does not gets deleted", isWebElementPresent(driver, MyAccountOR.deleteAddress));
	}
	
	@When("^I click on Change Password$")
	public void i_click_on_Change_Password() throws Throwable {
		userName = MyAccountOR.displayEmail.getText();
		clickOnElementUsingJS(driver, MyAccountOR.changePasswordButton);
	}
    
	@Given("^I change the old password as \"([^\"]*)\" with  new passowrd as \"([^\"]*)\"$")
	public void i_change_the_old_password_as_with_new_passowrd_as(String oldPassword, String newPass) throws Throwable {
		newPassword = generateRandomNumber()+newPass;
		inputText(MyAccountOR.oldPasswordField, oldPassword, driver);
		inputText(MyAccountOR.newPasswordField, newPassword, driver);
		inputText(MyAccountOR.confirmPasswordField, newPassword, driver);
	}  
	

	@When("^I logout of the application$")
	public void i_logout_of_the_application() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.myAccountField);		
		clickOnElementUsingJS(driver, homePageOR.login_signOut);
		executionDelay(5000);
		
	}

	@When("^I log in again using new password$")
	public void i_log_in_again_using_new_password() throws Throwable {
		 navigateToURL(ConfigReader.getValue("HomePageURL"), driver);
		 executionDelay(5000);
		 clickOnElementUsingJS(driver, homePageOR.loginIcon);
		 inputText(homePageOR.login_username, userName,driver);
		 inputText(homePageOR.login_password, newPassword,driver);
		 clickOnElementUsingJS(driver, homePageOR.login_signIn);
	}
	
	@When("^I click on Order Details$")
	public void i_click_on_Order_Details() throws Throwable {
	    scrollIntoView(MyAccountOR.orderDetailsLink, driver);
		clickOnElementUsingJS(driver, MyAccountOR.orderDetailsLink);
		executionDelay(5000);
	}

	@Then("^it opens detail for that particular order$")
	public void it_opens_detail_for_that_particular_order() throws Throwable {		
		Assert.assertTrue("Order details are not coming", isWebElementPresent(driver, MyAccountOR.orderListing));
	
	}
	
	@When("^i click on product name in detail section$")
	public void i_click_on_product_name_in_detail_section() throws Throwable {
		productName = MyAccountOR.detailsOrderNameLink.getText();
		System.out.println("product name "+productName);
		clickOnElementUsingJS(driver, MyAccountOR.detailsOrderNameLink);
	}

	@Then("^it redirects to specific Product page$")
	public void it_redirects_to_specific_Product_page() throws Throwable {
		executionDelay(4000);
		System.out.println("product name2 "+ProductDetailPageOR.itemName.getText());
	    verifyUIText(driver, ProductDetailPageOR.itemName, productName);
	}
	
	@Then("^saved design should be present in saved designs panel$")
	public void saved_design_should_be_present_in_saved_designs_panel() throws Throwable {
		Assert.assertTrue("Order details are not coming", isWebElementPresent(driver, MyAccountOR.savedDesignPersonalize));
		clickOnElementUsingJS(driver, MyAccountOR.deleteSavedDesign);
		clickOnElementUsingJS(driver, MyAccountOR.deleteDesignYes);
	}
	
	@When("^I click on My Account icon$")
	public void i_click_on_My_Account_icon() throws Throwable {
		clickOnElementUsingJS(driver, MyAccountOR.fluidMyAccountIcon);
	}	
	
	@Given("^I click on Saved Design$")
	public void i_click_on_Saved_Design() throws Throwable {
		executionDelay(7000);
		clickOnElementUsingJS(driver, MyAccountOR.fluidSavedDesignLink);
	}
	
	@Then("^it should display password change success message$")
	public void it_should_display_password_change_success_message() throws Throwable {
		
	}





	
	
}
