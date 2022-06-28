package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]"));

		// System.out.println(element.getText());
		// System.out.println(element.getAttribute("class"));
		System.out.println(driver.getTitle());

	}

}
