package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.EmptyYourCartPage;
import pages.LoginPage;

public class EmptyYourCartStepDef {

	WebDriver driver=Hooks.driver;
	public EmptyYourCartPage emptyCartPage = new EmptyYourCartPage(driver);
	
	@Then("I click on cart icon")
	public void i_click_on_cart_icon() {
	    
		emptyCartPage.clickUserCartIcon();
	}

	@Then("click on the delete cart icon")
	public void click_on_the_delete_cart_icon() {
	   
		emptyCartPage.clickDeleteCartIcon();
	}

	@Then("I should get the message {string}")
	public void i_should_get_the_message(String string) {
	   
		emptyCartPage.ValidateEmptyCartMsg();
	}
}
