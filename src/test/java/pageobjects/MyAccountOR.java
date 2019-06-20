package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountOR {
	public final static String accountSettings = "(//div[contains(text(),'Account Settings')])[1]";
	public final static String myAccountEdit = "//a[@data-mz-action='startEdit']";
	public final static String myAccountFirstName = "//input[@class='mz-accountsettings-firstname']";
	public final static String myAccountLastName = "//input[@class='mz-accountsettings-lastname']";	
	public final static String myAccountEmail = "//input[@class='mz-accountsettings-email']";
	public final static String myAccountSave = "//button[contains(text(),'Save')]";
	public final static String myAccountDisplayName = "//div[@class='mz-accountsettings-displayname']";
	public final static String myAccountDisplayEmail = "//div[@class='mz-accountsettings-displayemail']";
	public final static String myAccountCountryDropDown = "//select[@data-mz-value='editingContact.address.countryCode']";
	
	public final static String addressBookEdit = "(//a[@class='mz-accountaddressbook-edit'])[1]";
	public final static String firstNameErrorMessage = "//span[@data-mz-validationmessage-for='editingContact.firstName']";
	public final static String lastNameErrorMessage = "//span[@data-mz-validationmessage-for='editingContact.lastNameOrSurname']";
	public final static String streetAddressErrorMessage = "//span[@data-mz-validationmessage-for='editingContact.address.address1']";
	public final static String cityErrorMessage = "//span[@data-mz-validationmessage-for='editingContact.address.cityOrTown']";
	public final static String zipCodeErrorMessage = "//span[@data-mz-validationmessage-for='editingContact.address.postalOrZipCode']";
	public final static String phoneNumberErrorMessage = "//span[@data-mz-validationmessage-for='editingContact.phoneNumbers.home']";
	
	public final static String addNewAddress = "//a[contains(text(),'Add new address')]";
	public final static String addressBookDisplayName = "(//div[@class='mz-accountaddressbook-contactdetails mz-addresssummary'])[2]//div";
	public final static String newAddressEdit = "(//a[@class='mz-accountaddressbook-edit'])[2]";
	public final static String deleteAddress = "(//a[@class='mz-accountaddressbook-delete'])[2]";
	
	public final static String changePassword = "//button[@class='mz-primary-button mz-accountsettings-passwordedit']";
	public final static String oldPassword = "(//input[@class='mz-accountsettings-password'])[1]";
	public final static String newPassword = "(//input[@class='mz-accountsettings-password'])[2]";
	public final static String confirmPassword = "//input[@class='mz-accountsettings-confirmpassword']";
	public final static String passwordChangeSuccessMessage = "//div[@data-mz-validationmessage-for='passwordChanged']";
	public final static String orderDetails = "(//dl[@class='mz-propertylist mz-propertylist-order detail-list'])[1]";
	public final static String orderListing = "//div[@class='mz-orderlisting-items mz-l-formfieldgroup order-details']";
	public final static String detailsOrderName = "//a[@class='mz-itemlisting-title col-xs-9 col-sm-7 detail-data']";
	public final static String savedDesignPersonalize = "//a[contains(text(),'Personalize')]";
	public final static String deleteDesign = "//button[contains(text(),'Delete Design')]";
	public final static String fluidMyAccount = "//a[@id='my-account']";
	public final static String deleteSavedDesignYes = "//button[@id='confirmed']";
	//public final static String fluidAccountSettings = "(//h4[contains(text(),'Account Settings')])[1]";
	public final static String fluidAccountSettings = "(//div[contains(text(),'Account Settings')])[1]";
	//public final static String fluidSavedDesign = "(//h4[contains(text(),'Saved Designs')])[1]";
	public final static String fluidSavedDesign = "(//div[contains(text(),'Saved Designs')])[1]";
	
	@FindBy(how=How.XPATH, using=accountSettings)
	@CacheLookup
	public static WebElement accountSettingsLink;
	
	@FindBy(how=How.XPATH, using=myAccountEdit)
	@CacheLookup
	public static WebElement editLink;
	
	@FindBy(how=How.XPATH, using=myAccountFirstName)
	@CacheLookup
	public static WebElement firstName;
	
	@FindBy(how=How.XPATH, using=myAccountLastName)
	@CacheLookup
	public static WebElement lastName;
	
	@FindBy(how=How.XPATH, using=myAccountEmail)	
	public static WebElement email;
	
	@FindBy(how=How.XPATH, using=myAccountSave)	
	public static WebElement saveButton;
	
	@FindBy(how=How.XPATH, using=myAccountDisplayName)
	@CacheLookup
	public static WebElement displayName;
	
	@FindBy(how=How.XPATH, using=myAccountDisplayEmail)	
	public static WebElement displayEmail;
	
	@FindBy(how=How.XPATH, using=addressBookEdit)
	@CacheLookup
	public static WebElement addressBookEditLink;
	
	@FindBy(how=How.XPATH, using=addNewAddress)
	@CacheLookup
	public static WebElement addNewAddressButton;
	
	@FindBy(how=How.XPATH, using=addressBookDisplayName)
	
	public static WebElement addressBookDisplayNameDetails;
	
	@FindBy(how=How.XPATH, using=newAddressEdit)
	@CacheLookup
	public static WebElement newAddressEditLink;
	
	@FindBy(how=How.XPATH, using=deleteAddress)
	@CacheLookup
	public static WebElement deleteAddressLink;
	
	@FindBy(how=How.XPATH, using=changePassword)
	@CacheLookup
	public static WebElement changePasswordButton;
	
	@FindBy(how=How.XPATH, using=oldPassword)
	@CacheLookup
	public static WebElement oldPasswordField;
	
	@FindBy(how=How.XPATH, using=newPassword)
	@CacheLookup
	public static WebElement newPasswordField;
	
	@FindBy(how=How.XPATH, using=confirmPassword)
	@CacheLookup
	public static WebElement confirmPasswordField;
	
	@FindBy(how=How.XPATH, using=orderDetails)
	@CacheLookup
	public static WebElement orderDetailsLink;
	
	@FindBy(how=How.XPATH, using=orderListing)
	@CacheLookup
	public static WebElement orderListingDetails;
	
	@FindBy(how=How.XPATH, using=detailsOrderName)	
	public static WebElement detailsOrderNameLink;
	
	@FindBy(how=How.XPATH, using=deleteDesign)	
	public static WebElement deleteSavedDesign;
	
	@FindBy(how=How.XPATH, using=fluidMyAccount)	
	public static WebElement fluidMyAccountIcon;
	
	@FindBy(how=How.XPATH, using=deleteSavedDesignYes)	
	public static WebElement deleteDesignYes;
	
	@FindBy(how=How.XPATH, using=fluidSavedDesign)	
	public static WebElement fluidSavedDesignLink;
	
	@FindBy(how=How.XPATH, using=myAccountCountryDropDown)	
	public static WebElement countryDropSown;
	
	
	

}
