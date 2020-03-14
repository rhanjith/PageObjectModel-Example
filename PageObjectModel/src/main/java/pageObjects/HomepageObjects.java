package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomepageObjects 
{
   
	
	
	@FindBy(xpath="//span[@class='mc-hd__register-btn']")
	public static WebElement Register;
	
	@FindBy(xpath="//span[@class='mc-hd__login-btn']")
	public static WebElement Signin;
	
	//Test
	/*
	public static WebElement Register(WebDriver driver) 
	{
		return driver.findElement(By.xpath("//span[@class='mc-hd__register-btn']"));	
		
	}
	
	
	public static WebElement Signin(WebDriver driver) 
	{
		return driver.findElement(By.xpath("//span[@class='mc-hd__login-btn']"));
		
	}
	
	*/
}
