package stepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminMngProductPage;
import pages.LoginPage;
import pages.PlacingOrderPage;
import pages.ProductsPage;
import pages.RegistrationPage;

public class RegistrationStepDef {

	WebDriver driver=Hooks.driver;
	
	public RegistrationPage RGpage = new RegistrationPage(driver);
	
	
	//Registration Page:   New Registration
	
		@Given("I have launched the application")
		public void i_have_launched_the_application() {
		    						
			RGpage.launchApp();
		}

		
		@Given("I click on the Login Link")
		public void i_click_on_the_Login_Link() {
			
			 RGpage.clickLoginLink();
		}

		
		@When("I click on the registration Link")
		public void i_click_on_the_registration_Link() {
			RGpage.clickRGLink();
		}

		
		@When("I enter the firstname as {string} and lastname as {string}")
		public void i_enter_the_firstname_as_and_lastname_as(String fname, String lname) {
			RGpage.SetFirstName(fname);
			RGpage.SetLastName(lname);
		}

		
		@Then("I enter the email id as {string}")
		public void i_enter_the_email_id_as(String email) {
		   
			RGpage.SetEmailId(email);
		}

		
		@Then("I enter the contact number as {string}")
		public void i_enter_the_contact_number_as(String phone) {
		    RGpage.setPhone(phone);
		}

		
		@Then("I enter the password as {string}")
		public void i_enter_the_password_as(String Newpassword) {
		    
			RGpage.SetPassword(Newpassword);
		}

		
		@Then("I enter the confirm password as {string}")
		public void i_enter_the_confirm_password_as(String confPassword) {
		    
			RGpage.SetConfPassword(confPassword);
		}

		
		@Then("I select the role as user")
		public void i_select_the_role_as_user() {
		   
			RGpage.clickRadioUser();
		}

		
		@Then("I click on the Next Billing Button")
		public void i_click_on_the_Next_Billing_Button() {
		   
			RGpage.clickNextBilling();
		}
		
		
		@Then("I enter the address details")
		public void i_enter_the_address_details() {
		    RGpage.SetAddLineOne("Madhapur");
		    RGpage.SetAddLineTwo("Kondapur");
		    RGpage.SetCity("Hyderabad");
		    RGpage.SetpostalCode("500012");
		    RGpage.SetState("Telangana");
		    RGpage.SetCountry("India");
		}

		
		@Then("I click on Next-confirm Button")
		public void i_click_on_Next_confirm_Button() {
		    RGpage.clickNextConfirmBtn();
		}

		
		@Then("I click on confirm Button")
		public void i_click_on_confirm_Button() {
			
			
		    RGpage.clickConfirmBtn();
		}

		
		@Then("validate I am on the Welcome page and Login Button is displayed")
		public void validate_I_am_on_the_Welcome_page_and_Login_Button_is_displayed() {
		    RGpage.ValidWelcome();
		    RGpage.ValidLoginBtnVisible();
		}

		@Then("Click on registration page login Button")
		public void click_on_registration_page_login_Button() {
		 
			RGpage.clickRgLoginBtn();
		}
		
			
		@When("I enter the username as {string} and password as {string}")
		public void i_enter_the_username_as_and_password_as(String UserNameVal, String PwdVal) {
		   RGpage.SetNewUserName(UserNameVal);
		   RGpage.newPassword(PwdVal);
		}

		
		@When("I click on the Login Button")
		public void i_click_on_the_Login_Button() {
		   RGpage.clickLoginBtn();
		}

		
		@Then("validate the username")
		public void validate_the_username() {
		 RGpage.ValidUserVisible();   
		}
}
