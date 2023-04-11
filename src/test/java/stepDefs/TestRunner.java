package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome=true,
	    plugin = {"pretty","summary","html:target/html-cucumber","json:target/cucumber.json", 
	    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features="src/test/java/features",
		glue="stepDefs",
		//tags= {"@api"}
		tags= {"@user or @admin or @api or @database"} 
		
		
		
		)
		
		

	public class TestRunner{

	}
