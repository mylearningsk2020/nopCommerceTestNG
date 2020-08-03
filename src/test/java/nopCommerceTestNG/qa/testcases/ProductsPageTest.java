package nopCommerceTestNG.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerce.qa.TestBase.TestBase;
import com.nopCommerce.qa.pages.CatalogsPage;
import com.nopCommerce.qa.pages.HomePage;
import com.nopCommerce.qa.pages.LoginPage;
import com.nopCommerce.qa.pages.ProductsPage;

public class ProductsPageTest extends TestBase {

	ProductsPage productsPage;
	LoginPage loginPage;
	HomePage homePage;
	CatalogsPage catalogsPage;
	
	public ProductsPageTest() {
		super();
		
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage= new LoginPage();
		productsPage = new ProductsPage();
		catalogsPage = new CatalogsPage();
		homePage = loginPage.clickLogin(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickCatalog();
		productsPage = catalogsPage.clickProductsLink();
			
	}

	@Test(priority=1)
	public void productsPageTitleTest() {
		String title = productsPage.proudctsPageTitle();
		Assert.assertEquals(title, "Products / nopCommerce administration");
		
	}

	@Test(priority=2)
	public void searchProductsTest() {
		productsPage.searchProduts();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
