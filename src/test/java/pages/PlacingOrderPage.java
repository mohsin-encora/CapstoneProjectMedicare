package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.GlobalConstants;

public class PlacingOrderPage {

	WebDriver driver;
	GlobalConstants globalConstantsants;
	
	
	@FindBy(xpath = "//input[@id='addressLineOne']")
	WebElement AddressLine1;
	
	@FindBy(xpath = "//input[@id='addressLineTwo']")
	WebElement AddressLine2;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement City;
	
	@FindBy(xpath = "//input[@id='postalCode']")
	WebElement PostalCode;
	
	@FindBy(xpath = "//input[@id='state']")
	WebElement State;
	
	@FindBy(xpath = "//input[@id='country']")
	WebElement Country;
	
	@FindBy(xpath = "//button[@name='_eventId_saveAddress']")
	WebElement AddAddressbutton;

	//@FindBy(xpath = "//a[@class='btn btn-primary']")
	//WebElement AddSelect;
	
	@FindBy(xpath = "//h3[contains(text(),'Payment Details')]")
	WebElement PaymentDetails;
	
	@FindBy(xpath = "//h3[text()='Paracetamol']")
	WebElement TabletnameParacetamol;
	
	@FindBy(xpath = "//h3[text()='Combiflame']")
	WebElement TabletnameCombiflame;
	
	@FindBy(xpath = "//h3[text()='Paracetamol']//following::h4[1]")
	WebElement TabletOneQnt;
	
	@FindBy(xpath = "//h3[text()='Paracetamol']//following::h4[2]")
	WebElement TabletTwoQnt;
	
	/*@FindBy(xpath = "//tr[2]//preceding::tr[1]/td[3]")
	WebElement tabonequantity;
	
	@FindBy(xpath = "//tr[2]/td[3]")
	WebElement tabtwoquantity;*/
	
	@FindBy(xpath = "//input[@id='cardNumber']")
	WebElement CardNumber;
	
	@FindBy(xpath = "//input[@id='expityMonth']")
	WebElement CardExpiryDateMonth;

	@FindBy(xpath = "//input[@id='expityYear']")
	WebElement CardExpiryDateYear;
	
	@FindBy(xpath = "//input[@id='cvCode']")
	WebElement CardCVCode;
	
	@FindBy(xpath = "//a[@class='btn btn-success btn-lg btn-block']")
	WebElement PayButton;
	

	@FindBy(xpath = "//h3[contains(text(),'Your Order is Confirmed!!')]")
	WebElement OrderConfirmedMsg;
	
	
	public PlacingOrderPage(WebDriver driver){
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    }
	
	public void SetShippingAddress(String add1, String add2, String city, String pcode, String state, String cntry)
	{
		
		AddressLine1.sendKeys(add1);
		AddressLine2.sendKeys(add2);
		City.sendKeys(city);
		PostalCode.sendKeys(pcode);
		State.sendKeys(state);
		Country.sendKeys(cntry);
	}
	
	public void clickAddAddressBtn()
	{
		AddAddressbutton.click();
	}
	
		
	public void ValidPaymentDetailsPage()
    {
		WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Payment Details')]")));
		
		String ActText = PaymentDetails.getText();
        String ExpText="Payment Details";
        Assert.assertEquals(ExpText, ActText);
    }
	
	public void ValidProductsName()
    {
    	String ActProductName1 = TabletnameParacetamol.getText();
        String ExpProductName1="Paracetamol";
        Assert.assertEquals(ExpProductName1, ActProductName1);
        
        String ActProductName2 = TabletnameCombiflame.getText();
        String ExpProductName2="Combiflame";
        Assert.assertEquals(ExpProductName2, ActProductName2);
    }
	
	/*public void ValidProductsQnt()
    {
		globalConstantsants = new GlobalConstants();
		
    	String ActQnt1 = TabletOneQnt.getText();
        String ExpQnt1= "3";
        Assert.assertEquals(ActQnt1, ExpQnt1);
        
        String ActQnt2 = TabletTwoQnt.getText();
        String ExpQnt2="3";
        Assert.assertEquals(ActQnt2, ExpQnt2 );
    }*/
	
	public void SetCardDetails(String cardNo, String month, String year, String CVCode)
	{
		CardNumber.sendKeys(cardNo);
		CardExpiryDateMonth.sendKeys(month);
		CardExpiryDateYear.sendKeys(year);
		CardCVCode.sendKeys(CVCode);
	}
	public void clickPayButton()
    {
		PayButton.click();
    }
	
	public void ValidOrderConfirmed()
    {
    	String ActText = OrderConfirmedMsg.getText();
        String ExpText="Your Order is Confirmed!!";
        Assert.assertEquals(ExpText, ActText);
    }
}
