package nopCommerceTestNG.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerce.qa.TestBase.TestBase;
import com.nopCommerce.qa.pages.AddNewAttributePage;
import com.nopCommerce.qa.pages.AddNewSpecification;
import com.nopCommerce.qa.pages.AttributesPage;
import com.nopCommerce.qa.pages.CatalogsPage;
import com.nopCommerce.qa.pages.HomePage;
import com.nopCommerce.qa.pages.LoginPage;
import com.nopCommerce.qa.pages.SpecAttributesPage;

public class SpecAttributesPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CatalogsPage catalogPage;
	AttributesPage attributesPage;
	AddNewSpecification addNewSpecification;
	SpecAttributesPage specAttributesPage;
	AddNewAttributePage addNewAttributesPage;
	
	
	
	public SpecAttributesPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		loginPage = new LoginPage();
		loginPage.clickLogin(prop.getProperty("username"), prop.getProperty("password"));
		catalogPage =new CatalogsPage();
		homePage = new HomePage();
		homePage.clickCatalog();
		catalogPage.clickAttributesLink();
		attributesPage = new AttributesPage();
		attributesPage.clickSpecAttributesLink();
		specAttributesPage = new SpecAttributesPage();
				
	
	}
	
	@Test(priority=1)
	public void SpecAttributesPageTitleTest() {
		specAttributesPage.specAttributesTitle();
			
	}
	
	@Test(priority=2)
	public void specLabelTest() {
		specAttributesPage.verifyspecLabel();
	}
	
	@Test(priority=3)
		public SpecAttributesPage clickAddNewBtnTest() {
		addNewSpecification = new AddNewSpecification();
		specAttributesPage.clickAddNewBtn();
		addNewSpecification.clickSaveBtn();
		return new SpecAttributesPage();
				
		}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
