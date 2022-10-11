package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.UtilityClass1.ScreenshotClass;
import com.SauceDemo.POMClass.HomePagePOMclass;
import com.SauceDemo.POMClass.LoginPOmClass;

public class TC02_TestClass_LogOutFunctionality extends TestBaseClass
{	
	
	//test steps
		@Test
		public void verifyLOgOutFunctionality() throws IOException
		{
			HomePagePOMclass hp =new HomePagePOMclass(driver);
			hp.clickMenuButton();
			log.info("clicked on menu button");
			hp.clickLogOutButton();
			log.info("clicked on Logoutbutton");
			
			ScreenshotClass.takeScreenshot(driver, "logout");
			
			
			log.info("apply the validation");
			
			   String expectedTitle = "Swag Labs";    //dev/BA
				
			   String actualTitle = driver.getTitle();
			
//			   if(expectedTitle.equals(actualTitle))
//			   {
//				   System.out.println("logOut functionality test case is passed");
//			   }
//			   else
//			   {
//				   System.out.println("logOut functionality test case is failed");
//			   }
			   
			   Assert.assertEquals(actualTitle, expectedTitle);
		}
	}

