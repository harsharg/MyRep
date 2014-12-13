package Amazon;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.util.Arrays;

public class ImageComparison {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		  System.out.println("Executing processImage Keyword");

		  try {

		   String file1 = "C:\\Users\\harsharg\\Desktop\\AirAasiaBooking2.PNG";
		   String file2 = "C:\\Users\\harsharg\\Desktop\\AirtelBill.PNG";

		   Image pic1= Toolkit.getDefaultToolkit().getImage(file1);
		   Image pic2= Toolkit.getDefaultToolkit().getImage(file2);

		   try {

		    PixelGrabber grab11 = new PixelGrabber(pic1, 0, 0, -1, -1,
		      false);
		    PixelGrabber grab21 = new PixelGrabber(pic2, 0, 0, -1, -1,
		      false);

		    byte[] array1= null;

		    if (grab11.grabPixels()) {
		     int width = grab11.getWidth();
		     int height = grab11.getHeight();
		     array1= new byte[width * height];
		     array1= (byte[]) grab11.getPixels();
		    }

		    byte[] array2 = null;

		    if (grab21.grabPixels()) {
		     int width = grab21.getWidth();
		     int height = grab21.getHeight();
		     array2 = new byte[width * height];
		     array2 = (byte[]) grab21.getPixels();
		    }

		    if(Arrays.equals(array1,array2))
		    {
		    	System.out.println("pass");
		    }
		    else
		    {
		    	System.out.println("fail");
		    }
		    
		      
		   } catch (InterruptedException e1) {
		    e1.printStackTrace();
		   }
		 
		  } catch (Throwable t) {
		   // report error
	
		  }

		 }

	}


