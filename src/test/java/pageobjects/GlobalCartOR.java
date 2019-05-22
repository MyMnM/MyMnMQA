package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GlobalCartOR {
	
	public final static String emptyGlobalCart="//div[contains(text(),'Your shopping cart is empty')]";
	//public final static String pdp_ItemName = "(//h1[@itemprop='name'])[2]";
	public final static String pdp_ItemName = "//h1[@itemprop='name']";
	public final static String golbalCart_item = "(//div[@id='global-cart']//a)[2]";
	public final static String golbalCart_itemImage = "(//div[@id='global-cart']//a)[1]";
	public final static String addToCart = "//button[@id='add-to-cart']";
	
	public final static String pdpQuantity = "//input[@id='mz_pdp_qty']";
	public final static String pdpPriceEach = "(//span[@class='is-not-ranged mz-price is-crossedout'])[2]";
	public final static String pdpPrice = "(//span[@class='mz-price is-saleprice'])[2]";
	public final static String globalCartQuantity = "(//div[@id='global-cart']//span)[1]";
	public final static String globalCartPriceEach = "//span[@class='mz-item-price']";
	public final static String globalCartPrice = "//span[@class='mz-item-rowtotal ']";
	public final static String globalCartSubTotal = "//div[@class='col-xs-12 text-right sub-total-price']//span";
	public final static String globalCartItemLevelDiscount = "//span[@class='mz-item-discountamt']";
	public final static String globalCartTotal = "//div[@class='col-xs-12 text-right  sub-total-price']//span";
	
	public final static String viewCart = "//a[contains(text(),'View Cart')]";
	public final static String checkOut = "//button[contains(text(),'Checkout')]";
	public final static String saveCart = "//button[contains(text(),'Save Cart')]";
	
	public final static String saveCartLogin = "//button[@class='mz-primary-button sign-in']";
	
	
	
	@FindBy(how=How.XPATH, using=emptyGlobalCart)
	@CacheLookup
	public static WebElement emptyGlobalCartMessage;
	
	@FindBy(how=How.XPATH, using=pdp_ItemName)
	@CacheLookup
	public static WebElement pdp_ItemNameLabel;
	
	@FindBy(how=How.XPATH, using=golbalCart_item)
	@CacheLookup
	public static WebElement golbalCart_itemName;
	
	@FindBy(how=How.XPATH, using=addToCart)
	@CacheLookup
	public static WebElement addToCartButton;
	
	@FindBy(how=How.XPATH, using=golbalCart_itemImage)
	@CacheLookup
	public static WebElement golbalCart_itemImageLink;
	
	@FindBy(how=How.XPATH, using=pdpQuantity)
	@CacheLookup
	public static WebElement pdpQuantityValue;
	
	@FindBy(how=How.XPATH, using=pdpPriceEach)
	@CacheLookup
	public static WebElement pdpPriceEachValue;
	
	@FindBy(how=How.XPATH, using=pdpPrice)
	@CacheLookup
	public static WebElement pdpPriceValue;
	
	@FindBy(how=How.XPATH, using=globalCartQuantity)
	@CacheLookup
	public static WebElement globalCartQuantityValue;
	
	@FindBy(how=How.XPATH, using=globalCartPriceEach)
	@CacheLookup
	public static WebElement globalCartPriceEachValue;
	
	@FindBy(how=How.XPATH, using=globalCartPrice)
	@CacheLookup
	public static WebElement globalCartPriceValue;
	
	@FindBy(how=How.XPATH, using=globalCartSubTotal)
	@CacheLookup
	public static WebElement globalCartSubTotalValue;
	
	@FindBy(how=How.XPATH, using=globalCartItemLevelDiscount)
	@CacheLookup
	public static WebElement ItemLevelDiscountValue;
	
	@FindBy(how=How.XPATH, using=globalCartTotal)
	@CacheLookup
	public static WebElement globalCartTotalValue;
	
	@FindBy(how=How.XPATH, using=viewCart)
	@CacheLookup
	public static WebElement viewCartButton;
	
	@FindBy(how=How.XPATH, using=checkOut)
	@CacheLookup
	public static WebElement checkOutButton;
	
	@FindBy(how=How.XPATH, using=saveCart)
	@CacheLookup
	public static WebElement saveCartButton;
	
	@FindBy(how=How.XPATH, using=saveCartLogin)
	@CacheLookup
	public static WebElement saveCartLoginButton;

}
