package Generic_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements finalmembers
{
public WebDriver driver;
	@BeforeMethod
	public void test1()
	{
		System.setProperty(gecko_key, gecko_val);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void test2()
	{
		driver.quit();
	}
	
}

