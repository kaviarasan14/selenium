package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsexample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("http://www.leafground.com/pages/drop.html");
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		
//		Actions act = new Actions(driver);
//		
//		//act.dragAndDrop(drag, drop).build().perform();
//        act.clickAndHold(drag).moveToElement(drop).release().build().perform(); 
		
	///Mouse Hover 
		driver.get("http://www.amazon.in/");
		WebElement findElement = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		WebElement youraccount = driver.findElement(By.xpath("(//span[@class='nav-text'])[6]"));
		
		Actions ref = new Actions(driver);
		ref.moveToElement(findElement);
		ref.click(youraccount).build().perform();
		
		
		
	}
	
}
