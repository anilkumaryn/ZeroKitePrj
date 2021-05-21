package com.ZeroKitePrj.TestCase;



//import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.KiteLogin.PageObjects.LoginPage;
import com.KitePrj.BaseClass.BaseClass;

public class TC_LoginZeroKite_01 extends BaseClass{
	
	
	
	@Test
	public void logintest() 	{
		driver.get(BaseUrl);
		logger.info("Kite url is opend");
		
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
		logger.info("Logged into Kite");
		lp.search();
		
		
	}

}
