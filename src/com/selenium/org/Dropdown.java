package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select list1 = new Select(dropdown1);
		list1.selectByValue("3");
		
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select list2 = new Select(dropdown2);
		list2.selectByVisibleText("Selenium");
		
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select list3 = new Select(dropdown3);
		list3.selectByIndex(1);
		
		WebElement dropdown4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select list4 = new Select(dropdown4);
		list4.selectByVisibleText("Appium");
		
		WebElement dropdown5 = driver.findElement(By.xpath("(//select)[5]"));
		dropdown5.sendKeys("Selenium");
		Thread.sleep(1000);
		Select list5 = new Select(dropdown5);
		list5.selectByVisibleText("Appium");
		
	}

}
