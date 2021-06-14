package com.kiteZeroPrj.Utilis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	
	Properties pro;
	public ReadConfig() {
		
		File scr =new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(scr);
			pro =new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getUrl() 
	{
		String url=pro.getProperty("BaseUrl");
		return url;
	}
	
	public String getUserName() 
	{
		String UserName=pro.getProperty("UserName");
		return UserName;
	}
	
	public String getPassword() 
	{
		String Password=pro.getProperty("Password");
		return Password;
	}
	
	public String getMip()
	{
		String Mpin=pro.getProperty("MPin");
		return Mpin;
	}
	
	public String getChromepath()
	{
		String chrome=pro.getProperty("chromepath");
		return chrome;
		
	}
	public String getFirefox()
	{
		String firefox=pro.getProperty("geckodriver");
		return firefox;
		
	}
	public String getIEdriver()
	{
		String iedriver=pro.getProperty("IEDriverServer");
		return iedriver;
		
	}
	

	
	
}
