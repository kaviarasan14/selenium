package com.selenium.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		alert1.click();
	    Alert alertbox = driver.switchTo().alert(); 
	    Thread.sleep(2000);
	    alertbox.accept();
	    
	    WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
	    alert2.click();
	    Alert confirmalert = driver.switchTo().alert();
	    Thread.sleep(2000);
	    confirmalert.dismiss();
	    
	    WebElement alert3 = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
	    alert3.click();
	    Alert prompt = driver.switchTo().alert();
	    prompt.sendKeys("greens");
	    Thread.sleep(2000);
	    prompt.accept();
	    
	    WebElement alert4 = driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
	    alert4.click();
	    Alert linebreak = driver.switchTo().alert();
	    Thread.sleep(2000);
	    linebreak.accept();
	    
	}

}
