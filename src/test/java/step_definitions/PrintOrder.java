package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import helpers.GlobalUtil;
import pageobjects.PrintOrderOR;



public class PrintOrder extends GlobalUtil{
	public WebDriver driver;	
	
	public PrintOrder() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, PrintOrderOR.class);
	}
	@Given("^print icon is present on the right side corner of the order confirmation page and is clikable$")
	public void print_icon_is_present_on_the_right_side_corner_of_the_order_confirmation_page_and_is_clikable() throws Throwable {
		clickOnElementUsingJS(driver, PrintOrderOR.printIcon);
		
	}
	
}
	
	