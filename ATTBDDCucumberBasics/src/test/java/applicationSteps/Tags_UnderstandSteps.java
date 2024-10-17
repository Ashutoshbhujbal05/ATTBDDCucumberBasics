package applicationSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tags_UnderstandSteps
{
	@Given("user on the login page")
	public void user_on_the_login_page() 
	{
	    System.out.println("on the login page");
	}

	@When("user get logged in")
	public void user_get_logged_in()
	{
	    System.out.println("get logged in");
	}

	@Then("user on the home page")
	public void user_on_the_home_page() 
	{
	    System.out.println("on the home page");
	}

	@When("ser click on order link")
	public void ser_click_on_order_link()
	{
		System.out.println("on order link");
	}

	@When("user on the order page")
	public void user_on_the_order_page() 
	{
		System.out.println("on the order page");
	}

	@Then("user shows order details")
	public void user_shows_order_details()
	{
		System.out.println("shows order details");
	}

	@When("the user clicks cancel button")
	public void the_user_clicks_cancel_button()
	{
		System.out.println("the user clicks cancel button");
	}

	@Then("order Should cancel")
	public void order_should_cancel()
	{
	    System.out.println("order Should cancel");
	}

}
