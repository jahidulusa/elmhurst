package com.jahid.smarttech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bird {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("jahidul.us@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("gcktdfclfou");
		//driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		
		
	}

}
