package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\application\\OrderedProduct.feature"},
		glue= {"applicationSteps"},
		plugin= {"pretty"}
)
public class RunnerClassOrderProduct extends AbstractTestNGCucumberTests
{

}
