package rivekajoshi.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rivekajoshi.AbstractComponent.Abstractcomponent;

public class Landingpage extends Abstractcomponent
{
	WebDriver driver;
    public Landingpage(WebDriver driver)
    {
    	super(driver);
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(id="userEmail")
    WebElement email;
    
    @FindBy(id="userPassword")
    WebElement password;
    
    @FindBy(id="login")
    WebElement loginbutt;
    
    //class="ng-tns-c4-6 toast-message ng-star-inserted"
  //div[@class='ng-tns-c4-8 ng-star-inserted ng-trigger ng-trigger-flyInOut ngx-toastr toast-error']
    
    @FindBy(css="[class*='flyInOut']")
    WebElement errorMessage;
    
    
    public ProductCatalogue landingpagecrede(String mail,String pass)
    {
    	email.sendKeys(mail);
    	password.sendKeys(pass);
    	loginbutt.click();
    	ProductCatalogue productcatalogue = new ProductCatalogue(driver);
    	return productcatalogue;
    }
    //<div role="alert" class="ng-tns-c4-6 toast-message ng-star-inserted" aria-label="Incorrect email or password." style=""> Incorrect email or password. </div>
 
    public WebElement errorTextMessage()
    {
    	errorMessage.getText();
    	waitforWebElementToAppear(errorMessage);
    	return errorMessage;
    }
    public void Goto()
    {
    	driver.get("https://rahulshettyacademy.com/client");
    }
    
}
