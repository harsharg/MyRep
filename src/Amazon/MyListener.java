package Amazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.IOException;
import org.apache.log4j.*;

public class MyListener  

{
	
	public Logger log = Logger.getLogger(this.getClass().getName());

  public static void Main(String args[]) throws IOException
 {
    String m = "hggsgsd*ssahgs";
	Properties Prop = new Properties();
	System.out.println(System.getProperty("user.dir"));
	//private String path = "C:\\Users\harsharg\workspace\SampleTest\src\Config\Login.Properties";
	FileInputStream fp = new FileInputStream(System.getProperty("user.dir") + "\\src\\Config\\Login.Properties");
    Prop.load(fp);
    System.out.println(Prop.getProperty("name"));
    System.out.println(m.replace("*ssa", "ssb"));
    
 }
    
}
