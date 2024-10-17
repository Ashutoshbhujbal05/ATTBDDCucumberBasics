package applicationSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookUnderstandSteps
{
	@Given("the user is on application WebPage")
	public void the_user_is_on_application_web_page()
	{
	    System.out.println("the user is on application WebPage");
	}

	@When("the current user logs in")
	public void the_current_user_logs_in()
	{
	    System.out.println("the current user logs in");
	}

	@When("the user click on upload profile pic element")
	public void the_user_click_on_upload_profile_pic_element() 
	{
	    System.out.println("the user click on upload profile pic element");
	}

	@When("the user select the picture")
	public void the_user_select_the_picture()
	{
	    System.out.println("the user select the picture");
	}

	@When("the user click on submit buttom element")
	public void the_user_click_on_submit_buttom_element()
	{
	    System.out.println("the user click on submit buttom element");
	}

	@Then("the user shows success msg element")
	public void the_user_shows_success_msg_element()
	{
	    System.out.println("the user shows success msg element");
	}

}
