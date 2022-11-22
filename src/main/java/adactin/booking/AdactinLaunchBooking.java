package adactin.booking;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import adactin.pages.AdactinBookHotelPage;
import adactin.pages.AdactinBookingConfirmPage;
import adactin.pages.AdactinDetailsConfirmPage;
import adactin.pages.AdactinLoginPage;
import adactin.pages.AdactinSearchHotelPage;
import adactin.utils.AdactinUtils;

public class AdactinLaunchBooking extends AdactinUtils{
	String url="https://adactinhotelapp.com/";
	
	@Test
	public void TC001() throws InterruptedException {
		WebDriver driver = launchChromeBrowser(url);
		Thread.sleep(2000);
		AdactinLoginPage loginPageElements = new AdactinLoginPage(driver);
		typeValue(loginPageElements.getFldUserName(), "afsarasee");
		typeValue(loginPageElements.getFldPassword(), "afsarasee");
		elementToClick(loginPageElements.getbtnLogin());
		
		AdactinSearchHotelPage searchRoomPageElements = new AdactinSearchHotelPage(driver);
		dropDownElement(searchRoomPageElements.getSearchLocation(), "London");
		dropDownElement(searchRoomPageElements.getHotelName(), "Hotel Sunshine");
		dropDownElement(searchRoomPageElements.getRoomType(), "Super Deluxe");
		dropDownElement(searchRoomPageElements.getNumberOfRooms(), "3");
		typeValue(searchRoomPageElements.getCheckInDate(), "22/11/2022");
		typeValue(searchRoomPageElements.getCheckOutDate(), "24/11/2022");
		dropDownElement(searchRoomPageElements.getNumberOfAdultPerRoom(), "3");
		dropDownElement(searchRoomPageElements.getNumberOfChildrenPerRoom(), "0");
		elementToClick(searchRoomPageElements.getSubmitButton());
		
		AdactinDetailsConfirmPage detailsPageElements = new AdactinDetailsConfirmPage(driver);
		elementToClick(detailsPageElements.getSelectRadioButton());
		elementToClick(detailsPageElements.getContinueButton());
		
		AdactinBookHotelPage bookHotelPageElements = new AdactinBookHotelPage(driver);
		typeValue(bookHotelPageElements.getFldFirstName(), "Afsana");
		typeValue(bookHotelPageElements.getFldLastName(), "sana");
		typeValue(bookHotelPageElements.getFldBillingAddress(), "No 30 a RajuStreet,kelambakam,Vaaniyambadi");
		typeValue(bookHotelPageElements.getFldCreditCard(), "1234567898765432");
		dropDownElement(bookHotelPageElements.getFldCreditCardType(), "VISA");
		dropDownElement(bookHotelPageElements.getFldExpireMonth(), "12");
		dropDownElement(bookHotelPageElements.getFldExpireYear(), "2022");
		typeValue(bookHotelPageElements.getFldCvvNumber(), "123");
		elementToClick(bookHotelPageElements.getBtnSubmit());
		
		Thread.sleep(5000);
		AdactinBookingConfirmPage bookConfirmpageElements = new AdactinBookingConfirmPage(driver);
		getTextFromElement(bookConfirmpageElements.getOrderNumber());
		
	}
}
