package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PrintOrderOR {
	public final static String print = "//i[@id='mz-print-content-confirmation']";
	
	@FindBy(how=How.XPATH, using=print)
	@CacheLookup
	public static WebElement printIcon;

}
