package Generic_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class constructorchain
{

	public WebDriver driver;
	public constructorchain(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
