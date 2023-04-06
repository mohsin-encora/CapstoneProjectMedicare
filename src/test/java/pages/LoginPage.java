package pages;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	
	WebDriver driver;
	

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement LoginLink;
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement UserName;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;
		
	@FindBy(xpath = "//input[@type='submit']")
	WebElement LoginBtn;
		
	@FindBy(xpath = "//div[contains(text(),'Username and Password is invalid!')]")
    WebElement ErrorMsg;
	
	@FindBy(xpath = "//a[contains(text(),'Medicare')]")
    WebElement HomePage;
	
	@FindBy(xpath = "//a[@id='dropdownMenu1']")
    WebElement LoggedUserName;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement LogOut;

   public LoginPage(WebDriver driver){
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    }
          
    public void clickLoginLink()
    {
    	LoginLink.click();
    }
           
    public void SetUserName(String user)
    {
    	UserName.sendKeys(user);
    }
    
    public void Password(String password)
    {
    	Password.sendKeys(password);
    }
    
    public void clickLoginBtn()
    {
    	LoginBtn.click();
    }
      
    
    public void ValidHomePage()
    {
    	String ActText = HomePage.getText();
        String ExpText="Medicare";
        Assert.assertEquals(ExpText, ActText);
    }
    
    public void clickIconUserName()
    {
    	
    	LoggedUserName.click();
    	
    }
    
    public void clickLogOutBtn()
    {
    	LogOut.click();
    }
    public void ValidateErrorMsg()
    {
    String ActError= ErrorMsg.getText();
	String ExpError = "Username and Password is invalid!";
	Assert.assertEquals(ExpError, ActError);
    }
}
