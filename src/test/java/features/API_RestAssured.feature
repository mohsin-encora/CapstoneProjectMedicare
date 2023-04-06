Feature: To perform all the CRUD Operations in products API

@api
  Scenario: To Perform the GET Operation on product DB to retrieve a list of products
    Given The base URI is "http://localhost:8090/medicare"
    When I perform the Get Operation
    Then I receive the list of the products
    And Response code should be 200
    And I validate the products in UI and API are same
	
@api
  Scenario: To Perform the get Operation for most viewed products on product DB
    Given The base URI for most Viewed products is "http://localhost:8090/medicare"
    When I perform the get operation to get most viewed products
    Then I receive the list of the most viewed products
    Then I should receive response code as 200
    And I should receive the same list of products in UI and API

@api
  Scenario: To retrive the products from one category
    Given The base URI for one category products is "http://localhost:8090/medicare"
    When I perform the get operation to get one category products
    Then I receive the list of the one category products
    Then I should get response code as 200
    And I should receive the same list of products from one category in UI and API
