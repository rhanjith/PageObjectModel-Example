package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	
	@FindBy(id="userName")
	public static WebElement username;
	
	@FindBy(id="txtPassword")
	public static WebElement password;
	
	@FindBy(xpath="//input[@id='btnSubmitData']")
	public static WebElement submit;
	
	
	
	
	
	
	
	
	/*
	public static WebElement username(WebDriver driver) 
	{
		return driver.findElement(By.id("userName"));
	
	}
	
	public static WebElement password(WebDriver driver) 
	{
		return driver.findElement(By.id("txtPassword"));
	}

	public static WebElement submit(WebDriver driver) 
	{
		return driver.findElement(By.xpath("//input[@id='btnSubmitData']"));
	}

*/


}