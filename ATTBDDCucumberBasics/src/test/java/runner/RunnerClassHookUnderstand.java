package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\application\\HookUnderstand.feature"},
		glue= {"applicationSteps","hooks"},
		plugin= {"pretty"}
)
public class RunnerClassHookUnderstand extends AbstractTestNGCucumberTests
{
	

}
