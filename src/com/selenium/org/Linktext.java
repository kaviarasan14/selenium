package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		WebElement findtheurl = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		System.out.println(findtheurl.getAttribute("href"));
	}

}
