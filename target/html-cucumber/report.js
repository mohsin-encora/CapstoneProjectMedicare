$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/API_RestAssured.feature");
formatter.feature({
  "name": "To perform all the CRUD Operations in products API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Perform the GET Operation on product DB to retrieve a list of products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@api"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The base URI is \"http://localhost:8090/medicare\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.ApiAllProductsStepDef.the_base_URI_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I perform the Get Operation",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.ApiAllProductsStepDef.i_perform_the_Get_Operation()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I receive the list of the products",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.ApiAllProductsStepDef.i_receive_the_list_of_the_products()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Response code should be 200",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.ApiAllProductsStepDef.response_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I validate the products in UI and API are same",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.ApiAllProductsStepDef.i_validate_the_products_in_UI_and_API_are_same()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To Perform the get Operation for most viewed products on product DB",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@api"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The base URI for most Viewed products is \"http://localhost:8090/medicare\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.ApiMostViewedProductsStepDef.the_base_URI_for_most_Viewed_products_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I perform the get operation to get most viewed products",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.ApiMostViewedProductsStepDef.i_perform_the_get_operation_to_get_most_viewed_products()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I receive the list of the most viewed products",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.ApiMostViewedProductsStepDef.i_receive_the_list_of_the_most_viewed_products()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should receive response code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.ApiMostViewedProductsStepDef.i_should_receive_response_code_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should receive the same list of products in UI and API",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.ApiMostViewedProductsStepDef.i_should_receive_the_same_list_of_products_in_UI_and_API()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To retrive the products from one category",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@api"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The base URI for one category products is \"http://localhost:8090/medicare\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.ApiOneCategoryProductsStepDef.the_base_URI_for_one_category_products_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I perform the get operation to get one category products",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.ApiOneCategoryProductsStepDef.i_perform_the_get_operation_to_get_one_category_products()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I receive the list of the one category products",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.ApiOneCategoryProductsStepDef.i_receive_the_list_of_the_one_category_products()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should get response code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.ApiOneCategoryProductsStepDef.i_should_get_response_code_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should receive the same list of products from one category in UI and API",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.ApiOneCategoryProductsStepDef.i_should_receive_the_same_list_of_products_from_one_category_in_UI_and_API()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/DatabaseTesting.feature");
formatter.feature({
  "name": "To perform all the Operations in Database",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To retrieve the data from category table from database",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@database"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The connection is built with the medicare database",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.the_connection_is_built_with_the_medicare_database()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I pass the statement quary to retrive the data from the category table",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_pass_the_statement_quary_to_retrive_the_data_from_the_category_table()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To insert a new category into the database",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@database"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The connection is built with the medicare database",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.the_connection_is_built_with_the_medicare_database()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I perform the insert quary to create a new category with name and description",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_perform_the_insert_quary_to_create_a_new_category_with_name_and_description()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I pass the statement quary to retrive the data from the category table",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_pass_the_statement_quary_to_retrive_the_data_from_the_category_table()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I check the new category is displayed in GUI",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_check_the_new_category_is_displayed_in_GUI()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I close the driver",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_close_the_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To add a new user to the database",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@database"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The connection is built with the medicare database",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.the_connection_is_built_with_the_medicare_database()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I add a new user with all the required details",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_add_a_new_user_with_all_the_required_details()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "the new user should be added to the database",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.the_new_user_should_be_added_to_the_database()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I close the driver",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_close_the_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Link",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the existing username as \"sm@gmail.com\" and password as \"13245\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.i_enter_the_existing_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate I am on the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.validate_I_am_on_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I close the driver",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_close_the_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To create a new category in GUI and validating the data from the database",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@database"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Link",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I send the admin credentials username as \"vk@gmail.com\" and password as \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.i_send_the_admin_credentials_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on Manage Product",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.i_click_on_Manage_Product()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add New Category",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.i_click_on_Add_New_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the category name as \"Dermatology1\" and description as \"Drugs for the treatment of skin disease\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.i_enter_the_category_name_as_and_description_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click the save Button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.i_click_the_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I validate the new category name in the Category table in database",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_validate_the_new_category_name_in_the_Category_table_in_database()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I delete the new Category entry",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_delete_the_new_Category_entry()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I close the driver",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_close_the_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To delete the new category and new user details from the database",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@database"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The connection is built with the medicare database",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.the_connection_is_built_with_the_medicare_database()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I perform the delete quary to delete the new category with name",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_perform_the_delete_quary_to_delete_the_new_category_with_name()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I perform the delete quary to delete the new user details with email",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_perform_the_delete_quary_to_delete_the_new_user_details_with_email()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "the category should be deleted from the database",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.the_category_should_be_deleted_from_the_database()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "the user should be deleted from the database",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.the_user_should_be_deleted_from_the_database()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I close the driver",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.DatabaseTestingStepDefs.i_close_the_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/UITest.feature");
formatter.feature({
  "name": "User End To End Feature Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Link",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to define the registration happy path",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@user"
    }
  ]
});
formatter.step({
  "name": "I click on the registration Link",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_registration_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the firstname as \"Partha\" and lastname as \"Karmokar\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_enter_the_firstname_as_and_lastname_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the email id as \"park@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_enter_the_email_id_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the contact number as \"2686245910\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_enter_the_contact_number_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the password as \"423\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_enter_the_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the confirm password as \"423\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_enter_the_confirm_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I select the role as user",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_select_the_role_as_user()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Next Billing Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Next_Billing_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the address details",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_enter_the_address_details()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on Next-confirm Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_Next_confirm_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on confirm Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_confirm_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate I am on the Welcome page and Login Button is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.validate_I_am_on_the_Welcome_page_and_Login_Button_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click on registration page login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.click_on_registration_page_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the username as \"park@gmail.com\" and password as \"423\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_enter_the_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate the username",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.validate_the_username()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Link",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to define the sucessful login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@user"
    }
  ]
});
formatter.step({
  "name": "I enter the existing username as \"kn@gmail.com\" and password as \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.i_enter_the_existing_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate I am on the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.validate_I_am_on_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on username icon",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.i_click_on_username_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on logout",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.i_click_on_logout()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Link",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to define the failure login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@user"
    }
  ]
});
formatter.step({
  "name": "I enter the username as \"abc@gmail.com\" and password as \"23578\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_enter_the_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should get the error message \"Username and Password is invalid!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.i_should_get_the_error_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Link",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to define the product page and placing the order path",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@user"
    }
  ]
});
formatter.step({
  "name": "I enter the username as \"kn@gmail.com\" and password as \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_enter_the_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate I am on the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.validate_I_am_on_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on view product",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.ProductPageStepDef.i_click_on_view_product()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate I am on the product page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.ProductPageStepDef.validate_I_am_on_the_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add to Cart icon to add one item to cart for 1st product",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.ProductPageStepDef.i_click_on_Add_to_Cart_icon_to_add_one_item_to_cart_for_1st_product()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click Continue Shopping",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.ProductPageStepDef.i_click_Continue_Shopping()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add to Cart icon to add one item to cart for 2nd product",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.ProductPageStepDef.i_click_on_Add_to_Cart_icon_to_add_one_item_to_cart_for_2nd_product()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on Checkout Button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.ProductPageStepDef.i_click_on_Checkout_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate I am on the Shipping address page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.ProductPageStepDef.validate_I_am_on_the_Shipping_address_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Shipping address details",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.PlacingOrderPageStepDef.i_enter_the_Shipping_address_details()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add address Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.PlacingOrderPageStepDef.i_click_on_Add_address_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate I am on the payment details page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.PlacingOrderPageStepDef.validate_I_am_on_the_payment_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate the product names",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.PlacingOrderPageStepDef.validate_the_product_names()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the card details",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.PlacingOrderPageStepDef.i_enter_the_card_details()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click the pay button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.PlacingOrderPageStepDef.i_click_the_pay_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should get the order confirmed message \"Your Order is Confirmed!!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.PlacingOrderPageStepDef.i_should_get_the_order_confirmed_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Link",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to define the empty your cart path",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@user"
    }
  ]
});
formatter.step({
  "name": "I enter the username as \"kn@gmail.com\" and password as \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_enter_the_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on view product",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.ProductPageStepDef.i_click_on_view_product()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add to Cart icon to add one item to cart for 1st product",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.ProductPageStepDef.i_click_on_Add_to_Cart_icon_to_add_one_item_to_cart_for_1st_product()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on username icon",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.i_click_on_username_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on cart icon",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.EmptyYourCartStepDef.i_click_on_cart_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click on the delete cart icon",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.EmptyYourCartStepDef.click_on_the_delete_cart_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should get the message \"Your Cart is Empty!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.EmptyYourCartStepDef.i_should_get_the_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Link",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to define the admin login happy path and manage product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@admin"
    }
  ]
});
formatter.step({
  "name": "I send the admin credentials username as \"vk@gmail.com\" and password as \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.i_send_the_admin_credentials_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.RegistrationStepDef.i_click_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "validate I am on the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.LoginStepDef.validate_I_am_on_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on Manage Product",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.i_click_on_Manage_Product()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add New Category",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.i_click_on_Add_New_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the category name as \"Dermatology\" and description as \"Drugs for the treatment of skin disease\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.i_enter_the_category_name_as_and_description_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click the save Button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.i_click_the_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter all the product details",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.i_enter_all_the_product_details()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I upload a file",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.i_upload_a_file()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "select the newly created category from the category dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.select_the_newly_created_category_from_the_category_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click the product save Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.i_click_the_product_save_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate the newly added product in the all products list by searching by productname",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.AdminMngProductPageStepDef.validate_the_newly_added_product_in_the_all_products_list_by_searching_by_productname()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});