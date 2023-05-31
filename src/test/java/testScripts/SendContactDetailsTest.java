package testScripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class SendContactDetailsTest extends BaseClass{
	@Test 
	public void sendContactDetailsTest() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillrayDemoAppLink();
		web.switchToChildBrowser();
		
		soft.assertTrue(demo.getPageHeader().contains("ECommerce"));
		
		web.scrollTillElement(demo.getContactUsLink());
		demo.clickContactUs();
		
		soft.assertTrue(contact.getLogo().isDisplayed());
		
		Map<String,String> map=excel.getDataFormExcel("Sheet1");
		contact.sendDetails(map.get("FullName"), map.get("Email"), map.get("Subject"), map.get("Message"));
		
		soft.assertAll();
		
	}
	
	

}
