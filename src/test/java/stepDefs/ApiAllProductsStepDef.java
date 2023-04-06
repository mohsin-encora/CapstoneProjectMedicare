package stepDefs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import apiTestingPage.APIproductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pages.ProductsPage;

public class ApiAllProductsStepDef {

	WebDriver driver=Hooks.driver;
	
	public APIproductPage productPage = new APIproductPage(driver);
	
	Map<String,Object> MapObj = new HashMap<String,Object>();
	Response response;
	RequestSpecification request;
	
  
	//List<String> APIproduct = new ArrayList<String>();
	//List<String> UIProducts = new ArrayList<String>();
	
	@Given("The base URI is {string}")
	public void the_base_URI_is(String URI) {
	    
		request = RestAssured.given().baseUri(URI);
	}

	@When("I perform the Get Operation")
	public void i_perform_the_Get_Operation() {
	   		
		response = request.get("/json/data/all/products");
		System.out.println(response.getBody().asString());
		
	}

	@Then("I receive the list of the products")
	public void i_receive_the_list_of_the_products() {
	   
		productPage.APIallProductsList();
		productPage.UIallProductsList();
	}

	@Then("Response code should be {int}")
	public void response_code_should_be(int expResponseCode) {
	   
		Assert.assertEquals(expResponseCode, response.getStatusCode());
	}

	
	@Then("I validate the products in UI and API are same")
	public void i_validate_the_products_in_UI_and_API_are_same() {
	 
		productPage.ValidateUIandAPIproducts();
	}	
}
