package com.SwagLab.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil 
{
	
	public Properties p1;
	
	public PropertiesUtil ()
	{ //create object of properties class
		   p1=new Properties();
		
		//set the path of file
		  File f1=new File(System.getProperty("user.dir")+"//ConfigData//config.properties");
		
		  //read in stream
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			 //load the properties from file to class object
			  p1.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
	}
	
	public String getData(String key)
	{
		
		return p1.getProperty(key);
	}

}
