package rivekajoshi.pageobject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import rivekajoshi.AbstractComponent.Abstractcomponent;

public class CheckOutPage extends Abstractcomponent
{
	WebDriver driver;
    public CheckOutPage(WebDriver driver)
    {
    	super(driver);
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    //Actions a = new Actions(driver);
    //a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")),"india").build().perform();
  //select the item from from the dropdown
    //driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    
    //click the placeorder button
    //driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")).click();
    
    
    @FindBy(css = "input[placeholder='Select Country']")
    WebElement country;
    
    @FindBy(xpath="(//button[@type='button'])[2]")
    WebElement clickoncountry;
    
    @FindBy(xpath="//a[@class='btnn action__submit ng-star-inserted']")
    WebElement placeorder;
    
    
    
    
    
    public void SelectCountry(String CountryName)
    {
    	Actions a = new Actions(driver);
        a.sendKeys(country,CountryName).build().perform();
        clickoncountry.click();
        
    }
    
    public Confirmationpage Placeorder()
    {
    	placeorder.click();
    	Confirmationpage confirmpage = new Confirmationpage(driver);
    	return confirmpage;
    }
    
  
    
   
    
}
