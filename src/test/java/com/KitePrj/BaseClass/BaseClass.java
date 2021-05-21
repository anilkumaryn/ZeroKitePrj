

package com.KitePrj.BaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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
	public void setup() {
		
		
		//System.setProperty("WebDriver.chrome.driver",System.getProperty("User.dir")+"ZeroKitePrj\\Drivers\\chromedriver.exe");
		System.setProperty("WebDriver.chrome.driver",readConfig.getChromepath());
		driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 20);
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
	
}
