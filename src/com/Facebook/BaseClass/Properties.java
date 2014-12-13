package com.Facebook.BaseClass;

import java.io.FileInputStream;
import java.util.*;

public class Properties {
	
	public static void main(String args[])
	{
		
		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "\\Users\\harsharg\\workspace\\SampleTest\\src\\Config\\Config.Properties";
		
		try
		{
		FileInputStream fs = new FileInputStream(path);
		
		}
		catch(Exception e)
		{
			return;
		}
		
	}


}
