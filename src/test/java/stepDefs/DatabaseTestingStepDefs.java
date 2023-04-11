package stepDefs;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

import apiTestingPage.APIproductPage;
import databaseTestingMedicarePage.DatabaseConnectionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminMngProductPage;
import pages.LoginPage;
import pages.RegistrationPage;

public class DatabaseTestingStepDefs {

	WebDriver driver=Hooks.driver;
	public DatabaseConnectionPage DatabaseConPage = new DatabaseConnectionPage(driver);
	public AdminMngProductPage adminMngPrdPage = new AdminMngProductPage(driver);
	public RegistrationPage RGpage = new RegistrationPage(driver);
	public LoginPage loginpage = new LoginPage(driver);
	
	
	@Given("The connection is built with the medicare database")
	public void the_connection_is_built_with_the_medicare_database() throws SQLException, ClassNotFoundException {
	  
		DatabaseConPage.DBConnection();
				
	}
	
	@When("I pass the statement quary to retrive the data from the category table")
	public void i_pass_the_statement_quary_to_retrive_the_data_from_the_category_table() throws ClassNotFoundException, SQLException {
		
		DatabaseConPage.DBConnection();
		DatabaseConPage.DBDataCategory();
	}
	
	@When("I perform the insert quary to create a new category with name and description")
	public void i_perform_the_insert_quary_to_create_a_new_category_with_name_and_description() throws ClassNotFoundException, SQLException {
	    
		DatabaseConPage.DBConnection();
		DatabaseConPage.CreateCategoryDB();
		
	}

	@Then("I check the new category is displayed in GUI")
	public void i_check_the_new_category_is_displayed_in_GUI() throws ClassNotFoundException, SQLException {
			
		DatabaseConPage.DBConnection();	
		DatabaseConPage.ValidateNewAddedCategoryInDB();
	
	}

	@Then("I close the driver")
	public void i_close_the_driver() throws ClassNotFoundException, SQLException {
	    
		DatabaseConPage.CloseDriver();
	}

	@When("I perform the delete quary to delete the new category with name")
	public void i_perform_the_delete_quary_to_delete_the_new_category_with_name() throws SQLException, ClassNotFoundException {
	    		
		DatabaseConPage.DBConnection();
		DatabaseConPage.DeleteCategoryDB();
	}

	@Then("the category should be deleted from the database")
	public void the_category_should_be_deleted_from_the_database() throws SQLException {
	    
		DatabaseConPage.ValidateCategoryDeletedInDB();
	}
	
	@When("I add a new user with all the required details")
	public void i_add_a_new_user_with_all_the_required_details() throws ClassNotFoundException, SQLException {
	   
		DatabaseConPage.DBConnection();
		DatabaseConPage.CreateNewUserDB();
	}
	
	@Then("the new user should be added to the database")
	public void the_new_user_should_be_added_to_the_database() throws SQLException, ClassNotFoundException {
	   
		DatabaseConPage.DBConnection();
		DatabaseConPage.ValidateNewUserInDB();
	}

	
	@Then("I validate the new category name in the Category table in database")
	public void i_validate_the_new_category_name_in_the_Category_table_in_database() throws SQLException, ClassNotFoundException {
	   
		DatabaseConPage.DBConnection();
		DatabaseConPage.ValidateUIcategoryInDatabase();
		DatabaseConPage.DBDataCategory();
	}

	@Then("I delete the new Category entry")
	public void i_delete_the_new_Category_entry() throws SQLException {
	   
		DatabaseConPage.DeleteUICategoryDB();
		DatabaseConPage.DBDataCategory();
	}
	
	@When("I perform the delete quary to delete the new user details with email")
	public void i_perform_the_delete_quary_to_delete_the_new_user_details_with_email() throws SQLException {
	    
		
		DatabaseConPage.DeleteNewUserDB();
		
	}

	
	@Then("the user should be deleted from the database")
	public void the_user_should_be_deleted_from_the_database() throws SQLException {
	    
		DatabaseConPage.ValidateNewUserDeletedInDB();
	}
	
	
	/*@And("I perform the delete quary to delete the newly created category in the UI admin test with name")
	public void i_perform_the_delete_quary_to_delete_the_newly_created_category_in_the_UI_admin_test_with_name() throws SQLException, ClassNotFoundException {
	    DatabaseConPage.DBConnection();
		DatabaseConPage.DeleteUIAdminTestCategoryDB();
	}

	@When("I perform the delete quary to delete the newly created user details in the UI registration test with email")
	public void i_perform_the_delete_quary_to_delete_the_newly_created_user_details_in_the_UI_registration_test_with_email() throws SQLException, ClassNotFoundException {
	    DatabaseConPage.DBConnection();
		DatabaseConPage.DeleteNewUiUserDB();
	}*/
	
	}
