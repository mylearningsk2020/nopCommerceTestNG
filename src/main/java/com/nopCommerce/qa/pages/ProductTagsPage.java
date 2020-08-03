package com.nopCommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerce.qa.TestBase.TestBase;

public class ProductTagsPage extends TestBase {
	
	@FindBy(xpath="//input[@id='SearchTagName']")
	WebElement tagName;
	
	@FindBy(xpath="//button[@id='search-product-tags']")
	WebElement searchTags;
	
	@FindBy(xpath="//h1[@class='pull-left']")
	WebElement label;
	
	
	public ProductTagsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void searchTag() {
		tagName.sendKeys("computer");
		searchTags.click();
	}
	
	public String productTagsPageTitle() {
		return driver.getTitle();
	}
	
	public void verifyLabel() {
		label.isDisplayed();
	}

	}

	