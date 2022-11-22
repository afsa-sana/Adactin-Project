package adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookHotelPage {

	public AdactinBookHotelPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement fldFirstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement fldLastName;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement fldBillingAddress;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement fldCreditCard;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement btnSubmit;
	
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement fldCreditCardType;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement fldExpireMonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement fldExpireYear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement fldCvvNumber;
	
	
	public WebElement getFldFirstName() {
		return fldFirstName;
	}

	public WebElement getFldLastName() {
		return fldLastName;
	}

	public WebElement getFldBillingAddress() {
		return fldBillingAddress;
	}

	public WebElement getFldCreditCard() {
		return fldCreditCard;
	}

	public WebElement getFldCreditCardType() {
		return fldCreditCardType;
	}

	public WebElement getFldExpireMonth() {
		return fldExpireMonth;
	}

	public WebElement getFldExpireYear() {
		return fldExpireYear;
	}

	public WebElement getFldCvvNumber() {
		return fldCvvNumber;
	}

	public WebElement getBtnSubmit()
	{
		return btnSubmit;
	}
	
	
	
}
