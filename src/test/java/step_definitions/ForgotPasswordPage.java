package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import UIAction.ProductListAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.ConfigReader;
import helpers.GlobalUtil;
import pageobjects.ForgotPasswordOR;



public class ForgotPasswordPage extends GlobalUtil{
	public WebDriver driver;
	public String invalidEmail = "wrongEmail";
	
	public ForgotPasswordPage() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
		PageFactory.initElements(driver, ForgotPasswordOR.class);		
		
	}
	
	@When("^I enter email id in wrong pattern$")
	public void i_enter_email_id_in_wrong_pattern() throws Throwable {
		inputText(ForgotPasswordOR.resetEmailField, invalidEmail, driver);
		clickOnElementUsingJS(driver, ForgotPasswordOR.resetEmailSubmitButton);
		executionDelay(3000);
	}

	@Then("^it should display invalid email error message$")
	public void it_should_display_invalid_email_error_message() throws Throwable {
		Assert.assertTrue("Validation message for Invalid email is not displayed", isWebElementPresent(driver, ForgotPasswordOR.resetEmailValidationMessage));
	
	}
	
	@When("^I enter valid email id$")
	public void i_enter_valid_email_id() throws Throwable {
		inputText(ForgotPasswordOR.resetEmailField, ConfigReader.getValue("validEmailId"), driver);
		clickOnElementUsingJS(driver, ForgotPasswordOR.resetEmailSubmitButton);
		executionDelay(3000);
	}

	@Then("^it should display specific message$")
	public void it_should_display_specific_message() throws Throwable {
		Assert.assertTrue("Success message for valid email is not displayed", isWebElementPresent(driver, ForgotPasswordOR.resetValidEmailValidationMessage));
		
	}


	
	
}
