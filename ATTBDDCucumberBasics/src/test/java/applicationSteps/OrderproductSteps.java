package applicationSteps;

import io.cucumber.java.en.When;

public class OrderproductSteps
{
	@When("the user entered Username as {string}")
	public void the_user_entered_username_as(String username)
	{
		System.out.println("UserName is:"+username);
	}

	@When("the user entered Password as {string}")
	public void the_user_entered_password_as(String password)
	{
		System.out.println("UserName is:"+password);
	}

	@When("the user click on the order button")
	public void the_user_click_on_the_order_button()
	{
		System.out.println("the user click on the order button");
	}

	@When("the user click on the order product")
	public void the_user_click_on_the_order_product()
	{
		System.out.println("the user click on the order product");
	}

}
