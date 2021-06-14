

package com.KitePrj.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.kiteZeroPrj.Utilis.ReadConfig;

public class BaseClass  {

	ReadConfig readConfig=new ReadConfig();
	
	public String  BaseUrl = readConfig.getUrl();
	public String	UserName= readConfig.getUserName(); 	
	public String	Password=readConfig.getPassword();
	public String 	MPin =readConfig.getMip();
	public  WebDriver driver;
	public Logger logger;
	
	
	@BeforeClass
	public void setup(String br) {
		
		if(br.equals("chrome"))
		{
			//System.setProperty("WebDriver.chrome.driver",System.getProperty("User.dir")+"ZeroKitePrj\\Drivers\\chromedriver.exe");
			System.setProperty("WebDriver.chrome.driver",readConfig.getChromepath());
			driver = new ChromeDriver();
		}else if(br.equals("firefox"))
		{
			//System.setProperty("WebDriver.chrome.driver",System.getProperty("User.dir")+"ZeroKitePrj\\Drivers\\chromedriver.exe");
			System.setProperty("WebDriver.chrome.driver",readConfig.getFirefox());
			driver = new FirefoxDriver();
		}else if(br.equals("iedriver"))
		{
			//System.setProperty("WebDriver.chrome.driver",System.getProperty("User.dir")+"ZeroKitePrj\\Drivers\\chromedriver.exe");
			System.setProperty("WebDriver.chrome.driver",readConfig.getIEdriver());
			driver = new ChromeDriver();
		}
		
		driver.get(BaseUrl);
	//	WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//driver.manage().wait();
		
		 logger=Logger.getLogger("ZeroKite");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
	@AfterClass
	public void tearDown()
	{
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/div[2]/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/div[2]/div/div/ul/li[9]/a")).click();
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException 
	{
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken");
	}

	
}
