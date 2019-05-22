package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartOR {
	
	public final static String cartItemImage = "//img[@class='mz-carttable-item-image']";
	public final static String cartItem = "//a[@class='mz-carttable-item-title']";
	public final static String cartItemQuantity = "(//input[@class='mz-carttable-qty-field'])[2]";
	public final static String cartItemPrice = "(//span[@class='mz-item-price'])[2]";
	public final static String cartItemPriceTotal = "(//span[@class='mz-item-rowtotal '])[2]";
	public final static String cartItemCode = "//span[@class='mz-carttable-item-code']";
	public final static String cartSubTotal = "(//div[@id='mz-carttable-total'])[1]";
	public final static String cartOrderTotal = "(//div[@id='mz-carttable-total'])[2]";
	public final static String cartEditCustomization = "//a[contains(text(),'Edit Customization')]";
	public final static String cartPreview = "//h4[@class='panel-title']";
	public final static String cartQunatityPlus = "(//div[@id='plus' and @class='qty-counter'])[2]";
	public final static String cartQunatityMinus = "(//div[@id='minus' and @class='qty-counter '])[2]";
	public final static String cartRemoveLink  = "(//a[contains(text(),'Remove')])[2]";
	public final static String cartTaxAndShipping  = "//em[@class='mz-auxiliary-text pull-right mz-cart-message-padding']";
	public final static String cartCouponField = "//input[@id='coupon-code']" ;
	public final static String cartApplyButton = "//button[@id='cart-coupon-code']";
	public final static String cartCouponApplied = "//strong[contains(text(),'Code Applied')]";
	public final static String cartOrderLevelDiscount = "//span[contains(text(),'order level discount')]";
	public final static String cartRemoveCouponCode = "//span[@class='mz-remove-coupon mz-link-span']";
	public final static String cartCouponErrorMessage = "//span[@class='mz-remove-coupon mz-link-span']";
	public final static String cartCheckout = "(//button[contains(text(),'Checkout')])[2]";
	public final static String cartContinueShopping = "//button[contains(text(),'Continue Shopping')]";
	public final static String cartOrderLevelDiscountValue = "//div[@class='mz-carttable-total-wrap col-xs-5 col-md-3 col-sm-4 pull-right']//span";
	public final static String checkoutOrderLevelDiscountValue = "//span[@class='mz-ordersummary-discountamt col-sm-4']";
	public final static String checkoutCouponCodeField = "//p[@class='mz-coupon-name']";
	
	
	
	public final static String fluidCloseIcon = "//div[@class='fc-button fc-fancy-button ']";
	public final static String fluidColor = "(//div[@class='fc-lentil'])[1]";
	public final static String fluidSecondColor = "(//div[@class='fc-lentil'])[2]";
	public final static String fluidAddToCart = "//span[contains(text(),'Add to Cart')]";
	
	
	
	

	@FindBy(how=How.XPATH, using=cartItemImage)	
	public static WebElement itemImage;
	
	@FindBy(how=How.XPATH, using=cartItem)
	@CacheLookup
	public static WebElement Item;
	
	@FindBy(how=How.XPATH, using=cartItemQuantity)
	@CacheLookup
	public static WebElement quantity;
	
	@FindBy(how=How.XPATH, using=cartItemPrice)
	@CacheLookup
	public static WebElement price;
	
	@FindBy(how=How.XPATH, using=cartItemPriceTotal)	
	public static WebElement priceTotal;
	
	@FindBy(how=How.XPATH, using=cartItemCode)
	@CacheLookup
	public static WebElement itemCode;
	
	@FindBy(how=How.XPATH, using=cartSubTotal)
	@CacheLookup
	public static WebElement subTotal;
	
	@FindBy(how=How.XPATH, using=cartOrderTotal)
	@CacheLookup
	public static WebElement totalPrice;
	
	@FindBy(how=How.XPATH, using=fluidCloseIcon)
	
	public static WebElement closeIcon;
	
	@FindBy(how=How.XPATH, using=fluidColor)
	@CacheLookup
	public static WebElement gemColor;
	
	@FindBy(how=How.XPATH, using=fluidAddToCart)
	@CacheLookup
	public static WebElement addToCart;
	
	@FindBy(how=How.XPATH, using=cartEditCustomization)
	@CacheLookup
	public static WebElement editCustomization;
	
	@FindBy(how=How.XPATH, using=cartPreview)
	@CacheLookup
	public static WebElement preview;
	
	@FindBy(how=How.XPATH, using=cartQunatityPlus)
	@CacheLookup
	public static WebElement qunatityPlusSign;
	
	@FindBy(how=How.XPATH, using=cartQunatityMinus)
	@CacheLookup
	public static WebElement qunatityMinusSign;
	
	@FindBy(how=How.XPATH, using=cartRemoveLink)
	@CacheLookup
	public static WebElement removeLink;
	
	@FindBy(how=How.XPATH, using=cartTaxAndShipping)
	@CacheLookup
	public static WebElement taxAndShipping;
	
	@FindBy(how=How.XPATH, using=cartCouponField)	
	public static WebElement couponField;
	
	@FindBy(how=How.XPATH, using=cartApplyButton)	
	public static WebElement applyButton;
	
	@FindBy(how=How.XPATH, using=cartCouponApplied)	
	public static WebElement couponAppliedField;
	
	@FindBy(how=How.XPATH, using=cartOrderLevelDiscount)	
	public static WebElement orderLevelDiscountField;
	
	@FindBy(how=How.XPATH, using=cartRemoveCouponCode)	
	public static WebElement removeCouponCodeLink;
	
	@FindBy(how=How.XPATH, using=cartCheckout)	
	public static WebElement checkoutButton;
	
	@FindBy(how=How.XPATH, using=cartContinueShopping)	
	public static WebElement continueShoppingButton;
	
	@FindBy(how=How.XPATH, using=cartOrderLevelDiscountValue)	
	public static WebElement cartDiscountValue;
	
	@FindBy(how=How.XPATH, using=checkoutOrderLevelDiscountValue)	
	public static WebElement checkoutDiscountValue;
	
	@FindBy(how=How.XPATH, using=fluidSecondColor)
	@CacheLookup
	public static WebElement secondGemColor;
	
	

}
