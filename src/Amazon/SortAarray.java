package Amazon;

public class SortAarray {

	static  String Array[]= new String[]{" Hello " , " This " , "is ", "Sorting ", "Example"};
	static String  temp; 

	public static void main(String[] args)

	{    
        for(int i=0;i<Array.length;i++)
        {
          for(int j=i+1;j<Array.length;j++)
          {
        	  if(Array[i].trim().compareToIgnoreCase(Array[j].trim()) > 0)
        	  {
        		  temp = Array[i];
        		  Array[i] = Array[j];
                  Array[j] = temp;
        	  }
   
          }
        }
        
		 for(int k=0;k<Array.length;k++)
		 {
			 System.out.println(Array[k]);
		 }
	       
	    
	 }
	
}
