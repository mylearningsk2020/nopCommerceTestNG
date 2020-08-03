package nopCommerceTestNG.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerce.qa.TestBase.TestBase;
import com.nopCommerce.qa.pages.AddNewSpecification;
import com.nopCommerce.qa.pages.AttributesPage;
import com.nopCommerce.qa.pages.CatalogsPage;
import com.nopCommerce.qa.pages.HomePage;
import com.nopCommerce.qa.pages.LoginPage;
import com.nopCommerce.qa.pages.SpecAttributesPage;

import junit.framework.Assert;

public class AddNewAttributePageTest extends TestBase {
	
		LoginPage loginPage;
		HomePage homePage;
		CatalogsPage catalogsPage;
		AttributesPage attributesPage;
		SpecAttributesPage specAttributesPage;
		AddNewSpecification addNewSpecification;	
	
	
	public AddNewAttributePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.clickLogin(prop.getProperty("username"), prop.getProperty("password"));
		catalogsPage =new CatalogsPage();
		homePage = new HomePage();
		homePage.clickCatalog();
		catalogsPage.clickAttributesLink();
		attributesPage = new AttributesPage();
		specAttributesPage=attributesPage.clickSpecAttributesLink();
		specAttributesPage = new SpecAttributesPage();
		
	}
	
	@Test(priority=1)
	public AddNewSpecification addNewSpecificationTest() {
		addNewSpecification = specAttributesPage.clickAddNewBtn();
		return new AddNewSpecification();
		
	}
	
	@Test(priority=2)
	public void addNewAttributePageTitleTest() {
		addNewSpecification = specAttributesPage.clickAddNewBtn();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Add a new specification attribute / nopCommerce administration", title);
		}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
