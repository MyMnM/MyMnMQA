package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class productListOR {

	public final static String products="(//a[@class='mz-productlisting-title product-name'])";
	public final static String productImage="(//img[@class='mz-productimages-mainimage'])[1]";
	public final static String productName="(//a[@class='mz-productlisting-title product-name'])[1]";
	public final static String secondProductName="(//a[@class='mz-productlisting-title product-name'])[3]";
	public final static String breadCrumbs="//a[@class='mz-breadcrumb-link']";
	public final static String quickShop="(//span[contains(text(),'Quick Shop')])[1]";
	public final static String perPage="//select[@id='sortByPagesize']";
	public final static String perPageItems="//select[@id='sortByPagesize']//option";
	public final static String sortBy="//select[@id='sort-by-wrapper-val']";
	public final static String priceFirstItem ="(//span[contains(text(),'Starting at')])[1]";
	public final static String priceSecondItem ="(//span[contains(text(),'Starting at')])[2]";
	public final static String filter_Weight ="//p[contains(text(),'Product Weight Size')]";
	public final static String kgFilter = "(//input[@class='mz-facetingform-value'])[1]";
	public final static String fortyGFilter = "(//input[@class='mz-facetingform-value'])[2]";
	public final static String removeFilter ="(//i[@class='remove-facet pull-right'])[1]";
/*	public final static String firstFilter ="(//label[@class='mz-facetingform-valuelabel'])[1]";
	public final static String secondFilter ="(//label[@class='mz-facetingform-valuelabel'])[2]";*/
	//changed for US site working also
	public final static String firstFilter = "(//div[@id='filter-tenant-product_weight_size']//label[@class='mz-facetingform-valuelabel'])[1]";
	public final static String secondFilter = "(//div[@id='filter-tenant-product_weight_size']//label[@class='mz-facetingform-valuelabel'])[2]";
	public final static String clearAll ="//button[contains(text(),'Clear All')]";
	public final static String pageNumber ="(//a[@class='mz-pagenumbers-number'])[1]";
	//public final static String rightArrow ="//i[@class='fa fa-chevron-right']";
	public final static String rightArrow ="//a[@class='mz-pagenumbers-next fa fa-chevron-right']";
	//public final static String leftArrow ="//i[@class='fa fa-chevron-left']";
	public final static String leftArrow ="//a[@class='mz-pagenumbers-prev fa fa-chevron-left']";
	public final static String personalize ="//button[contains(text(),'Personalize')]";
	public final static String addToCart ="//button[contains(text(),'Add To Cart')]";	
	public final static String usPriceFirstItem ="(//span[@class='mz-price'])[1]";
	public final static String usPriceSecondItem ="(//span[@class='mz-price'])[2]";
	
	
	@FindBy(how=How.XPATH, using=productImage)
	@CacheLookup
	public static WebElement productImageLink;
	
	@FindBy(how=How.XPATH, using=productName)
	
	public static WebElement productNameLink;
	
    @FindBy(how=How.XPATH, using=secondProductName)	
	public static WebElement secondProductNameLink;
	
	@FindBy(how=How.XPATH, using=breadCrumbs)
	@CacheLookup
	public static WebElement breadCrumbsLink;
	
	@FindBy(how=How.XPATH, using=quickShop)
	
	public static WebElement quickShopButton;
	
	@FindBy(how=How.XPATH, using=perPage)	
	public static WebElement perPageDropDown;
	
	@FindBy(how=How.XPATH, using=sortBy)	
	
	public static WebElement sortByDropDown;
	
	@FindBy(how=How.XPATH, using=priceFirstItem)	
		
	public static WebElement priceFirstItemField;
	
	@FindBy(how=How.XPATH, using=priceSecondItem)	
		
	public static WebElement priceSecondItemField;
	
	@FindBy(how=How.XPATH, using=filter_Weight)		
	public static WebElement weightFilter;
	
	@FindBy(how=How.XPATH, using=kgFilter)		
	public static WebElement kgFilterCheckBox;
	
	@FindBy(how=How.XPATH, using=fortyGFilter)		
	public static WebElement fortyGFilterCheckBox;
	
	@FindBy(how=How.XPATH, using=removeFilter)		
	public static WebElement removeFilterField;
	
	@FindBy(how=How.XPATH, using=firstFilter)		
	public static WebElement firstFilterValue;
	
	@FindBy(how=How.XPATH, using=secondFilter)		
	public static WebElement secondFilterValue;
	
	@FindBy(how=How.XPATH, using=clearAll)		
	public static WebElement clearAllLink;
	
	@FindBy(how=How.XPATH, using=pageNumber)		
	public static WebElement productsPageNumber;
	
	@FindBy(how=How.XPATH, using=rightArrow)		
	public static WebElement paginationRightArrow;
	
	@FindBy(how=How.XPATH, using=leftArrow)		
	public static WebElement paginationLeftArrow;
	
	@FindBy(how=How.XPATH, using=addToCart)	
	@CacheLookup
	public static WebElement addToCartButton;
	
	@FindBy(how=How.XPATH, using=usPriceFirstItem)		
	public static WebElement usPriceFirstItemField;
	
	@FindBy(how=How.XPATH, using=usPriceSecondItem)		
	public static WebElement usPriceSecondItemField;
}
