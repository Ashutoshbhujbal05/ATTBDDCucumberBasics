package appFeatureStepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import appFeaturePages.HomePage;
import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class AppFeatueSteps 
{
	WebDriver driver;
	HomePage homePage= new HomePage(DriverFactory.getDriver());
	@Given("user is now on the amazon page")
	public void user_is_now_on_the_amazon_page() 
	{
		driver = DriverFactory.getDriver();
		driver.get("https://amazon.in");
	}


	@Then("the title should contains the text {string}")
	public void the_title_should_contains_the_text(String string)
	{
		driver = DriverFactory.getDriver();
		String title = homePage.getTitle();
		boolean isPresent = title.contains(string);
		Assert.assertTrue(isPresent);
	}
	
	@When("user perform mouse hover on the signInHover element")
	public void user_perform_mouse_hover_on_the_sign_in_hover_element()
	{
		homePage.mouseHoverOnElement();
	}
	
	@When("user click on the SignInBtnAfterHover element")
	public void user_click_on_the_sign_in_btn_after_hover_element()
	{
		homePage.clickOnSignInBtnAfterHover();
	}
	
	@When("user add the username as {string}")
	public void user_add_the_username_as(String string) throws InterruptedException
	{
		Thread.sleep(3000);
		homePage.enterUsername(string);
	}
	
	@When("user add the password as {string}")
	public void user_add_the_password_as(String string) 
	{
		homePage.enterPassword(string);
	}
	
	@When("user click on continue button")
	public void user_click_on_continue_button() 
	{
		homePage.clickOnContinueBtn();
	}
	@When("user click on sign in button")
	public void user_click_on_sign_in_button()
	{
		homePage.clickOnSgnInBtn();
	}
	
	@Then("User login Successfully")
	public void user_login_successfully() 
	{
	   System.out.println("Succefully Login");
	}
	
	@Then("the add to cart button should be present")
	public void the_add_to_cart_button_should_be_present() 
	{
		boolean ispresent = homePage.addToCartBtn();
		Assert.assertTrue(ispresent);
	}


}
