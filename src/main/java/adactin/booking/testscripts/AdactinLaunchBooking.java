package adactin.booking.testscripts;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import adactin.pages.AdactinBookHotelPage;
import adactin.pages.AdactinBookingConfirmPage;
import adactin.pages.AdactinDetailsConfirmPage;
import adactin.pages.AdactinLoginPage;
import adactin.pages.AdactinSearchHotelPage;
import adactin.utils.AdactinUtils;
import adactin.utils.Log;

public class AdactinLaunchBooking extends AdactinUtils{
	
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest logger;
	
	String url="https://adactinhotelapp.com/";
	WebDriver driver = null;
	@BeforeTest
	public void init() {
		Log.InitiateReport();
	}
	
	@Test(description="TC001 Verify Valid User Allowed To Login The Application")
	public void TC001() throws InterruptedException, IOException {
		Log.testcaseinfo("TC001 Verify Valid User Allowed To Login The Application");
		driver = launchChromeBrowser(url);
		Log.message("ChromeBrowser Launched Successfully");
		Thread.sleep(2000);
		
		AdactinLoginPage loginPageElements = new AdactinLoginPage(driver);
		loginPageElements.enterValidUsername();
		loginPageElements.enterValidPassword();
		AdactinSearchHotelPage searchRoomPageElements = loginPageElements.enterLoginButton(driver);
		searchRoomPageElements.verifyWelcomePopUp();
		Log.message("User Succesfully Logged Into The Booking Page ");
		Log.endtestcase();
	}
	
	@Test(description="TC002 Verify Invalid User Not Allowed To Login The Application")
	public void TC002() throws InterruptedException {
		Log.testcaseinfo("TC002 Verify Invalid User Not Allowed To Login The Application");
		driver = launchChromeBrowser(url);
		Log.message("ChromeBrowser Launched Successfully");
		Thread.sleep(2000);
		
		AdactinLoginPage loginPageElements = new AdactinLoginPage(driver);
		loginPageElements.enterInvalidUserName();
		loginPageElements.enterInvalidPassword();
		loginPageElements.enterLoginButton(driver);
		loginPageElements.verifyErrorMessagePop();
		Log.message("Error Message Pop is Displayed");
		Log.endtestcase();

	}
	
	@Test(description = "TC003-Verify valid user allowed to book the hotel successfully")
	public void TC003() throws InterruptedException, IOException {
		Log.testcaseinfo("TC003-Verify valid user allowed to book the hotel successfully");
	    driver = launchChromeBrowser(url);
		Thread.sleep(2000);
		
		AdactinLoginPage loginPageElements = new AdactinLoginPage(driver);
		loginPageElements.enterValidUsername();
		loginPageElements.enterValidPassword();
		AdactinSearchHotelPage searchRoomPageElements = loginPageElements.enterLoginButton(driver);
		searchRoomPageElements.verifyWelcomePopUp();
		
		Log.message("Driver Launched Successfully");
		
		searchRoomPageElements.selectLocation();
		searchRoomPageElements.selectHotel();
		searchRoomPageElements.selectRoomType();
		searchRoomPageElements.enterNumberOfRooms();
		searchRoomPageElements.enterCheckInDate();
		searchRoomPageElements.enterCheckOutDate();
		searchRoomPageElements.enterNumberOfAdultRooms();
		searchRoomPageElements.enterNumberOfChildrenRooms();
		AdactinDetailsConfirmPage detailsPageElements  = searchRoomPageElements.enterSearchButton(driver);
		
		detailsPageElements.selectRadioButton();
		AdactinBookHotelPage bookHotelPageElements  =detailsPageElements.enterContinueButton(driver);
		Log.message("User successfully Confirmed Hotel details by clicking Continue Button");
				
		bookHotelPageElements.enterFirstName();
		bookHotelPageElements.enterLastName();
		bookHotelPageElements.enterBillingAddress();
		bookHotelPageElements.enterCreditCardNumber();
		bookHotelPageElements.selectCreditCardType();
		bookHotelPageElements.selectExpiryMonth();
		bookHotelPageElements.selectExpiryYear();
		bookHotelPageElements.enterCvvNumber();
		AdactinBookingConfirmPage bookConfirmpageElements  = bookHotelPageElements.selectBookNowButton(driver);
		Thread.sleep(5000);
		
		bookConfirmpageElements.getOrderNumberOfBooking();
		Log.message("Order Number of the hotel Booking is displayed successfully");
 		Log.message("Successfully done");
		Log.endtestcase();
	}
	
	@Test(description = "TC 004: Verify User Not Allowed To Book The Hotel, If Any Mandatory Is Missed")
	public void TC004() throws InterruptedException, IOException {
		Log.testcaseinfo("TC 004: Verify User Not Allowed To Book The Hotel, If Any Mandatory Is Missed");
		driver = launchChromeBrowser(url);
		Thread.sleep(2000);
		
		AdactinLoginPage loginPageElements = new AdactinLoginPage(driver);
		loginPageElements.enterValidUsername();
		loginPageElements.enterValidPassword();
		AdactinSearchHotelPage searchRoomPageElements = loginPageElements.enterLoginButton(driver);
		searchRoomPageElements.verifyWelcomePopUp();
		
		searchRoomPageElements.selectHotel();
		searchRoomPageElements.selectRoomType();
		searchRoomPageElements.enterNumberOfRooms();
		searchRoomPageElements.enterCheckInDate();
		searchRoomPageElements.enterCheckOutDate();
		searchRoomPageElements.enterNumberOfAdultRooms();
		searchRoomPageElements.enterNumberOfChildrenRooms();
		searchRoomPageElements.enterSearchButton(driver);
		searchRoomPageElements.verifyLocationErrorPopDisplayed();
		
		
		Log.endtestcase();
		
	}
	
	@Test(description=" TC005 :Verify User Able To Logout the application Successfully ")
	public void TC005() throws InterruptedException, IOException {
		Log.testcaseinfo(" TC005: Verify User Able To Logout the application Successfully ");
		driver = launchChromeBrowser(url);
		Thread.sleep(2000);
		

		AdactinLoginPage loginPageElements = new AdactinLoginPage(driver);
		loginPageElements.enterValidUsername();
		loginPageElements.enterValidPassword();
		AdactinSearchHotelPage searchRoomPageElements = loginPageElements.enterLoginButton(driver);
		searchRoomPageElements.verifyWelcomePopUp();
		
		
		searchRoomPageElements.selectLocation();
		searchRoomPageElements.selectHotel();
		searchRoomPageElements.selectRoomType();
		searchRoomPageElements.enterNumberOfRooms();
		searchRoomPageElements.enterCheckInDate();
		searchRoomPageElements.enterCheckOutDate();
		searchRoomPageElements.enterNumberOfAdultRooms();
		searchRoomPageElements.enterNumberOfChildrenRooms();
		AdactinDetailsConfirmPage detailsPageElements = searchRoomPageElements.enterSearchButton(driver);
		Log.message("User successfully clicked SearchButton");
		
		detailsPageElements.selectRadioButton();
		AdactinBookHotelPage bookHotelPageElements = detailsPageElements.enterContinueButton(driver);
		Log.message("User successfully Confirmed Hotel details");
				
		bookHotelPageElements.enterFirstName();
		bookHotelPageElements.enterLastName();
		bookHotelPageElements.enterBillingAddress();
		bookHotelPageElements.enterCreditCardNumber();
		bookHotelPageElements.selectCreditCardType();
		bookHotelPageElements.selectExpiryMonth();
		bookHotelPageElements.selectExpiryYear();
		bookHotelPageElements.enterCvvNumber();
		AdactinBookingConfirmPage bookConfirmpageElements = bookHotelPageElements.selectBookNowButton(driver);
		Log.message("User successfully clicked on Book now Button");
		Thread.sleep(5000);
		bookConfirmpageElements.getOrderNumberOfBooking();
		Thread.sleep(2000);
		bookConfirmpageElements.logOutButton();
		bookConfirmpageElements.verifyLogOutPopUp();
 		Log.message("Successfully done");
		Log.endtestcase();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		


	
	/*@Test
	public void TC003() throws InterruptedException {
		String property = System.getProperty("user.dir");
		System.out.println(property);*/
	
}
