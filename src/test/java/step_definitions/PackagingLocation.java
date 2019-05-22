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
import pageobjects.GlobalCartOR;
import pageobjects.PackagingLocationOR;
import pageobjects.ProductDetailPageOR;
import pageobjects.homePageOR;
import pageobjects.productListOR;

public class PackagingLocation extends GlobalUtil{
	public WebDriver driver;
	int productsCount = 2;
	
	public PackagingLocation() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
		PageFactory.initElements(driver, PackagingLocationOR.class);
		PageFactory.initElements(driver, CartOR.class);
		
	}
	
	@When("^I navigate to first different location product$")
	public void i_navigate_to_first_different_location_product() throws Throwable {
		navigateToURL(ConfigReader.getValue("productURLwithDifferentPackagingLocation"), driver);
	}

	@When("^I navigate to second different location product$")
	public void i_navigate_to_second_different_location_product() throws Throwable {
		navigateToURL(ConfigReader.getValue("secondProductURLwithDifferentPackagingLocation"), driver);
	}

	@Then("^it does not get added to Cart and displays Error message$")
	public void it_does_not_get_added_to_Cart_and_displays_Error_message() throws Throwable {
		Assert.assertTrue("Product with different location gets added to cart", isWebElementPresent(driver, PackagingLocationOR.packagingRestrictionMessage));
	}
	
	@Then("^both the products should be displaying in the cart$")
	public void both_the_products_should_be_displaying_in_the_cart() throws Throwable {
		executionDelay(3000);
		Assert.assertTrue("both the products are not added to the cart",countOfElements(driver, CartOR.cartItem)==productsCount);
	}
	
}