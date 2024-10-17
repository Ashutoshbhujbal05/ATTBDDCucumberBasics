package applicationSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class HomePageStepsDefination
{
	@Given("the user is now on the portal page")
	public void the_user_is_now_on_the_portal_page()
	{
		System.out.println("the user is now on the portal page");
	}

	@Then("the user is now on the Home Page")
	public void the_user_is_now_on_the_home_page()
	{
		System.out.println("the user is now on the Home Page");
	}


}
