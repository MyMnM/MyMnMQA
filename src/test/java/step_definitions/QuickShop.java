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
import pageobjects.QuickShopOR;
import pageobjects.homePageOR;
import pageobjects.productListOR;

public class QuickShop extends GlobalUtil{
	public WebDriver driver;	
	public boolean result;
	public String filterValue;	
	String curentProduct;
	String newProduct;
	String initialQuantity;
	
	
	public QuickShop() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
	}
	
	@Then("^Global Cart is visible$")
	public void global_Cart_is_visible() throws Throwable {
		PageFactory.initElements(driver, productListOR.class);
		PageFactory.initElements(driver, QuickShopOR.class);
		Assert.assertTrue("Global cart is not visible", isWebElementPresent(driver, QuickShopOR.globalCart));
		
  	
	}

	
	@When("^I click on Quick Shop button$")
	public void i_click_on_Quick_Shop_button() throws Throwable {
		
		ProductListAction.hoverMouse(productListOR.productNameLink, driver);
		executionDelay(5000);
		clickOnElementUsingJS(driver, productListOR.quickShopButton);
	}

	@Then("^it displays accordion$")
	public void it_displays_accordion() throws Throwable {
		executionDelay(3000);
		Assert.assertTrue("Accordion is not present", isWebElementPresent(driver, QuickShopOR.accordion));
	    
		
	}
	
	@Given("^I expand Personalization Options$")
	public void i_expand_Personalization_Options() throws Throwable {
	    clickOnElementUsingJS(driver, QuickShopOR.personalizationOptionsTab);
	    executionDelay(3000);
	    Assert.assertTrue("personalizationOptionsTab cannot be expand", isWebElementPresent(driver, QuickShopOR.personalizationSection));
	    
	}

	@Given("^I collapse Personalization Options$")
	public void i_collapse_Personalization_Options() throws Throwable {
		clickOnElementUsingJS(driver, QuickShopOR.personalizationOptionsTab);
		executionDelay(3000);
		Assert.assertTrue("Is not able to minimuise it", isWebElementPresent(driver, QuickShopOR.maximisePersonalization));
	}
	
	@When("^I navigate to non-customisable product listing$")
	public void i_navigate_to_non_customisable_product_listing() throws Throwable {
	    navigateToURL(ConfigReader.getValue("nonCustomiseListingURL"), driver);
	}

	@Then("^it displays Quantity field$")
	public void it_displays_Quantity_field() throws Throwable {
		Assert.assertTrue("quantity label is not displayed", isWebElementPresent(driver, QuickShopOR.quantityLabel));
		
	   //isWebElementPresent(driver, QuickShopOR.quantityLabel);
	}
	
	@When("^I click on Plus icon$")
	public void i_click_on_Plus_icon() throws Throwable {
		initialQuantity = QuickShopOR.quantityValueBox.getAttribute("value");
		System.out.println("initial Qunatity "+initialQuantity);
	    clickOnElementUsingJS(driver, QuickShopOR.increaseQuantity);
	    executionDelay(5000);
	}

	@Then("^quantity value gets increased$")
	public void quantity_value_gets_increased() throws Throwable {
		String finalQuantity = QuickShopOR.quantityValueBox.getAttribute("value");
		System.out.println("final Qunatity "+finalQuantity);		
		Assert.assertTrue("quantity does not gets increased", !(finalQuantity.equals(initialQuantity)));
		executionDelay(5000);
	}

	@When("^I click on minus icon$")
	public void i_click_on_minus_icon() throws Throwable {
		initialQuantity = QuickShopOR.quantityValueBox.getAttribute("value");
		System.out.println("initial Qunatity "+initialQuantity);
		clickOnElementUsingJS(driver, QuickShopOR.decreaseQuantity);
		executionDelay(5000);//delays are added to show the flow on GUI as automation is very fast
	}

	@Then("^quantity value gets decreased$")
	public void quantity_value_gets_decreased() throws Throwable {
		String finalQuantity = QuickShopOR.quantityValueBox.getAttribute("value");
		System.out.println("final Qunatity "+finalQuantity);
		Assert.assertTrue("quantity does not gets decreased", !(finalQuantity.equals(initialQuantity)));
		executionDelay(3000);
	}
	
	@Then("^it displays Add To Cart Button$")
	public void it_displays_Add_To_Cart_Button() throws Throwable {
		Assert.assertTrue("Add to Cart is not displayed" , isWebElementPresent(driver, QuickShopOR.addToCart));
	}

	@When("^I click on Add To Cart Button$")
	public void i_click_on_Add_To_Cart_Button() throws Throwable {
		scrollIntoView(QuickShopOR.addToCartButton, driver);
		clickOnElementUsingJS(driver, QuickShopOR.addToCartButton);
		executionDelay(5000);
	}

	@Then("^it displays Global Cart$")
	public void it_displays_Global_Cart() throws Throwable {
		Assert.assertTrue("Global Cart is not displayed" , isWebElementPresent(driver, QuickShopOR.globalCart));
	}
	
	@When("^I navigate to Product listing$")
	public void i_navigate_to_Product_listing() throws Throwable {
	   navigateToURL(ConfigReader.getValue("bagsProductsURL"), driver);
	}

	
	@Then("^it displays Personalize button$")
	public void it_displays_Personalize_button() throws Throwable {
		Assert.assertTrue("Personalize is not displayed", isWebElementPresent(driver, QuickShopOR.personalizeProduct));
		
		//isWebElementPresent(driver, QuickShopOR.personalizeProduct);
	}

	@When("^i click on Personalize button$")
	public void i_click_on_Personalize_button() throws Throwable {
		clickOnElementUsingJS(driver, QuickShopOR.personalizeButton);
	}

	@Then("^it navigates to its desired webpage$")
	public void it_navigates_to_its_desired_webpage() throws Throwable {
		executionDelay(5000);
		Assert.assertTrue("Personalize message is not displayed" , isWebElementPresent(driver, QuickShopOR.personalizeMessage));
	}
	
	@When("^I click View full details hyperlink$")
	public void i_click_View_full_details_hyperlink() throws Throwable {
		clickOnElementUsingJS(driver, QuickShopOR.viewFullDetailsLink);
	}

	@Then("^it navigates to desired webpage$")
	public void it_navigates_to_desired_webpage() throws Throwable {
		executionDelay(5000);
		Assert.assertTrue("Personalize message is not displayed" , isWebElementPresent(driver, productListOR.breadCrumbs));
		
	}
	
	@Then("^minimum order quantity message is displayed$")
	public void minimum_order_quantity_message_is_displayed() throws Throwable {
		Assert.assertTrue("Personalize message is not displayed" , isWebElementPresent(driver, QuickShopOR.minimumQuantity));
		
	}

	@Then("^minus button of Quantity box is disabled$")
	public void minus_button_of_Quantity_box_is_disabled() throws Throwable {
		executionDelay(5000);
		Assert.assertTrue("Personalize message is not displayed" , isWebElementPresent(driver, QuickShopOR.minusDisabled));
		
	}



	
}
	