package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPasswordOR {
	
	public final static String resetEmail = "//input[@name='reset-password']";
	public final static String resetEmailSubmit = "//button[@data-mz-action='forgotpasswordpage-submit']";
	public final static String resetEmailValidationMessage = "//span[contains(text(),'Account not recognized.')]";
	public final static String resetValidEmailValidationMessage = "//span[contains(text(),'You should receive an email with instructions to reset your password shortly.')]";
	
	
	

	@FindBy(how=How.XPATH, using=resetEmail)
	@CacheLookup
	public static WebElement resetEmailField;
	
	@FindBy(how=How.XPATH, using=resetEmailSubmit)
	@CacheLookup
	public static WebElement resetEmailSubmitButton;	
	

}
