package com.nopCommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nopCommerce.qa.TestBase.TestBase;

public class SearchCustomers extends TestBase{
	
	
	@FindBy(xpath="//input[@id='SearchEmail']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='SearchCompany']")
	WebElement company;
	
	@FindBy(xpath="//input[@id='SearchFirstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='SearchLastName']")
	WebElement lastName;
	
	
	@FindBy(xpath="//input[@id='SearchIpAddress']")
	WebElement ipAddress;
	
	@FindBy(xpath="//div[@class='k-multiselect-wrap k-floatwrap']")
	WebElement customerRoles;
	
	@FindBy(xpath="//select[@id='SearchMonthOfBirth']")
	WebElement monthOfBrith;
	
	@FindBy(xpath="//select[@id='SearchDayOfBirth']")
	WebElement dayOfBirth;
	
	@FindBy(xpath="//button[@id='search-customers']")
	WebElement search;
	
	
	public SearchCustomers() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchByEmail() {
		email.sendKeys("victoria_victoria@nopCommerce.com");
		search.click();		
		
	}
	
	public void searchByName() {
		firstName.sendKeys("Brenda");
		lastName.sendKeys("Lindgren");
		search.click();
		
	}
	
	public void searchByDateOfBirth() {
		Select month = new Select(monthOfBrith);
		month.selectByVisibleText("10");
		Select day = new Select(dayOfBirth);
		day.selectByValue("20");
		search.click();		
		
	}
	
	public void getPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
