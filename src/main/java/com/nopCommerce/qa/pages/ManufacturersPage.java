package com.nopCommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nopCommerce.qa.TestBase.TestBase;

public class ManufacturersPage extends TestBase {
	
	Select select;
	
	@FindBy(xpath="//input[@id='SearchManufacturerName']")
	WebElement manufacturerName;
	
	@FindBy(xpath="//select[@name='SearchPublishedId']")
	WebElement published;
	
	@FindBy(xpath="//button[@id='search-manufacturers']")
	WebElement search;
	
	
	public ManufacturersPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchAll() {
		Select select = new Select(published);
		select.selectByVisibleText("All");
		search.click();
	}
	
	public void searchPublished() {
		select = new Select(published);
		select.selectByVisibleText("Published only");
		search.click();
		
	}
	
	public void searchUnpublished() {
		select = new Select(published);
		select.selectByVisibleText("Unpublished only");
		search.click();
		
	}
	
	public String manufacturersPageTitle() {
		return driver.getTitle();
	}

}
