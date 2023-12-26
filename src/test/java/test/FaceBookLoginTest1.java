package test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.faceBookLoginPage;
import utility.reports;

@Listeners(test.Listener.class)	
public class FaceBookLoginTest1 extends BaseTest  {
	 
	ExtentReports extentReport;
	ExtentTest Test;
	@BeforeTest
	public void configureReports() {
		extentReport=reports.generateReport();
	}
	
	@BeforeMethod
	public void BrowserLaunch()
	{
		driver=Browser.openChrome("https://www.facebook.com/");
	}
	
	@Test(priority = 0)
	public void ValidPasswordInvalidUsername() 
	{
		Test=extentReport.createTest("ValidPasswordInvalidUsername");
		faceBookLoginPage obj =new faceBookLoginPage(driver);
		obj.enterEmailId("Ish@123");
		obj.enterPassword("1234");
		//obj.clickOnLogin();
	}
	@Test(priority=1)
	public void InvalidPasswordValidUsername() 
	{
		Test=extentReport.createTest("InvalidPasswordValidUsername");
		faceBookLoginPage obj =new faceBookLoginPage(driver);
		obj.enterEmailId("ishwar@123");
		obj.enterPassword("11111");
		//obj.clickOnLogin();
	}
	@Test(priority=2,timeOut=1000)
	public void InvalidPasswordInvalidUsername() throws InterruptedException
	{
		Test=extentReport.createTest("InvalidPasswordInvalidUsername");
		Thread.sleep(2000);
		faceBookLoginPage obj =new faceBookLoginPage(driver);
		obj.enterEmailId("isr@123");
		obj.enterPassword("11111");
		//obj.clickOnLogin();
	}
	@AfterMethod
	public void addTestStatus(ITestResult result) {
		
		if(result.getStatus()==ITestResult.SUCCESS) {
			
			Test.log(Status.PASS, result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			
			Test.log(Status.FAIL, result.getName());
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			
			Test.log(Status.SKIP, result.getName());
		}
    
	}
	
     @AfterTest

     public void publishReports() {

    	 extentReport.flush();
        }
	

	


}
