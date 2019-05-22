package UIAction;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.ConfigReader;
import helpers.GlobalUtil;
import pageobjects.productListOR;
import step_definitions.Hooks;

public class ProductListAction extends GlobalUtil {
	
	public static boolean verifyDisplayedItems(WebDriver driver) throws InterruptedException {
		int flag= 0;
		int count = countOfElements(driver, productListOR.perPageItems);
		System.out.println("count "+count);
		List<WebElement> items = mutilpleOccurenceOfElement(driver, productListOR.perPageItems);
		System.out.println(items);
		System.out.println("items "+items.size());
		for(int i =0; i<count-2; i++) {	//count-1 to leave View All value
			int perPagetiems = Integer.parseInt(items.get(i).getText().split(":")[1].trim());
			System.out.println("per page "+perPagetiems);
			
			SelectUsingIndex(productListOR.perPageDropDown, i);
			executionDelay(12000);
			if(countOfElements(driver, productListOR.products)==perPagetiems) {
				flag=0;
			}
			else {
				flag=1;
			}		
			
		}
		if(flag==0) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static boolean verifyHighToLow(WebElement firstElement, WebElement secondElement) {
		int length_firstElement = firstElement.getText().length();
		int length_secondElement = secondElement.getText().length();
		float firstValue = Float.parseFloat(firstElement.getText().substring(13, length_firstElement));
		System.out.println("value "+firstValue);
		float secondValue = Float.parseFloat(secondElement.getText().substring(13, length_secondElement));
		System.out.println("value "+secondValue);
		if(firstValue>secondValue) {
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static boolean verifyLowToHigh(WebElement firstElement, WebElement secondElement) {
		
		int length_firstElement = firstElement.getText().length();
		int length_secondElement = secondElement.getText().length();
		float firstValue = Float.parseFloat(firstElement.getText().substring(13, length_firstElement));
		System.out.println("value "+firstValue);
		float secondValue = Float.parseFloat(secondElement.getText().substring(13, length_secondElement));
		System.out.println("value "+secondValue);
		if(firstValue<secondValue) {
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static boolean verifyFilterResults(WebDriver driver,String filterValue) {
		int flag = 0;
		int count = countOfElements(driver, productListOR.productName);
		System.out.println("count "+count);
		List<WebElement> items = mutilpleOccurenceOfElement(driver, productListOR.productName);
		System.out.println(items);
		System.out.println("items "+items.size());
		for(int i =0; i<count; i++) {
			if(items.get(i).getText().contains(filterValue)) {
				flag = 0;
			}
			else {
			
				flag = 1;
				break;
			}
			
		}
		if(flag==0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
