package stepDefs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import apiTestingPage.APImostViewedProductsPage;
import apiTestingPage.APIproductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiMostViewedProductsStepDef {

	WebDriver driver=Hooks.driver;
	public APImostViewedProductsPage MostViewedProductPage = new APImostViewedProductsPage(driver);
	
	Map<String,Object> MapObj = new HashMap<String,Object>();
	Response response;
	RequestSpecification request;
	
	//List<String> ApiMVproduct = new ArrayList<String>();
	
	@Given("The base URI for most Viewed products is {string}")
	public void the_base_URI_for_most_Viewed_products_is(String URI) {
		
		request = RestAssured.given().baseUri(URI);
	}
	
	@When("I perform the get operation to get most viewed products")
	public void i_perform_the_get_operation_to_get_most_viewed_products() {
	  
		response = request.get("/json/data/mv/products");
		System.out.println(response.getBody().asString());
	}
	
	@Then("I receive the list of the most viewed products")
	public void i_receive_the_list_of_the_most_viewed_products() {
		
		MostViewedProductPage.APIMostViewedProductsList();
		MostViewedProductPage.UIMostViewedProductsList();
	}

	@Then("I should receive response code as {int}")
	public void i_should_receive_response_code_as(int expResponseCode) {
	    
		Assert.assertEquals(expResponseCode, response.getStatusCode());
	}

	@Then("I should receive the same list of products in UI and API")
	public void i_should_receive_the_same_list_of_products_in_UI_and_API() {
	   
		MostViewedProductPage.MVValidateUIandAPIproducts();
		
	}
	
}
