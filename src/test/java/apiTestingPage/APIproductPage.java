package apiTestingPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIproductPage {

	WebDriver driver;
	Response response;
	RequestSpecification request;
	String baseUri = "http://localhost:8090/medicare";
	
	@FindBy(xpath = "//table[@id='productListTable']//td[2]")
	public List<WebElement> UIallProductsList;
			
	public List<String> UIProducts = new ArrayList<String>();
	public List<String> APIproduct = new ArrayList<String>();
			
	
	public APIproductPage(WebDriver driver){
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    }
	
		
	public void UIallProductsList() {
		
		for (WebElement UIproduct : UIallProductsList ) {
		String prod = UIproduct.getText();	
		UIProducts.add(prod);
		System.out.println(prod);
		}
	    System.out.println("UI Products: "+ UIProducts);
     	}

	
	public void APIallProductsList() {
	
		System.out.println("All the Products");
		response = GetAllProducts();
					
		JsonPath jpath = response.jsonPath();
		List<String> products = jpath.getList("name");
		
		System.out.println("The number of products in the list is: "+products.size());
		
		//Converting Api list into an Array
		
		for(int i=0;i<products.size();i++) {
			
			APIproduct.add(products.get(i).toString());
		}
			
		System.out.println("Api Products: "+ APIproduct);
							
		}
	
			
	public void ValidateUIandAPIproducts() {
	
		boolean isArrayEqual = true;
		for (int i = 0; i < UIProducts.size(); i++) {
		if (UIProducts.get(i).equals(APIproduct.get(i))) {
		    isArrayEqual = true;
		}
		}
		if (isArrayEqual) {
		System.out.println("Product List from API and UI are equal");
		} else {
		System.out.println(" Product List from API and UI are not equal");
		}
		}	
	
		
	public Response GetAllProducts() {
		
		RestAssured.baseURI = this.baseUri;
		request = RestAssured.given();
		response = request.get("/json/data/all/products");
		System.out.println(response.getBody().asString());
		
		return response;
	    }
	
	}
