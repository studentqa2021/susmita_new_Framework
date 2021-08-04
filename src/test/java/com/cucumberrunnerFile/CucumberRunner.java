package com.cucumberrunnerFile;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



	@CucumberOptions(publish = true,//
			plugin = { "pretty",// report will here like json report
			"html:target/site/cucumber-pretty", 
			"rerun:target/rerun.txt",
			"json:target/cucumber.json",
			},

			features = { "./src/test/resources/Login.feature" }, //pass feature file path
			glue = { "com.steodefination" },// step def package name
			monochrome = true,//to remove all ? east to read console
			 dryRun = true,//check feature file
			strict = true//check step def //every step code there or not
			//tags= {"@Tc_002"}//to run specific scenario

	)

	public class CucumberRunner extends AbstractTestNGCucumberTests {

		@BeforeTest //cucumber Hooks
		public void setup() {
			// code
		}
		
		@Test //Hooks
		public void test() {
			
		}
	@AfterTest  //Hooks
	public void teardown() {
		
	}
		
	}	
	

