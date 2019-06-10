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

import pageobjects.homePageOR;
import pageobjects.productListOR;

public class productList extends GlobalUtil{
	public WebDriver driver;	
	public boolean result;
	public String filterValue;	
	String curentProduct;
	String newProduct;
	public String usSiteFirstElement;
	public String usSiteSecondElement;
	
	
	
	public productList() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
	}
	
	@When("^I navigate to product List page$")
	public void i_navigate_to_product_List_page() throws Throwable {
		PageFactory.initElements(driver, productListOR.class);
		navigateToURL(ConfigReader.getValue("productListURL"), driver);
	}

	@When("^I click on product name$")
	public void i_click_on_product_name() throws Throwable {
	   clickOnElementUsingJS(driver, productListOR.productNameLink);
	}

	@Then("^it redirects to product detail page$")
	public void it_redirects_to_product_detail_page() throws Throwable {
	    executionDelay(3000);
	    Assert.assertTrue("bread crumbs is not coming" ,isWebElementPresent(driver, productListOR.breadCrumbs));		
		
		//isWebElementPresent(driver, productListOR.breadCrumbs);
	}
	@Given("^I click on product image$")
	public void i_click_on_product_image() throws Throwable {
		navigateToURL(ConfigReader.getValue("productListURL"), driver);
		clickOnElementUsingJS(driver, productListOR.productImageLink);
	}
	@Given("^I hover mouse over the product$")
	public void i_hover_mouse_over_the_product() throws Throwable {
	   hoverMouse(productListOR.productNameLink, driver);
	}

	@Then("^it displays Quick Shop button$")
	public void it_displays_Quick_Shop_button() throws Throwable {
		Assert.assertTrue("bread crumbs is not coming" ,isWebElementPresent(driver, productListOR.quickShop));		
			
	    //isWebElementPresent(driver, productListOR.quickShop);
	}
	

    @When("^I select particular value from per page drop down$")
    public void i_select_particular_value_from_per_page_drop_down() throws Throwable {
    	 result = ProductListAction.verifyDisplayedItems(driver);
    }

	@Then("^products are listed as per option selected$")
	public void products_are_listed_as_per_option_selected() throws Throwable {
	    Assert.assertTrue(result);
	}
	
	@When("^I select Low to High sortby value$")
	public void i_select_Low_to_High_sortby_value() throws Throwable {
	   //SelectUsingIndex(productListOR.sortByDropDown, 2);
	   SelectUsingVisibleValue(productListOR.sortByDropDown, "Sort by: Price: Low to High");
	   executionDelay(15000);
	}

	@Then("^products gets listed as per Low to High$")
	public void products_gets_listed_as_per_Low_to_High() throws Throwable {
	  Assert.assertTrue(ProductListAction.verifyLowToHigh(productListOR.priceFirstItemField,productListOR.priceSecondItemField));
	}

	@When("^I select High to Low sortby value$")
	public void i_select_High_to_Low_sortby_value() throws Throwable {
		//SelectUsingIndex(productListOR.sortByDropDown, 3);
		SelectUsingVisibleValue(productListOR.sortByDropDown, "Sort by: Price: High to Low");
		 executionDelay(15000);
	}

	@Then("^products gets listed as per High to Low$")
	public void products_gets_listed_as_per_High_to_Low() throws Throwable {
		 Assert.assertTrue(ProductListAction.verifyHighToLow(productListOR.priceFirstItemField,productListOR.priceSecondItemField));
			
	}
	
	@When("^I select Weight filter$")
	public void i_select_Weight_filter() throws Throwable {
	   clickOnElementUsingJS(driver, productListOR.weightFilter);
	   executionDelay(5000);
	   //filterValue = productListOR.firstFilterValue.getAttribute("id").toUpperCase(); changed for US site
	   filterValue = productListOR.firstFilterValue.getAttribute("id").toUpperCase().split(" ")[0];
	   System.out.println("filter "+filterValue);
	   executionDelay(5000);
	   clickOnElementUsingJS(driver, productListOR.firstFilterValue);
	   executionDelay(7000);
	   
	}

	@Then("^products gets listed as per selected filter$")
	public void products_gets_listed_as_per_selected_filter() throws Throwable {
	    
		Assert.assertTrue(ProductListAction.verifyFilterResults(driver, filterValue));
	}

	@When("^I click on Cross next to filer$")
	public void i_click_on_Cross_next_to_filer() throws Throwable {
		clickOnElementUsingJS(driver, productListOR.removeFilterField);
		executionDelay(7000);
	}

	@Then("^filter gets removed$")
	public void filter_gets_removed() throws Throwable {
		//checking second element does not contain filter value
		executionDelay(5000);
		Assert.assertFalse(productListOR.secondProductNameLink.getText().contains(filterValue));
	}

	@When("^I select another Weight$")
	public void i_select_another_Weight() throws Throwable {
		 clickOnElementUsingJS(driver, productListOR.weightFilter);
		 executionDelay(5000);
		 filterValue = productListOR.secondFilterValue.getAttribute("id").toUpperCase().split(" ")[0];
		 System.out.println("second time filter "+filterValue);
		 clickOnElementUsingJS(driver, productListOR.secondFilterValue);
		 executionDelay(7000);
	}
	
	@Then("^products gets listed per selected filter$")
	public void products_gets_listed_per_selected_filter() throws Throwable {
		Assert.assertTrue(ProductListAction.verifyFilterResults(driver, filterValue));
	}
	
	@When("^I click on Clear All$")
	public void i_click_on_Clear_All() throws Throwable {
		clickOnElementUsingJS(driver, productListOR.clearAllLink);
	}

	
	@When("^I click on page number$")
	public void i_click_on_page_number() throws Throwable {
	   
		curentProduct = productListOR.productNameLink.getText();
		System.out.println("product name "+curentProduct);
		clickOnElementUsingJS(driver, productListOR.productsPageNumber);
		executionDelay(10000);
	}

	@Then("^it navigates to next page$")
	public void it_navigates_to_next_page() throws Throwable {
		newProduct = productListOR.productNameLink.getText();
		System.out.println("product name "+newProduct);
		Assert.assertFalse("Pagination is not working properly",curentProduct.equalsIgnoreCase(newProduct));
	}

	@When("^I click on right arrow$")
	public void i_click_on_right_arrow() throws Throwable {
		curentProduct = newProduct;
		System.out.println("product name "+curentProduct);
		clickOnElementUsingJS(driver, productListOR.paginationRightArrow);
		executionDelay(10000);
	}
	
	@Then("^it navigates to other page$")
	public void it_navigates_to_other_page() throws Throwable {		
		newProduct = productListOR.productNameLink.getText();	
		System.out.println("product name "+newProduct);
		Assert.assertFalse("Pagination is not working properly",curentProduct.equalsIgnoreCase(newProduct));
	}

	@When("^I click on left arrow$")
	public void i_click_on_left_arrow() throws Throwable {
		curentProduct = newProduct;
		System.out.println("product name "+curentProduct);
		clickOnElementUsingJS(driver, productListOR.paginationLeftArrow);
		executionDelay(10000);
	}

	@Then("^it navigates to previous page$")
	public void it_navigates_to_previous_page() throws Throwable {
		newProduct = productListOR.productNameLink.getText();
		System.out.println("product name "+newProduct);
		Assert.assertFalse("Pagination is not working properly",curentProduct.equalsIgnoreCase(newProduct));
	 
	}
	
	@When("^I navigate to customised product$")
	public void i_navigate_to_customised_product() throws Throwable {
	   navigateToURL(ConfigReader.getValue("customiseItemURL"), driver);
	}

	@Then("^it shows Personalize button$")
	public void it_shows_Personalize_button() throws Throwable {
		Assert.assertFalse("Personalize is not displayed",isWebElementPresent(driver, productListOR.personalize));
		 
	   //isWebElementPresent(driver, productListOR.personalize);
	}

	@When("^I navigate to non customised product$")
	public void i_navigate_to_non_customised_product() throws Throwable {
		navigateToURL(ConfigReader.getValue("nonCustomiseURL"), driver);
	}

	@Then("^it shows Add to cart button$")
	public void it_shows_Add_to_cart_button() throws Throwable {
		Assert.assertFalse("add to cart is not displayed",isWebElementPresent(driver, productListOR.addToCart));
		
		//isWebElementPresent(driver, productListOR.addToCart);
	}
	
	
	@Then("^products gets listed as per Low to High for US site$")
	public void products_gets_listed_as_per_Low_to_High_for_US_site() throws Throwable {
	    executionDelay(4000);	    
	    float price_FirstItem = Float.parseFloat((productListOR.usPriceFirstItemField.getText().split("\\$"))[1]);	    
	    float price_SecondItem = Float.parseFloat((productListOR.usPriceSecondItemField.getText().split("\\$"))[1]);	    
	    Assert.assertTrue("Products are not filtered as per Low to High", price_FirstItem<=price_SecondItem);
	}

	@Then("^products gets listed as per High to Low for US site$")
	public void products_gets_listed_as_per_High_to_Low_for_US_site() throws Throwable {
		executionDelay(4000);
	    float price_FirstItem = Float.parseFloat((productListOR.usPriceFirstItemField.getText().split("\\$"))[1]);
	    float price_SecondItem = Float.parseFloat((productListOR.usPriceSecondItemField.getText().split("\\$"))[1]);	    
	    Assert.assertTrue("Products are not filtered as per Low to High", price_FirstItem>=price_SecondItem);
	}
	
	




	
}