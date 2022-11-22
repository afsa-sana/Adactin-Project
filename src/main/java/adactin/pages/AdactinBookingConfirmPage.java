package adactin.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookingConfirmPage {
	
	
	
	public AdactinBookingConfirmPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement orderNumber;
	
	public WebElement getOrderNumber()
	{
		return orderNumber;
	}
	
	
	
	
}
