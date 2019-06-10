package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FluidPageOR {
	
	public final static String fluidClipArt = "//div[@class='fc-selected-value fc-clipart-1']";
	public final static String fluidClipArtImage = "(//div[@class='fc-clipart-image'])[1]";
	public final static String fluidAddText = "(//div[@class='fc-selected-value fc-text-1'])[1]";
	public final static String fluidAddTextArea1 = "//input[@aria-label='Text Personalization 1']";
	public final static String fluidAddTextArea2 = "//input[@aria-label='Text Personalization 1 - Line 2']";
	public final static String fluidSelectPackaging = "//div[@alias='select_packaging_1']";
	public final static String fluidPackagingImage = "(//div[@class='fc-packaging-image'])[18]";
	public final static String fluidPackagingIncreaseQuantity = "//div[@class='fc-quantity-increment fc-quantity-button-increase']";
	public final static String fluidPackagingSubtotal = "//span[@class='fc-packaging-value']";
	public final static String fluidSavedDesign = "//button[contains(text(),'Save design')]";
	public final static String fluidSaveDesignUrl = "//input[@class='fc-share-tiny-url']";
	public final static String fluidSaveToAccount = "//button[@id='save_to_wishlist']";
	public final static String fluidColorRemove = "//div[@class='fc-multiselect-value fc-active']//div[contains(text(),'REMOVE')]";
	public final static String fluidPrint = "//button[@id='fc-print']";
	public final static String fluidResetButton = "//button[@id='fc-start-over']";
	public final static String fluidUpdateCartButton = "//span[contains(text(),'Update Cart')]";
	
	
	@FindBy(how=How.XPATH, using=fluidClipArt)
	@CacheLookup
	public static WebElement clipArtCircle;
	
	@FindBy(how=How.XPATH, using=fluidClipArtImage)
	@CacheLookup
	public static WebElement clipArtImage;
	
	@FindBy(how=How.XPATH, using=fluidAddText)
	@CacheLookup
	public static WebElement addTextCircle;
	
	@FindBy(how=How.XPATH, using=fluidAddTextArea1)
	@CacheLookup
	public static WebElement addTextArea1;
	
	@FindBy(how=How.XPATH, using=fluidAddTextArea2)
	@CacheLookup
	public static WebElement addTextArea2;
	
	@FindBy(how=How.XPATH, using=fluidSelectPackaging)
	@CacheLookup
	public static WebElement selectPackaging;
	
	@FindBy(how=How.XPATH, using=fluidPackagingImage)
	@CacheLookup
	public static WebElement packagingImage;
	
	@FindBy(how=How.XPATH, using=fluidPackagingIncreaseQuantity)
	@CacheLookup
	public static WebElement packagingIncreaseQuantityButton;
	
	@FindBy(how=How.XPATH, using=fluidPackagingSubtotal)	
	public static WebElement packagingSubtotal;
	
	@FindBy(how=How.XPATH, using=fluidSavedDesign)	
	@CacheLookup
	public static WebElement savedDesignButton;
	
	@FindBy(how=How.XPATH, using=fluidSaveDesignUrl)	
	@CacheLookup
	public static WebElement savedDesignUrl;
	
	@FindBy(how=How.XPATH, using=fluidSaveToAccount)	
	@CacheLookup
	public static WebElement saveToAccountButton;
	
	@FindBy(how=How.XPATH, using=fluidColorRemove)
	public static WebElement colorRemoveLink;
	
	@FindBy(how=How.XPATH, using=fluidPrint)	
	@CacheLookup
	public static WebElement printButton;
	
	@FindBy(how=How.XPATH, using=fluidResetButton)	
	@CacheLookup
	public static WebElement resetButton;
	
	@FindBy(how=How.XPATH, using=fluidUpdateCartButton)	
	@CacheLookup
	public static WebElement updateCartButton;
	
	

}
