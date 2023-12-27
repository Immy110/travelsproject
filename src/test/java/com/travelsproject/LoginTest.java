package com.travelsproject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.travelsproject.factory.DriverFactory;
import com.travelsproject.pages.LandingPage;

@Listeners(com.travels.customListeners.Log.class)
public class LoginTest extends DriverFactory {
	
	LandingPage landingPage;
	
	@BeforeTest
	public void startApplication() throws IOException, InterruptedException
	{
		Init_Driver();
		getDriver().get(prop.getProperty("AppUrl"));
		Thread.sleep(5000);
	}
	
	@Test
	public void verifyLogin() throws InterruptedException
	{
		landingPage  = new LandingPage(getDriver());
		landingPage.clickObNAccount();
		landingPage.clickOnLoginLink();
		Thread.sleep(5000);
		landingPage.enterEmailCredentails("admin@phptravels.com", "demoadmin");
		landingPage.clickonSubmit();
	}
	
	@AfterTest
	public void tearDown()
	{
		getDriver().quit();
	}

}
