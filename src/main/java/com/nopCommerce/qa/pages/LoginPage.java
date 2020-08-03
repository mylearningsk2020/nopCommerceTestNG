package com.nopCommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.nopCommerce.qa.TestBase.TestBase;



public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement login;
	
	@FindBy(xpath="//input[@name='RememberMe']")
	WebElement RememberMe;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void loginPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Your store. Login", title);
		
	}
	
	public HomePage clickLogin(String un, String pwd) {
		
		Email.clear();
		Password.clear();
		Email.sendKeys(un);
		Password.sendKeys(pwd);
		login.click();
		return new HomePage();
		
		}
		
}



