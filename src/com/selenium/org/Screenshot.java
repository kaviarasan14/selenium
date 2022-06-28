package com.selenium.org;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in/");
		
		TakesScreenshot ss =(TakesScreenshot) driver;
		
		File source = ss.getScreenshotAs(OutputType.FILE);
		//1.Saving a screenshot in a local folder
		//File destination = new File("C:\\Users\\kavia\\Desktop\\Screenshot\\screen1.png");
		//2. Saving a screenshot in a project folder
		File destination = new File("C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Screenshots\\screen.png");
		FileHandler.copy(source, destination);
		
		
	}

}
