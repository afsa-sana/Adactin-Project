package adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.utils.AdactinUtils;

public class AdactinBookHotelPage extends AdactinUtils{

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
	
	public void enterFirstName() {
		typeValue(fldFirstName, "Afsana");
	}
	
	public void enterLastName() {
		typeValue(fldLastName, "sana");
	}
	
	public void enterBillingAddress() {
	    typeValue(fldBillingAddress, "No.30 A,Raju Street,Melkalvoy.603108");
	}
	
	public void enterCreditCardNumber() {
		typeValue(fldCreditCard, "1234567898765432");
	}
	
	public void selectCreditCardType() {
		dropDownElement(fldCreditCardType, "VISA");
	}
	
	public void selectExpiryMonth() {
		dropDownElement(fldExpireMonth, "12");
	}
	
	public void selectExpiryYear() {
		dropDownElement(fldExpireYear, "2022");
	}
	
	public void enterCvvNumber() {
		typeValue(fldCvvNumber, "123");
	}
	
	public AdactinBookingConfirmPage selectBookNowButton(WebDriver driver) {
		elementToClick(btnSubmit);
		return new AdactinBookingConfirmPage(driver);

	}
	
	
}
