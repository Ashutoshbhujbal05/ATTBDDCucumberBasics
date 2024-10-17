package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\application\\DryRunFunctionality.feature"},
		glue= {"applicationSteps","hooks"},
		plugin= {"pretty"},
		dryRun=true//it will show which Scenario step is not having the method or implementation in the feature File
		
)
public class RunnerClassDryRunFunctionality extends AbstractTestNGCucumberTests
{

}
