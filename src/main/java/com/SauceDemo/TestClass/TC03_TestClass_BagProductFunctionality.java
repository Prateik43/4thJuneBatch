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

public class TC03_TestClass_BagProductFunctionality extends TestBaseClass
{		
				//--homePage--//
				
	@Test
	public void verifyBagProductFunctionality() throws IOException
	{
		
		//--homePage--//
		
		//bag product
		HomePagePOMclass hp = new HomePagePOMclass(driver);
		hp.clickBagButton();
		log.info("Bag product will get selected");
		ScreenshotClass.takeScreenshot(driver, "product selected");
		//--validation--//
		String expectedProduct = "1";
		
		String actualProduct = hp.getTextFromAddToCart();
		System.out.println("actual product->"+actualProduct);
		
		log.info("apply validation");
//		
//		if(exceptedProduct.equals(actualProduct))
//		{
//			System.out.println("Bag product add to cart case is passed");
//		}
//		else
//		{
//			System.out.println("Bag product add to cart case is failed");
//		}
		Assert.assertEquals(actualProduct, expectedProduct);
		
		}
	

}
