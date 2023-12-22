package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.faceBookLoginPage;

@Listeners(test.Listener.class)
public class FaceBookLoginTest extends BaseTest {
	
	@BeforeClass
	public void launchBrowser() {
		
		 driver=Browser.openChrome("https://www.facebook.com/");
	}

	@Test
	public void enterEmilId() {
		faceBookLoginPage obj=new faceBookLoginPage(driver);
		obj.clickOnCreateNewAccount();
		obj.enterFirstName("Ishwar",driver);
		obj.enterSurname("Shinde");
		obj.enterMobileNumber("9637289331");
		obj.enternewPassword("Ishwar@3292");
		obj.clickOnDay("25");
		obj.clickOnMonth("3");
		obj.clickOnYear("2000");
		obj.clickOnMale();
		
		
		
	}

}
