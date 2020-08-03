package com.nopCommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerce.qa.TestBase.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement dashBoard;
	
	@FindBy(xpath="//span[text()='Catalog']")
	WebElement catalog;
	
	@FindBy(xpath="//span[text()='Sales']")
	WebElement sales;
	
	@FindBy(xpath="//span[text()='Customers']")
	WebElement customers;
	
	@FindBy(xpath="//span[text()='Promotions']")
	WebElement promotions;
	
	@FindBy(xpath="//span[text()='Content management']")
	WebElement cmanagement;
	
	@FindBy(xpath="//span[text()='Configuration']")
	WebElement configuration;
	
	@FindBy(xpath="//span[text()='System']")
	WebElement system;
	
	@FindBy(xpath="//span[text()='Reports']")
	WebElement reports;
	
	@FindBy(xpath="//span[text()='Help']")
	WebElement help;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logOut;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifydashBoardPageTitle() {
		String dashBoardPageTitle = driver.getTitle();
		System.out.println(dashBoardPageTitle);
	}
	public void clickCatalog() {
		catalog.click();
		
	}
	
	
	
	public void clickSales() {
		sales.click();
		
	}
	
	public void clickCustomers() {
		customers.click();
	}
	
	public void clickPromotions() {
		promotions.click();
	}
	
	public void clickCmanagement() {
		cmanagement.click();
	}
	
	public void clickConfiguration() {
		configuration.click();
	}
	
	public void clickSystem() {
		system.click();
	}
	
	public void clickReports() {
		reports.click();
	}
	
	public void clickHelp() {
		help.click();
	}
	
	public void clickLogout() {
		logOut.click();
	}
	
	
}
