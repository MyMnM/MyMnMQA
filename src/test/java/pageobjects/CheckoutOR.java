package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutOR {
	
	public final static String checkoutLogin = "//span[contains(text(),'Registered customer? Sign In')]";
	public final static String firstNameErrorMessage = "//span[@data-mz-validationmessage-for='firstName']";
	public final static String lastNameErrorMessage = "//span[@data-mz-validationmessage-for='lastNameOrSurname']";
	public final static String streetAddressErrorMessage = "//span[@data-mz-validationmessage-for='address.address1']";
	public final static String cityErrorMessage = "//span[@data-mz-validationmessage-for='address.cityOrTown']";
	public final static String zipCodeErrorMessage = "//span[@data-mz-validationmessage-for='address.postalOrZipCode']";
	public final static String phoneNumberErrorMessage = "//span[@data-mz-validationmessage-for='phoneNumbers.home']";
	public final static String emailErrorMessage = "//span[@data-mz-validationmessage-for='email']";
	public final static String occasionErrorMessage = "//span[@data-mz-validationmessage-for='orderattr_Occasion']";
	public final static String vatIdErrorMessage = "(//span[contains(@data-mz-validationmessage-for,'orderattr')])[2]";
	
	public final static String cardNumberErrorMessage = "//span[@data-mz-validationmessage-for='card.cardNumberPartOrMask']";
	public final static String cardNameErrorMessage = "//span[@data-mz-validationmessage-for='card.nameOnCard']";
	public final static String cardExpiryErrorMessage = "//span[@data-mz-validationmessage-for='card.expireYear']";
	public final static String cardCvvErrorMessage = "//span[@data-mz-validationmessage-for='card.cvv']";
	public final static String billingEmailErrorMessage = "//span[@data-mz-validationmessage-for='billingContact.email']";
	public final static String termsAndConditionsErrorMessage = "//span[@data-mz-validationmessage-for='agreeToTerms']";
	
	
	
	
	public final static String checkoutZipCode = "(//input[@name='postal-code'])[1]";
	//public final static String checkoutVatId = "//input[@name='orderattr_vatId']";
	public final static String checkoutVatId = "//input[contains(@name,'orderattr')]";
	public final static String checkoutSavedAddressDropDown = "//select[@id='mz--contactselector-savedcontact']";
	public final static String shipToNext = "(//button[contains(text(),'Next')])[1]";
	public final static String shipToNext_France = "(//button[contains(text(),'Suivant')])[1]";
	public final static String shipToNext_Dutch = "(//button[contains(text(),'Volgende')])[1]";
	public final static String shipToNext_German = "(//button[contains(text(),'Weiter')])[1]";
	public final static String shipToNext_Italy = "(//button[contains(text(),'Seguente')])[1]";
	public final static String shipToNext_Spain = "(//button[contains(text(),'Siguiente')])[1]";
	public final static String shipToNext_Poland = "(//button[contains(text(),'Dalej')])[1]";
	
	public final static String shipMethodNext = "(//button[contains(text(),'Next')])[2]";
	public final static String shipMethodNext_France = "(//button[contains(text(),'Suivant')])[2]";
	public final static String shipMethodNext_Dutch = "(//button[contains(text(),'Volgende')])[2]";
	public final static String shipMethodNext_German = "(//button[contains(text(),'Weiter')])[2]";
	public final static String shipMethodNext_Italy = "(//button[contains(text(),'Seguente')])[2]";
	public final static String shipMethodNext_Spain = "(//button[contains(text(),'Siguiente')])[2]";
	public final static String shipMethodNext_Poland = "(//button[contains(text(),'Dalej')])[2]";
	
	public final static String paymentNext = "(//button[contains(text(),'Next')])[3]";
	public final static String paymentNext_France = "(//button[contains(text(),'Suivant')])[3]";
	public final static String paymentNext_Dutch = "(//button[contains(text(),'Volgende')])[3]";
	public final static String paymentNext_German = "(//button[contains(text(),'Weiter')])[3]";
	public final static String paymentNext_Italy = "(//button[contains(text(),'Seguente')])[3]";
	public final static String paymentNext_Spain = "(//button[contains(text(),'Siguiente')])[3]";
	public final static String paymentNext_Poland = "(//button[contains(text(),'Dalej')])[3]";
	
	public final static String shippingMethod_France = "(//input[@name='shippingMethod'])[1]";
	
	public final static String checkoutFirstName = "(//input[@name='firstname'])[1]";
	public final static String checkoutLastName = "(//input[@name='lastname'])[1]";
	public final static String checkoutAddressLine1 = "(//input[@name='address-line-1'])[1]";
	public final static String checkoutCity = "(//input[@name='city'])[1]";
	public final static String checkoutPostalCode = "(//input[@name='postal-code'])[1]";
	public final static String checkoutPhoneNumber = "(//input[@name='shippingphone'])[1]";
	public final static String checkoutEmail = "(//input[@name='email'])[1]";
	public final static String checkoutOccasion = "//select[@id='orderattr_Occasion']";	
	public final static String checkoutEditArrivalDate = "//a[@class='change_date shipping-date-picker']";
	public final static String checkoutDate = "(//div[@class='xdsoft_datepicker active'])[6]//tr[5]//td[3]";
	public final static String checkoutChangedDate = "//div[contains(text(),'Estimated Arrival Date')]";
	
	public final static String checkoutCardNumber = "//input[@id='mz-payment-credit-card-number']";
	public final static String checkoutCardName = "//input[@id='mz-payment-credit-card-name']";
	public final static String checkoutExpiryMonth = "//select[@class='expiry-month']";
	public final static String checkoutExpiryYear = "//select[@name='mz-payment-expiration-year']";
	public final static String checkoutCVVNumber = "//input[@id='mz-payment-security-code']";
	public final static String checkoutSaveCCInformation = "//input[@name='save-card-info']";
	public final static String checkoutSameBillingAddress = "//input[@data-mz-value='isSameBillingShippingAddress']";
	public final static String checkoutPlaceOrder = "//button[contains(text(),'Place Order')]";
	public final static String checkoutPlaceOrder_France = "//button[contains(text(),'Valider la commande')]";
	public final static String checkoutPlaceOrder_Dutch = "//button[contains(text(),'Bestelling plaatsen')]";
	public final static String checkoutPlaceOrder_German = "//button[contains(text(),'Bestellung aufgeben')]";
	public final static String checkoutPlaceOrder_Italy = "//button[contains(text(),'Effettua l’ordine')]";
	public final static String checkoutPlaceOrder_Spain = "//button[contains(text(),'Hacer un pedido')]";
	
	public final static String checkoutPlaceOrder_Poland = "//button[contains(text(),'wienie')]";
	//public final static String checkoutPlaceOrder_Poland = "//button[@data-mz-action='submit']";
	
	public final static String checkoutBillingFirstName = "//input[@data-mz-value='billingContact.firstName']";
	public final static String checkoutBillingSummaryFirstName = "(//div[@class='mz-addresssummary'])[1]//div[1]";
	public final static String checkoutSubscribe = "//input[@name='special-offers']";
	
	public final static String checkoutOrderSummaryItemName = "//div[@class='mz-carttable-item-title']";
	public final static String checkoutOrderSummaryItemCode = "//div[@class='mz-carttable-item-code']";
	public final static String checkoutOrderSummaryItemQuantity = "//div[@class='mz-propertylist ']";
	public final static String checkoutOrderSummaryItemPrice = "//span[@class='mz-item-price']";
	public final static String checkoutOrderSummarySubTotal = "(//div[@class='mz-checkout-total-row'])[1]";
	public final static String checkoutOrderSummaryVAT = "(//div[@class='mz-checkout-total-row'])[2]";
	public final static String checkoutOrderSummaryShippingAndHandling = "(//div[@class='mz-checkout-total-row'])[3]";
	public final static String checkoutOrderSummaryGrandTotal = "(//div[@class='mz-checkout-total-row'])[4]";
	public final static String checkoutTermsAndCondition = "//input[@name='terms-and-conditions']";
	public final static String checkoutCreateAccount = "//input[@name='create-new-account']";
	public final static String checkoutNewAccountEmail = "//input[@name='new-account-email']";
	public final static String checkoutNewAccountPassword = "//input[@name='new-account-password']";
	public final static String checkoutNewAccountConfirmPassword = "//input[@name='new-account-confirm']";
	
	public final static String orderConfirmationTitle = "//h1[contains(text(),'Order Confirmation')]";
	public final static String orderConfirmationTitle_France = "//h1[contains(text(),'Confirmation de commande ')]";
	public final static String orderConfirmationTitle_Dutch = "//h1[contains(text(),'Bestelbevestiging ')]";
	public final static String orderConfirmationTitle_German = "//h1[contains(text(),'Bestellbestätigung ')]";
	public final static String orderConfirmationTitle_Italy = "//h1[contains(text(),'Conferma')]";
	public final static String orderConfirmationTitle_Spain = "//h1[contains(text(),'Confirmación de pedido ')]";
	public final static String orderConfirmationTitle_Poland = "//h1[contains(text(),'Potwierdzenie zamówienia ')]";
	
	public final static String checkoutOrderSummarySubTotalValue = "(//span[@class='mz-ordersummary-totalvalue col-sm-4'])[1]";
	public final static String checkoutOrderSummaryOrderLevelDiscountValue = "//span[@class='mz-ordersummary-discountamt col-sm-4']";
	public final static String checkoutOrderSummarySAndHTaxValue = "(//span[@class='mz-ordersummary-totalvalue col-sm-4'])[3]";
	public final static String checkoutOrderGrandTotalValue= "(//span[@class='mz-ordersummary-totalvalue col-sm-4'])[4]";
	
	public final static String checkoutUSProvince= "//select[@data-mz-value='address.stateOrProvince']";
	public final static String checkoutCountry= "//select[@data-mz-value='address.countryCode']";
		
	
	@FindBy(how=How.XPATH, using=checkoutLogin)
	@CacheLookup
	public static WebElement loginLink;
	

	@FindBy(how=How.XPATH, using=shipToNext)	
	public static WebElement shipToNextButton;
	
	@FindBy(how=How.XPATH, using=zipCodeErrorMessage)
	@CacheLookup
	public static WebElement zipErrorMessage;
	
	@FindBy(how=How.XPATH, using=occasionErrorMessage)
	@CacheLookup
	public static WebElement occasionValidationMessage;
	
	@FindBy(how=How.XPATH, using=checkoutZipCode)	
	public static WebElement zipCodeField;
	
	@FindBy(how=How.XPATH, using=checkoutVatId)	
	public static WebElement vatIdField;
	
	@FindBy(how=How.XPATH, using=checkoutSavedAddressDropDown)
	@CacheLookup
	public static WebElement savedAddressDropDown;
	
	@FindBy(how=How.XPATH, using=checkoutFirstName)
	
	public static WebElement firstNameField;
	
	@FindBy(how=How.XPATH, using=checkoutLastName)
	
	public static WebElement lastNameField;
	
	@FindBy(how=How.XPATH, using=checkoutAddressLine1)
	@CacheLookup
	public static WebElement addressLine1;
	
	@FindBy(how=How.XPATH, using=checkoutCity)
	@CacheLookup
	public static WebElement cityField;
	
	@FindBy(how=How.XPATH, using=checkoutPostalCode)
	@CacheLookup
	public static WebElement postalCode;
	
	@FindBy(how=How.XPATH, using=checkoutPhoneNumber)
	
	public static WebElement phoneNumber;
	
	@FindBy(how=How.XPATH, using=checkoutEmail)
	@CacheLookup
	public static WebElement email;
	
	@FindBy(how=How.XPATH, using=checkoutOccasion)
	@CacheLookup
	public static WebElement occasionDropDown;
	
	@FindBy(how=How.XPATH, using=checkoutEditArrivalDate)
	
	public static WebElement editArrivalDateLink;
	
	@FindBy(how=How.XPATH, using=checkoutDate)
	
	public static WebElement newArrivalDate;
	
	@FindBy(how=How.XPATH, using=checkoutChangedDate)
	@CacheLookup
	public static WebElement changedArrivalDate;
	
	@FindBy(how=How.XPATH, using=shipMethodNext)	
	public static WebElement shipMethodNextButton;
	
	@FindBy(how=How.XPATH, using=paymentNext)	
	public static WebElement paymentNextButton;
	
	@FindBy(how=How.XPATH, using=checkoutCardNumber)	
	public static WebElement creditCardNumber;
	
	@FindBy(how=How.XPATH, using=checkoutCardName)	
	public static WebElement cardName;
	
	@FindBy(how=How.XPATH, using=checkoutExpiryMonth)	
	public static WebElement cardExpiryMonth;
	
	@FindBy(how=How.XPATH, using=checkoutExpiryYear)	
	public static WebElement cardExpiryYear;
	
	@FindBy(how=How.XPATH, using=checkoutCVVNumber)	
	public static WebElement cardCVVNumber;
	
	@FindBy(how=How.XPATH, using=checkoutPlaceOrder)
	
	public static WebElement placeOrderButton;
	
	@FindBy(how=How.XPATH, using=checkoutSaveCCInformation)
	@CacheLookup
	public static WebElement saveCCInformationCheckBox;
	
	@FindBy(how=How.XPATH, using=checkoutSameBillingAddress)
	@CacheLookup
	public static WebElement billingAddressSameAsShipping;
	
	@FindBy(how=How.XPATH, using=checkoutBillingFirstName)
	@CacheLookup
	public static WebElement billingAddressFirstName;
	
	@FindBy(how=How.XPATH, using=checkoutBillingSummaryFirstName)	
	public static WebElement billingSummaryFirstName;
	
	@FindBy(how=How.XPATH, using=checkoutTermsAndCondition)	
	public static WebElement termsAndCondition;
	
	@FindBy(how=How.XPATH, using=checkoutCreateAccount)	
	public static WebElement createAccountCheckBox;
	
	@FindBy(how=How.XPATH, using=checkoutNewAccountEmail)	
	@CacheLookup
	public static WebElement newAccountEmail;
	
	@FindBy(how=How.XPATH, using=checkoutNewAccountPassword)	
	@CacheLookup
	public static WebElement newAccountPassword;
	
	@FindBy(how=How.XPATH, using=checkoutNewAccountConfirmPassword)	
	@CacheLookup
	public static WebElement newAccountConfirmPassword;
	
	@FindBy(how=How.XPATH, using=checkoutOrderSummarySubTotalValue)	
	@CacheLookup
	public static WebElement orderSummarySubTotalValue;
	
	@FindBy(how=How.XPATH, using=checkoutOrderSummaryOrderLevelDiscountValue)	
	@CacheLookup
	public static WebElement orderSummaryOrderLevelDiscountValue;
	
	@FindBy(how=How.XPATH, using=checkoutOrderSummarySAndHTaxValue)	
	@CacheLookup
	public static WebElement orderSummarySAndHTaxValue;
	
	@FindBy(how=How.XPATH, using=checkoutOrderGrandTotalValue)	
	@CacheLookup
	public static WebElement orderSummaryGrandTotalValue;
	
	@FindBy(how=How.XPATH, using=checkoutUSProvince)	
	public static WebElement checkoutUSProvinceDropDown;
	
	@FindBy(how=How.XPATH, using=shipToNext_France)	
	public static WebElement shipToNext_FranceButton;
	
	@FindBy(how=How.XPATH, using=shipToNext_Dutch)	
	public static WebElement shipToNext_DutchButton;
	
	@FindBy(how=How.XPATH, using=shipToNext_German)	
	public static WebElement shipToNext_GermanButton;
	
	@FindBy(how=How.XPATH, using=shipToNext_Italy)	
	public static WebElement shipToNext_ItalyButton;
	
	@FindBy(how=How.XPATH, using=shipToNext_Spain)	
	public static WebElement shipToNext_SpainButton;
	
	@FindBy(how=How.XPATH, using=shipToNext_Poland)	
	public static WebElement shipToNext_PolandButton;
	
	@FindBy(how=How.XPATH, using=shipMethodNext_France)	
	public static WebElement shipMethodNext_FranceButton;
	
	@FindBy(how=How.XPATH, using=shipMethodNext_Dutch)	
	public static WebElement shipMethodNext_DutchButton;
	
	@FindBy(how=How.XPATH, using=shipMethodNext_German)	
	public static WebElement shipMethodNext_GermanButton;
	
	@FindBy(how=How.XPATH, using=shipMethodNext_Italy)	
	public static WebElement shipMethodNext_ItalyButton;
	
	@FindBy(how=How.XPATH, using=shipMethodNext_Spain)	
	public static WebElement shipMethodNext_SpainButton;
	
	@FindBy(how=How.XPATH, using=shipMethodNext_Poland)	
	public static WebElement shipMethodNext_PolandButton;
	
	
	@FindBy(how=How.XPATH, using=paymentNext_France)	
	public static WebElement paymentNext_France_Button;
	
	@FindBy(how=How.XPATH, using=paymentNext_Dutch)	
	public static WebElement paymentNext_Dutch_Button;
	
	@FindBy(how=How.XPATH, using=paymentNext_German)	
	public static WebElement paymentNext_German_Button;
	
	@FindBy(how=How.XPATH, using=paymentNext_Italy)	
	public static WebElement paymentNext_Italy_Button;
	
	@FindBy(how=How.XPATH, using=paymentNext_Spain)	
	public static WebElement paymentNext_Spain_Button;
	
	@FindBy(how=How.XPATH, using=paymentNext_Poland)	
	public static WebElement paymentNext_Poland_Button;
	
	@FindBy(how=How.XPATH, using=checkoutPlaceOrder_France)	
	public static WebElement checkoutPlaceOrder_FranceButton;
	
	@FindBy(how=How.XPATH, using=checkoutPlaceOrder_Dutch)	
	public static WebElement checkoutPlaceOrder_DutchButton;
	
	@FindBy(how=How.XPATH, using=checkoutPlaceOrder_German)	
	public static WebElement checkoutPlaceOrder_GermanButton;
	
	@FindBy(how=How.XPATH, using=checkoutPlaceOrder_Italy)	
	public static WebElement checkoutPlaceOrder_ItalyButton;
	
	@FindBy(how=How.XPATH, using=checkoutPlaceOrder_Spain)	
	public static WebElement checkoutPlaceOrder_SpainButton;
	
	@FindBy(how=How.XPATH, using=checkoutPlaceOrder_Poland)	
	public static WebElement checkoutPlaceOrder_PolandButton;
	
	@FindBy(how=How.XPATH, using=shippingMethod_France)	
	public static WebElement shippingMethod_FranceRadioButton;
	
	@FindBy(how=How.XPATH, using=checkoutCountry)	
	public static WebElement checkoutCountryDropDown;
	
	
	

}
