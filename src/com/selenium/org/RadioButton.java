package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[6]")).click();
		driver.findElement(By.xpath("//input[@id='yes']")).click();
		WebElement Unchecked = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		WebElement Checked = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
		WebElement age21to40 = driver.findElement(By.xpath("(//input[@type='radio'])[6]"));
		WebElement age1to20 = driver.findElement(By.xpath("(//input[@type='radio'])[5]"));
		
		if(Unchecked.isSelected())
		{
			System.out.println("Unchecked radio button is selected");	
		} 
		else if (Checked.isSelected()) 
		{
			System.out.println("UnChecked radio button is not selected so Iam Clicking the button");   	   
		}
		Unchecked.click();
		
		if(age21to40.isSelected()) {
		         System.out.println("selected age group is wrong , so Clicking correct age group ");
		         age1to20.click();
		}
	}

}
