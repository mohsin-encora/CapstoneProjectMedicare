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

public class APIoneCategoryProductsPage {

	
	WebDriver driver;
	Response response;
	RequestSpecification request;
	String baseUri = "http://localhost:8090/medicare";
	
	@FindBy(xpath = "//table[@id='productListTable']//tbody//td[2]")
	public List<WebElement> OneCatProductsList;
	
	
	public List<String> UIOneCatProducts = new ArrayList<String>();
	public List<String> APIOneCatproduct = new ArrayList<String>();
			
	
	public APIoneCategoryProductsPage(WebDriver driver){
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    }
	
	public void UIOneCatProductsList() {
		
		for (WebElement OneCatPrd : OneCatProductsList) {
		String OneCat =  OneCatPrd.getText();	
		UIOneCatProducts.add(OneCat);
		System.out.println(OneCat);
		}
	    System.out.println("UI 1st category Products: "+ UIOneCatProducts);
     	}
	
	
	public void APIOneCatProductsList() {
		
		System.out.println("First Category Products");
		response = GetOneCatProducts();
					
		JsonPath jpath = response.jsonPath();
		List<String> OneCatProducts = jpath.getList("name");
		
		System.out.println("The number of products in the most viewed product list is: "+OneCatProducts.size());
		
		//Converting Api list into an Array
		
		for(int i=0;i<OneCatProducts.size();i++) {
			
			APIOneCatproduct.add(OneCatProducts.get(i).toString());
		}
			
		System.out.println("Api Most Viewed Products: "+ APIOneCatproduct);
		
	}
	
	
	public void MVValidateUIandAPIproducts() {
		
		boolean isApiEqualUI = true;
		for (int i = 0; i < UIOneCatProducts.size(); i++) {
		if (UIOneCatProducts.get(i).equals(APIOneCatproduct.get(i))) {
			isApiEqualUI = true;
		}
		}
		if (isApiEqualUI) {
		System.out.println("First Category Product List from API and UI are equal");
		} else {
		System.out.println(" First Category Product List from API and UI are not equal");
		}
		}	
	
	
	public Response GetOneCatProducts() {
		
		RestAssured.baseURI = this.baseUri;
		request = RestAssured.given();
		response = request.get("/json/data/category/1/products");
		System.out.println(response.getBody().asString());
		return response;
	    }
	
}
