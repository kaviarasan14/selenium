package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.amazon.com");
	
	Thread.sleep(2000);
	
	driver.close();
	
		
	}

}
