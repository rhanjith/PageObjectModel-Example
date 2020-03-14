package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.HomepageObjects;
import pageObjects.LoginPageObjects;

public class LoginPageTest {

private static final TimeUnit TimeUnits = null;

@Test
public void SignedIn()
{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//library//chromedriver.exe");	;
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://us.trip.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnits.SECONDS);
	
    PageFactory.initElements(driver, HomepageObjects.class);
    HomepageObjects.Signin.click();
    
//	HomepageObjects.Signin(driver).click();
	
	PageFactory.initElements(driver, LoginPageObjects.class);
	LoginPageObjects.username.sendKeys("toxoyi3736@hxqmail.com");
	LoginPageObjects.password.sendKeys("Alliswell@123");
	LoginPageObjects.submit.click();
	
	
	/*
	LoginPageObjects.username(driver).sendKeys("toxoyi3736@hxqmail.com");
	LoginPageObjects.password(driver).sendKeys("Alliswell@123");
	LoginPageObjects.submit(driver).click();
	
	*/
	
	
}
	
}
