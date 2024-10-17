package appFeatureRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\AppFeature\\Appfeature.feature"},
		glue= {"appFeatureStepDefination","appFeatureHook"},
		plugin= {"pretty"},
		publish=true
)
public class AppFeatureRunner extends AbstractTestNGCucumberTests
{
	

}
