package com.TestNG.TestDataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesFileReading {
  @Test
  public void fileRead() throws IOException 
  {
	  
	  //set the path of file
	  File f1=new File(System.getProperty("user.dir")+"//config.properties");
	  //File f1=new File("C:\\Users\\Ganes\\OneDrive\\Desktop\\AutomationLivePersonal\\Harman International Project\\JavaSeleniumNovBatch\\SeleniumMaven\\config.properties");
	  //read in stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //create object of properties class
	  Properties p1=new Properties();
	    
	  //load the properties from file to class object
	  p1.load(fs);
	  
	  
	  
	  //getProperty(Key)---->value
	  System.out.println("Browser name is: "+p1.getProperty("bname"));
	  System.out.println(p1.getProperty("url"));
	  
	  
  }
}
