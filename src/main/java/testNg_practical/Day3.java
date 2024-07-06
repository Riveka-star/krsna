package testNg_practical;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3 
{
  @Test
  public void tweety()
  {
	  System.out.println("tweety");
  }
  
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println(" it will execute in day 3 very first among all the test methods");
  }
  @Test(groups={"smoke"})
  public void dexter()
  {
	  System.out.println("dexter");
  }
  
  @BeforeMethod
  public void beforemethod() 
  {
	  System.out.println("it will before every test in day3 class");
  }
  
  @Test(dependsOnMethods="tweety")
  public void horridhenry()
  {
	  System.out.println("horridhenry");
  }
}
