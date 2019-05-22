package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderConfirmationOR {
	public final static String billingPayment = "//div[@class='mz-checkout-payment']";
	public final static String billingEmail = "(//div[@class='mz-l-stack-item col-sm-6'])[3]";
	public final static String billingName = "(//div[@class='mz-l-stack-item col-sm-6'])[4]";
	public final static String billingAddress = "(//div[@class='mz-l-stack-item col-sm-6'])[5]";
	public final static String billingCardType = "(//div[@class='mz-l-stack-item col-sm-6'])[6]";
	public final static String billingCardNumber = "(//div[@class='mz-l-stack-item col-sm-6'])[7]";
	public final static String confirmationClosePopUp = "(//button[@data-dismiss='modal'])[1]";
	
	@FindBy(how=How.XPATH, using=confirmationClosePopUp)	
	public static WebElement closePopUp;
	
	@FindBy(how=How.XPATH, using=billingCardNumber)
	@CacheLookup
	public static WebElement billingCardNumberField;
	
	
	
	
}
