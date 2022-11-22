package adactin.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AdactinUtils {
	WebDriver driver=null;
	
	public WebDriver launchChromeBrowser(String appUrl) {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91730\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get(appUrl);
			driver.manage().window().maximize();
			System.out.println("ChromeBrowser Launched successfully");
			
		} catch (Exception e) {
			System.out.println("ChromeBrowser unable to Launch");
			e.printStackTrace();
		}
		return driver;
	}
	
	public void typeValue(WebElement elementToSendValue, String valueToType) {
		try {
			elementToSendValue.sendKeys(valueToType);
			System.out.println("The "+valueToType+" is typed on the webelement ");
			
		} catch (Exception e) {
			System.out.println("The "+valueToType+" is unable to type");
			e.printStackTrace();
		}
	}
	
	public void elementToClick(WebElement elementToBeClicked) {
		try {
			elementToBeClicked.click();
			System.out.println("The "+elementToBeClicked+" is clicked");
		} catch (Exception e) {
			System.out.println("The selected element "+elementToBeClicked+" is unable to click.");
			e.printStackTrace();
		}
		
	}
	
	public void dropDownElement(WebElement elementToBeDropDown,String location ) {
		try {
			Select sel = new Select(elementToBeDropDown);
			sel.selectByValue(location);
			System.out.println("The location for hotel is selected");
			
		} catch (Exception e) {
			System.out.println("The location for the hotel is unable to select");
			e.printStackTrace();
		}
		
	}
	
	public void getTextFromElement(WebElement elementToGetText) {
		try {
			String textFromElement = elementToGetText.getAttribute("value");
			System.out.println("The Order Number is:" +textFromElement);
			System.out.println("Successfully got the text from the WebElement");
			
		} catch (Exception e) {
			System.out.println("Unable to get text from the Element");
			e.printStackTrace();
		}

	}
	
	
}
