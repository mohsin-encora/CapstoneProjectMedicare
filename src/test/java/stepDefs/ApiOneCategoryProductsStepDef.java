package stepDefs;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import apiTestingPage.APImostViewedProductsPage;
import apiTestingPage.APIoneCategoryProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiOneCategoryProductsStepDef {
	
	
	WebDriver driver=Hooks.driver;
	public APIoneCategoryProductsPage OneCatProductPage = new APIoneCategoryProductsPage(driver);
	
	Map<String,Object> MapObj = new HashMap<String,Object>();
	Response response;
	RequestSpecification request;
	

	@Given("The base URI for one category products is {string}")
	public void the_base_URI_for_one_category_products_is(String URI) {
	    
		request = RestAssured.given().baseUri(URI);
	}

	@When("I perform the get operation to get one category products")
	public void i_perform_the_get_operation_to_get_one_category_products() {
	    
		response = request.get("/json/data/category/1/products");
		System.out.println(response.getBody().asString());
	}

	@Then("I receive the list of the one category products")
	public void i_receive_the_list_of_the_one_category_products() {
	    
		OneCatProductPage.APIOneCatProductsList();
		OneCatProductPage.UIOneCatProductsList();
		
	}

	@Then("I should get response code as {int}")
	public void i_should_get_response_code_as(int expResponseCode) {
	   
		Assert.assertEquals(expResponseCode, response.getStatusCode());
	}

	@Then("I should receive the same list of products from one category in UI and API")
	public void i_should_receive_the_same_list_of_products_from_one_category_in_UI_and_API() {
	   
		OneCatProductPage.MVValidateUIandAPIproducts();
		
	}
	
}
