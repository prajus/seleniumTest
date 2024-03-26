package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//Features//GoogleSearch.feature",
		glue = "stepDefs",
		monochrome=true,
		dryRun = false,
		plugin = {"pretty",
				"rerun:target\\failedScenarios.txt"}
		)
public class ParallelRunner extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	

}
