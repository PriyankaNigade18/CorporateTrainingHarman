package com.WebElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandling {
  @Test
  public void testIFrame()
   {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/iframe");
	  
	  //frame handling with indexing
	  //driver.switchTo().frame(0);
	  
	   //frame handling with id/name
	  //driver.switchTo().frame("mce_0_ifr");
	  
	  //frame handling with frame WebElement
	  
	  WebElement frameEle=driver.findElement(By.id("mce_0_ifr"));
	  driver.switchTo().frame(frameEle);
	  
	  WebElement ele=driver.findElement(By.tagName("p"));
	  ele.clear();
	  ele.sendKeys("Hello All!");	  
	  
	  
	  
  }
  
  @Test
  public void frameHandlingDemo2()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  //frame1
	  driver.switchTo().frame(0);
	  
	  driver.findElement(By.name("mytext1")).sendKeys("frame1 completed");
	  /*
	   * Selects either the first frame on the page,
	   *  or the main document when a page containsiframes. 
	   */
	  //come to mainPAge
	  driver.switchTo().defaultContent();
	  
	  
	  //frame2
	  WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	  driver.switchTo().frame(frame2);
	  
	  driver.findElement(By.name("mytext2")).sendKeys("frame2 completed");
	  
	  //come to mainpage
	  driver.switchTo().defaultContent();
	  
	  //frame3-Nested frame
	  
	  WebElement fram3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	  driver.switchTo().frame(fram3);
	  
	  //iframe
	  //driver.switchTo().frame(0);
	  WebElement innerframe=driver.findElement(By.tagName("iframe"));
	  driver.switchTo().frame(innerframe);
	  
	  driver.findElement(By.id("i9")).click();
	  
	  //parentFrame()
	  driver.switchTo().parentFrame();
	  
	  driver.findElement(By.name("mytext3")).sendKeys("frame3 completed");
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
