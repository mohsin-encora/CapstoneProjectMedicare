Feature: User End To End Feature Scenario

  Background: 
    Given I have launched the application
    And I click on the Login Link

  @user
  Scenario: This scenario is to define the registration happy path
    When I click on the registration Link
    When I enter the firstname as "Partha" and lastname as "Karmokar"
    Then I enter the email id as "park@gmail.com"
    Then I enter the contact number as "2686245910"
    Then I enter the password as "423"
    And I enter the confirm password as "423"
    And I select the role as user
    And I click on the Next Billing Button
    Then I enter the address details
    And I click on Next-confirm Button
    And I click on confirm Button
    Then validate I am on the Welcome page and Login Button is displayed
    Then Click on registration page login Button
    When I enter the username as "park@gmail.com" and password as "423"
    And I click on the Login Button
    Then validate the username

@user
  Scenario: This scenario is to define the sucessful login
    When I enter the existing username as "kn@gmail.com" and password as "12345"
    And I click on the Login Button
    Then validate I am on the Home page
    Then I click on username icon
    And I click on logout

@user
  Scenario: This scenario is to define the failure login
    When I enter the username as "abc@gmail.com" and password as "23578"
    And I click on the Login Button
    Then I should get the error message "Username and Password is invalid!"

@user
  Scenario: This scenario is to define the product page and placing the order path
    When I enter the username as "kn@gmail.com" and password as "12345"
    And I click on the Login Button
    Then validate I am on the Home page
    And I click on view product
    Then validate I am on the product page
    Then I click on Add to Cart icon to add one item to cart for 1st product
    Then I click Continue Shopping
    And I click on Add to Cart icon to add one item to cart for 2nd product
    Then I click on Checkout Button
    And validate I am on the Shipping address page
    And I enter the Shipping address details
    And I click on Add address Button
    Then validate I am on the payment details page
    Then validate the product names
    Then I enter the card details
    And I click the pay button
    Then I should get the order confirmed message "Your Order is Confirmed!!"

@user
  Scenario: This scenario is to define the empty your cart path
    When I enter the username as "kn@gmail.com" and password as "12345"
    And I click on the Login Button
    And I click on view product
    Then I click on Add to Cart icon to add one item to cart for 1st product
    Then I click on username icon
    And I click on cart icon
    Then click on the delete cart icon
    Then I should get the message "Your Cart is Empty!"

@admin
  Scenario: This scenario is to define the admin login happy path and manage product
    When I send the admin credentials username as "vk@gmail.com" and password as "admin"
    And I click on the Login Button
    Then validate I am on the Home page
    Then I click on Manage Product
    Then I click on Add New Category
    Then I enter the category name as "Dermatology" and description as "Drugs for the treatment of skin disease"
    Then I click the save Button
    Then I enter all the product details
    And I upload a file
    Then select the newly created category from the category dropdown
    And I click the product save Button
    Then Validate the newly added product in the all products list by searching by productname
