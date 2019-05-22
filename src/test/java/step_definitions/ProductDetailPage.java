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
import pageobjects.ProductDetailPageOR;
import pageobjects.QuickShopOR;
import pageobjects.homePageOR;
import pageobjects.productListOR;

public class ProductDetailPage extends GlobalUtil{
	public WebDriver driver;		
	public String categoryName;
	
	
	public ProductDetailPage() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
		PageFactory.initElements(driver, ProductDetailPageOR.class);
	}
	
	@When("^I navigate to Product Detail Page$")
	public void i_navigate_to_Product_Detail_Page() throws Throwable {
		PageFactory.initElements(driver, ProductDetailPageOR.class);
		PageFactory.initElements(driver, QuickShopOR.class);
		navigateToURL(ConfigReader.getValue("PDPURL"), driver);
	}

	@When("^I click on home page link of breadcrumbs$")
	public void i_click_on_home_page_link_of_breadcrumbs() throws Throwable {
		clickOnElementUsingJS(driver, ProductDetailPageOR.homeBreadcrumbLink);
		executionDelay(5000);
	}

	@Then("^it navigates to Home Page$")
	public void it_navigates_to_Home_Page() throws Throwable {
	    verifyWebsiteURL(driver, ConfigReader.getValue("HomePageURL"));
	}

	@When("^I click on category link of breadcrumbs$")
	public void i_click_on_category_link_of_breadcrumbs() throws Throwable {
		navigateToURL(ConfigReader.getValue("PDPURL"), driver);
		categoryName = ProductDetailPageOR.categoryBreadcrumbLink.getText();
		clickOnElementUsingJS(driver, ProductDetailPageOR.categoryBreadcrumbLink);
		
	}

	@Then("^it navigates to corresponding category page$")
	public void it_navigates_to_corresponding_category_page() throws Throwable {
		executionDelay(5000);
		Assert.assertTrue("It does not navgate to Category page" ,isWebElementPresent(driver, ProductDetailPageOR.categoryName));		
		Assert.assertTrue("It does not navgate to Category page" , categoryName.equalsIgnoreCase(ProductDetailPageOR.categoryNameLabel.getText()));
	}
	
	@When("^I navigate to normal product page$")
	public void i_navigate_to_normal_product_page() throws Throwable {
		navigateToURL(ConfigReader.getValue("PDPNormalItemURL"), driver);
	}

	@Then("^Quantity box is visible with - & \\+ sign to increase and descrease quantity$")
	public void quantity_box_is_visible_with_sign_to_increase_and_descrease_quantity() throws Throwable {
		Assert.assertTrue("Quantity box is visible with + and - sign to increase and descrease quantity" ,isWebElementPresent(driver, ProductDetailPageOR.quantityBox));	
		Assert.assertTrue("+ sign is not visible in quantity box " ,isWebElementPresent(driver, QuickShopOR.quantityPlusSign));	
		Assert.assertTrue("- sign is not visible in quantity box " ,isWebElementPresent(driver, QuickShopOR.minusDisabled));	
		
	}
	
	@Then("^Add to cart button is visible$")
	public void add_to_cart_button_is_visible() throws Throwable {
		//Assert.assertTrue("Add to cart button is not displayed" ,isWebElementPresent(driver, ProductDetailPageOR.addToCart));	
		
	}

	@When("^I click on it$")
	public void i_click_on_it() throws Throwable {
		System.out.println("inside click it");
		//executionDelay(10000);
		clickOnElementUsingJS(driver, ProductDetailPageOR.addToCartButton);
		executionDelay(5000);
	}

	@Then("^it displays Proceed to Checkout button$")
	public void it_displays_Proceed_to_Checkout_button() throws Throwable {
		Assert.assertTrue("Proceed to checkout button is not displayed" ,isWebElementPresent(driver, ProductDetailPageOR.proceedToCheckout));	
		
	}
	
	@When("^I click on personalize button$")
	public void i_click_on_personalize_button() throws Throwable {
		clickOnElementUsingJS(driver, ProductDetailPageOR.personalizeButton);
	}

	@Then("^it navigates to fluid page$")
	public void it_navigates_to_fluid_page() throws Throwable {
		
	}

	@Then("^personalize button is not visible$")
	public void personalize_button_is_not_visible() throws Throwable {
		Assert.assertTrue("Personalize button is not displayed" ,!(isWebElementPresent(driver, ProductDetailPageOR.personalize)));	
		
	}
    
	@When("^I navigate to zero inventory customized product$")
	public void i_navigate_to_zero_inventory_customized_product() throws Throwable {
		navigateToURL(ConfigReader.getValue("zeroInventoryCustomizeProductURL"), driver);
	}
	
}
