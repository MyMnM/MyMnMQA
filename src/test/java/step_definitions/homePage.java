package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.ConfigReader;
import helpers.GlobalUtil;

import pageobjects.homePageOR;

public class homePage extends GlobalUtil{
	public WebDriver driver;
	public String month = "09";
	public String day = "09";
	public String year = "1991";
	public static String wrongFormatEmailId = "wrongvalue@123";
	public static String wrongEmailId = "64aaaa@gmail.com";
	
	
	public homePage() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
		PageFactory.initElements(driver, homePageOR.class);
	}
	
	@Given("^I open the given website$")
	public void i_open_the_given_website() throws Throwable {
		PageFactory.initElements(driver, homePageOR.class);
		driver.get(ConfigReader.getValue("HomePageURL"));
		executionDelay(5000);
		
		if(isWebElementPresent(driver, homePageOR.agePopUp)) {
			inputText(homePageOR.monthbox, month,driver);
			inputText(homePageOR.dayBox, day,driver);			
			inputText(homePageOR.yearBox, year,driver);
			executionDelay(2000);			
			clickOnElementUsingJS(driver, homePageOR.letsGoButton);
		}
		//For US site
		if(isWebElementPresent(driver, homePageOR.usEmailSubscribeBody)) {
			/*inputText(homePageOR.usEmailField, wrongEmailId, driver);
			clickOnElementUsingJS(driver, homePageOR.usSubscribeNowButton);*/
			clickOnElement(driver, homePageOR.usEmailCloseButton);
		}		
		
	}

	@Then("^verify the Url$")
	public void verify_the_Url() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("HomePageURL"));
	}

	@When("^I click on logo of the website$")
	public void i_click_on_logo_of_the_website() throws Throwable {
		executionDelay(5000);
		highlight(homePageOR.homePageLogo, driver);
		clickOnElementUsingJS(driver, homePageOR.homePageLogo);
	}

	@Then("^it redirects me to the Home Page$")
	public void it_redirects_me_to_the_Home_Page() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("HomePageURL"));
	    
	}
	
	@When("^I enter the value \"([^\"]*)\"in Search bar$")
	public void i_enter_the_value_in_Search_bar(String searchTerm) throws Throwable {
	    executionDelay(5000);
		highlight(homePageOR.searchBox, driver);
		inputText(homePageOR.searchBox, searchTerm,driver);
		executionDelay(5000);
	}

	@Then("^give auto suggestions for what user types$")
	public void give_auto_suggestions_for_what_user_types() throws Throwable {
		highlight(homePageOR.searchTermResults, driver);
		Assert.assertTrue(isWebElementPresent(driver, homePageOR.searchResults), "Auto Suggestion is not coming");
		executionDelay(5000);
	}
	
	@When("^I click on flag icon$")
	public void i_click_on_flag_icon() throws Throwable {		
		clickOnElementUsingJS(driver, homePageOR.flagIcon);		
		
	}

	@Then("^it redirects to specific country site$")
	public void it_redirects_to_specific_country_site() throws Throwable {		
		clickOnElementUsingJS(driver, homePageOR.countryName);
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("UKHomePage"));		
		
	}
	
	@When("^I click on Login icon$")
	public void i_click_on_Login_icon() throws Throwable {
	   // executionDelay(5000);
		clickOnElementUsingJS(driver, homePageOR.loginIcon);
	   
	}

	@Then("^it opens new Shopper Window$")
	public void it_opens_new_Shopper_Window() throws Throwable {
		//executionDelay(5000);		
		Assert.assertTrue(isWebElementPresent(driver, homePageOR.login), "New Shpper window is not opened");
	}
	
	@When("^I hover on the cart icon$")
	public void i_hover_on_the_cart_icon() throws Throwable {
		//executionDelay(5000);
	    hoverMouse(homePageOR.cartIcon,driver);
	}

	@Then("^it shows the cart contents$")
	public void it_shows_the_cart_contents() throws Throwable {
		//executionDelay(5000);
		//isWebElementPresent(driver, homePageOR.cartContent);
		Assert.assertTrue(isWebElementPresent(driver, homePageOR.cartContent), "Cart content is not coming");
	}
	
	@When("^I click on Design your own button$")
	public void i_click_on_Design_your_own_button() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.designYourOwn);
	}

	@Then("^it redirects to fluid page$")
	public void it_redirects_to_fluid_page() throws Throwable {
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("fluidPageURL"));	
	}
	
	@When("^I click on shopByCategory menu$")
	public void i_click_on_shopByCategory_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.shopByCategoryMenu);
	}
	@Then("^it redirects to shopByCategory page$")
	public void it_redirects_to_shopByCategory_page() throws Throwable {
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("shopByCategoryURL"));
	}

	@When("^I click on inspiration menu$")
	public void i_click_on_inspiration_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.inspirationMenu);
	}
	@Then("^it redirects to inspiration page$")
	public void it_redirects_to_inspiration_page() throws Throwable {
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("inspirationURL"));
	
	}

	@When("^I click on experienceM&M menu$")
	public void i_click_on_experienceM_M_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.experienceMenu);
	}
	@Then("^it redirects to experienceM page$")
	public void it_redirects_to_experienceM_page() throws Throwable {
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("experienceMMSURL"));
	}

	@When("^I click on forYourBusiness menu$")
	public void i_click_on_forYourBusiness_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.forYourBusinessMenu);
	}
	@Then("^it redirects to forYourBusiness page$")
	public void it_redirects_to_forYourBusiness_page() throws Throwable {
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("forYourBusinessURL"));
	}
	
	@When("^I click on gifts sub category under Shop By Category$")
	public void i_click_on_gifts_sub_category_under_Shop_By_Category() throws Throwable {
		hoverMouse(homePageOR.shopByCategoryMenu,driver);
		clickOnElementUsingJS(driver,homePageOR.giftsSubCategory);
	}

	@Then("^it redirects to its specific page$")
	public void it_redirects_to_its_specific_page() throws Throwable {
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("giftsURL"));
	
	}
	
	@When("^I click on Contact us$")
	public void i_click_on_Contact_us() throws Throwable {
		scrollIntoView(homePageOR.contactUsLink, driver);
		clickOnElementUsingJS(driver, homePageOR.contactUsLink);
	}

	@Then("^it redirects to Contact us page$")
	public void it_redirects_to_Contact_us_page() throws Throwable {
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("contactUsURL"));
	}

	@When("^I click on Order Status$")
	public void i_click_on_Order_Status() throws Throwable {
		scrollIntoView(homePageOR.orderStatusLink, driver);
		clickOnElementUsingJS(driver, homePageOR.orderStatusLink);
	}

	@Then("^it redirects to Order Status page$")
	public void it_redirects_to_Order_Status_page() throws Throwable {
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("orderStatusURL"));
	}

	@When("^I click on FAQ$")
	public void i_click_on_FAQ() throws Throwable {
		scrollIntoView(homePageOR.FAQLink, driver);
		clickOnElementUsingJS(driver, homePageOR.FAQLink);
	}

	@Then("^it redirects to FAQ page$")
	public void it_redirects_to_FAQ_page() throws Throwable {
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("FAQURL"));
	}

	@When("^I click on site Map$")
	public void i_click_on_site_Map() throws Throwable {
		scrollIntoView(homePageOR.siteMapLink, driver);
		clickOnElementUsingJS(driver, homePageOR.siteMapLink);
	}

	@Then("^it redirects to site Map page$")
	public void it_redirects_to_site_Map_page() throws Throwable {
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("siteMapURL"));
	}
    
	
	@When("^I click on Facebook link$")
	public void i_click_on_Facebook_link() throws Throwable {
		scrollIntoView(homePageOR.facebookLink, driver);
		clickOnElementUsingJS(driver, homePageOR.facebookLink);
	}

	@Then("^it redirects to Facebook page$")
	public void it_redirects_to_Facebook_page() throws Throwable {
		switchToNewBrowserTab(driver);
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("facebookURL"));
		driver.close();
		switchBackToOriginalBrowserTab(driver);
	}

	@When("^I click on Twitter link$")
	public void i_click_on_Twitter_link() throws Throwable {
		scrollIntoView(homePageOR.twitterLink, driver);
		clickOnElementUsingJS(driver, homePageOR.twitterLink);
	}

	@Then("^it redirects to Twitter page$")
	public void it_redirects_to_Twitter_page() throws Throwable {
		switchToNewBrowserTab(driver);
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("twitterURL"));
		driver.close();
		switchBackToOriginalBrowserTab(driver);
		
	}

	@When("^I click on Youtube link$")
	public void i_click_on_Youtube_link() throws Throwable {
		scrollIntoView(homePageOR.youtubeLink, driver);
		clickOnElementUsingJS(driver, homePageOR.youtubeLink);
	}

	@Then("^it redirects to Youtube page$")
	public void it_redirects_to_Youtube_page() throws Throwable {
		switchToNewBrowserTab(driver);
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("youTubeURL"));
		driver.close();
		switchBackToOriginalBrowserTab(driver);
	}

	@When("^I click on PinInterest link$")
	public void i_click_on_PinInterest_link() throws Throwable {
		scrollIntoView(homePageOR.pintRestLink, driver);
		clickOnElementUsingJS(driver, homePageOR.pintRestLink);
		
	}

	@Then("^it redirects to PinInterest page$")
	public void it_redirects_to_PinInterest_page() throws Throwable {
		switchToNewBrowserTab(driver);
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("pinRestURL"));
		driver.close();
		switchBackToOriginalBrowserTab(driver);
	}

	@When("^I click on Instagram link$")
	public void i_click_on_Instagram_link() throws Throwable {
		scrollIntoView(homePageOR.instagramLink, driver);
		clickOnElementUsingJS(driver, homePageOR.instagramLink);
	}

	@Then("^it redirects to Instagram page$")
	public void it_redirects_to_Instagram_page() throws Throwable {
		switchToNewBrowserTab(driver);
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("instagramURL"));
		driver.close();
		switchBackToOriginalBrowserTab(driver);
	}
	
	@When("^I fill valid email as \"([^\"]*)\" and click on sign up in footer$")
	public void i_fill_valid_email_as_and_click_on_sign_up_in_footer(String email) throws Throwable {
		scrollIntoView(homePageOR.footerEmailBox, driver);
		inputText(homePageOR.footerEmailBox, email,driver);
        clickOnElementUsingJS(driver, homePageOR.emailSubmitButton);
	}

	@Then("^it redirects to email sign up page$")
	public void it_redirects_to_email_sign_up_page() throws Throwable {
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("emailSignUpURL"));
	}
	
	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String username, String password) throws Throwable {
	   executionDelay(5000);
	   inputText(homePageOR.login_username, username,driver);
	   inputText(homePageOR.login_password, password,driver);
	   
	   
	}

	@When("^I click on Sign in button$")
	public void i_click_on_Sign_in_button() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.login_signIn);
		executionDelay(7000);
	}

	@Then("^I am successfully logged in$")
	public void i_am_successfully_logged_in() throws Throwable {		
		clickOnElementUsingJS(driver, homePageOR.myAccountField);
		Assert.assertTrue(isWebElementPresent(driver,homePageOR.signOut), "Sign Out is not present");
		//isWebElementPresent(driver,homePageOR.signOut);
		executionDelay(5000);
	}
	
	@When("^I click on Create an Account$")
	public void i_click_on_Create_an_Account() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.createAnAccountLink);
	}

	@When("^I enter username as \"([^\"]*)\" password as \"([^\"]*)\" and Re-enter password as \"([^\"]*)\"$")
	public void i_enter_username_as_password_as_and_Re_enter_password_as(String username, String password, String reEnterPassword) throws Throwable {
	    String new_username = generateRandomNumber()+username;
	    System.out.println("username is"+new_username );
		inputText(homePageOR.signUpEmailBox, new_username,driver);
	    inputText(homePageOR.signUpPasswordBox, password,driver);
	    inputText(homePageOR.signUpReEnterPasswordBox, reEnterPassword,driver);
	}
	
	@When("^I click on email subscribe check box$")
	public void i_click_on_email_subscribe_check_box() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.signUpEmailSubscribeCheckBox);
	}

	@When("^I click on Sign Up button$")
	public void i_click_on_Sign_Up_button() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.signUpButton);
		executionDelay(5000);
	}
    

	@Then("^My Account title is visible$")
	public void my_Account_title_is_visible() throws Throwable {
		Assert.assertTrue(isWebElementPresent(driver, homePageOR.myAccount), "My Account title is not visible");
		//isWebElementPresent(driver, homePageOR.myAccount);
	}
	
	@When("^I click on Forgot your Password$")
	public void i_click_on_Forgot_your_Password() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.forgotPasswordLink);
	}

	@Then("^it redirects to page having Forgot your password heading$")
	public void it_redirects_to_page_having_Forgot_your_password_heading() throws Throwable {
		Assert.assertTrue(isWebElementPresent(driver, homePageOR.forgotPasswordTitle), "Forgot password title is not visible");
	    //isWebElementPresent(driver, homePageOR.forgotPasswordTitle);
	}
	
	@Then("^it should display the validation error message$")
	public void it_should_display_the_validation_error_message() throws Throwable {	
		Assert.assertTrue(isWebElementPresent(driver, homePageOR.emptyErrorMessage), "Empty error message is not coming");		   
		//isWebElementPresent(driver, homePageOR.emptyErrorMessage);
	}

	@When("^I enter email id in wrong format$")
	public void i_enter_email_id_in_wrong_format() throws Throwable {
	   inputText(homePageOR.login_username, wrongFormatEmailId, driver);
	}

	@Then("^it should display appropriate error message$")
	public void it_should_display_appropriate_error_message() throws Throwable {		
		Assert.assertTrue(isWebElementPresent(driver, homePageOR.wrongFormatErrorMessage), "Wrong format error message is not coming");
		//isWebElementPresent(driver, homePageOR.wrongFormatErrorMessage);
		
	}

	@When("^I enter incorrect password for valid email id$")
	public void i_enter_incorrect_password_for_valid_email_id() throws Throwable {
	   inputText(homePageOR.login_username, ConfigReader.getValue("validEmailId"), driver);
	   inputText(homePageOR.login_password, wrongFormatEmailId, driver);
	}

	@Then("^appropriate error message should be displayed$")
	public void appropriate_error_message_should_be_displayed() throws Throwable {		
		String value = "'Login as "+ConfigReader.getValue("validEmailId")+ " failed. Please try again.'";
		String path = "//span[contains(text(),"+value+")]";
		System.out.println("path "+path);
		Assert.assertTrue(isWebElementPresent(driver, path), "error message is not coming");
		//isWebElementPresent(driver, path);	
	}

	@When("^I enter correct password for invalid email id$")
	public void i_enter_correct_password_for_invalid_email_id() throws Throwable {
		inputText(homePageOR.login_username, wrongEmailId, driver);
		inputText(homePageOR.login_password, wrongFormatEmailId, driver);
	}

	@Then("^respective error message should be displayed$")
	public void respective_error_message_should_be_displayed() throws Throwable {		
		String value = "'Login as "+wrongEmailId+" failed. Please try again.'";
		String path = "//span[contains(text(),"+value+")]";
		System.out.println("path "+path);
		//WebElement element = driver.findElement(By.xpath("//span[contains(text(),\" + value + \")]"));
		Assert.assertTrue(isWebElementPresent(driver, path), "Wrong format error message is not coming");		
		//isWebElementPresent(driver, path);
		
	}
	
	@When("^I click on logout$")
	public void i_click_on_logout() throws Throwable {
		executionDelay(5000);
		clickOnElementUsingJS(driver, homePageOR.myAccountField);
		executionDelay(5000);
		clickOnElementUsingJS(driver, homePageOR.login_signOut);
		executionDelay(7000);
		
	}

	@Then("^it logged out successfully$")
	public void it_logged_out_successfully() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.loginIcon);
		Assert.assertTrue(isWebElementPresent(driver, homePageOR.newShopper), "New shopper window is not coming");
		//isWebElementPresent(driver, homePageOR.newShopper);
		executionDelay(5000);
	}


}
