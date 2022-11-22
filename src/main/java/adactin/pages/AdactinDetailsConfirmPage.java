package adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinDetailsConfirmPage {
	
	public AdactinDetailsConfirmPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement selectRadioButton;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continueButton;
	
	public WebElement getSelectRadioButton()
	{
		return selectRadioButton;
	}
	
	public WebElement getContinueButton()
	{
		return continueButton;
	}
}
