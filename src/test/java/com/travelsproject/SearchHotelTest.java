package com.travelsproject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.travelsproject.factory.DriverFactory;
import com.travelsproject.pages.SearchFlightsPage;
import com.travelsproject.pages.SearchHotelPage;

public class SearchHotelTest {

	@Listeners(com.travels.customListeners.Log.class)
	public class SearchFlightsTest extends DriverFactory{
		
		SearchHotelPage searchHotel;
		
		@BeforeTest
		public void startApplication() throws IOException, InterruptedException
		{
			Init_Driver();
			getDriver().get(prop.getProperty("AppUrl"));
			Thread.sleep(1500);
		}
		
		@Test
			public void searchHotelResults()
			{
			searchHotel = new SearchHotelPage(getDriver());
			searchHotel.clickOnHotelLink();
			searchHotel.clickOnHotelDropdown();
			searchHotel.enterCityName("Dubai");
			searchHotel.selectCity("Dubai, ");
			searchHotel.CheckinDate("31-12-2023");
			searchHotel.CheckoutDate("08-01-2024");
			searchHotel.TravellersDropdown();
			searchHotel.ClickOnSearchButton();
			
		}
		
		@AfterTest
		public void tearDown()
		{
			getDriver().quit();
		}
}
}