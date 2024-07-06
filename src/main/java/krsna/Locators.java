package krsna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://rahulshettyacademy.com/locatorspractice/");
	       driver.manage().window().maximize();
	       driver.findElement(By.id("inputUsername")).sendKeys("kostarivea33@gmail.com");
	       driver.findElement(By.name("inputPassword")).sendKeys("rive@123");
	       driver.findElement(By.cssSelector("button.signInBtn")).click();
	       Thread.sleep(2000);
	       System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	       driver.findElement(By.linkText("Forgot your password?")).click();
	       
	       
	       

	}

}
