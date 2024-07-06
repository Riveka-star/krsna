package rivekajoshi.Test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import rivekajoshi.TestComponent.BaseTest;
import rivekajoshi.pageobject.CartPage;
import rivekajoshi.pageobject.CheckOutPage;
import rivekajoshi.pageobject.Confirmationpage;
import rivekajoshi.pageobject.Landingpage;
import rivekajoshi.pageobject.ProductCatalogue;


public class ErrorValidationTest extends BaseTest{
	

	@Test
		public void submittingorder() throws IOException
			
		{	
		   Landingpage landing =launch();
		   landing.landingpagecrede("riveka20@gmail.com", "Rivekayt@123");
		   Assert.assertEquals("Incorrect email or password", landing.errorTextMessage());    
		}
	
	@Test
	public void ProductErrorValidation() throws IOException
		
	{	
	
	   String productsName="ADIDAS ORIGINAL";
	    Landingpage landing =launch();
	    ProductCatalogue productcatalogue = landing.landingpagecrede("riveka20@gmail.com", "Riveka@123");
	    List<WebElement> listitem = productcatalogue.listofproduct();
	    productcatalogue.addproductTocart(productsName);
	    CartPage cartpage = productcatalogue.goToCartpage();
	    boolean match = cartpage.verifyproductdisplay("Zara Coat 33");
	    Assert.assertFalse(match);
	  
	    
	}
		  
		    
		
}
		    
		 
		  
		    
		    

	


