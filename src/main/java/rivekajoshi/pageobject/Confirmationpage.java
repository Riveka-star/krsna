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

public class Confirmationpage extends Abstractcomponent
{
	WebDriver driver;
    public Confirmationpage(WebDriver driver)
    {
    	super(driver);
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    //String confirmessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
   // Assert.assertFalse(confirmessage.equalsIgnoreCase("THANKYOU FOR THE ORDER"));
    //System.out.println(confirmessage);
    
    
    @FindBy(css = ".hero-primary")
    WebElement confirmessage;
    
    
    public String placeorderthankspage()
    {
    	return confirmessage.getText();
    }
    
    
    
  
    
   
    
}
