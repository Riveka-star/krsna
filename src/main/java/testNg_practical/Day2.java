package testNg_practical;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 
{

	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("i will execute very first");
	}
	@Parameters({"URL"})
	@Test
	  public void oswald(String urlname)
	  {
		  System.out.println("oswald");
		  System.out.println(urlname);
	  }
	
	@Test(groups={"smoke"})
	  public void Noddy()
	  {
		System.out.println("noddy");
	  }
	@AfterClass
	public void afterclass()
	{
	 System.out.println("it will execute last ,the all method execute in day 2");
	}
	
	@Test(dataProvider="getdata")
	  public void doggykeeper(String username, String password)
	  {
		System.out.println("doggykeeper");
		

	  }
	 @DataProvider
	   public Object[][] getdata()
	   {
		   //1st combination - username,password - good credits
		   //2nd  username,password - no credits
		   //3rd  fraudlent credit history 
		   
		   Object[][] data = new Object[3][2];
		   data[0][0]="firstname";
		   data[0][1]="password";
		   
		   data[1][0]="secondname";
		   data[2][1]="secondpassword";
		   
		   data[2][0]="thirdname";
		   data[2][1]="thirdpassword";
		   
		   return data;
	   }
}
