package rivekajoshi.pageobject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rivekajoshi.AbstractComponent.Abstractcomponent;

public class ProductCatalogue extends Abstractcomponent
{
	WebDriver driver;
    public ProductCatalogue(WebDriver driver)
    {
    	super(driver);
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    
    
    @FindBy(css=".mb-3")
    List<WebElement> listitem;
    
    @FindBy(css="[routerlink*='cart']")
    WebElement cartbutton;
    
    By productby = By.cssSelector(".mb-3");
    By addtocart = By.cssSelector(".card-body button:last-of-type");
    By toastmessanger=By.cssSelector("#toast-container");
    By spinner=By.className("ng-animating");
    
    // wait for element to appear
    public List<WebElement> listofproduct()
    {
    	waitforElementToAppear(productby);
    	return listitem;
    }
    
    
    
    //list out the product 
    public WebElement getproductbyname(String productsName)
    {
    	WebElement prod = listofproduct().stream().filter(lt->lt.findElement(By.cssSelector("b")).getText().equals(productsName))
    			.findFirst().orElse(null);
    	return prod;
    }
    
    // - action code
    //select the item by action on that product 
    public CartPage addproductTocart(String productsName)
    {
    	 WebElement prod = getproductbyname(productsName);
    	 prod.findElement(addtocart).click();
    	 waitforElementToAppear(toastmessanger);
    	 waitforElementToDissappear(spinner);
    	 CartPage cartpage = new CartPage(driver);
    	 return cartpage;
    	 
    }
    
   
    
   
    
    
    
   
    
  
    
    
   
    
}
