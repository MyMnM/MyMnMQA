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
import pageobjects.ProductDetailPageOR;
import pageobjects.homePageOR;
import pageobjects.productListOR;

public class Cart extends GlobalUtil{
	public WebDriver driver;	
	public boolean result;
	public String filterValue;	
	public String curentProduct;
	public String newProduct;
	public String itemName;
	public float itemTotal;
	//public String couponCode = "Testcoup1";
	public String invalidCouponCode = "asdewqs";
	public String invalidCouponCodeWithQuotes = "'asdewqs'";
	public String errorMessage = "Sorry, "+invalidCouponCodeWithQuotes+" does not appear to be a valid coupon code.";
	public String cartDiscountValue;
	
	
	
	public Cart() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
		PageFactory.initElements(driver, CartOR.class);
		PageFactory.initElements(driver, ProductDetailPageOR.class);
		
	}
	
	@Then("^product image and product name is displaying in cart page$")
	public void product_image_and_product_name_is_displaying_in_cart_page() throws Throwable {
		Assert.assertTrue("Item image is not present" ,isWebElementPresent(driver, CartOR.cartItemImage));
		Assert.assertTrue("Item name is not present" ,isWebElementPresent(driver, CartOR.cartItem));
		
	}
	
	@Then("^Item / Quantity / Price / Item Total/Subtotal/Total fields are displaying in cart page$")
	public void item_Quantity_Price_Item_Total_Subtotal_Total_fields_are_displaying_in_cart_page() throws Throwable {
		Assert.assertTrue("Item image is not present" ,isWebElementPresent(driver, CartOR.cartItemQuantity));
		Assert.assertTrue("Item image is not present" ,isWebElementPresent(driver, CartOR.cartItemPrice));
		Assert.assertTrue("Item image is not present" ,isWebElementPresent(driver, CartOR.cartItemPriceTotal));
		Assert.assertTrue("Item image is not present" ,isWebElementPresent(driver, CartOR.cartSubTotal));
		Assert.assertTrue("Item image is not present" ,isWebElementPresent(driver, CartOR.cartOrderTotal));
	}

	@Then("^Product code is present under every product present in cart page$")
	public void product_code_is_present_under_every_product_present_in_cart_page() throws Throwable {
		Assert.assertTrue("Item image is not present" ,isWebElementPresent(driver, CartOR.cartItemCode));
	   
	}
	
	@Given("^I click on Personalize button$")
	public void i_click_on_Personalize_button() throws Throwable {
		clickOnElementUsingJS(driver, ProductDetailPageOR.personalizeButton);
	}

	@Given("^I close the pop up window$")
	public void i_close_the_pop_up_window() throws Throwable {		
		executionDelay(5000);
		if(isWebElementPresent(driver, CartOR.fluidCloseIcon)) {
			clickOnElementUsingJS(driver, CartOR.closeIcon);
		}
	}

	@When("^I select a color of the product$")
	public void i_select_a_color_of_the_product() throws Throwable {
		clickOnElementUsingJS(driver, CartOR.gemColor);
	}

	@Then("^I click on Add to Cart button$")
	public void i_click_on_Add_to_Cart_button() throws Throwable {
		clickOnElementUsingJS(driver, CartOR.addToCart);
		executionDelay(20000);
		
	}

	@Then("^it displays Edit Customization option$")
	public void it_displays_Edit_Customization_option() throws Throwable {
		Assert.assertTrue("Edit Customization is not present" ,isWebElementPresent(driver, CartOR.cartEditCustomization));
	}

	@Then("^it displays Preview link$")
	public void it_displays_Preview_link() throws Throwable {
		Assert.assertTrue("Preview is not present" ,isWebElementPresent(driver, CartOR.cartPreview));
	}
	
	@When("^I increment the quantity by clicking on plus sign$")
	public void i_increment_the_quantity_by_clicking_on_plus_sign() throws Throwable {
		itemTotal  = Float.parseFloat(CartOR.priceTotal.getText().split("£")[1]);
		System.out.println("item total "+itemTotal);
		clickOnElementUsingJS(driver, CartOR.qunatityPlusSign);
		executionDelay(5000);
	}

	@Then("^Item total gets increased accordingly$")
	public void item_total_gets_increased_accordingly() throws Throwable {	  
		float newItemTotal = Float.parseFloat(CartOR.priceTotal.getText().split("£")[1]);
		System.out.println("after plus "+newItemTotal);
		Assert.assertTrue("Item total not incremented properly" ,newItemTotal==itemTotal*2);
		
	}

	@When("^I decrement the quantity by clicking on minus sign$")
	public void i_decrement_the_quantity_by_clicking_on_minus_sign() throws Throwable {
		clickOnElementUsingJS(driver, CartOR.qunatityMinusSign);
		executionDelay(5000);
		
	}
	
	@Then("^Item total gets decreased accordingly$")
	public void item_total_gets_decreased_accordingly() throws Throwable {
		float newItemTotal = Float.parseFloat(CartOR.priceTotal.getText().split("£")[1]);
		System.out.println("after minus "+newItemTotal);
		Assert.assertTrue("Item total not decremented properly" ,newItemTotal==itemTotal);
	}
	
	@When("^I click on Remove link$")
	public void i_click_on_Remove_link() throws Throwable {
		executionDelay(6000);
		clickOnElementUsingJS(driver, CartOR.removeLink);
		executionDelay(4000);
	}

	@Then("^item gets removed from the cart$")
	public void item_gets_removed_from_the_cart() throws Throwable {
		Assert.assertFalse("Item is not removed from the cart" ,isWebElementPresent(driver, CartOR.cartItem));
	}
	
	@Then("^Tax & Shipping Calculated at Checkout is present$")
	public void tax_Shipping_Calculated_at_Checkout_is_present() throws Throwable {
		Assert.assertTrue("Tax & Shipping Calculated at Checkout is not present" ,isWebElementPresent(driver, CartOR.cartTaxAndShipping));
	}
	
	@When("^I enter valid coupon code and click on Apply$")
	public void i_enter_valid_coupon_code_and_click_on_Apply() throws Throwable {
		scrollIntoView(CartOR.couponField, driver);
		inputText(CartOR.couponField, ConfigReader.getValue("couponCode"), driver);
		clickOnElementUsingJS(driver, CartOR.applyButton);
		executionDelay(3000);
	}

	@Then("^Coupon code gets applied$")
	public void coupon_code_gets_applied() throws Throwable {
		Assert.assertTrue("Coupon code is not applied" ,isWebElementPresent(driver, CartOR.cartCouponApplied));
		if(isWebElementPresent(driver, CartOR.cartOrderLevelDiscount)) {
		Assert.assertTrue("Coupon code is not applied" ,isWebElementPresent(driver, CartOR.cartOrderLevelDiscount));
		}
		
	}
	
	@When("^I click on Remove link to remove coupon code$")
	public void i_click_on_Remove_link_to_remove_coupon_code() throws Throwable {
		scrollIntoView(CartOR.removeCouponCodeLink, driver);
		clickOnElementUsingJS(driver, CartOR.removeCouponCodeLink);
		executionDelay(3000);
	}

	@Then("^coupon code applied is removed$")
	public void coupon_code_applied_is_removed() throws Throwable {
		Assert.assertFalse("Coupon code is not removed" ,isWebElementPresent(driver, CartOR.cartCouponApplied));
		Assert.assertFalse("Coupon code is not removed" ,isWebElementPresent(driver, CartOR.cartOrderLevelDiscount));
	}
	
	@When("^I enter invalid coupon Code$")
	public void i_enter_invalid_coupon_Code() throws Throwable {
		executionDelay(6000);
		inputText(CartOR.couponField, invalidCouponCode, driver);
		clickOnElementUsingJS(driver, CartOR.applyButton);
	}

	@Then("^it displays appropriate error message$")
	public void it_displays_appropriate_error_message() throws Throwable {
		String errorMessagePath = "//li[contains(text(),\""+errorMessage+"\")]";
		System.out.println("error message path "+errorMessagePath);
		executionDelay(6000);
		Assert.assertTrue("error message for invalid coupon code is not displayed" ,isWebElementPresent(driver, errorMessagePath));
		
	   
	}
	
	@When("^I click on Checkout button$")
	public void i_click_on_Checkout_button() throws Throwable {
		clickOnElementUsingJS(driver, CartOR.checkoutButton);
		executionDelay(5000);
	}

	@Then("^it redirects to Checkout Page$")
	public void it_redirects_to_Checkout_Page() throws Throwable {
	    verifyWebsiteURL(driver, ConfigReader.getValue("checkOutPageURL"));	    
	    
	}
	
	@When("^I click on Continue Shopping button$")
	public void i_click_on_Continue_Shopping_button() throws Throwable {		
		executionDelay(6000);
		clickOnElementUsingJS(driver, CartOR.continueShoppingButton);
		executionDelay(5000);
	}
	
	@Given("^I fetch order level discount at Cart page$")
	public void i_fetch_order_level_discount_at_Cart_page() throws Throwable {
		System.out.println("discount1 "+CartOR.cartDiscountValue.getText().trim());
		cartDiscountValue = (CartOR.cartDiscountValue.getText().trim().split("£"))[1];
	}

	@Then("^Order level discount should match with cart page discount$")
	public void order_level_discount_should_match_with_cart_page_discount() throws Throwable {
		System.out.println("discount2 "+CartOR.checkoutDiscountValue.getText().trim());
	    Assert.assertTrue("Order level discount values are not same" , (CartOR.checkoutDiscountValue.getText().trim().split("£"))[1].equals(cartDiscountValue));
	    Assert.assertTrue("Coupon code is not present" ,isWebElementPresent(driver, CartOR.checkoutCouponCodeField));
	}







	
}
