package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QuickShopOR {
	
	public final static String accordion = "(//div[@class='product-list-detail quick-view-accordion'])[1]";
	public final static String personalization_Options = "//span[contains(text(),'Personalization Options')]";
	public final static String personalizationSection = "//div[@class='mz-l-stack-section personalization-option pull-left']";
	public final static String maximisePersonalization = "//i[@class='fa fa-minus pull-right']";
	public final static String quantityLabel = "//label[@class='mz-qty-label text-uppercase']";
	public final static String quantityValue = "//input[@class='mz-productdetail-qty text-center']";
	public final static String quantityPlusSign = "//div[@class='qty-counter']//i[@class='fa fa-plus']";
	public final static String quantityMinusSign = "//div[@class='qty-counter']//i[@class='fa fa-minus']";
	public final static String addToCart = "//button[@id='add-to-cart']";
	public final static String globalCart = "//div[@id='global-cart']";
	public final static String personalizeProduct = "//button[@class='mz-customize-button btnAddToCart']";
	//public final static String personalizeMessage = "//h1[contains(text(),'Personalise Your Own')]";
	//commented for US site as it has Design Your Own
	public final static String personalizeMessage = "//h1[contains(text(),'Your Own')]";
	public final static String viewFullDetails = "//a[contains(text(),'VIEW FULL DETAILS')]";
	public final static String minimumQuantity = "//span[@class='min-qty-padding']";
	public final static String minusDisabled = "//div[@class='qty-counter disabled-qty']";
	
	@FindBy(how=How.XPATH, using=accordion)
	@CacheLookup
	public static WebElement accordionPanel;
	
	@FindBy(how=How.XPATH, using=personalization_Options)	
	public static WebElement personalizationOptionsTab;
	

	@FindBy(how=How.XPATH, using=personalizationSection)
	@CacheLookup
	public static WebElement personalizationSectionView;
	
	@FindBy(how=How.XPATH, using=maximisePersonalization)
	@CacheLookup
	public static WebElement maximisePersonalizationSection;
	
	@FindBy(how=How.XPATH, using=quantityLabel)
	@CacheLookup
	public static WebElement quantityLabelQuickShop;
	
	@FindBy(how=How.XPATH, using=quantityPlusSign)
	@CacheLookup
	public static WebElement increaseQuantity;
	
	@FindBy(how=How.XPATH, using=quantityValue)
	
	public static WebElement quantityValueBox;
	
	@FindBy(how=How.XPATH, using=quantityMinusSign)
	@CacheLookup
	public static WebElement decreaseQuantity;
	
	@FindBy(how=How.XPATH, using=addToCart)
	@CacheLookup
	public static WebElement addToCartButton;
	
	@FindBy(how=How.XPATH, using=globalCart)
	@CacheLookup
	public static WebElement globalCartPanel;
	
	@FindBy(how=How.XPATH, using=personalizeProduct)
	@CacheLookup
	public static WebElement personalizeButton;
	
	@FindBy(how=How.XPATH, using=personalizeMessage)
	@CacheLookup
	public static WebElement personalizeYourOwnMnM;
	
	@FindBy(how=How.XPATH, using=viewFullDetails)
	@CacheLookup
	public static WebElement viewFullDetailsLink;
	
	@FindBy(how=How.XPATH, using=minimumQuantity)
	@CacheLookup
	public static WebElement minimumQuantityMessage;
	
	@FindBy(how=How.XPATH, using=minusDisabled)
	@CacheLookup
	public static WebElement disabledMinusSign;

}
