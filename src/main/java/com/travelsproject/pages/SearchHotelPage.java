package com.travelsproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.travelsproject.factory.DriverFactory;
import com.travelsproject.factory.ProjectActions;

public class SearchHotelPage extends ProjectActions {
	
	 public WebDriver driver;

	public SearchHotelPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	By HotelLink = By.xpath("//a[@href='https://phptravels.net/hotels']");
	By Hotel = By.xpath("//*[@id='select2-hotels_city-container']");
	By EnterCityName = By.xpath("//*[@id='fadein']/span/span/span[1]/input");
	By Checkin = By.xpath("//*[@id='checkin']");
	By Checkout = By.xpath("//*[@id='checkout']");
	By TravellersDropdown = By.xpath("//*[contains(@class, 'dropdown-btn travellers')]");
	By AdultsPlus = By.xpath("//*[@id='hotels-search']/div/div[4]/div/div/div/div/div[2]/div/div/div[2]");
	By SearchButton = By.xpath("//*[@id='hotels-search']/div/div[5]/button");
	
	By calendarDates = By.xpath("//div[@class='datepicker-days']//tr//td");

	public void clickOnHotelLink()
	{
		click(HotelLink, "Hotel Menu Link");
	}
	
	public void clickOnHotelDropdown()
	{
		click(Hotel, "Hotel Dropdown");
	}
	
	public void enterCityName(String text)
	
	{
		sendKeys(EnterCityName, text, "Hotel City Input");
	}
	
	public void selectCity(String City)
	{
		driver.findElement(By.xpath("//li[text()='"+City+"']")).click();
	}
	
	public void CheckinDate(String text)
	
	{
		click(Checkin, "Checkin Date");
		//getDateSection(calendarDates, text);
		sendKeys(Checkin, text, "Checkin Date");
	}
	
	public void CheckoutDate(String text)
	
	{
		click(Checkout, "Checkout Date");
		sendKeys(Checkout, text, "Checkout Date");
	}
	
	
	public void TravellersDropdown()
	{

		click(TravellersDropdown, "Travellers Dropdown");
		click(AdultsPlus, "Adults Plus Button");
		
		click(TravellersDropdown, "Travellers Dropdown");
	}
	
	public void ClickOnSearchButton()
	
	{
		click(SearchButton, "Search Button");
	}

	

	
	
	

}
