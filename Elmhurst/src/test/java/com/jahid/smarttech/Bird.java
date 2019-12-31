package com.jahid.smarttech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bird {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("jahidul.us@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("gcktdfclfou");
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		
		
	}

}
