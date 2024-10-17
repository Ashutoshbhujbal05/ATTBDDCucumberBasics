package applicationSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps 
{
	@When("the user enters the UserName as {string}")
	public void the_user_enters_the_user_name_as(String name)
	{
	    System.out.println("User Entered Name As:"+name);
	}

	@When("the user entered the Password as {string}")
	public void the_user_entered_the_password_as(String password)
	{
	    System.out.println("User Entered Password As:"+password);
	}

	@When("the User click on SignIn button for signup")
	public void the_user_click_on_sign_in_button_for_signup()
	{
	    System.out.println("User clicked on signin button");
	}
	
	@Then("The user is now on HomePage Module")
	public void the_user_is_now_on_home_page_module() 
	{
	    System.out.println("User is on HomePage");
	}
}
