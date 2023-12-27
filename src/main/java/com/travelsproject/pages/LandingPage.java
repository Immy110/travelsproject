package com.travelsproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.travelsproject.factory.ProjectActions;

public class LandingPage extends ProjectActions {
	
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	By Account = By.xpath("//*[@id='navbarSupportedContent']/div[2]/ul/li[3]/a");
	By Login = By.xpath("//*[@href='https://phptravels.net/login']");
	
	By Email = By.xpath("//*[@id='email']");
	By Password = By.xpath("//*[@id='password']");
	By LoginButton = By.xpath("//*[@id='submitBTN']");
	
	public void clickObNAccount()
	{
		click(Account, "Account link");
	}
	
	public void clickOnLoginLink()
	{
		click(Login, "Login lin");
	}
	
	public void enterEmailCredentails(String emailaddress, String password)
	{
		sendKeys(Email, emailaddress, "Email Address");
		sendKeys(Password, password, "Password");
	}
	
	public void clickonSubmit()
	{
		click(LoginButton, "Login button");
	}

}


