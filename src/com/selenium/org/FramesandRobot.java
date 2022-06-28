package com.selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesandRobot {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavia\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames " + frames.size());

		Robot robo = new Robot();

		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);

	}

}
