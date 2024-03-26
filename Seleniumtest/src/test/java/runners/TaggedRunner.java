package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src//test//resources//Features//TaggedFeature.feature"}
,glue = "stepDefs",
monochrome=true,
dryRun = false
//,tags="@smoke and @regression"

)
public class TaggedRunner extends AbstractTestNGCucumberTests {

}
