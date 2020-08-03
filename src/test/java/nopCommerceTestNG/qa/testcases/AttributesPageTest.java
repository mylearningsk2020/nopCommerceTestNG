package nopCommerceTestNG.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerce.qa.TestBase.TestBase;
import com.nopCommerce.qa.pages.AddNewAttributePage;
import com.nopCommerce.qa.pages.AttributesPage;
import com.nopCommerce.qa.pages.CatalogsPage;
import com.nopCommerce.qa.pages.HomePage;
import com.nopCommerce.qa.pages.LoginPage;

import org.testng.Assert;

public class AttributesPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	CatalogsPage catalogsPage;
	AttributesPage attributesPage;
	AddNewAttributePage addNewAttributePage;
		
	public AttributesPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.clickLogin(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickCatalog();
		catalogsPage = new CatalogsPage();
		attributesPage = new AttributesPage();
		catalogsPage.clickAttributesLink();
		attributesPage = catalogsPage.clickProductAttributesLink();
		
	}
	
	@Test(priority=1)
	public void attributesPageTitleTest() {
		String title = attributesPage.attributePageTitle();
		System.out.println(title);
		Assert.assertEquals("Product attributes / nopCommerce administration", title);
		
	}
	
	@Test(priority=2)
	public void clickAddNewTest() {
		addNewAttributePage = attributesPage.clickAddNew();
	}
	
	@Test(priority=3)
	public void labelTest() {
		attributesPage.verifyLabel();
	}
	
	@Test(priority=4)
	public void verifyMessageTest() throws InterruptedException {
		addNewAttributePage = new AddNewAttributePage();
		addNewAttributePage =attributesPage.clickAddNew();
		attributesPage =addNewAttributePage.addNewAttribute();
		attributesPage.addNewMsg();
		Thread.sleep(5000);
		
	}
	
	@Test(priority=5)
	public void checkhDDCheckBoxTest() throws Throwable {
		attributesPage.checkhDDCheckBox();
		Thread.sleep(5000);
	}
	
	@Test(priority=5)
	public void deleteSelectedTest() {
		attributesPage.deleteSelected();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
