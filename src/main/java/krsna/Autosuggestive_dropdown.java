package krsna;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("am");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		//System.out.println(list.get(4).getText());
		for(WebElement option : list)
		{
			if(option.getText().equalsIgnoreCase("Jamaica"))
			{
				option.click();
			}
		}

		
	}

}
