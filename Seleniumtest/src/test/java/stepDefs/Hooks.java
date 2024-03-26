package stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

WebDriver driver;
	
	@Before
	public void setup() {
		 TestBase.initDriver();
	}
	
	 @After
	  public void tearDown() {
		//  driver.quit();
	  }

}
