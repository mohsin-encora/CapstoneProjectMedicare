Feature: To perform all the Operations in Database

@database
  Scenario: To retrieve the data from category table from database
    Given The connection is built with the medicare database
    When I pass the statement quary to retrive the data from the category table
    
    
@database
  Scenario: To insert a new category into the database
    Given The connection is built with the medicare database
    When I perform the insert quary to create a new category with name and description 
    Then I pass the statement quary to retrive the data from the category table
    Then I check the new category is displayed in GUI
    And I close the driver

  @database
  Scenario: To add a new user to the database
    Given The connection is built with the medicare database
    When I add a new user with all the required details
    Then the new user should be added to the database
    And I close the driver
    When I have launched the application
    And I click on the Login Link
    When I enter the existing username as "sm@gmail.com" and password as "13245"
    And I click on the Login Button
    Then validate I am on the Home page
    And I close the driver

@database
Scenario: To create a new category in GUI and validating the data from the database
	When I have launched the application
    And I click on the Login Link
    Then I send the admin credentials username as "vk@gmail.com" and password as "admin"
    And I click on the Login Button
    Then I click on Manage Product
    Then I click on Add New Category
    Then I enter the category name as "Dermatology1" and description as "Drugs for the treatment of skin disease"
    Then I click the save Button
    And I validate the new category name in the Category table in database
    Then I delete the new Category entry
    And I close the driver
    

@database
  Scenario: To delete the new category and new user details from the database
    Given The connection is built with the medicare database
    When I perform the delete quary to delete the new category with name
    And I perform the delete quary to delete the new user details with email
    Then the category should be deleted from the database
    And the user should be deleted from the database
    And I close the driver


    