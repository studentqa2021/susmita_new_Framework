package com.generic;


  import org.openqa.selenium.By; 
  import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  import org.openqa.selenium.firefox.FirefoxDriver;
 
  import com.util.HighlighterAutomation;
  import com.util.ScreenshotAutomation;

 public class BaseLoginAutomation {
 
 public void getLoginH(WebDriver driver ) {
  //sign in
  ScreenshotAutomation.getscreenshot(driver, "signinscreenshot");//screenshot
 WebElement Signin = driver.findElement(By.xpath("//*[@class='login']"));
 //highlighter
  HighlighterAutomation.getcolour(driver, Signin);
 Signin.click();
  //email
 
  ScreenshotAutomation.getscreenshot(driver, "EmailScreenshot"); //screenshot
 WebElement email =driver.findElement(By.xpath("//*[@id='email']"));
 //highlighter
 HighlighterAutomation.getcolour(driver, email);
 email.sendKeys("sarowerny@gmail.com"); 
  //pass
 WebElement pass = driver.findElement(By.xpath("//*[@name='passwd']"));
  HighlighterAutomation.getcolour(driver, pass);
  pass.sendKeys("student");
  //finalsignin 
  WebElement finalsignin =driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
  HighlighterAutomation.getcolour(driver, finalsignin);
  finalsignin.click();
 //Signout
  //driver.quit(); }
  
 }
}