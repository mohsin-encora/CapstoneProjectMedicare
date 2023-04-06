package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome=true,
	    plugin = {"pretty","summary","html:target/html-cucumber","json:target/cucumber.json", 
	    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features="src/test/java/features",
		glue="stepDefs",
		
		//snippets = CucumberOptions.SnippetType.CAMELCASE,
		//tags= {"@user1 or @user"}
		//tags= {"@admin"}
		//tags= {"@api"}
		//tags= {"@database"}
		tags= {"@user or @admin or @api or @database"} 
		
		
		
		)
		
		


	public class TestRunner  {

	}
