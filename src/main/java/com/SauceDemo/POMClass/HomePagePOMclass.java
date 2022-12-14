package com.SauceDemo.POMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMclass 
{
	//POM Class steps
			//1.WebDriver driver declare
			//2.ele find by @FindBy Annotation
			//3.created a method to perform a action on element
			//4.Constructor create
		
		//1.
		WebDriver driver;
		private Select s;
		
		//2.
		@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
		WebElement menuButton;
		
		//3.
		public void clickMenuButton()
		{
			menuButton.click();
		}
		
		//2.
		@FindBy(xpath = "//a[@id='logout_sidebar_link']")
		WebElement logOutButton;
		
		//3. 
		public void clickLogOutButton()
		{
			logOutButton.click();
		}
		
		//4
		public HomePagePOMclass(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//bag ele
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
		private WebElement bagButton;
		
		public void clickBagButton()
		{
			bagButton.click();
		}
		
		
		//addToCart ele
		@FindBy(xpath = "//a[@class='shopping_cart_link']")
		private WebElement addToCart;
		
		public String getTextFromAddToCart()
		{
			String totalProducts= addToCart.getText();
			return totalProducts;
		}
		//multiple product ele
		
		@FindBy(xpath = "//button[text()='Add to cart']")
		private List<WebElement> allProducts;
		
		public void clickAllProducts()
		{
//			for(int i=0; i<allProducts.size();i++)
//			{
//				allProducts.get(i).click();
//			}
			for(WebElement i : allProducts)
			{
				i.click();
			}
		}
		//assignment
		//apply for each loop here
	//-----------------------------------//
		//dropDownELe find
		
		
		@FindBy(xpath = "//select[@class='product_sort_container']")
		private WebElement dropDown;
		
		public void clickDropDownFilter()
		{
			dropDown.click();
//			Select s = new Select(dropDown);
			s.selectByValue("lohi");	
		}

		
		
		
		

}
