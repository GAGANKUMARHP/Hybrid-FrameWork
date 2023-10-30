package Test_scipt;

import org.testng.annotations.Test;

import Generic_script.Basetest;
import Generic_script.singl_read;
import pom_script.TEST1;

public class login_facebook extends Basetest

{
	@Test
	public void tes12() throws InterruptedException
	{
		TEST1 t=new TEST1(driver);
		t.emailData(singl_read.fetch("Sheet1", 1, 1));
		Thread.sleep(2000);
		t.passData(singl_read.fetch("Sheet1", 1, 0));
		Thread.sleep(2000);
		t.loginButton();
	}

	
}
