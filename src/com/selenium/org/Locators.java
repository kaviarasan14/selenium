package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.id("signInSubmit")).click();
		
			
	}

}
