package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//Features//BackgroudScenario.feature"
,glue = "stepDefs",
monochrome=true,
dryRun = false

)
public class BackgroundScenario extends AbstractTestNGCucumberTests  {

}
