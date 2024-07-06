package rivekajoshi.AbstractComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import rivekajoshi.pageobject.CartPage;

public class Abstractcomponent 
{
	WebDriver driver;
	public Abstractcomponent(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css=("[routerlink*='cart']"))
	WebElement CartIcon;

	public void waitforElementToAppear(By findby)
	{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
	}
	
	public void waitforWebElementToAppear(WebElement findby)
	{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    wait.until(ExpectedConditions.visibilityOf(findby));
	}
    
	public void waitforElementToDissappear(By findby)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(findby));
	}
	
	public CartPage goToCartpage()
	{
		CartIcon.click();
		CartPage cartpage = new CartPage(driver);
		return cartpage;
	}
    
}
