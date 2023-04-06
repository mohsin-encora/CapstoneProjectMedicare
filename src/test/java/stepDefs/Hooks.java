package stepDefs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	public static WebDriver driver;
	 public static String scenarioName;

	@Before
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");	
		driver = new ChromeDriver();
			

	}
	
	
	@AfterStep
	public void takeScreenshot(Scenario scenario) {
		
		if (scenario.isFailed()) {
		
		final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png", "image");
		
		}
		}
	
	
	@After
	public void TearDown() {

		driver.close();
		
	}
	
	/*@After("@lastScenario")
	public void dataCleanUp() {

	    CleanUpScripts cleanUpScripts = new CleanUpScripts();
	    cleanUpScripts.dataCleanUp();
	}*/
}
