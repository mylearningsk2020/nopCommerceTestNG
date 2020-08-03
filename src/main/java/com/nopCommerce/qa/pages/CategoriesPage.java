package com.nopCommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nopCommerce.qa.TestBase.TestBase;

public class CategoriesPage extends TestBase{


	@FindBy(xpath="//input[@id='SearchCategoryName']")
	WebElement categoryName;
	
	@FindBy(xpath="//select[@id='SearchPublishedId']")
	WebElement published;
	
	@FindBy(xpath="//button[@id='search-categories']")
	WebElement search;
	
	public CategoriesPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchPublished() {
		Select select = new Select(published);
		select.selectByVisibleText("Published only");
		search.click();
		
	}
	
	public void searchUnpublished() {
		Select select = new Select(published);
		select.selectByVisibleText("Unpublished only");
		search.click();
		
	}
	
	public void searchAll() {
		Select select = new Select(published);
		select.selectByVisibleText("All");
		search.click();
		
	}
	
	public String verifyPageTitle() {
	   return  driver.getTitle();
	}
	
	
	
	
	
}
