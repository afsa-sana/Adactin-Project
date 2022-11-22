package adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSearchHotelPage {
	public AdactinSearchHotelPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement searchLocation;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotelName;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement numberOfRooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement  checkInDate;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOutDate;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement numberOfAdultPerRoom;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement numberOfChildrenPerRoom;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitButton;

	public WebElement getSearchLocation() {
		return searchLocation;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getNumberOfAdultPerRoom() {
		return numberOfAdultPerRoom;
	}

	public WebElement getNumberOfChildrenPerRoom() {
		return numberOfChildrenPerRoom;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	
	
	
	
}
