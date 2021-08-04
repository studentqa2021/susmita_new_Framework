package com.smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.BaseLoginAutomation;
import com.generic.BaseLoginPOMAutomation;
import com.generic.DriverManager;

public class SmokeAutomation {
	public static void main(String[] args) {
		//setup
		DriverManager dm = new DriverManager();
		WebDriver driver=dm.getDriver();
		
		/*
		 * //Login BaseLoginAutomation obj = new BaseLoginAutomation();
		 * obj.getLoginH(driver);
		 */
		
		//pomLogin
		BaseLoginPOMAutomation obj1 = new BaseLoginPOMAutomation();
	obj1.baseLogin(driver);
	//close browser
		driver.quit();
		
	}
	
}
