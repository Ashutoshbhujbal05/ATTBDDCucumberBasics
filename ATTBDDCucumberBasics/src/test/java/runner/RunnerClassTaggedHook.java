package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features= {"src\\test\\resources\\application\\TaggedHooks.feature"},
	glue= {"applicationSteps","taggedHooks"},
	plugin= {"pretty"},
	tags="@sanity"
)

public class RunnerClassTaggedHook extends AbstractTestNGCucumberTests
{
	

}
