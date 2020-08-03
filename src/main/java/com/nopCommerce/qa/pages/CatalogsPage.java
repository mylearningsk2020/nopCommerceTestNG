package com.nopCommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerce.qa.TestBase.TestBase;

public class CatalogsPage extends TestBase {
	
   @FindBy(xpath="//span[contains(text(),'Products')]")
	WebElement products;
   
   @FindBy(xpath="//span[contains(text(),'Categories')]")
	WebElement categories;
   
   @FindBy(xpath="//span[contains(text(),'Manufacturers')]")
	WebElement manufacturers;
   
   @FindBy(xpath="//span[contains(text(),'Product reviews')]")
	WebElement pReviews;
   
   @FindBy(xpath="//span[contains(text(),'Product tags')]")
	WebElement pTags;
   
   @FindBy(xpath="//span[contains(text(),'Attributes')]")
	WebElement attributes;
   
   @FindBy(xpath="//span[text()='Product attributes']")
   WebElement pAttributesLink;
   
   @FindBy(xpath="//span[text()='Specification attributes']")
   WebElement specAttributes;
   
   
   
   public CatalogsPage() {
	   PageFactory.initElements(driver, this);
   }
   
   public ProductsPage clickProductsLink() {
	   products.click();
	   return new ProductsPage();
   }
   
   public CategoriesPage clickCategoriesLink() {
	   categories.click();
	   return new CategoriesPage();
   }
   
   public ManufacturersPage clickManufactureresLink() {
	   manufacturers.click();
	   return new ManufacturersPage();
   }
   
   public ProductReviewsPage clickproductReviewsLink() {
	   pReviews.click();
	   return new ProductReviewsPage();
   }
   
   public ProductTagsPage clickProductTagsLink() {
	   pTags.click();
	   return new ProductTagsPage();
	   
      }
   
   public void clickAttributesLink() {
	   attributes.click();
   }
   
   public AttributesPage clickProductAttributesLink() {
	   pAttributesLink.click();
	   return new AttributesPage();
   }
   
   public void clickSpectAttributesLink() {
	   specAttributes.click();
	   
   }
}