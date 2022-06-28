package com.selenium.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.youtube.com/");
	Thread.sleep(3000);
	
	String parentwindow = driver.getWindowHandle();
	
	driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-topbar-menu-button-renderer'])[1]")).click();
	driver.findElement(By.linkText("YouTube Kids")).click();
	
	Set<String> multiplewindow=driver.getWindowHandles();
	
	for (String firstwindow : multiplewindow) 
	{
		String title=driver.switchTo().window(firstwindow).getTitle();
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='kid-button']")).click();
	Thread.sleep(2000);
	driver.close();
	driver.switchTo().window(parentwindow);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]")).click();

	System.out.println("Num of windows"+" "+multiplewindow.size());
	driver.quit();
	}
	
}
