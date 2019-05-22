package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetailPageOR {
	
	public final static String homeBreadcrumb="//a[contains(text(),'Home')]";
	public final static String categoryBreadcrumb="//a[@class='mz-breadcrumb-link is-first']";
	public final static String categoryName = "//div[@class='mz-pagetitle product-label col-xs-12 col-lg-5']";
	public final static String quantityBox = "//div[@class='qty-box']";
	public final static String addToCart = "//button[@id='add-to-cart']";
	//public final static String proceedToCheckout = "//button[contains(text(),'Proceed to Checkout')]";
	public final static String proceedToCheckout = "//button[@data-mz-action='checkoutGuest']";
	public final static String personalize = "//button[contains(text(),'Personalize')]";
	public final static String pdpItemName = "//div[@class='col-xs-12 col-sm-6 col-lg-offset-2 col-lg-5 product-description']//h1[@class='mz-pagetitle']";
	
	
	@FindBy(how=How.XPATH, using=homeBreadcrumb)
	@CacheLookup
	public static WebElement homeBreadcrumbLink;
	
	@FindBy(how=How.XPATH, using=categoryBreadcrumb)
	@CacheLookup
	public static WebElement categoryBreadcrumbLink;
	
	@FindBy(how=How.XPATH, using=categoryName)
	@CacheLookup
	public static WebElement categoryNameLabel;
	
	@FindBy(how=How.XPATH, using=quantityBox)
	@CacheLookup
	public static WebElement quantityBoxField;
	
	@FindBy(how=How.XPATH, using=addToCart)
	
	public static WebElement addToCartButton;
	
	@FindBy(how=How.XPATH, using=proceedToCheckout)
	@CacheLookup
	public static WebElement proceedToCheckoutButton;
	
	@FindBy(how=How.XPATH, using=personalize)
	@CacheLookup
	public static WebElement personalizeButton;
	
	@FindBy(how=How.XPATH, using=pdpItemName)
	@CacheLookup
	public static WebElement itemName;

}
