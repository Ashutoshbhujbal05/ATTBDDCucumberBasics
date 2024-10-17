package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\application\\Tags_Understand.feature"},
		glue= {"applicationSteps"},
		plugin= {"pretty"},
		tags="not @sanity"
)
public class Tags_UnderstandRunnerClass extends AbstractTestNGCucumberTests
{
	
}
