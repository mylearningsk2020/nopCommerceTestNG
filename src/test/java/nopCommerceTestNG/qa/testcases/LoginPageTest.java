package nopCommerceTestNG.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerce.qa.TestBase.TestBase;
import com.nopCommerce.qa.pages.HomePage;
import com.nopCommerce.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage dashBoardPage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void loginPageTitle() {
		loginPage.loginPageTitle();
		
	}
	
	@Test(priority=2)
	public void clickLoginPageTest() {
		dashBoardPage =loginPage.clickLogin(prop.getProperty("username"),prop.getProperty("password"));
//		homePage =signInPage.clickSignin(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
