package com.selenium.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 1.Implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		//driver.get("http://automationpractice.com/index.php");
		//driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		
		// 2.Explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.get("https://www.phptravels.net/login");
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='ladda-label'])[1]")));
		
		// 3.fluent Wait
		
		
		
		
	}

}
