package com.nopCommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerce.qa.TestBase.TestBase;

public class AddNewAttributePage extends TestBase {

	@FindBy(xpath="//input[@id='Name']")
	WebElement name;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement save;
	
	
	
	public AddNewAttributePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public AttributesPage addNewAttribute() {
		name.sendKeys("2computer");
		save.click();
		return new AttributesPage();
	}
	
}
