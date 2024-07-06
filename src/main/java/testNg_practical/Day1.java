package testNg_practical;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 
{

	@AfterSuite
	public void aftersuite()
	{
		System.out.println("it will execute at the end among all the testcase");
	}
	
   @Parameters({"username"})
   @Test
   public void demo(String user)
   {
	   System.out.println("hello testng");
	   System.out.println(user);
	   Assert.assertTrue(false);
   }
   
  
   
}
