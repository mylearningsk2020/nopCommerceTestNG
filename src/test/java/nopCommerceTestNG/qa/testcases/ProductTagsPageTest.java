package nopCommerceTestNG.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerce.qa.TestBase.TestBase;
import com.nopCommerce.qa.pages.CatalogsPage;
import com.nopCommerce.qa.pages.HomePage;
import com.nopCommerce.qa.pages.LoginPage;
import com.nopCommerce.qa.pages.ProductTagsPage;

import junit.framework.Assert;

public class ProductTagsPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CatalogsPage catalogsPage;
	ProductTagsPage productTagsPage;
	
	public ProductTagsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.clickLogin(prop.getProperty("username"),prop.getProperty("password"));
		  homePage.clickCatalog();
		  catalogsPage =  new CatalogsPage();
		  productTagsPage = new ProductTagsPage();
		  productTagsPage =   catalogsPage.clickProductTagsLink();
		  
		
		
	}
	
	@Test(enabled = false)
	public void searchTagsTest() {
		productTagsPage.searchTag();
		
	}
	
	@Test(priority=1)
	public void productTagsPageTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Product tags / nopCommerce administration",title);
	}
	
	@Test(priority=2)
	public void verifyLabelTest() {
		productTagsPage.verifyLabel();
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
