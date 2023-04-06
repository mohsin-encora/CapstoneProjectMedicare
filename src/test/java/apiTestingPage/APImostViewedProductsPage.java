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

public class APImostViewedProductsPage {

	WebDriver driver;
	Response response;
	RequestSpecification request;
	String baseUri = "http://localhost:8090/medicare";
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]")
	public List<WebElement> UIMostViewedProductsList;
	
	public List<String> UIMostViwedProducts = new ArrayList<String>();
	public List<String> ApiMVproduct = new ArrayList<String>();
	
	
	public APImostViewedProductsPage(WebDriver driver){
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    }
	

	public void UIMostViewedProductsList() {
		
		for (WebElement MostViewed : UIMostViewedProductsList ) {
		String MVP = MostViewed.getText();	
		UIMostViwedProducts.add(MVP);
		System.out.println(MVP);
		}
	    System.out.println("UI Most Viewed Products: "+ UIMostViwedProducts);
     	}
	
		
	public void APIMostViewedProductsList() {
	
		System.out.println("Most viewed Products");
		response = GetMostViewedProducts();
					
		JsonPath jpath = response.jsonPath();
		List<String> MVproducts = jpath.getList("name");
		
		System.out.println("The number of products in the most viewed product list is: "+MVproducts.size());
		
		//Converting Api list into an Array
		
		for(int i=0;i<MVproducts.size();i++) {
			
			ApiMVproduct.add(MVproducts.get(i).toString());
		}
			System.out.println("Api Most Viewed Products: "+ ApiMVproduct);
						
		}
	
		
	public void MVValidateUIandAPIproducts() {
		
		boolean isArrayEqual = true;
		for (int i = 0; i < UIMostViwedProducts.size(); i++) {
		if (UIMostViwedProducts.get(i).equals(ApiMVproduct.get(i))) {
		    isArrayEqual = true;
		}
		}
		if (isArrayEqual) {
		System.out.println("Most viewed Product List from API and UI are equal");
		} else {
		System.out.println(" Most viewed Product List from API and UI are not equal");
		}
		}	
	
	
	
	public Response GetMostViewedProducts() {
		
		RestAssured.baseURI = this.baseUri;
		request = RestAssured.given();
		response = request.get("/json/data/mv/products");
		System.out.println(response.getBody().asString());
		return response;
	    }
}
