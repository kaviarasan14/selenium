package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		WebElement Checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
		
		
		if(checkbox1.isSelected())
		{
			System.out.println("Selenium checkbox is Selected");
		}
		else
		{
			System.out.println("Selenium checkbox is not selected");
		}
		if(Checkbox2.isSelected())
		{
			Checkbox2.click();
			System.out.println("Default Selected checkbox is Deselected");
		}
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();
		
		
			
	}

}
