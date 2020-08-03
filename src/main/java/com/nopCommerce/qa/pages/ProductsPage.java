package com.nopCommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nopCommerce.qa.TestBase.TestBase;

public class ProductsPage extends TestBase {
	
	@FindBy(xpath="//input[@id='SearchProductName']")
	WebElement productName;
	
	@FindBy(xpath="//select[@id='SearchCategoryId']")
	WebElement category;
	
	@FindBy(xpath="//select[@id='SearchCategoryId']")
	WebElement subCategories;
	
	@FindBy(xpath="//select[@name='SearchManufacturerId']")
	WebElement manufacturer;
	
	@FindBy(xpath="//select[@name='SearchVendorId']")
	WebElement vendor;
	
	@FindBy(xpath="//select[@name='SearchWarehouseId']")
	WebElement wareHouse;
	
	@FindBy(xpath="//select[@name='SearchProductTypeId']")
	WebElement productType;
	
	@FindBy(xpath="//select[@name='SearchPublishedId']")
	WebElement published;
	
	@FindBy(xpath="//input[@name='GoDirectlyToSku']']")
	WebElement productSKU;
	
	@FindBy(xpath="//button[@id='go-to-product-by-sku']")
	WebElement goBtn;
	
	@FindBy(xpath="//button[@id='search-products']")
	WebElement searchProducts;
	
	public ProductsPage() {
		PageFactory.initElements(driver,this);
		
	}	
		
	public String proudctsPageTitle() {
		  return driver.getTitle();
	}
	
	public void searchProduts() {
	
		Select select = new Select(manufacturer);
		select.selectByVisibleText("Apple");
		searchProducts.click();
		
	}
	
					
	}
			
	
	
	
	

