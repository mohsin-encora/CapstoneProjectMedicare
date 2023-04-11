package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminMngProductPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement LoginLink;

	@FindBy(xpath = "//input[@id='username']")
	WebElement AdminUserName;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement AdminPassword;
		
	@FindBy(xpath = "//input[@type='submit']")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Medicare')]")
    WebElement HomePage;
	
	@FindBy(xpath = "//a[contains(text(),'Manage Product')]")
	WebElement ManageProduct;
	
	@FindBy(xpath = "//button[@class='btn btn-warning btn-xs']")
	WebElement AddNewCategory;
	
	@FindBy(xpath = "//input[@placeholder='Category Name']")
	WebElement NewCategoryName;
	
	@FindBy(xpath = "//div[@class='col-md-8 validate']//textarea")
	WebElement NewCategoryDescription;
	
	@FindBy(xpath = "//form[@id='categoryForm']//input[@class='btn btn-primary']")
	WebElement NewCatSaveButton;
	
	@FindBy(xpath = "//input[@placeholder='Product Name']")
	WebElement NewProductName;
	
	@FindBy(xpath = "//input[@id='brand']")
	WebElement NewBrand;
	
	@FindBy(xpath = "//div[@class='col-md-8']//textarea[@id='description']")
	WebElement NewProductDescription;
	
	@FindBy(xpath = "//div[@class='col-md-8']//input[@id='unitPrice']")
	WebElement UnitPrice;
	
	@FindBy(xpath = "//input[@id='quantity']")
	WebElement Quantity;
	
	@FindBy(xpath = "//input[@id='file']")
	WebElement ChooseFile;
	
	@FindBy(xpath = "//select[@id='categoryId']")
	WebElement CatDropDown;
	
	@FindBy(xpath = "//select[@id='categoryId']/option")
	WebElement CatDropDownOption;
	
	@FindBy(xpath = "//*[@id=\"product\"]/div[8]/div/input")
	WebElement NewProductSaveBtn;
	
	@FindBy(xpath = "//select[@name='productsTable_length']")
	WebElement ShowAllProducts;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement ProductSearch;
	
	
	public AdminMngProductPage(WebDriver driver){
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
	}
	
	 public void clickLoginLink()
	    {
		 LoginLink.click();
	    }
	           
	    public void SetAdminCredential(String user, String pass)
	    {
	    	AdminUserName.sendKeys(user);
	    	AdminPassword.sendKeys(pass);
	    }
	    public void clickLoginBtn()
	    {
	    	LoginBtn.click();
	    }
	    
	    public void clickManageProduct()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Manage Product')]")));
	    	ManageProduct.click();
	    }
	    
	    public void ValidHomePage()
	    {
	    	String ActText = HomePage.getText();
	        String ExpText="Medicare";
	        Assert.assertEquals(ExpText, ActText);
	    }
	    
	    public void clickAddNewCategory()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-warning btn-xs']")));
	    	AddNewCategory.click();
	    }
	    
	    public void SetNewCategory(String name, String desp)
	    {
	    	WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Category Name']")));
	    	
	    	NewCategoryName.sendKeys(name);
	    	NewCategoryDescription.sendKeys(desp);
	    }
	    
	    public void clickCatSaveBtn()
	    {
	    	NewCatSaveButton.click();
	    }
	    
	    public void SetProductName(String name)
	    {
	    	 NewProductName.sendKeys(name);
	    }
	    
	    public void SetBrandName(String brand)
	    {
	    	NewBrand.sendKeys(brand);
	    }
	    
	    public void SetDescription(String Descp)
	    
	    {
	    	NewProductDescription.sendKeys(Descp);
	    }
	    	    
	    public void SetUnitPrice(String UnP) 
	    {
	    	UnitPrice.clear();
	    	UnitPrice.sendKeys(UnP);
	    }
	    
	    public void SetQuantity(String Qnt)
	    {
	    	Quantity.clear();
	    	Quantity.sendKeys(Qnt);
	    }
	    
	    public void ChooseFile()
	    {
	    	
	    	ChooseFile.sendKeys("D:\\Simplilearn\\Capestone\\Project1Medicare\\Amorolfine.jpg");
	    }
	    
	    public void clickValidCatDropDown()
	    {
	    	
	    	
	    	WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='categoryId']/option")));
		    
		    Select CatOption = new Select(CatDropDown);
		    CatOption.selectByVisibleText("Dermatology");
	    	    	    	
	    }
	    public void clickNewProductSaveBtn()
	    {
	    	NewProductSaveBtn.click();
	    }
	    
	    public void ValidateProductNameList() {
	    	
	    	    	
	    	ProductSearch.sendKeys("Amorolfine");
	    	
	    	String Actual = driver.findElement(By.xpath("//td[3]")).getText();
	    	String Expected = "Amorolfine";
	    	
	    	Assert.assertEquals(Actual, Expected);
	    	
	    	
	    }
	    	
}
