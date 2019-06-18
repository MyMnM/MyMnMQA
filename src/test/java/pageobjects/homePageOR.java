package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePageOR {
	public final static String logo="//img[contains(@src,'/resources/images/svg/mms-logo.svg')]";
	public final static String emailPopUp="//input[@id='emailAddress']";
	public final static String agePopUp="//div[@class='ageGateModelSignup']";
	public final static String month="//input[@name='month']";
	public final static String day="//input[@name='day']";
	public final static String year="//input[@name='year']";
	public final static String letsGo="//input[@id='AgeGatePopupSubmit']";
	
	public final static String closeEmailPopUp="//button[@class='close']";
	public final static String searchBar="//input[@placeholder='Search']";
	public final static String searchResults="//span[@class='tt-dropdown-menu']";
	public final static String flag="//a[@class='country-picker countryPicker']";
	public final static String country="(//div[@class='country-item']//span)[7]";
	public final static String login="//span[@class='user-cricle-icon getAccountInfo hidden-xs']";
	public final static String newShopper="//div[@id='newshopper']";
	public final static String cart="//div[@class='ml-icon-global-cart']";
	public final static String cartContent = "//div[@id='global-cart']";
	public final static String designButton = "//span[@class='design-text']";
	public final static String myAccountIcon = "//a[@id='my-account']";
	
	public final static String shopByCategory = "(//a[contains(text(),'Shop by Category')])[2]";
	public final static String inspiration = "(//a[contains(text(),'Inspiration')])[3]";
	//public final static String experience = "(//a[contains(text(),'Experience')])[3]";
	public final static String experience = "//ul[@class='mz-sitenav-list']//a[contains(text(),'Experience')]";
	
	public final static String forYourBusiness = "(//a[contains(text(),'For Your Business')])[2]";
	//public final static String gifts = "//div[@class='sub-level-col col-sm-3']//a[contains(text(),'Our gift range')]";
	public final static String gifts = "(//div[@class='mz-sitenav-item sub-level-li']//a[@class='mz-sitenav-link'])[2]";
	
	public final static String contactUs = "//a[contains(text(),'Contact Us')]";
	public final static String orderStatus = "//a[contains(text(),'Order Status')]";
	public final static String FAQ = "//a[contains(text(),'Faq')]";
	public final static String siteMap = "//a[contains(text(),'Site map')]";
	
	public final static String facebook = "//a[@title='Facebook']";
	public final static String twitter = "//a[@title='Twitter']";
	public final static String youTube = "//a[@title='YouTube']";
	public final static String pintRest = "//a[@title='Pintrest']";
	public final static String instagram = "//a[@title='Instagram']";
	
	public final static String footerEmail = "//input[@id='emailSignUp']";
	public final static String emailSubmit = "//div[@class='emailbtn']//button[@type='submit']";
	
	public final static String username = "(//input[@type='email'])[1]";
	public final static String password = "(//input[@type='password'])[1]";
	public final static String signIn = "//button[contains(text(),'Sign In')]";
	//public final static String signOut = "(//h4[contains(text(),'Sign Out')])[1]";
	public final static String signOut = "(//div[contains(text(),'Sign Out')])[1]";
	
	public final static String createAnAccount = "//a[contains(text(),'Create an account')]";
	public final static String signUpEmail = "(//input[@type='email'])[2]";
	public final static String signUpPassword = "(//input[@type='password'])[2]";
	public final static String signUpReEnterPassword = "(//input[@type='password'])[3]";
	public final static String signUp = "//button[@data-mz-action='doSignup']";
	public final static String signUpEmailSubscribe = "//label[contains(text(),'Sign me up')]";
	public final static String myAccount = "//h1[contains(text(),'My Account')]";
	public final static String forgotPassword = "//a[contains(text(),'Forgot your password')]";
	public final static String forgotPasswordTitle = "//h1[contains(text(),'Forgot your password')]";
	
	public final static String emptyErrorMessage = "//span[contains(text(),'Please enter a valid email address.')]";
	public final static String wrongFormatErrorMessage = "//span[contains(text(),'Email does not appear to be a valid e-mail address.')]";
	
	public final static String usEmailSubscribeBody = "//div[@class='emailSignupBody']";
	public final static String usEmailclose = "//button[@class='close']";
	public final static String usEmail = "//input[@id='emailAddress']";
	public final static String usSubscribeNow = "//input[@class='homePagePopupSubmit']";
	
		
	
	@FindBy(how=How.XPATH, using=logo)
	@CacheLookup
	public static WebElement homePageLogo;
	
	@FindBy(how=How.XPATH, using=agePopUp)
	@CacheLookup
	public static WebElement emailSubscribe;
	
	@FindBy(how=How.XPATH, using=month)	
	public static WebElement monthbox;
	
	@FindBy(how=How.XPATH, using=day)	
	public static WebElement dayBox;
	
	@FindBy(how=How.XPATH, using=year)
	@CacheLookup
	public static WebElement yearBox;
	
	@FindBy(how=How.XPATH, using=letsGo)
	@CacheLookup
	public static WebElement letsGoButton;
	
	
	
	
	
	@FindBy(how=How.XPATH, using=closeEmailPopUp)
	@CacheLookup
	public static WebElement closeEmailSubscibe;
	
	@FindBy(how=How.XPATH, using=searchBar)
	@CacheLookup
	public static WebElement searchBox;
	
	@FindBy(how=How.XPATH, using=searchResults)
	@CacheLookup
	public static WebElement searchTermResults;
	
	@FindBy(how=How.XPATH, using=flag)
	@CacheLookup
	public static WebElement flagIcon;
	
	@FindBy(how=How.XPATH, using=country)
	@CacheLookup
	public static WebElement countryName;
	
	@FindBy(how=How.XPATH, using=login)	
	public static WebElement loginIcon;
	
	@FindBy(how=How.XPATH, using=newShopper)
	@CacheLookup
	public static WebElement newShopperWindow;
	
	@FindBy(how=How.XPATH, using=cart)
	
	public static WebElement cartIcon;
	
	@FindBy(how=How.XPATH, using=cartContent)
	@CacheLookup
	public static WebElement globalCartMenu;
	
	@FindBy(how=How.XPATH, using=designButton)
	@CacheLookup
	public static WebElement designYourOwn;
	
	@FindBy(how=How.XPATH, using=shopByCategory)
	@CacheLookup
	public static WebElement shopByCategoryMenu;
	
	@FindBy(how=How.XPATH, using=inspiration)
	@CacheLookup
	public static WebElement inspirationMenu;
	
	@FindBy(how=How.XPATH, using=experience)
	@CacheLookup
	public static WebElement experienceMenu;
	
	@FindBy(how=How.XPATH, using=forYourBusiness)
	@CacheLookup
	public static WebElement forYourBusinessMenu;
	
	@FindBy(how=How.XPATH, using=gifts)
	@CacheLookup
	public static WebElement giftsSubCategory;
	
	@FindBy(how=How.XPATH, using=contactUs)
	@CacheLookup
	public static WebElement contactUsLink;
	
	@FindBy(how=How.XPATH, using=orderStatus)
	@CacheLookup
	public static WebElement orderStatusLink;
	
	@FindBy(how=How.XPATH, using=FAQ)
	@CacheLookup
	public static WebElement FAQLink;
	
	@FindBy(how=How.XPATH, using=siteMap)
	@CacheLookup
	public static WebElement siteMapLink;
	
	@FindBy(how=How.XPATH, using=facebook)
	@CacheLookup
	public static WebElement facebookLink;
	
	@FindBy(how=How.XPATH, using=twitter)
	@CacheLookup
	public static WebElement twitterLink;
	
	@FindBy(how=How.XPATH, using=youTube)
	@CacheLookup
	public static WebElement youtubeLink;
	
	@FindBy(how=How.XPATH, using=pintRest)
	@CacheLookup
	public static WebElement pintRestLink;
	
	@FindBy(how=How.XPATH, using=instagram)
	@CacheLookup
	public static WebElement instagramLink;
	
	@FindBy(how=How.XPATH, using=footerEmail)
	@CacheLookup
	public static WebElement footerEmailBox;
	
	@FindBy(how=How.XPATH, using=emailSubmit)
	@CacheLookup
	public static WebElement emailSubmitButton;
	
	@FindBy(how=How.XPATH, using=username)
	@CacheLookup
	public static WebElement login_username;
	
	@FindBy(how=How.XPATH, using=password)
	@CacheLookup
	public static WebElement login_password;
	
	@FindBy(how=How.XPATH, using=signIn)	
	public static WebElement login_signIn;
	
	@FindBy(how=How.XPATH, using=signOut)	
	public static WebElement login_signOut;
	
	@FindBy(how=How.XPATH, using=createAnAccount)
	@CacheLookup
	public static WebElement createAnAccountLink;
	
	@FindBy(how=How.XPATH, using=signUpEmail)
	@CacheLookup
	public static WebElement signUpEmailBox;
	
	@FindBy(how=How.XPATH, using=signUpPassword)
	@CacheLookup
	public static WebElement signUpPasswordBox;
	
	@FindBy(how=How.XPATH, using=signUpReEnterPassword)
	@CacheLookup
	public static WebElement signUpReEnterPasswordBox;
	
	@FindBy(how=How.XPATH, using=signUp)
	@CacheLookup
	public static WebElement signUpButton;
	
	@FindBy(how=How.XPATH, using=signUpEmailSubscribe)
	@CacheLookup
	public static WebElement signUpEmailSubscribeCheckBox;
	
	@FindBy(how=How.XPATH, using=myAccount)
	@CacheLookup
	public static WebElement myAccountHeading;
	
	@FindBy(how=How.XPATH, using=forgotPassword)
	@CacheLookup
	public static WebElement forgotPasswordLink;
	
	@FindBy(how=How.XPATH, using=forgotPasswordTitle)
	@CacheLookup
	public static WebElement forgotPasswordHeading;
	
	@FindBy(how=How.XPATH, using=emptyErrorMessage)
	@CacheLookup
	public static WebElement emptyErrorMessageField;
	
	@FindBy(how=How.XPATH, using=wrongFormatErrorMessage)
	@CacheLookup
	public static WebElement wrongFormatErrorMessageField;
	
	@FindBy(how=How.XPATH, using=myAccountIcon)	
	public static WebElement myAccountField;
	
	
	@FindBy(how=How.XPATH, using=usEmailclose)
	@CacheLookup
	public static WebElement usEmailCloseButton;
	
	@FindBy(how=How.XPATH, using=usEmail)	
	public static WebElement usEmailField;
	
	@FindBy(how=How.XPATH, using=usSubscribeNow)	
	public static WebElement usSubscribeNowButton;
	
	
	
}
