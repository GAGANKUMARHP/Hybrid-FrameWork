package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_script.constructorchain;

public class TEST1 extends constructorchain
{
@FindBy(id="email")
private WebElement email;

@FindBy(id="pass")
private WebElement pass;

@FindBy(name="login")
private WebElement login;

public TEST1(WebDriver driver)
{
	super(driver);
	
}
 public void emailData(String un)
 {
	  email.sendKeys(un);
 }

 public void passData(String pa)
 {
	 pass.sendKeys(pa);
 }
 public void loginButton()
 {
	 login.click();
 }
 
 
}
