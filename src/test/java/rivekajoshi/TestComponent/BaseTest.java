package rivekajoshi.TestComponent;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import rivekajoshi.pageobject.Landingpage;

import java.io.*;
import java.time.Duration;

public class BaseTest
{
	WebDriver driver;
	public Landingpage landing ;
	@Test
	public WebDriver initializer() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fstream = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//rivekajoshi//resources//GlobalData.properties");
		prop.load(fstream);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new EdgeDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	
	@BeforeMethod
	public Landingpage launch() throws IOException
	{
		driver=initializer();
		Landingpage landing = new Landingpage(driver);
	    landing.Goto();
	    return landing;
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
  
  
}
