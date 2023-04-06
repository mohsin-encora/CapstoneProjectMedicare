package pages;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement LoginLink;
	
	@FindBy(xpath = "//a[contains(text(),'Register Here')]")
	WebElement RegisterLink;
	
	@FindBy(xpath = "//a[contains(text(),'Medicare')]")
	WebElement ValidMedicare;
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement LastName;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='contactNumber']")
	WebElement ContactNumber;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement RgPassword;
	
	@FindBy(xpath = "//input[@id='confirmPassword']")
	WebElement ConfirmPassword;

	@FindBy(xpath = "//input[@id='role1']")
	WebElement RadioBtnUser;
	
	@FindBy(xpath = "//button[@name='_eventId_billing']")
	WebElement NextBillingBtn;

	@FindBy(xpath = "//input[@id='addressLineOne']")
	WebElement AddressLineOne;
	
	@FindBy(xpath = "//input[@id='addressLineTwo']")
	WebElement AddressLineTwo;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement City;
	
	@FindBy(xpath = "//input[@id='postalCode']")
	WebElement PostalCode;
	
	@FindBy(xpath = "//input[@id='state']")
	WebElement State;
	
	@FindBy(xpath = "//input[@id='country']")
	WebElement Country;
	
	@FindBy(xpath = "//button[@name='_eventId_confirm']")
	WebElement NextConfirmBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Confirm')]")
	WebElement confirmBtn;
	
	@FindBy(xpath = "//h1[contains(text(),'Welcome!')]")
	WebElement ValidWelcome;
	
	@FindBy(xpath = "//a[contains(text(),'Login Here')]")
	WebElement ValidLoginBtnEnable;
	
	@FindBy(xpath = "//a[@class='btn btn-lg btn-success']")
	WebElement RegLoginBtn;
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement NewUserName;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement NewPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//a[@id='dropdownMenu1']")
	WebElement IconUserName;
	
	
	public RegistrationPage(WebDriver driver){
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    }
	
	public void launchApp() {
		
		driver.get("http://localhost:8090/medicare/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
	}
	
	 public void clickLoginLink()
	    {
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Login')]")));
		 	  	LoginLink.click();
	    }
	 public void clickRGLink()
	    {
	    	RegisterLink.click();
	    }
	    
	    public void validLoginPage()
	    {
	     String ActLogo = ValidMedicare.getText();
	     String ExpLogo="Medicare";
	     Assert.assertEquals(ExpLogo, ActLogo);
	    }
	    
	    public void SetFirstName(String fName)
	    {
	    	FirstName.sendKeys(fName);
	    }
	    
	    public void SetLastName(String Lname)
	    {
	    	LastName.sendKeys(Lname);
	    }
	    
	    public void SetEmailId(String email)
	    {
	    	Email.clear();
	    	Email.sendKeys(email);
	    }
	    
	    public void setPhone(String ph)
	    {
	    	ContactNumber.sendKeys(ph);
	    }
	          
	    public void SetPassword(String password)
	    {
	    	RgPassword.sendKeys(password);
	    }
	    
	    public void SetConfPassword(String confPassword)
	    {
	    	ConfirmPassword.sendKeys(confPassword);
	    }
	    
	    public void clickRadioUser()
	    {
	    	RadioBtnUser.click();
	    }
	       
	    public void clickNextBilling()
	    {
	    	NextBillingBtn.click();
	    }
	    
	    public void SetAddLineOne(String AddLineOne)
	    {
	    	WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='addressLineOne']")));
	    	AddressLineOne.sendKeys(AddLineOne);
	    }
	    
	    public void SetAddLineTwo(String AddLineTwo)
	    {
	    	AddressLineTwo.sendKeys(AddLineTwo);
	    }
	          
	    public void SetCity(String city)
	    {
	    	City.sendKeys(city);
	    }
	    
	    public void SetpostalCode(String postalCode)
	    {
	    	PostalCode.sendKeys(postalCode);
	    }
	    
	    public void SetState(String state)
	    {
	    	State.sendKeys(state);
	    }
	       
	    public void SetCountry(String country)
	    {
	    	Country.sendKeys(country);
	    }
	    
	    public void clickNextConfirmBtn()
	    {
	    	NextConfirmBtn.click();
	    }
	          
	    public void clickConfirmBtn()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Confirm')]")));
		    
	    	confirmBtn.click();
	    }
	    	        
	    public void ValidWelcome()
	    {
	    	String ActText = ValidWelcome.getText();
	        String ExpText="Welcome!";
	        Assert.assertEquals(ExpText, ActText);
	    }
	    
	    public void ValidLoginBtnVisible()
	    {
	    	Boolean LoginVisible = ValidLoginBtnEnable.isDisplayed();
	    	Assert.assertTrue(LoginVisible);
	    }
	    
	    public void clickRgLoginBtn()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-lg btn-success']")));
	    	RegLoginBtn.click();
	    }
	    
	    public void SetNewUserName(String user)
	    {
	    	NewUserName.sendKeys(user);
	    }
	    
	    public void newPassword(String password)
	    {
	    	NewPassword.sendKeys(password);
	    }
	    
	    public void clickLoginBtn()
	    {
	    	LoginBtn.click();
	    }
	    
	    public void ValidUserVisible()
	    {
	    	Boolean UserVisible = IconUserName.isDisplayed();
	    	Assert.assertTrue(UserVisible);
	    }
	    
	    /*public static String getRandomemail() {
			String randommail = RandomStringUtils.randomAlphanumeric(2);
			
			return (randommail +"42@gmail.com");
			
		}*/
}
