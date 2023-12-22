package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class faceBookLoginPage {
	
	@FindBy(xpath="//input[@type='text']") private WebElement emailId;
	
	@FindBy(xpath="//input[@id='pass']") private WebElement password;
	
	@FindBy(xpath="//button[@name='login']") private WebElement login;
	
	@FindBy(xpath="//a[text()='Forgotten password?']") private WebElement forgotpass;
	
	@FindBy(xpath="(//a[@role='button'])[2]") private WebElement createNewAccount;
	
@FindBy(xpath="(//input[@type='text'])[2]") private WebElement firstname;
	
	@FindBy(xpath="(//input[@type='text'])[3]") private WebElement surname;
	
	@FindBy(xpath="(//input[@type='text'])[4]") private WebElement mobileno;
	
	@FindBy(xpath="(//input[@type='password'])[2]") private WebElement newpass;
	
    @FindBy(xpath="//select[@id='day']") private WebElement day;
    
    @FindBy(xpath="//select[@id='month']") private WebElement month;
    
    @FindBy(xpath="//select[@id='year']") private WebElement year;
    
    @FindBy(xpath="//label[text()='Female']") private WebElement female;
    
    @FindBy(xpath="//label[text()='Male']") private WebElement male;
    
    @FindBy(xpath="//label[text()='Custom']") private WebElement custom;
    
    @FindBy(xpath="(//button[text()='Sign Up'])[1]") private WebElement signup;
    
	
	public faceBookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailId(String email) {
		emailId.sendKeys(email);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		
		login.click();
	}
	
	public void clickOnForgotPassword() {
		forgotpass.click();
		
	}
	public void clickOnCreateNewAccount() {
		
		createNewAccount.click();
	}
	  public void enterFirstName(String name,WebDriver driver) {
		//  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//  wait.until(ExpectedConditions.visibilityOf(firstname));
	    	firstname.sendKeys(name);
	    }
	    
	    public void enterSurname(String surn) {
	    	surname.sendKeys(surn);
	    }
	    
	    public void enterMobileNumber(String mn) {
	    	mobileno.sendKeys(mn);
	    }
	    
	    public void enternewPassword(String pass) {
	    	newpass.sendKeys(pass);
	    }
	    
	    public void clickOnDay(String value) {
	    	day.click();
	    	Select is=new Select(day);
	    	is.selectByValue(value);
	    }
	    
	    public void clickOnMonth(String value1) {
	    	month.click();
	    	Select is=new Select(month);
	    	is.selectByValue(value1);
	    }
	    
	    public void clickOnYear(String value3) {
	    	year.click();
	    	Select is =new Select (year);
	    	is.selectByValue(value3);
	    }
	    
	    public void clickOnFemale() {
	    	female.click();
	    }
	    
	    public void clickOnMale() {
	    	male.click();
	    }
	    
	    public void clickOnCustom() {
	        custom.click();
	    }
	    
	    public void clickOnSignUp() {
	    	signup.click();
	    }
	    

}
