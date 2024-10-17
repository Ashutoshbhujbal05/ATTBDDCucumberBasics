package applicationSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioPassingInteger 
{
	@When("the user is entering the Username {int}")
	public void the_user_is_entering_the_username(Integer MobileNumber) 
	{
	   System.out.println("entered name is:"+MobileNumber);
	}

	@When("the user is entering the Password as {int}")
	public void the_user_is_entering_the_password_as(Integer Password)
	{
		   System.out.println("entered password is:"+Password);
	}

	@When("User Clicks on signIn button")
	public void user_clicks_on_sign_in_button()
	{
	    System.out.println("Clicked on signinButton");
	}

	@Then("the user is now on the Home page module")
	public void the_user_is_now_on_the_home_page_module()
	{
	    System.out.println("on home Page");
	}
}
