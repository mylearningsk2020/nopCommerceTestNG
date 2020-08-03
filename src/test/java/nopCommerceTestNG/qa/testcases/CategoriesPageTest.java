package nopCommerceTestNG.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerce.qa.TestBase.TestBase;
import com.nopCommerce.qa.pages.CatalogsPage;
import com.nopCommerce.qa.pages.CategoriesPage;
import com.nopCommerce.qa.pages.HomePage;
import com.nopCommerce.qa.pages.LoginPage;

import junit.framework.Assert;

public class CategoriesPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CatalogsPage catalogsPage;
	CategoriesPage categoriesPage;
	
	public CategoriesPageTest() {
		super();
	}	
	
	@BeforeMethod
	public void setUp() {	
		initialization();
		loginPage = new LoginPage();
		catalogsPage = new CatalogsPage();
		categoriesPage = new CategoriesPage();
		homePage = loginPage.clickLogin(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickCatalog();
		categoriesPage =catalogsPage.clickCategoriesLink();
		
	}
	
	@Test(priority=1)
	 public void searchAllCategoriesTest() {
		categoriesPage.searchAll();
	}
	
	@Test(priority=2)
	public void searchPublishOnlyTest() {
		categoriesPage.searchPublished();
		
	}
	@Test(priority=3)
	public void searhUnpublishedOnly() {
		categoriesPage.searchUnpublished();
	}

	@Test(priority=4)
	public void verifyPageTitleTest() {
		String CategoriesPageTitle =categoriesPage.verifyPageTitle();
		Assert.assertEquals("Categories / nopCommerce administration", CategoriesPageTitle);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	

}
