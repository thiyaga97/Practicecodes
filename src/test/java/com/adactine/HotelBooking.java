package com.adactine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBooking extends AdactinBaseClass {
	WebDriver driver;
	
	@Test
	public void adactinHotelBook() {
			
	browserLaunch(driver, "http://adactinhotelapp.com/");
	WebElement userId = driver.findElement(By.className("login_input"));
	sendValues(userId, "thiyaga97");
//	WebElement passWrd = driver.findElement(By.id("password"));
//	sendValues(passWrd, "123456");
//	WebElement btnlogin = driver.findElement(By.id("login"));
//	buttonClick(btnlogin);
	
	
	}
}
