package com.travelsproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.travelsproject.factory.ProjectActions;

public class SearchFlightsPage extends ProjectActions {
	
    public WebDriver driver;

	public SearchFlightsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	By Flyfrom = By.xpath("//*[@id='onereturn']/div[1]/div[1]/div[2]/span/span[1]/span");
	By FlyfromInput = By.xpath("//*[@id='fadein']/span/span/span[1]/input");
	
	By FlyTo = By.xpath("//*[@id='onereturn']/div[2]/div[2]/div[2]/span/span[1]/span");
	By FlyToInput = By.xpath("//*[@id='fadein']/span/span/span[1]/input");
	
	By DepartDate = By.xpath("//input[@id='departure']");
	By searchButton = By.xpath("//button[@id='flights-search']");
	
	public void selectCity(String City)
	{
		driver.findElement(By.xpath("//button[text()='"+City+"']")).click();
	}
	
	public void clickonFlyingFrom()
	{
		click(Flyfrom, "Flying From");
	}
	
	public void enterCityNameFlyFromInput(String text)
	{
		sendKeys(FlyfromInput, text, "Fly From Input");
	}
	
	public void enterCityNameFlyToInput(String text)
	{
		sendKeys(FlyToInput, text, "Fly To Input");
	}
	
	public void clickonDestinationTo()
	{
		click(FlyTo, "Destination To");
	}

	public void selectDate(String text)
	{
		click(DepartDate, "Depart Date");
		sendKeys(DepartDate, text, "Depart Date");
	}
	
	public void clickOnSearch()
	{
		click(searchButton, "Search Button");
	}
}
