package com.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.BaseLoginPOMAutomation;
import com.generic.DriverManager;
import com.generic.MasterPageFactory;


public class TestNGExecution {
WebDriver driver;

@BeforeTest  //setup
public void getSetup() {
	//DriverManager dm = new DriverManager();
	//dm.getDriver();
	 driver=new DriverManager().getDriver();	
}

@Test
public void getLogin() {
	 // BaseLoginPOMAutomation obj1 = new BaseLoginPOMAutomation();
	 //obj1.baseLogin(driver);
	MasterPageFactory obj=	new BaseLoginPOMAutomation().baseLogin(driver);

Assert.assertTrue(obj.getSignOut().isDisplayed(),"Login Test passed");
}

@AfterTest
public void TearDown() {
	driver.quit();	
}


}
