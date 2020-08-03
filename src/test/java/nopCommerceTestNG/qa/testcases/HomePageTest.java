package nopCommerceTestNG.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerce.qa.TestBase.TestBase;
import com.nopCommerce.qa.pages.HomePage;
import com.nopCommerce.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		homePage = loginPage.clickLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@Test
	public void homePageTitleTest() {
		homePage.verifydashBoardPageTitle();
	}
	
	@Test
	public void clickCatalogTest() {
		homePage.clickCatalog();
	}
	
	@Test
	public void clickSalesTest() {
		homePage.clickSales();
	}
	@Test
	public void clickCustomersTest() {
		homePage.clickCustomers();
	}
	@Test
	public void clickPromotionsTest() {
		homePage.clickPromotions();
	}
	
	@Test
	public void clickCmanagementTest() {
	homePage.clickCmanagement();	
	}
	
	@Test
	public void clickConfiguratioinsTest() {
		homePage.clickConfiguration();
	}
	
	@Test
	public void clickSystemTest() {
		homePage.clickSystem();
	}
	@Test
	public void clickReportsTest() {
		homePage.clickReports();
	}
	
	@Test
	public void cickHelpTest() {
		homePage.clickHelp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

