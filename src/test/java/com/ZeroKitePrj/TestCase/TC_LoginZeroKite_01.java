package com.ZeroKitePrj.TestCase;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
//import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.KiteLogin.PageObjects.LoginPage;
import com.KitePrj.BaseClass.BaseClass;

public class TC_LoginZeroKite_01 extends BaseClass{
	
	
	
	@Test
	public void logintest() throws IOException 	{
		
		
		
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(UserName);
		logger.info("Entered User Name");
		
		lp.setpassword(Password);
		logger.info("Pawword entered");
		lp.ClickSubmit();
		logger.info("1st layer auth completed");
		lp.EnterPin(MPin);
		logger.info("enter Mpin");
		lp.clickmpinsubmit();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Logged into Kite");
		lp.search();
		
		if (driver.findElement(By.id("app")).isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("Kite App has been Successfully launched");
			}
		else
		{
			captureScreen(driver,"logintest");
			Assert.assertTrue(false);
			logger.info("Kite App has been closed without launch");
		}
			
				
		//*[@id="app"]/div[1]/div/div[2]/a/img
		
		
		
		
	}

}
