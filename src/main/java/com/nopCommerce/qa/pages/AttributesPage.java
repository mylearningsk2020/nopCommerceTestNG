package com.nopCommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerce.qa.TestBase.TestBase;

public class AttributesPage extends TestBase{

	AddNewAttributePage addNewAttributesPage;
	
	@FindBy(xpath="//h1[@class='pull-left']")
	WebElement pLabel;
	
	@FindBy(xpath="//a[@class='btn bg-blue']")
	WebElement addNew;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissable']")
	WebElement alertMsg;
	
	@FindBy(xpath="//td[text()='2computer']//preceding-sibling::td[@class=' text-center']//input[@name='checkbox_productattributes']")
	WebElement computer2;
	
	@FindBy(xpath="//td[text()='HDD']//preceding-sibling::td[@class=' text-center']//input[@name='checkbox_productattributes']")
	WebElement hDD;
	
	@FindBy(xpath="//button[@id='delete-selected']")
	WebElement delSelected;
	
	@FindBy(xpath="//span[contains(text(),'Product attributes')]")
	WebElement prodAttributes;
	
	@FindBy(xpath="//span[contains(text(),'Specification attributes')]")
	WebElement specAttributes;
	
	@FindBy(xpath="//span[contains(text(),'Checkout attributes')]")
	WebElement checkoutAttributes;
	
	
	public AttributesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLabel() {
		pLabel.isDisplayed();
	   return pLabel.getText();
	
	}
	
	
	public AddNewAttributePage clickAddNew() {
		addNew.click();
		return new AddNewAttributePage();
	}
	
	public String attributePageTitle() {
		return driver.getTitle();
		
	}
	
	public void addNewMsg() {
		String addNewMsg = alertMsg.getText();
		System.out.println(addNewMsg);
	}
	
	public void checkhDDCheckBox() {
		hDD.isSelected();
	}
	
	public void check2comuterCheckBox() {
		computer2.isSelected();
	}
	
	public void deleteSelected() {
		computer2.isSelected();
		delSelected.click();
	}
	
	public ProductAttributesPage clickProdAttributesLInk() {
		prodAttributes.click();
		return new ProductAttributesPage();
		
		}
	
	public SpecAttributesPage clickSpecAttributesLink() {
		specAttributes.click();
		return new SpecAttributesPage();
	}
	
	public CheckOutAttributesPage clickcheckoutAttributes() {		
		checkoutAttributes.click();
		return new CheckOutAttributesPage();
		
	}

}
