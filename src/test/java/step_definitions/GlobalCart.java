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
import pageobjects.GlobalCartOR;
import pageobjects.ProductDetailPageOR;
import pageobjects.homePageOR;
import pageobjects.productListOR;

public class GlobalCart extends GlobalUtil{
	public WebDriver driver;	
	public boolean result;
	public String filterValue;	
	String curentProduct;
	String newProduct;
	String itemName;
	
	
	public GlobalCart() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
		PageFactory.initElements(driver, GlobalCartOR.class);
	}
	
	@Then("^it displays Your Shopping basket is empty$")
	public void it_displays_Your_Shopping_basket_is_empty() throws Throwable {				
		Assert.assertTrue("Your Shopping basket is empty is not displayed " ,isWebElementPresent(driver, GlobalCartOR.emptyGlobalCart));
		
	}
	
	@When("^I click on cart button$")
	public void i_click_on_cart_button() throws Throwable {	
		executionDelay(5000);
		clickOnElementUsingJS(driver, GlobalCartOR.addToCartButton);
	}

	
	@Then("^product gets added to global cart$")
	public void product_gets_added_to_global_cart() throws Throwable {	
		itemName = GlobalCartOR.pdp_ItemNameLabel.getText();
		System.out.println("item Name"+ itemName);
		hoverMouse(homePageOR.cartIcon,driver);
		executionDelay(5000);
		Assert.assertTrue("product is not added into the cart", isWebElementPresent(driver, GlobalCartOR.golbalCart_item));
		Assert.assertTrue("product is not added into the cart", isWebElementPresent(driver, GlobalCartOR.golbalCart_itemImage));		
		System.out.println("gvalue "+GlobalCartOR.golbalCart_itemName.getText().trim());
		Assert.assertTrue("product is not added into the cart", itemName.equalsIgnoreCase(GlobalCartOR.golbalCart_itemName.getText().trim()));
		
	}
	
	@Then("^quantity / price each / price / Subtotal is displaying correct in global cart$")
	public void quantity_price_each_price_Subtotal_is_displaying_correct_in_global_cart() throws Throwable {
		hoverMouse(homePageOR.cartIcon,driver);
		executionDelay(7000);
		/*System.out.println("Quantity "+GlobalCartOR.pdpQuantityValue.getAttribute("data-mz-value"));
		System.out.println("Quantity2 "+GlobalCartOR.globalCartQuantityValue.getText());
		System.out.println("Price each "+GlobalCartOR.pdpPriceEachValue.getText());
		System.out.println("Price each "+GlobalCartOR.globalCartPriceEachValue.getText());

		System.out.println("Price "+GlobalCartOR.pdpPriceValue.getText());
		System.out.println("Price "+GlobalCartOR.globalCartPriceValue.getText());
		
		System.out.println("Subtotal "+GlobalCartOR.globalCartSubTotalValue.getText());*/		
		Assert.assertTrue("Quantity value is not correctly displayed", GlobalCartOR.pdpQuantityValue.getAttribute("data-mz-value").equalsIgnoreCase(GlobalCartOR.globalCartQuantityValue.getText()));
		Assert.assertTrue("Price each value is not correctly displayed", GlobalCartOR.pdpPriceEachValue.getText().equalsIgnoreCase(GlobalCartOR.globalCartPriceEachValue.getText()));
		Assert.assertTrue("Price value is not correctly displayed", GlobalCartOR.pdpPriceValue.getText().equalsIgnoreCase(GlobalCartOR.globalCartPriceValue.getText()));
		Assert.assertTrue("Subtotal is not correctly displayed", GlobalCartOR.globalCartPriceValue.getText().equalsIgnoreCase(GlobalCartOR.globalCartSubTotalValue.getText()));
		
		
	}
	
	@Then("^item level discount is applied and total is calcualated for that particular item after deducting item level discount$")
	public void item_level_discount_is_applied_and_total_is_calcualated_for_that_particular_item_after_deducting_item_level_discount() throws Throwable {
		float priceEach = Float.parseFloat(GlobalCartOR.globalCartPriceEachValue.getText().split("£")[1]);
		float discount = Float.parseFloat(GlobalCartOR.ItemLevelDiscountValue.getText().split("£")[1]);
		float total = Float.parseFloat(GlobalCartOR.globalCartTotalValue.getText().split("£")[1]);
		
		Assert.assertTrue("values are different", (priceEach-discount)==total);
	}
	
	@When("^I click on View cart button$")
	public void i_click_on_View_cart_button() throws Throwable {		
		clickOnElementUsingJS(driver, GlobalCartOR.viewCartButton);
	}

	@Then("^it navigates to basket page$")
	public void it_navigates_to_basket_page() throws Throwable {
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("basketPageURL"));
	}

	@When("^I click on checkout button$")
	public void i_click_on_checkout_button() throws Throwable {
		hoverMouse(homePageOR.cartIcon,driver);
		clickOnElementUsingJS(driver, GlobalCartOR.checkOutButton);
	}

	@Then("^it navigates to Checkout page$")
	public void it_navigates_to_Checkout_page() throws Throwable {
		executionDelay(5000);
		verifyWebsiteURL(driver, ConfigReader.getValue("checkOutPageURL"));
	}
	
	@When("^I click on Save Cart button$")
	public void i_click_on_Save_Cart_button() throws Throwable {
		navigateToURL(ConfigReader.getValue("HomePageURL"), driver);
		hoverMouse(homePageOR.cartIcon,driver);
		clickOnElementUsingJS(driver, GlobalCartOR.saveCartButton);
	}

	@Then("^it displays login menu\\.$")
	public void it_displays_login_menu() throws Throwable {
	   
	   Assert.assertTrue("product is not added into the cart", isWebElementPresent(driver, GlobalCartOR.saveCartLogin));		
		
	}

	
}
