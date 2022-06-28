package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,600)", "");
		
		
		WebElement element2 = driver.findElement(By.xpath("//a[@class='homefeatured']"));
		//	js.executeScript("arguments[0].scrollIntoView()", element2);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		
		
	}

}
