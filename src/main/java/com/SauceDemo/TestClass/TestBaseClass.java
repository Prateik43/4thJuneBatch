package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.SauceDemo.POMClass.LoginPOmClass;
import com.SauceDemo.UtilityClass1.ScreenshotClass;

public class TestBaseClass 
{
	
	WebDriver driver;
	Logger log= Logger.getLogger("SauceDemo_Project");
	@Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName ) throws IOException
	{
		if(browserName.equals("chrome"))
		{System.setProperty("webdriver.chrome.driver",
				"./DriverFiles\\chromedriver.exe");

				 driver = new ChromeDriver();
		}
		 else
		{
			System.setProperty("webdriver.gecko.driver",
					"./DriverFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		PropertyConfigurator.configure("log4j.properties");
		
				
				log.info("Browser is opened");
								
				driver.get("https://www.saucedemo.com/");
				log.info("website is open");
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				ScreenshotClass.takeScreenshot(driver, "Saucewebsite is open");


				//loginPage elements find +action perform
				
				LoginPOmClass x = new LoginPOmClass(driver);
				
				x.sendUsername();
				log.info("username is entered");
				
				x.sendPassword();
				log.info("Password is entered");
				
				x.clickOnLoginButton();
				log.info("Clicked on login button");
				ScreenshotClass.takeScreenshot(driver, "Saucewebsite1");
	}
	
	@AfterMethod
	public void tearDown()
	{
		   driver.quit();
		   log.info("browser is closed");
	       
		   log.info("end of Program");	
	}
}
