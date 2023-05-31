package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomClasses.ContactUs;
import pomClasses.SeleniumTrainingPage;
import pomClasses.SkillraryDemoAppPage;
import pomClasses.SkillraryHomePage;
import pomClasses.TestingPageInSkillrarayApp;

public class BaseClass {
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected JavaUtility junit;
	protected WebDriverUtility web;
	protected WebDriver driver;
	
	protected SkillraryHomePage home;
	protected SkillraryDemoAppPage demo;
	protected SeleniumTrainingPage selenium;
	protected TestingPageInSkillrarayApp testing;
	protected ContactUs contact;
		
	//@BeforeSuite
	//@BeforeTest
	
	@BeforeClass
	public void ClassConfig() {
		property= new PropertiesUtility();
		excel = new ExcelUtility();
		junit = new JavaUtility();
		web = new WebDriverUtility();

		property.propertiesInit(IConstantPath.PROPERTIES_PATH);
		excel.excelInit(IConstantPath.EXCEL_PATH);
		
	}
	@BeforeMethod
	public void methodConfig()
	{
		driver=web.launchBroswer(property.readDataFromProperties("browser"));
		web.maximizeBrowser();
		web.navigateToApp(property.readDataFromProperties("url"));
		web.waitUntilElementFound(Long.parseLong(property.readDataFromProperties("time")));
		
		home = new SkillraryHomePage(driver);
		demo = new SkillraryDemoAppPage(driver);
		selenium = new SeleniumTrainingPage(driver);
		testing= new TestingPageInSkillrarayApp(driver);
		contact	= new ContactUs(driver);
	}
	@AfterMethod
	public void methoTearDown() {
		web.quitAllWindows();
	}
	@AfterClass
	public void classTearDown() {
		excel.closeExcel();
	}
	//@Aftertest
	//@AfterSuite
}
