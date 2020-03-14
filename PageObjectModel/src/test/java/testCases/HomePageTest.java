package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.HomepageObjects;

public class HomePageTest {

@Test
public void Signin()
{

	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//library//chromedriver.exe");	;
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://us.trip.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
    PageFactory.initElements(driver, HomepageObjects.class);
    HomepageObjects.Signin.click();
	
	
	
	
	
	
	}

}
