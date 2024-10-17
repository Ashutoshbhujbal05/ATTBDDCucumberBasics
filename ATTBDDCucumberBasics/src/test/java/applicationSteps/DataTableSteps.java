package applicationSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import io.cucumber.datatable.DataTable;

public class DataTableSteps
{
	@Given("the user is on login page1")
	public void the_user_is_on_login_page1()
	{
	    System.out.println("the user is on login page1");
	}

	@When("the user set the current page as default page")
	public void the_user_set_the_current_page_as_default_page()
	{
		System.out.println("the user set the current page as default page");
	}

	@When("the user entered the below data")
	public void the_user_entered_the_below_data(DataTable dataTable)
	{
		List<List<String>> list_data = dataTable.asLists(String.class);//here it will return dataType as in list of list of string
//		List<List<Object>> list_data1 = dataTable.asLists(Object.class);//here it will return dataType as in list of list of Object
	    System.out.println(list_data.get(0));//it will print 0th position list
	    for(List<String> data:list_data)
	    {
	    	System.out.println("All lists");
	    	System.out.println(data);//it will print all the list inside the data variable
	    	System.out.println("first lists");
	    	System.out.print(data.get(0));//it will print 0th position value of 0th list
	    	System.out.println("Second lists");
	    	System.out.print(data.get(1));//it will print 1st position value of 0th list
	    }
	}

	@Then("the user click on submit button")
	public void the_user_click_on_submit_button()
	{
	    System.out.println("the user click on submit button");
	}


}
