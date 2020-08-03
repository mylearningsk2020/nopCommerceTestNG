package com.nopCommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import com.nopCommerce.qa.TestBase.TestBase;

public class AddNewSpecification extends TestBase {
	
	@FindBy(xpath="//h1[@class='pull-left']")
	WebElement addNewSpecLabel;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//button[@name='save-continue']")
	WebElement saveContinueBtn;
	
	@FindBy(xpath="//li[text()='Please provide a name.']")
	WebElement wrngMsg;
	
	@FindBy(xpath="//input[@id='Name']")
	WebElement attrName;
	
	@FindBy(xpath="//input[@id='DisplayOrder']")
	WebElement displayOrder;
	
	
	public AddNewSpecification() {
		PageFactory.initElements(driver, this);
	}
	
	public SpecAttributesPage clickSaveBtn() {
		attrName.sendKeys("2computer");
		displayOrder.sendKeys("4");
		saveBtn.click();
		return new SpecAttributesPage();
		              	
		
	}
	
	
	public void addNewSpecificationPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
}
