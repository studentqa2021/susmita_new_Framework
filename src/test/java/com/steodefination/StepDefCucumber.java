package com.steodefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.BaseLoginPOMAutomation;
import com.generic.DriverManager;
import com.generic.MasterPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefCucumber {
WebDriver driver;
MasterPageFactory pf;

@Given("open browser and send URL")	
public void setup() {
driver =new DriverManager().getDriver();
}

@When("login with valid credentials")
public void getLogin() {
	 pf=	new BaseLoginPOMAutomation().baseLogin(driver);
	}
	

@Then("Check login was success")
public void getvalidation() {
	Assert.assertTrue(pf.getSignOut().isDisplayed(),"Login Test passed");
	
	driver.quit();
}
}	

