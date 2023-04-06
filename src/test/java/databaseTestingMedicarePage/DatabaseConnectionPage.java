package databaseTestingMedicarePage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatabaseConnectionPage {

	WebDriver driver;
	Connection con;
	
	@FindBy(xpath = "//select[@id='categoryId']/option")
	List<WebElement> DBNewCategoryList;
	
	
	public DatabaseConnectionPage(WebDriver driver){
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    }
	
		
	public void DBConnection() throws ClassNotFoundException, SQLException {
		
	con = DriverManager.getConnection("jdbc:mysql://localhost/medicare", "root", "root");
	
	}
	
	public void DBDataCategory() throws SQLException {
		
		Statement stm = con.createStatement();
		ResultSet result = stm.executeQuery("select * from Category");

		while(result.next()) {
			
			System.out.println(result.getInt("id"));
			System.out.println(result.getString("name"));
			System.out.println(result.getString("description"));
			
		}
	}
		
		public void CreateCategoryDB() throws SQLException {
					
			Statement stm = con.createStatement();
			stm.executeUpdate("insert into Category (id, name, description) values (4, 'Dental', 'This is to keep teeth healthy')");
			ResultSet result = stm.executeQuery("select * from Category");
						
		}
	
	public void ValidateNewAddedCategoryInDB() throws SQLException {
		
		
		for(WebElement CatDrop : DBNewCategoryList)
		{
			if(CatDrop.equals("Dental")) {
			Assert.assertTrue(true);
			}
		}
    	   		
	}
	
	
	public void DeleteCategoryDB() throws SQLException {
		
		Statement stm = con.createStatement();
		stm.executeUpdate("delete from category where name='Dental'");
		}
		
	
	public void DeleteUICategoryDB() throws SQLException {
		
		Statement stm = con.createStatement();
		stm.executeUpdate("delete from category where name='Dermatology1'");
				
		}
	
	
	public void ValidateCategoryDeletedInDB() throws SQLException {
		
		for(WebElement CatDrop : DBNewCategoryList)
		{
			if(CatDrop.equals("Dental")) {
			Assert.assertTrue(false);
			}
		}
	}
	
	public void ValidateUIcategoryInDatabase() throws SQLException {
		
		Statement stm = con.createStatement();
		ResultSet result = stm.executeQuery("select * from Category where name='Dermatology1'");
		
		if(result.equals("Dermatology1")) {
			
			Assert.assertTrue(true);
			System.out.println("The new Category is added to the Database");
		}
			
	}
	
	
	
	public void CloseDriver() throws ClassNotFoundException, SQLException {
		
		con.close();
		
		}
	
	
		public void CreateNewUserDB() throws SQLException {
			
			Statement stm = con.createStatement();
			stm.executeUpdate("insert into User_detail (id, first_name, last_name, role, password, email, contact_number) values ('5', 'Soma', 'Mondal', 'USER', '13245', 'sm@gmail.com', '2567159802')");
		}
		
		
		public void ValidateNewUserInDB() throws SQLException {
			
			Statement stm1 = con.createStatement();
			Statement stm2 = con.createStatement();
			ResultSet result1 = stm1.executeQuery("select * from User_detail where email='sma@gmail.com'");
			ResultSet result2 = stm2.executeQuery("select * from User_detail");
			
			if(result1.equals("sm@gmail.com")) {
				System.out.println("The user id is added to the Database");
			}else {
				
			System.out.println("The User id is not added to the Database");
			}
			
			while(result2.next()) {
				
				System.out.print(result2.getInt("id") + "   ");
				System.out.print(result2.getString("first_name")+ " ");
				System.out.print(result2.getString("last_name")+ "   ");
				System.out.print(result2.getString("role")+ "   ");
				System.out.print(result2.getString("email")+ "   ");
				System.out.print (result2.getString("password")+ "   ");
				System.out.println(result2.getString("contact_number"));
		
			}
	}
		
		public void DeleteNewUserDB() throws SQLException {
			
			Statement stm = con.createStatement();
			stm.executeUpdate("delete from User_detail where email='sm@gmail.com'");
						
		}
		
		
		public void ValidateNewUserDeletedInDB() throws SQLException {
			
			Statement stm = con.createStatement();
			ResultSet result = stm.executeQuery("select * from User_detail where email='sm@gmail.com'");
			
				if(result.equals("sm@gmail.com")) {
					System.out.println("The user id is not deleted");
			}else {
				System.out.println("The User id is deleted");
			}
		}
		
		
}
