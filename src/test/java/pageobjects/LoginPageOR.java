package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
/**
 * this file contains element locators for Login Page for valid login
 * @author vibhav.gupta
 *
 */

public class LoginPageOR{

	
	  

	/**
	 * these are the string paths for element locators.
	 */	
	public final static String Username="//input[@id='j_id0:loginform:login-username']";
	public final static String Password="//input[@id='j_id0:loginform:login-password']";
	public final static String Login="//a[@id='btn-fblogin']";
    public final static String DontShowButton="//button[contains(text(),'show again')]";
    public final static String ActionButton="//th[contains(text(),'Action')]";
    public final static String MakePayment="(//a[contains(text(),'Make Payment')])[1]";
    public final static String PaymentTypeDropDown="//select[contains(@id,'strandPaymentType')]";
    public final static String PaymentHeading="//h3[contains(text(),'Agent Credit Card')]";
    public final static String NewAgentCard="//input[@value='New Agent Card']";
    public final static String CardName="//input[@class='form-control required-field validate userName requiredField creditCardNumberInput']";
    public final static String CardNumber="//input[@class='form-control required-field validate requiredField cardNumber creditCardNumberInput']";
    public final static String CardType="//select[@class='form-control validate cardType required-field requiredField creditCardNumberInput ']";
    public final static String ExpirationMonth="//select[@class='form-control required-field validate input-md month']";
    public final static String ExpirationYear="//select[@class='form-control validate required-field input-md year']";
    public final static String CVV="//input[@class='form-control required-field validate cardCVV requiredField creditCardNumberInput ']";
    public final static String SaveCardInfo="//input[@class='newCardSaveInfo col-xs-1 creditCardSaveForFuture']";
    public final static String PaymentConditions="//input[@id='newCardTerms']";
    public final static String SubmitButton="(//button[contains(text(),'Submit')])[1]";
    public final static String EditButton="(//input[@value='Edit'])[last()-5]";
    public final static String DeleteButton="(//input[@value='Delete'])[last()-5]";
    public final static String DeleteYes="//button[@class='btn col-md-offset-5 btn-default answerYes']";
    public final static String EditCardType="//select[@id='j_id0:j_id184:j_id242']";
    public final static String EditSubmitButton="(//button[contains(text(),'Submit')])[2]";
    public final static String EditText="(//label[contains(text(),'Ending in')])[last()-5]";
	/**
	 * these are the Page Factory element locators
	 */
	
	@FindBy(how=How.XPATH, using=Username)
	@CacheLookup
	public static WebElement userName;
	
	@FindBy(how=How.XPATH, using=Password)
	@CacheLookup
	public static WebElement password;
	
	@FindBy(how=How.XPATH, using=Login)
	@CacheLookup
	public static WebElement login;
	
	@FindBy(how=How.XPATH, using=ActionButton)
	@CacheLookup
	public static WebElement actionButton;
	
	@FindBy(how=How.XPATH, using=DontShowButton)
	@CacheLookup
	public static WebElement dontShowButton;
	
	@FindBy(how=How.XPATH, using=MakePayment)
	@CacheLookup
	public static WebElement makePayment;
	
	@FindBy(how=How.XPATH, using=PaymentTypeDropDown)
	@CacheLookup
	public static WebElement paymentTypeDropDown;
	
	@FindBy(how=How.XPATH, using=PaymentHeading)
	@CacheLookup
	public static WebElement paymentHeading;
	
	@FindBy(how=How.XPATH, using=NewAgentCard)
	@CacheLookup
	public static WebElement newAgentCard;
	
	@FindBy(how=How.XPATH, using=CardName)
	@CacheLookup
	public static WebElement cardName;
	
	@FindBy(how=How.XPATH, using=CardNumber)
	@CacheLookup
	public static WebElement cardNumber;
	
	@FindBy(how=How.XPATH, using=CardType)
	@CacheLookup
	public static WebElement cardType;
	
	
	@FindBy(how=How.XPATH, using=ExpirationMonth)
	@CacheLookup
	public static WebElement expirationMonth;
	
	@FindBy(how=How.XPATH, using=ExpirationYear)
	@CacheLookup
	public static WebElement expirationYear;
	
	@FindBy(how=How.XPATH, using=CVV)
	@CacheLookup
	public static WebElement cvv;
	
	@FindBy(how=How.XPATH, using=SaveCardInfo)
	@CacheLookup
	public static WebElement saveCardInfo;
	
	
	@FindBy(how=How.XPATH, using=PaymentConditions)
	@CacheLookup
	public static WebElement paymentConditions;
	
	
	@FindBy(how=How.XPATH, using=SubmitButton)
	@CacheLookup
	public static WebElement submitButton;
	
	@FindBy(how=How.XPATH, using=EditButton)
	@CacheLookup
	public static WebElement editButton;
	
	@FindBy(how=How.XPATH, using=DeleteButton)
	@CacheLookup
	public static WebElement deleteButton;
	
	
	@FindBy(how=How.XPATH, using=DeleteYes)
	@CacheLookup
	public static WebElement deleteYes;
	
	@FindBy(how=How.XPATH, using=EditCardType)
	@CacheLookup
	public static WebElement editCardType;
	
	@FindBy(how=How.XPATH, using=EditSubmitButton)
	@CacheLookup
	public static WebElement editSubmitButton;
	
	
	@FindBy(how=How.XPATH, using=EditText)
	@CacheLookup
	public static WebElement editText;
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	