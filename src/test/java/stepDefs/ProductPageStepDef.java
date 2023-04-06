package stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import pages.AdminMngProductPage;
import pages.LoginPage;
import pages.PlacingOrderPage;
import pages.ProductsPage;
import pages.RegistrationPage;

public class ProductPageStepDef {

	WebDriver driver=Hooks.driver;
	
	public ProductsPage productPage = new ProductsPage(driver);
	
	//Product Page


	@Then("I click on view product")
	public void i_click_on_view_product() {
	    
		productPage.clickViewProduct();
	}

	@Then("validate I am on the product page")
	public void validate_I_am_on_the_product_page() {
	   
		productPage.ValidateProductPage();
		
	}

	@Then("I click on Add to Cart icon to add one item to cart for 1st product")
	public void i_click_on_Add_to_Cart_icon_to_add_one_item_to_cart_for_1st_product() {
	    
		productPage.clickAddToCartOne();
	}

	
	@Then("I click Continue Shopping")
	public void i_click_Continue_Shopping() {
	    
		productPage.clickContinueShopping();
	}

	@Then("I click on Add to Cart icon to add one item to cart for 2nd product")
	public void i_click_on_Add_to_Cart_icon_to_add_one_item_to_cart_for_2nd_product() {
		
		productPage.clickAddToCartTwo();
		
	}

	
	@Then("I click on Checkout Button")
	public void i_click_on_Checkout_Button() {
	   
		productPage.clickCheckOutBtn();
	}

	@Then("validate I am on the Shipping address page")
	public void validate_I_am_on_the_Shipping_address_page() {
	  
		productPage.ValidShippingAddPage();
	}
}
