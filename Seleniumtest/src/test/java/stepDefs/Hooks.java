package stepDefs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

WebDriver driver;
//private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
	@Before
	public void setup() {
	//	driver = new ChromeDriver();
	//	webDriver.set(driver);
	//	TestBase.initDriver();
	}
	
	@After
	public  void tearDown(Scenario scenario) {
	//	if(scenario.isFailed()) {
	//		TakesScreenshot screen = (TakesScreenshot)TestBase.getDriver();
	//		byte[] imgBytes = screen.getScreenshotAs(OutputType.BYTES);
	//		scenario.attach(imgBytes, "image/png", "ScreenImage");
		}
	//	TestBase.tearDown();
	//}

}
