package com.travelsproject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.travelsproject.factory.DriverFactory;
import com.travelsproject.pages.SearchFlightsPage;


@Listeners(com.travels.customListeners.Log.class)
public class SearchFlightsTest extends DriverFactory{
	
	SearchFlightsPage searchFlights;
	
	@BeforeTest
	public void startApplication() throws IOException, InterruptedException
	{
		Init_Driver();
		getDriver().get(prop.getProperty("AppUrl"));
		Thread.sleep(15000);
	}

	@Test
	public void searchFlighResults()
	{
		searchFlights = new SearchFlightsPage(getDriver());
		searchFlights.clickonFlyingFrom();
		searchFlights.enterCityNameFlyFromInput("BER");
		searchFlights.selectCity("BER");
		searchFlights.clickonDestinationTo();
		searchFlights.enterCityNameFlyToInput("AMS");
		searchFlights.selectCity("AMS");
		searchFlights.selectDate("29-12-2023");
		searchFlights.clickOnSearch();
	}
	
	@AfterTest
	public void tearDown()
	{
		getDriver().quit();
	}
}
