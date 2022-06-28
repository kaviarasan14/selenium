package com.selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("html/body/div[1]/div/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("Tshirt");
	driver.findElement(By.xpath("html/body/div[1]/div/header/div[3]/div/div/div[2]/form/button")).click();
	driver.findElement(By.xpath("html/body/div/div/header/div[3]/div/div/div/a/img")).click();
	Robot page = new Robot();
	page.keyPress(KeyEvent.VK_END);
	page.keyRelease(KeyEvent.VK_END);
	driver.findElement(By.xpath("html/body/div/div[3]/footer/div/section[5]/div/ul/li[1]/a")).click();
	
	}

}
