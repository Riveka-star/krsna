package testNg_practical;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day4 
{
  @Test
  public void weblogincarloan()
  {
	  System.out.println("weblogincarloan");
  }
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("it will execute after every testcase in day4 class");
  }
  
  @Test(groups={"smoke"})
  public void Mobilelogincarloan()
  {
	  System.out.println("Mobilelogincarloan");
  }
  @BeforeSuite
  public void beforesuit1()
  {
	  System.out.println("when should i run");
  }
  @Test(enabled=false)
  public void LoginApicarloan()
  {
	  System.out.println("LoginApicarloan");
  }
}
