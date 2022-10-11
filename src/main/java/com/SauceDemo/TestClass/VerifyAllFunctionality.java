package com.SauceDemo.TestClass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SauceDemo.UtilityClass1.ScreenshotClass;
import com.SauceDemo.POMClass.HomePagePOMclass;

public class VerifyAllFunctionality extends TestBaseClass
{

	@Test
	public void verifyLoginFunctionality() throws IOException, InterruptedException
	{
		
       System.out.println("apply the validation");
		
	   String expectedTitle = "Swag Labs";    //dev/BA	
	   String actualTitle = driver.getTitle();
		Thread.sleep(5000);

	   ScreenshotClass.takeScreenshot(driver, "LoginActivity");
	
	   if(expectedTitle.equals(actualTitle))
	   {
		   System.out.println("login functionality test case is passed");
	   }
	   else
	   {
		   System.out.println("login functionality test case is failed");
	   }
		Thread.sleep(5000);

	}
	//test steps
			@Test
			public void verifyLOgOutFunctionality() throws IOException, InterruptedException
			{
				System.out.println("apply the validation");
				
				   String expectedTitle = "Swag Labs";    //dev/BA
					
				   String actualTitle = driver.getTitle();
					Thread.sleep(5000);

				   ScreenshotClass.takeScreenshot(driver, "LogOutActivity");

				
				   if(expectedTitle.equals(actualTitle))
				   {
					   System.out.println("logOut functionality test case is passed");
				   }
				   else
				   {
					   System.out.println("logOut functionality test case is failed");
				   }
					Thread.sleep(5000);

			}
			

			@Test
			public void verifyBagProductFunctionality() throws IOException, InterruptedException
			{
				
				//--homePage--//
				
				//bag product
				HomePagePOMclass hp = new HomePagePOMclass(driver);
				hp.clickBagButton();
				System.out.println("Bag product will get selected");
				
				//--validation--//
				String exceptedProduct = "1";
				
				String actualProduct = hp.getTextFromAddToCart();
				System.out.println("actual product->"+actualProduct);
				
				System.out.println("apply validation");
				Thread.sleep(5000);
				   ScreenshotClass.takeScreenshot(driver, "1ProductActivity");

				
				if(exceptedProduct.equals(actualProduct))
				{
					System.out.println("Bag product add to cart case is passed");
				}
				else
				{
					System.out.println("Bag product add to cart case is failed");
				}
				
				}
			
}
