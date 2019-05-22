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
import pageobjects.CartOR;
import pageobjects.CheckoutOR;
import pageobjects.GlobalCartOR;
import pageobjects.OrderConfirmationOR;
import pageobjects.ProductDetailPageOR;
import pageobjects.homePageOR;
import pageobjects.productListOR;

public class OrderConfirmationPage extends GlobalUtil{
	public WebDriver driver;		
	
	public OrderConfirmationPage() {
		driver = Hooks.driver;	
		PageFactory.initElements(driver, OrderConfirmationOR.class);
		PageFactory.initElements(driver, CheckoutOR.class);
		PageFactory.initElements(driver, CartOR.class);
	}
	
	@Then("^Payment section shows Order total with payment options,billing email / billing name / billing address,payment details$")
	public void payment_section_shows_Order_total_with_payment_options_billing_email_billing_name_billing_address_payment_details() throws Throwable {
		
		scrollIntoView(OrderConfirmationOR.billingCardNumberField, driver);
		Assert.assertTrue("Billing Payment is not displayed" ,isWebElementPresent(driver, OrderConfirmationOR.billingPayment));
		Assert.assertTrue("Billing Email is not displayed" ,isWebElementPresent(driver, OrderConfirmationOR.billingEmail));
		Assert.assertTrue("Billing Email is not displayed" ,isWebElementPresent(driver, OrderConfirmationOR.billingName));		
		Assert.assertTrue("Billing Address is not displayed" ,isWebElementPresent(driver, OrderConfirmationOR.billingAddress));
		Assert.assertTrue("Billing Card Type is not displayed" ,isWebElementPresent(driver, OrderConfirmationOR.billingCardType));
		Assert.assertTrue("Billing Card Number is not displayed" ,isWebElementPresent(driver, OrderConfirmationOR.billingCardNumber));
		
	}
	
	@Then("^Order Sumaary section  has Product Code,Product details,Product price,Product price total,Price summary section$")
	public void order_Sumaary_section_has_Product_Code_Product_details_Product_price_Product_price_total_Price_summary_section() throws Throwable {
		scrollIntoView(CartOR.itemImage, driver);
		Assert.assertTrue("Item image is not displayed" ,isWebElementPresent(driver, CartOR.cartItemImage));
		Assert.assertTrue("Item name is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryItemName));
		Assert.assertTrue("Item code is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryItemCode));
		Assert.assertTrue("Item quantity is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryItemQuantity));
		Assert.assertTrue("Item price is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryItemPrice));
		Assert.assertTrue("Item price is not displayed" ,isWebElementPresent(driver, CartOR.cartItemPriceTotal));		
		Assert.assertTrue("Item subtotal is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummarySubTotal));
		Assert.assertTrue("VAT is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryVAT));
		Assert.assertTrue("Shipping and Handling is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryShippingAndHandling));
		Assert.assertTrue("Grand total is not displayed" ,isWebElementPresent(driver, CheckoutOR.checkoutOrderSummaryGrandTotal));
		
	}
	
	@Then("^order level discount applies on and then order total is calculated$")
	public void order_level_discount_applies_on_and_then_order_total_is_calculated() throws Throwable {
		
		Double subTotal = Double.parseDouble((CheckoutOR.orderSummarySubTotalValue.getText().split("£"))[1]);
		System.out.println("subtotal "+subTotal);
		Double orderLevelDiscount = Double.parseDouble((CheckoutOR.orderSummaryOrderLevelDiscountValue.getText().split("£"))[1]);
		System.out.println("discount "+orderLevelDiscount);
		Double sAndHTaxValue = Double.parseDouble((CheckoutOR.orderSummarySAndHTaxValue.getText().split("£"))[1]);
		System.out.println("shippingTax "+sAndHTaxValue);
		Double grandTotal = Double.parseDouble((CheckoutOR.orderSummaryGrandTotalValue.getText().split("£"))[1]);
		System.out.println("total "+grandTotal);
		/*Double finalValue = subTotal-orderLevelDiscount+sAndHTaxValue;
		double finalValue2 = Math.round(finalValue*100)/100;
		System.out.println("final value "+finalValue2)*/;
		Assert.assertTrue("order level discount is not applied on and then order total is calculated",Math.ceil(subTotal-orderLevelDiscount+sAndHTaxValue)==Math.ceil(grandTotal));
	}
}
