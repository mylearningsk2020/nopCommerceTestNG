package com.nopCommerce.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	public static Properties prop;
	
	
	public TestBase() {
	prop  = new Properties();
	
	try {
		FileInputStream fis = new FileInputStream("C:\\Selenium_Workplace\\nopCommerceTestNG\\src\\main\\java\\com\\nopCommerce\\qa\\config\\config.properties");
			prop.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
	
		if(browserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();
//			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")){
			WebDriverManager.iedriver().setup();
			driver =  new InternetExplorerDriver();
		}
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String urlName = prop.getProperty("url");
		driver.get(urlName);
		
//		driver.get("https://admin-demo.nopcommerce.com/login");
				
	}
	
	public void reportSetup() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/extent-reports.html/");
		htmlReporter.config().setDocumentTitle("My Automation Learning");
		htmlReporter.config().setReportName("Automation Test Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Envionrment","QA");
		extent.setSystemInfo("Operating System", "Windows 10");
		extent.setSystemInfo("Tester", "Krishna");
		
			
	}
	
	

}
