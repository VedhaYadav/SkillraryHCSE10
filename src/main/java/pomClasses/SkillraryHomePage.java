package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class contains elements and respective business libraries of SkillRary home page
 * @author Prakash Chandrappa
 *
 */

public class SkillraryHomePage {
	//declaration 
	@FindBy(xpath="//img[@alt='SkillRary']")
	private WebElement logo;
	
	@FindBy(xpath="//u[contains(@class,'home_menu')]/li[1]")
	private WebElement langaugeIcon;
	
	@FindBy(xpath="//ul[contains(@class,'home_menu')]/descendant::a[text()=' English']")
	private WebElement english;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsTab;
	
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement SkillraryDemoAppLink;
	
	//Initialization
	
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//utilization
	/**
	 * This method return logo
	 */
public WebElement getLogo() {
	return logo;
}
/**
 * this method is used to select English as default language
 */
public void chooseEnglish() {
	langaugeIcon.click();
	english.click();
}
/**
 * this method is used to click on gears tab
 */

public void clickGearsTab() {
	gearsTab.click();
	
}
/**
 * this method is used to click on skillRary demo app link
 */

public void clickSkillrayDemoAppLink() {
	SkillraryDemoAppLink.click();
}

}
