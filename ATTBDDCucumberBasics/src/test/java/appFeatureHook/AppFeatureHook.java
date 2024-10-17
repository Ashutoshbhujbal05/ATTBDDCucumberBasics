package appFeatureHook;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.io.FileInputStream;
import java.io.IOException;

public class AppFeatureHook 
{
	WebDriver driver;
	@Before
	public void initializeBrowser() throws IOException
	{
		Properties prop = new Properties();
		String path =System.getProperty("user.dir")+"//src//test//resources//Cucumber.properties";
		FileInputStream fis=new FileInputStream(path);
		prop.load(fis);
		String browserName=prop.getProperty("Browser");
		DriverFactory df= new DriverFactory();
		driver=df.initBrowser(browserName);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown()
	{
		driver.quit();
	}
}
