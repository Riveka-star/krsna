package rivekajoshi.pageobject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import rivekajoshi.AbstractComponent.Abstractcomponent;

public class CartPage extends Abstractcomponent
{
	WebDriver driver;
    public CartPage(WebDriver driver)
    {
    	super(driver);
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    //List<WebElement> cartproduct = driver.findElements(By.xpath("//div[@class='cartSection']/h3"));
    //boolean match = cartproduct.stream().anyMatch(cartproduct1->cartproduct1.getText().equalsIgnoreCase(productsName));
    //Assert.assertTrue(match);
    //select the checkoutbutton 
    //driver.findElement(By.cssSelector(".subtotal button")).click();
    
    @FindBy(xpath = "//div[@class='cartSection']/h3")
    List<WebElement> cartproduct;
    
    @FindBy(css=".subtotal button")
    WebElement checkoutbutton;
    
    
    
    public boolean verifyproductdisplay(String productsName)
    {
    	boolean match = cartproduct.stream().anyMatch(cartproduct1->cartproduct1.getText().equalsIgnoreCase(productsName));
    	return match;
    }
    
    
    public CheckOutPage gotocheckoutpage()
    {
    	checkoutbutton.click();
    	CheckOutPage checkout = new CheckOutPage(driver);
    	return checkout;
    }
    
}
