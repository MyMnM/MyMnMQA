package step_definitions;

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
import pageobjects.LoginSignUpOR;

import pageobjects.homePageOR;


public class LoginPageSignUpPage extends GlobalUtil{
	public WebDriver driver;
	public String invalidEmail = "asdsa";
	public String validEmail = "aab@gmail.com";
	public String password = "password";
	public String reEnterPassword = "rePassword";
	
	
	public LoginPageSignUpPage() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
		PageFactory.initElements(driver, LoginSignUpOR.class);
		PageFactory.initElements(driver, homePageOR.class);
		
	}	

	@Then("^it displays the error messages$")
	public void it_displays_the_error_messages() throws Throwable {
		Assert.assertTrue("Item image is not present" ,isWebElementPresent(driver, LoginSignUpOR.signUpErrorMessage));
		
	}
	
	@When("^I enter email id in wrong format on Sign up page$")
	public void i_enter_email_id_in_wrong_format_on_Sign_up_page() throws Throwable {
		inputText(LoginSignUpOR.email, invalidEmail, driver);
	}
	
	@When("^I enter Password and ReEnter Password with different values$")
	public void i_enter_Password_and_ReEnter_Password_with_different_values() throws Throwable {
		inputText(LoginSignUpOR.email, validEmail, driver);
		inputText(LoginSignUpOR.password, password, driver);
		inputText(LoginSignUpOR.reEnterPassword, reEnterPassword, driver);
	}
	
	@Then("^it should display password error message$")
	public void it_should_display_password_error_message() throws Throwable {
		Assert.assertTrue("Item image is not present" ,isWebElementPresent(driver, LoginSignUpOR.passwordErrorMessage));
		
	}
	
	@Then("^it should display already existing account error message$")
	public void it_should_display_already_existing_account_error_message() throws Throwable {
		Assert.assertTrue("Item image is not present" ,isWebElementPresent(driver, LoginSignUpOR.existingUserErrorMessage));
		
	}
	
	@When("^I input username as \"([^\"]*)\" password as \"([^\"]*)\" and Re-enter password as \"([^\"]*)\"$")
	public void i_input_username_as_password_as_and_Re_enter_password_as(String username, String password, String reEnterPassword) throws Throwable {
	    inputText(homePageOR.signUpEmailBox, username,driver);
	    inputText(homePageOR.signUpPasswordBox, password,driver);
	    inputText(homePageOR.signUpReEnterPasswordBox, reEnterPassword,driver);
	}


	
	
}