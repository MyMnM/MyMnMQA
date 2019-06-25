package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginSignUpOR {
	public final static String signUpErrorMessage = "//span[@class='mz-validationmessage']";
	public final static String signUpEmail = "(//input[@type='email'])[2]";
	public final static String signUpPassword = "(//input[@type='password'])[2]";
	public final static String signUpReEnterPassword = "//input[@placeholder='Re-enter Password']";
	public final static String passwordErrorMessage = "//span[contains(text(),'Passwords did not match. Please re-enter.')]";
	public final static String existingUserErrorMessage = "//span[contains(text(),'Email address already associated with a login')]";
	
	@FindBy(how=How.XPATH, using=signUpErrorMessage)
	@CacheLookup
	public static WebElement errorMessage;
	
	@FindBy(how=How.XPATH, using=signUpEmail)	
	public static WebElement email;
	
	@FindBy(how=How.XPATH, using=signUpPassword)
	@CacheLookup
	public static WebElement password;
	
	@FindBy(how=How.XPATH, using=signUpReEnterPassword)
	@CacheLookup
	public static WebElement reEnterPassword;

}
