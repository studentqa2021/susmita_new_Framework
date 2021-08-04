package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

public WebDriver getDriver(){
	
	System.setProperty("webdriver.driver.firefox", "./Driver/geckodriver.exe");	
	WebDriver driver = new FirefoxDriver();	
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	return driver;	
}
}
