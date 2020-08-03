package com.nopCommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerce.qa.TestBase.TestBase;

import junit.framework.Assert;

public class SpecAttributesPage extends TestBase {

	
	@FindBy(xpath="//h1[@class='pull-left']")
	WebElement specLabel;
	
	
	@FindBy(xpath="//a[@class='btn bg-blue']")
	WebElement addNew;
	
	@FindBy(xpath="//button[@id='delete-selected']")
	WebElement delSelected;
	
	
	public SpecAttributesPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void specAttributesTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Specification attributes / nopCommerce administration", title);
		
	}
	
	public AddNewSpecification clickAddNewBtn() {
		addNew.click();
		return new AddNewSpecification();
		
	}
	
	public void verifyspecLabel() {
		String Label = specLabel.getText();
		System.out.println(Label);
		Assert.assertEquals("Specification attributes", Label);
	}
	
		
}
