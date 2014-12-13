import java.util.*;
import java.lang.reflect.*;

  public class Customer 
  {

	private int i;
	public final String test = "jadjdjd";
	  
	  public int setValue(int k)
	  {
		  
		 k = k * 40;
		 i =k;	
		 return i;
				  
	  }
	  
	  public void sample(String r)
	  {
		  System.out.println("test"+r);
	  }
	  
	  public String getValue()
	  {
		//  test = "sdasd";
		  return test;
	  }
	  
	  
   
	public static void main(String[] args) {
		String r = "tester";
		int p;
		p = 20;
		
		Method method = ReflectionAPI.class.getMethod(r,String.class);
	       
		Customer k = new Customer();
		j = k.setValue(p);
		System.out.println(j);
		
		
	
	}

}
  

  
