package krsna;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@text='Hyderabad (HYD)']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@text='Hyderabad (HYD)']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@text= 'Gwalior (GWL)'] )[2]")).click();

	}

}
