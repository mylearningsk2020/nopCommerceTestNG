package nopCommerceTestNG.qa.testcases;

import org.testng.annotations.BeforeMethod;

import com.nopCommerce.qa.TestBase.TestBase;
import com.nopCommerce.qa.pages.HomePage;
import com.nopCommerce.qa.pages.LoginPage;

public class SearchCustomersTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	
	
	public SearchCustomersTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		homePage = loginPage.clickLogin(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickCustomers();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
