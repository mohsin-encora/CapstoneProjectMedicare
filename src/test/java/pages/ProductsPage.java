package pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductsPage {

	WebDriver driver;

	
	@FindBy(xpath = "//span[@class='caret']")
	WebElement userNameIconDropDown;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-shopping-cart']")
	WebElement userNameIconCart;


	@FindBy(xpath = "//a[contains(text(),'View Products')]")
	WebElement ViewProduct;

	@FindBy(xpath = "//li[contains(text(),'All Products')]")
	WebElement AllProductsPage;
		
	@FindBy(xpath = "//tr[1]//a[@class='btn btn-success']")
	WebElement AddToCartOne;
	
	@FindBy(xpath = "//*[@id='count_20']")
	WebElement AddQunt1;
	
	
	@FindBy(xpath = "//tr[2]//a[@class='btn btn-success']")
	WebElement AddToCartTwo;
	
	@FindBy(xpath = "//*[@id='count_21']")
	WebElement AddQunt2;
	
	@FindBy(xpath = "//a[@class='btn btn-warning']")
	WebElement ContinueShopping;
	
		
	@FindBy(xpath = "//a[@class='btn btn-success btn-block']")
	WebElement CheckOut;
	
	@FindBy(xpath = "//h4[contains(text(),'Select Shipping Address')]")
	WebElement ShippingAddPage;
	
	
	
	public ProductsPage(WebDriver driver){
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    }
	
	
	public void clickViewProduct()
    {
		WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'View Products')]")));
		ViewProduct.click();
    }
	
	public void ValidateProductPage()
    {
		String ActText = AllProductsPage.getText();
        String ExpText="All Products";
        Assert.assertEquals(ExpText, ActText);
    }
	
	public void clickAddToCartOne()
	{
		AddToCartOne.click();
		
	}
			
	public void clickContinueShopping()
    {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-warning']")));
	    
		ContinueShopping.click();
    }
	
	public void clickAddToCartTwo()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[2]//a[@class='btn btn-success']")));
		
		AddToCartTwo.click();
		
	}		
	public void clickCheckOutBtn()
    {
		WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-success btn-block']")));
	    
		CheckOut.click();
    }
	
	public void ValidShippingAddPage()
    {
    	String ActText = ShippingAddPage.getText();
        String ExpText="Select Shipping Address";
        Assert.assertEquals(ExpText, ActText);
    }
	
				
			
	}

