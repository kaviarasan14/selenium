package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("12345");
		
		//driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//a[@class='_sv4'])[4]")).click();

		
		
}
	
}
