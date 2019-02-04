package com.qa.tester;

import java.awt.Dimension;
import java.awt.image.BufferedImage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sikuli_garcia {
	
	WebDriver driver;
	
	
	/*@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://rsyspedia.india.rsystems.com/SitePages/Home.aspx");
		driver.manage().window().maximize();
		//suvneet.singh:zxcvbnm@2093@
	}*/
	
	@Test
  public void tests() throws FindFailed {
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,250)", "");
		
		Screen sc = new Screen();
		Pattern drag = new Pattern("C:\\Users\\Suvneet.Singh\\Desktop\\sikuli_ss\\drag.PNG");
		sc.wait(drag, 2);
		sc.rightClick(drag);
		Pattern copy = new Pattern("C:\\Users\\Suvneet.Singh\\Desktop\\sikuli_ss\\copy.PNG");
		sc.wait(copy, 2);
		//sc.rightClick(drag);
		
		//jse.executeScript("window.scrollBy(0,-250)", "");
		
		Pattern drop = new Pattern("C:\\Users\\Suvneet.Singh\\Desktop\\sikuli_ss\\drop.PNG");
		sc.wait(drop, 2);
		sc.rightClick(drop);
		Pattern paste = new Pattern("C:\\Users\\Suvneet.Singh\\Desktop\\sikuli_ss\\paste.PNG");
		sc.wait(paste, 2);
		
		//sc.click();
		
		
  }
	
	/*@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		
	}*/
	
}
