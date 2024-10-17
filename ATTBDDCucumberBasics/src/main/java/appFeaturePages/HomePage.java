package appFeaturePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"nav-cart\"]")
	private WebElement addToCartBtn;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement signInHover;
	
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")//input[@id='ap_email']
	private WebElement SignInBtnAfterHover;
	
	@FindBy(xpath="(//*[@id=\"ap_email\"]")
	private WebElement userName;
	
	@FindBy(xpath="(//input[@id='continue']")
	private WebElement ContinueBtn;
	
	@FindBy(xpath="(//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy(xpath="(//input[@id='signInSubmit']")
	private WebElement signInBtn;
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    public String getTitle()
    {
    	 String title=driver.getTitle();
    	 return title;    	
    }
    
    public void mouseHoverOnElement()
    {
    	Actions action = new Actions(driver);
	    action.moveToElement(signInHover).perform();
    }
    
    public boolean addToCartBtn()
    {
    	boolean isPresent = addToCartBtn.isDisplayed();
    	return isPresent;
    }
    
    public void clickOnSignInBtnAfterHover()
    {
    	SignInBtnAfterHover.click();
    }
    
    public void enterUsername(String username)
    {
    	userName.sendKeys(username);
    }
    
    public void clickOnContinueBtn()
    {
    	ContinueBtn.click();
    }
    
    public void enterPassword(String pwd)
    {
    	password.sendKeys(pwd);
    }
    
    public void clickOnSgnInBtn()
    {
    	signInBtn.click();
    }
}
