package com.adactine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinBaseClass {
	public static WebDriver driver;
	
	public WebDriver browserLaunch(WebDriver driver, String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		return driver;		
		
	}
	public void sendValues(WebElement element, String data) {
	element.sendKeys(data);

	}
	
	public void buttonClick(WebElement element) {
		element.click();

	}
	public String getPageUrl(WebDriver driver) {
		String url = driver.getCurrentUrl();
		return url;

	}
	
	public String getPageTitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;

	}
	
	
}
