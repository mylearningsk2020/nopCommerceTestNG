package nopCommerceTestNG.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerce.qa.TestBase.TestBase;
import com.nopCommerce.qa.pages.CatalogsPage;
import com.nopCommerce.qa.pages.HomePage;
import com.nopCommerce.qa.pages.LoginPage;
import com.nopCommerce.qa.pages.ProductReviewsPage;

public class ProductReviewsPageTest extends TestBase{
	
	String dateVal ="03/12/2017";
	String dateVal1 = "03/14/2017";
	
	LoginPage loginPage;
	HomePage homePage;
	CatalogsPage catalogsPage;
	ProductReviewsPage prPage;
	String dateValue1 = "03/12/2017";
	String dateValue2 = "03/14/2017";
	
	public ProductReviewsPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		catalogsPage = new CatalogsPage();
		prPage = new ProductReviewsPage();
		
		homePage = loginPage.clickLogin(prop.getProperty("username"), prop.getProperty("password"));
  		homePage.clickCatalog();
  		prPage = catalogsPage.clickproductReviewsLink();	
		
	}
	
	@Test(priority=1)
	public void searchProductReviewsTest() {
		
		prPage.clickSearchProductReviews();
	}
	
	@Test(priority=2)
	public void productReviewsPageTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Product reviews / nopCommerce administration", title);
	}
	
	@Test(priority=3)
	public void searchAllProductReviewsTest() {
		prPage.searchAll();
	}
	
	@Test(priority=4)
	public void searchApprovedOnlyTest() {
		prPage.searchApprovedOnly();
	}
	
	@Test(priority=5)
	public void searchDisapprovedOnlyTest() {
		prPage.searchDisapprovedOnly();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
