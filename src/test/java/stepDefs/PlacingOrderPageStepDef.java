package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.AdminMngProductPage;
import pages.LoginPage;
import pages.PlacingOrderPage;
import pages.ProductsPage;
import pages.RegistrationPage;

public class PlacingOrderPageStepDef {

	WebDriver driver=Hooks.driver;
	
	public PlacingOrderPage OrderPage = new PlacingOrderPage(driver);
	
	//Placing Order page

	@Then("I enter the Shipping address details")
	public void i_enter_the_Shipping_address_details() {
	    
		OrderPage.SetShippingAddress("Rahim Path", "Kondapur", "Durgapur", "500022", "West Bengal", "India");
		
	}

	@Then("I click on Add address Button")
	public void i_click_on_Add_address_Button() {
	    
		OrderPage.clickAddAddressBtn();
	}

	@Then("validate I am on the payment details page")
	public void validate_I_am_on_the_payment_details_page() {
	    
		OrderPage.ValidPaymentDetailsPage();
	}

	@Then("validate the product names")
	public void validate_the_product_names() {
	  
		OrderPage.ValidProductsName();
	}

	/*@Then("validate the quantities")
	public void validate_the_quantities() {

		OrderPage.ValidProductsQnt();
	}*/

	@Then("I enter the card details")
	public void i_enter_the_card_details() {
	   
		OrderPage.SetCardDetails("236786", "06", "2024", "4567");
	}

	@Then("I click the pay button")
	public void i_click_the_pay_button() {
	    
		OrderPage.clickPayButton();
	}

	@Then("I should get the order confirmed message {string}")
	public void i_should_get_the_order_confirmed_message(String string) {
	   
		OrderPage.ValidOrderConfirmed();
	}
}
