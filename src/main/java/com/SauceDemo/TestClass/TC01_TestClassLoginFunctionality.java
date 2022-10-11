package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SauceDemo.UtilityClass1.ScreenshotClass;
import com.SauceDemo.POMClass.LoginPOmClass;

public class TC01_TestClassLoginFunctionality extends TestBaseClass
{	
					

	@Test
	public void verifyLoginFunctionality() throws IOException
	{
		
		log.info("apply the validation");
		
	   String expectedTitle = "Swag Labs";    //dev/BA	
	   String actualTitle = driver.getTitle();
	
//	   if(expectedTitle.equals(actualTitle))
//	   {
//		   System.out.println("login functionality test case is passed");
//	   }
//	   else
//	   {
//		   System.out.println("login functionality test case is failed");
//	   }

	   Assert.assertEquals(actualTitle, expectedTitle);


	}
	
	

			

					
}


