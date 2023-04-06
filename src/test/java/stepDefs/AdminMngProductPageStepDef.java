package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminMngProductPage;
import pages.LoginPage;
import pages.PlacingOrderPage;
import pages.ProductsPage;
import pages.RegistrationPage;

public class AdminMngProductPageStepDef {

	WebDriver driver=Hooks.driver;
	
	public AdminMngProductPage adminMngPrdPage = new AdminMngProductPage(driver);
	
	//Admin Manage Product Page

	@When("I send the admin credentials username as {string} and password as {string}")
	public void i_send_the_admin_credentials_username_as_and_password_as(String username, String password) {
	    
		adminMngPrdPage.SetAdminCredential(username, password);
	}

	@Then("I click on Manage Product")
	public void i_click_on_Manage_Product() {
	    
		adminMngPrdPage.clickManageProduct();
	}

	@Then("I click on Add New Category")
	public void i_click_on_Add_New_Category() {
	    
		adminMngPrdPage.clickAddNewCategory();
	}

	@Then("I enter the category name as {string} and description as {string}")
	public void i_enter_the_category_name_as_and_description_as(String name, String description) {
	    
		adminMngPrdPage.SetNewCategory(name, description);
	}

	@Then("I click the save Button")
	public void i_click_the_save_Button() {
	    
		adminMngPrdPage.clickCatSaveBtn();
	}

	@Then("I enter all the product details")
	public void i_enter_all_the_product_details() {
	   
		adminMngPrdPage.SetProductName("Amorolfine");
		adminMngPrdPage.SetBrandName("Dr.Reddy");
		adminMngPrdPage.SetDescription("Antibiotic, prescribed for toenail infections");
		adminMngPrdPage.SetUnitPrice("20.0");
		adminMngPrdPage.SetQuantity("100");
	}

	@Then("I upload a file")
	public void i_upload_a_file() {
	   
		adminMngPrdPage.ChooseFile();
	}

	@Then("select the newly created category from the category dropdown")
	public void select_the_newly_created_category_from_the_category_dropdown() {
	   
		adminMngPrdPage.clickValidCatDropDown();
	}

	@Then("I click the product save Button")
	public void i_click_the_product_save_Button() {
	    
		adminMngPrdPage.clickNewProductSaveBtn();
	}

	@Then("Validate the newly added product in the all products list by searching by productname")
	public void validate_the_newly_added_product_in_the_all_products_list_by_searching_by_productname() {
	  
		adminMngPrdPage.ValidateProductNameList();
	}
}
