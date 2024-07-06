package rivekajoshi.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import rivekajoshi.pageobject.Landingpage;


public class Standlone {
	

		public static void main(String[] args) 
		{
			
			String productsName="ADIDAS ORIGINAL";
		   WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get("https://rahulshettyacademy.com/client");
		    driver.manage().window().maximize();
		    Landingpage landing = new Landingpage(driver);
		    driver.findElement(By.id("userEmail")).sendKeys("riveka20@gmail.com");
		    driver.findElement(By.id("userPassword")).sendKeys("Riveka@123");
		    driver.findElement(By.id("login")).click();
		    
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("mb-3")));
		    
		  //locator of fetching the entire item present in the product catalogue
		    List<WebElement> listitem = driver.findElements(By.cssSelector(".mb-3"));
		    WebElement prod = listitem.stream().filter(lt->lt.findElement(By.cssSelector("b")).getText().equals(productsName)).findFirst().orElse(null);
		    prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		    
		    //toastmessage visible after adding the product in cart by clicking on the "add to cart" button
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		    
		    //is the class locator -"ng-animating"- loading icon while adding the product in the cart
		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ng-animating")));
		    
		    //click on the cart icon, to see the added product in the cart
		    driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		    
		    //Add the validation the code
		    
		    List<WebElement> cartproduct = driver.findElements(By.xpath("//div[@class='cartSection']/h3"));
		    boolean match = cartproduct.stream().anyMatch(cartproduct1->cartproduct1.getText().equalsIgnoreCase(productsName));
		    Assert.assertTrue(match);
		    //click on  checkout button page
		    driver.findElement(By.cssSelector(".subtotal button")).click();
		    
		    //using the action class we handle the autosuggestion dropdown
		    Actions a = new Actions(driver);
		    a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")),"india").build().perform();
		    
		    //select the item from from the dropdown
		    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		    
		    //click the placeorder button
		    driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")).click();
		    
		    //fetch the confirmation message 
		    String confirmessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		    Assert.assertFalse(confirmessage.equalsIgnoreCase("THANKYOU FOR THE ORDER"));
		    System.out.println(confirmessage);
		    
		    
		    
		 
		  
		    
		    

		}

	}


