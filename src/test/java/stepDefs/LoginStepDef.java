package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminMngProductPage;
import pages.LoginPage;
import pages.PlacingOrderPage;
import pages.ProductsPage;
import pages.RegistrationPage;

public class LoginStepDef {

	WebDriver driver=Hooks.driver;
	public LoginPage loginpage = new LoginPage(driver);
	
		
	//LoginPage:  Successful Login
	
		@When("I enter the existing username as {string} and password as {string}")
		public void i_enter_the_existing_username_as_and_password_as(String user, String password) {
		    
			loginpage.SetUserName(user);
			loginpage.Password(password);
		}

		@Then("validate I am on the Home page")
		public void validate_I_am_on_the_Home_page() {
		    
			loginpage.ValidHomePage();
		}
		
		@Then("I click on username icon")
		public void i_click_on_username_icon() {
			
			WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='dropdownMenu1']")));
			
			loginpage.clickIconUserName();
		}
		
		@Then("I click on logout")
		public void i_click_on_logout() {
			
			loginpage.clickLogOutBtn();
		}
		
		
		
		//LoginPage:  Invalid Login
		
		@Then("I should get the error message {string}")
		public void i_should_get_the_error_message(String errormsg) {
		    
			loginpage.ValidateErrorMsg();
		}
		
		}
