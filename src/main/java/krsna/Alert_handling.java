package krsna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	       driver.findElement(By.id("alertbtn")).click();
	       Thread.sleep(3000);
	       driver.switchTo().alert().accept();

	}

}
