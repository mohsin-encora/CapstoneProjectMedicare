package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmptyYourCartPage {

WebDriver driver;
	

	@FindBy(xpath = "//span[@class='glyphicon glyphicon-shopping-cart']")
	WebElement UserCartIcon;
	
		
	@FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
	WebElement DeleteCartIcon;
	
	@FindBy(xpath = "//h3[contains(text(),'Your Cart is Empty!')]")
	WebElement EmptyCartMasg;
	
	
	
	public EmptyYourCartPage(WebDriver driver){
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    }
	
	public void clickUserCartIcon()
    {
		UserCartIcon.click();
    }
	
	public void clickDeleteCartIcon()
    {
		WebDriverWait wait = new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-danger btn-sm']")));
		
		DeleteCartIcon.click();
    }
	
	 public void ValidateEmptyCartMsg()
	    {
		 
		 WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Your Cart is Empty!')]")));
		 
	    String ActMsg= EmptyCartMasg.getText();
		String ExpMsg = "Your Cart is Empty!";
		Assert.assertEquals(ExpMsg, ActMsg);
	    }
}
