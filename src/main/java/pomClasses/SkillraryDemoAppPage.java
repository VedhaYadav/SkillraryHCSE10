package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
	// declaration
	
	@FindBy(xpath="//div[@class='navbar-header']")
	private WebElement pageHeader;
	
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="//span/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	
	@FindBy(name="addresstype")
	private WebElement categoryDD;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUsLink;
	//Initialization
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	/**
	 * this method is used return page header
	 */
	public String getPageHeader() {
		return  pageHeader.getText();
	}
	/**
	 * this method is used to mouse hover to course tab
	 */

	    public void mouseHoverToCourse(WebDriverUtility web) {
		 web.mouseHover(coursetab);
		
	}
	    /**
	     * this method is used to click on Selenium training
	     */
	public void clickSeleniumTraining() {
		seleniumTrainingLink.click();
		
	}
	/**
	 * this method is used to select category
	 */
	public void selectCategory(WebDriverUtility web,int index) {
		web.dropDown(categoryDD, index);
	}
	/**
	 * this method returns contact us link
	 * @return 
	 */
	    
	 public WebElement getContactUsLink() {
		 return contactUsLink;
	 }
	 /**
	  * this method on used to click on contact us link
	  */
	 public void clickContactUs() {
		 contactUsLink.click();
	 }
}


