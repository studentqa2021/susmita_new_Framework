package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.BaseConfig;
import com.util.HighlighterAutomation;
import com.util.ScreenshotAutomation;

public class BaseLoginPOMAutomation {
public  MasterPageFactory baseLogin(WebDriver driver) {
	
	System.setProperty("webdriver.driver.firefox", "./Driver/geckodriver.exe");	
	WebDriver driver2 = new FirefoxDriver();	
	driver.get(BaseConfig.getConfigValue("Url"));
	driver.manage().window().maximize();
	
	MasterPageFactory obj = new MasterPageFactory(driver);
	
	HighlighterAutomation.getcolour(driver, obj.getSigninBtn());
	ScreenshotAutomation.getscreenshot(driver, "Home Page");
	obj.getSigninBtn().click();
	
	HighlighterAutomation.getcolour(driver,obj.getEmail());
	ScreenshotAutomation.getscreenshot(driver, "Email page");
	obj.getEmail().sendKeys(BaseConfig.getConfigValue("User"));
	
	HighlighterAutomation.getcolour(driver,obj.getPass());
	ScreenshotAutomation.getscreenshot(driver, "password page");
	obj.getPass().sendKeys(BaseConfig.getConfigValue("pass"));
	
	HighlighterAutomation.getcolour(driver,obj.getFinalSigninBtn());
	//ScreenshotAutomation.getscreenshot(driver, "Login page");
	obj.getFinalSigninBtn().click();
	
	//signout
	//for assert or validate
	//boolean statusLogin = false;
	//try {
	// statusLogin = obj.getSignOut().isDisplayed();
	//} catch (Exception e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	//}
	//condition
	//if(obj.getSignOut().isDisplayed()) {
	//System.out.println("Login passed");	
	//}else {
	//System.out.println("Login Fail");	
	//}

	return obj;
}
}
