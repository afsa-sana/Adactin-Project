package adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage {


	public AdactinLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement fldUserName;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement fldPassword;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement btnLogin;
	
	
	public WebElement getFldUserName()
	{
		return fldUserName;
	}
	
	public WebElement getFldPassword()
	{
		return fldPassword;
	}
	
	public WebElement getbtnLogin()
	{
		return btnLogin;
	}
	
}
