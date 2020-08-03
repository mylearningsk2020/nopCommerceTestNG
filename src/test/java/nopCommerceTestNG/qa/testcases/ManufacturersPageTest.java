package nopCommerceTestNG.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerce.qa.TestBase.TestBase;
import com.nopCommerce.qa.pages.CatalogsPage;
import com.nopCommerce.qa.pages.HomePage;
import com.nopCommerce.qa.pages.LoginPage;
import com.nopCommerce.qa.pages.ManufacturersPage;

public class ManufacturersPageTest extends TestBase{
	
	WebDriver driver;
	ManufacturersPage mfrPage;
	LoginPage loginPage;
	HomePage homePage;
	CatalogsPage catalogsPage;
	
	
	public ManufacturersPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		mfrPage = new ManufacturersPage();
		homePage = new HomePage();
		homePage = loginPage.clickLogin(prop.getProperty("username"), prop.getProperty("password"));
		catalogsPage = new CatalogsPage();
		homePage.clickCatalog();
		mfrPage= catalogsPage.clickManufactureresLink();	
		
	}
	
	@Test(enabled = false)
	public void searchAllTest() {
		mfrPage.searchAll();
			
	}
	
	@Test(priority=1)
	public void searchPublishedOnlyTest() {
		mfrPage.searchPublished();
	}
	
	@Test(priority=2)
	public void searchUnpublishedOnlyTest() {
		mfrPage.searchUnpublished();
	}
	
	@Test(priority=4)
	public void manufacturersPageTitleTest() {
		
	String title =mfrPage.manufacturersPageTitle();
	Assert.assertEquals(title, "Manufacturers / nopCommerce administration");
	
	}

		
}
