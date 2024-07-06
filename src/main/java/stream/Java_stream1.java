package stream;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Java_stream1 
{
   @Test
   public void regular()
   {
	  ArrayList<String> names = new ArrayList<String>();
	  names.add("Abhijeet");
	  names.add("Don");
	  names.add("Alekhya");
	  names.add("Adam");
	  names.add("Ram");
	  
	  int count=0;
	  for(int i=0;i<names.size();i++)
	  {
		  String actual = names.get(i);
		  if(actual.startsWith("A"))
		  {
			  count++;
			  
		  }
		  System.out.println(count);
		  System.out.println("-------------------------------------");
	  }
	  
	  
   }
   @Test
   public void streamfilter()
   {
	   ArrayList<String> names = new ArrayList<String>();
		  names.add("Abhijeet");
		  names.add("Don");
		  names.add("Alekhya");
		  names.add("Adam");
		  names.add("Ram");
		  
		 names.stream().filter(r->r.startsWith("A")).count();
		  System.out.println(names);
		  
		  names.stream().filter(r->r.length()>4).forEach(r->System.out.println(r));
		  
		  names.stream().filter(r->r.length()>2).limit(1).forEach(r->System.out.println(r));
   }
   
   
   
	
}  
