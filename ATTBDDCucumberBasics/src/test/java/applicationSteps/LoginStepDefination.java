package applicationSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination 
{
	@Given("the user is now on the login page")
	public void onTheLoginPage()
	{
		System.out.println("the user is now on the login page");
	}

	@When("the user entered Username")
	public void enteredUsername()
	{
		System.out.println("the user entered Username");
	}

	@When("the user entered Password")
	public void enteredPassword()
	{
		System.out.println("the user entered Password");
	}

	@When("the user clicks on login button")
	public void clickOnButton()
	{
		System.out.println("the user clicks on login Button");
	}
    
	@Then("the user is now logged in")
	public void loggedIn()
	{
		System.out.println("the user is now logged in");
	}
	
	@Given("the user is logged in to the application")
	public void the_user_is_logged_in_to_the_application()
	{
		System.out.println("the user is logged in to the application");
	}

	@When("the user clicks on the mobile product")
	public void the_user_clicks_on_the_mobile_product()
	{
		System.out.println("the user clicks on the mobile product");
	}

	@When("the user clicks on add to cart button")
	public void the_user_clicks_on_add_to_cart_button()
	{
		System.out.println("the user clicks on add to cart button");
	}

	@Then("the user is now on the payment page")
	public void the_user_is_now_on_the_payment_page()
	{
       	System.out.println("the user is now on the payment page");    
	}


}
