package step_definitions;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.ConfigReader;
import helpers.GlobalUtil;
import junit.framework.Assert;
import pageobjects.CartOR;
import pageobjects.FluidPageOR;
import pageobjects.ProductDetailPageOR;


public class Fluid extends GlobalUtil{
	public WebDriver driver;	
	public String originalSubtotal;	
	
	public Fluid() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
		PageFactory.initElements(driver, FluidPageOR.class);
		PageFactory.initElements(driver, CartOR.class);
		
		
	}
	
	@When("^I click on Add ClipArt$")
	public void i_click_on_Add_ClipArt() throws Throwable {
		clickOnElementUsingJS(driver, FluidPageOR.clipArtCircle);
	    
	}

	@When("^I select clipArt image$")
	public void i_select_clipArt_image() throws Throwable {
		clickOnElementUsingJS(driver, FluidPageOR.clipArtImage);
	}

	@When("^I click on Add Text$")
	public void i_click_on_Add_Text() throws Throwable {
		clickOnElementUsingJS(driver, FluidPageOR.addTextCircle);
	   
	}

	@When("^enter the desired text$")
	public void enter_the_desired_text() throws Throwable {
		inputText(FluidPageOR.addTextArea1, ConfigReader.getValue("fluidTextValue1"), driver);
		inputText(FluidPageOR.addTextArea2, ConfigReader.getValue("fluidTextValue2"), driver);
	}

	@When("^I click on Packaging information$")
	public void i_click_on_Packaging_information() throws Throwable {
		clickOnElementUsingJS(driver, FluidPageOR.selectPackaging);
	}

	@When("^I select desired packaging$")
	public void i_select_desired_packaging() throws Throwable {
		clickOnElementUsingJS(driver, FluidPageOR.packagingImage);
	}
	
	@When("^I update Quantity after selection of packing$")
	public void i_update_Quantity_after_selection_of_packing() throws Throwable {
		originalSubtotal = FluidPageOR.packagingSubtotal.getText();
		System.out.println("original value "+originalSubtotal);
		clickOnElementUsingJS(driver, FluidPageOR.packagingIncreaseQuantityButton);
	}

	@Then("^Subtotal also gets updated$")
	public void subtotal_also_gets_updated() throws Throwable {
		executionDelay(3000);
		System.out.println("new value "+FluidPageOR.packagingSubtotal.getText());
		Assert.assertFalse("Minimum quantity value is not updated",FluidPageOR.packagingSubtotal.getText().equals(originalSubtotal));
		
	}
	
	@Given("^I click on Save Design button$")
	public void i_click_on_Save_Design_button() throws Throwable {
		clickOnElementUsingJS(driver, FluidPageOR.savedDesignButton);
	}

	@Given("^I open the saved design in new tab$")
	public void i_open_the_saved_design_in_new_tab() throws Throwable {
		
		String copyUrl = FluidPageOR.savedDesignUrl.getAttribute("value");
		openNewBrowserTab(driver);	
		executionDelay(4000);
		switchToNewBrowserTab(driver);
		navigateToURL(copyUrl,driver);		
		executionDelay(5000);
	}

	@Then("^I verify that the deign is same$")
	public void i_verify_that_the_deign_is_same() throws Throwable {
		Assert.assertTrue("Design is not saved" ,isWebElementPresent(driver, FluidPageOR.fluidColorRemove));
		
	}

	@When("^I click on Save To Account$")
	public void i_click_on_Save_To_Account() throws Throwable {		
		switchBackToOriginalBrowserTab(driver);
		clickOnElementUsingJS(driver, FluidPageOR.saveToAccountButton);
	}

	@Then("^the design gets saved successfully\\.$")
	public void the_design_gets_saved_successfully() throws Throwable {
		executionDelay(5000);
		clickOkOnDialogBox(driver);
		executionDelay(5000);
	}
	
	@When("^I click on Print button$")
	public void i_click_on_Print_button() throws Throwable {
		clickOnElementUsingJS(driver, FluidPageOR.printButton);
	}

	@Then("^it displays Print popUp$")
	public void it_displays_Print_popUp() throws Throwable {		
		//not possible to verify for Print popUp
		
	}
	
	@Given("^I click on Reset button$")
	public void i_click_on_Reset_button() throws Throwable {
		clickOnElementUsingJS(driver, FluidPageOR.resetButton);
	}

	@Then("^it should reset it$")
	public void it_should_reset_it() throws Throwable {
		executionDelay(3000);
		Assert.assertFalse("It is not reset after clicking reset button" ,isWebElementPresent(driver, FluidPageOR.fluidColorRemove));
	}
	
	@When("^I click on Edit Customization option$")
	public void i_click_on_Edit_Customization_option() throws Throwable {
	    clickOnElementUsingJS(driver, CartOR.editCustomization);
	}

	@When("^I edit the customisation on Design page$")
	public void i_edit_the_customisation_on_Design_page() throws Throwable {
		clickOnElementUsingJS(driver, CartOR.secondGemColor);
	}

	@Then("^I update cart on clicking update cart button$")
	public void i_update_cart_on_clicking_update_cart_button() throws Throwable {
		clickOnElementUsingJS(driver, FluidPageOR.updateCartButton);		
	}

	
	
}
