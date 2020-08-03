package com.nopCommerce.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nopCommerce.qa.TestBase.TestBase;

public class ProductReviewsPage extends TestBase {


	@FindBy(xpath = "//input[@id='CreatedOnFrom']")
	WebElement createdFrom;
	
	@FindBy(xpath = "//input[@id='CreatedOnTo']")
	WebElement createdTo;
	
	@FindBy(xpath = "//input[@id='SearchText']")
	WebElement message;
	
	@FindBy(xpath = "//select[@id='SearchApprovedId']")
	WebElement approved;
	
	@FindBy(xpath = "//input[@id='search-product-name']")
	WebElement product;
	
	@FindBy(xpath = "//button[@id='search-productreviews']")
	WebElement searchProductReviews;
	
//	String dateVal = " 03/12/2017";
//    String dateVal1 = "03/13/2017";
	
	
	
	public ProductReviewsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
//	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0],setAttribute('value','"+dateVal+"');", element);
//	
//	
//	}
//	
//	
//	public static void selectDateByJS1(WebDriver driver, WebElement element, String dateVal1) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0],setAttribute('value','"+dateVal1+"');", element);
//	
//	
//	}
	
	public void clickSearchProductReviews() {
//		selectDateByJS(driver,createdFrom,dateVal);
//		selectDateByJS1(driver,createdTo,dateVal1);		
		createdFrom.sendKeys("03/12/2017");
		createdTo.sendKeys("03/12/2017");
		searchProductReviews.click();
	}
	
	public String productReviewPageTitle() {
		return driver.getTitle();
		
	}

//	public void setCreatedFromData() {
//		createdFrom.sendKeys("03/12/2017");
//	}
//	
//	public void setCreateToData() {
//		createdFrom.sendKeys("03/12/2017");
//	}
	
	
	public void searchAll() {
		createdFrom.sendKeys("03/12/2017");
		createdTo.sendKeys("03/12/2017");
		Select select = new Select(approved);
		select.selectByVisibleText("All");
		searchProductReviews.click();
		
	}
	
	public void searchApprovedOnly() {
		createdFrom.sendKeys("03/12/2017");
		createdTo.sendKeys("03/12/2017");
		Select select = new Select(approved);
		select.selectByVisibleText("Approved only");
		searchProductReviews.click();
	}
	
	public void searchDisapprovedOnly() {
		createdFrom.sendKeys("03/12/2017");
		createdTo.sendKeys("03/12/2017");
		Select select = new Select(approved);
		select.selectByVisibleText("Disapproved only");
		searchProductReviews.click();
		
	}
	
	
	
}
