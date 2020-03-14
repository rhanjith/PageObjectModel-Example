package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.HomepageObjects;
import pageObjects.LoginPageObjects;

public class LoginPagewithoutFindbyandFindElementsTest {
	
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;

private static final TimeUnit TimeUnits = null;

@Test
public void SignedIn()
{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//library//chromedriver.exe");	;
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnits.SECONDS);
	

	
	PageFactory.initElements(driver, LoginPagewithoutFindbyandFindElementsTest.class);
	
	LoginPagewithoutFindbyandFindElementsTest.txtUsername.sendKeys("abcd");
	LoginPagewithoutFindbyandFindElementsTest.txtPassword.sendKeys("1234");
	LoginPagewithoutFindbyandFindElementsTest.btnLogin.click();
}
	
}
