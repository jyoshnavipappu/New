package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonModule {
@Test
	
	public void module1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hero\\Downloads\\Files\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
	
		driver.findElement(By.id("home")).click();
		
		Thread.sleep(2000);
	

	}
	
}

