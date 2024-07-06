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


public class SubmitOrder extends BaseTest{
	

	@Test
		public void submittingorder() throws IOException
			
		{	
		
		   String productsName="ADIDAS ORIGINAL";
		    
		    
		    Landingpage landing =launch();
		    ProductCatalogue productcatalogue = landing.landingpagecrede("riveka20@gmail.com", "Riveka@123");
		    List<WebElement> listitem = productcatalogue.listofproduct();
		    productcatalogue.addproductTocart(productsName);
		    CartPage cartpage = productcatalogue.goToCartpage();
		    
		    
		    boolean match = cartpage.verifyproductdisplay(productsName);
		    Assert.assertTrue(match);
		    CheckOutPage checkpage = cartpage.gotocheckoutpage();
		    checkpage.SelectCountry("india");
		    Confirmationpage confirmpage = checkpage.Placeorder();
		    String confirmessage = confirmpage.placeorderthankspage();		    
		    Assert.assertFalse(confirmessage.equalsIgnoreCase("THANKYOU FOR THE ORDER"));
		    System.out.println(confirmessage);
		    //driver.close();
		    
		}
}
		    
		 
		  
		    
		    

	


