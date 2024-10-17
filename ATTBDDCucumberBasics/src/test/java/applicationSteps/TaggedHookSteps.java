package applicationSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHookSteps 
{
	@Given("the first step of tag scenario1")
	public void the_first_step_of_tag_scenario1()
	{
		System.out.println("the first step of tag scenario1");
	}

	@When("the second step of tag scenario1")
	public void the_second_step_of_tag_scenario1()
	{
		System.out.println("the second step of tag scenario1");
	}

	@Then("third step of tag scenario1")
	public void third_step_of_tag_scenario1() 
	{
		System.out.println("third step of tag scenario1");
	}

	@Given("the first step of tag scenario2")
	public void the_first_step_of_tag_scenario2()
	{
		System.out.println("the first step of tag scenario2");
	}

	@When("the second step of tag scenario2")
	public void the_second_step_of_tag_scenario2()
	{
		System.out.println("the second step of tag scenario2");
	}

	@Then("third step of tag scenario2")
	public void third_step_of_tag_scenario2()
	{
		System.out.println("third step of tag scenario2");
	}

	@Given("the first step of tag scenario3")
	public void the_first_step_of_tag_scenario3()
	{
		System.out.println("the first step of tag scenario3");
	}

	@When("the second step of tag scenario3")
	public void the_second_step_of_tag_scenario3()
	{
		System.out.println("the second step of tag scenario3");
	}

	@Then("third step of tag scenario3")
	public void third_step_of_tag_scenario3()
	{
		System.out.println("third step of tag scenario3");
	}

	

}
