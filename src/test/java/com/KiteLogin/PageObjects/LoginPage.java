package com.KiteLogin.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	WebDriver ldriver;
	
	 public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	 @FindBy(id="userid")
	 WebElement txtUserName;
	 
	 @FindBy(id="password")
	 WebElement Password;


	 //@FindBy(id="container")
	 //@FindBy(xpath="//*[@id=\"container\"]/div[2]/div/div/form/div[3]/button")
	/* @FindAll({
		 @FindBy(xpath="//*[@id=\"container\"]/div[2]/div/div/form/div[3]/button"),
		@FindBy(id="container")
	 }
			 )
			 */
	 //@FindBy(xpath="//button[@type='submit'") 
	 @FindBy(xpath="//*[@type='submit']")
	 WebElement ClickONSubmit;
	 
	 
	  @FindBy(id="pin")
	// @FindBy(xpath="//*[@id=\"pin\"]")
	 WebElement EnterPin;
	 
	 @FindBy(xpath="//*[@id=\"container\"]/div/div/div/form/div[3]/button")
	 WebElement EnterSubmit;
	 
	@FindBy(id="search-input")
	WebElement SearchEq;
	
	
	public void setUserName(String user)
	{
		txtUserName.sendKeys(user);
	}
	
	public void setpassword(String pwrd)
	{
		Password.sendKeys(pwrd);
		
	}
	
	public void ClickSubmit()
	{
		ClickONSubmit.click();
	}
	
	public void EnterPin(String pin)
	{
		
		EnterPin.sendKeys(pin);
		
	}
	
	public void clickmpinsubmit()
	{
		EnterSubmit.click();
	}
	public void search()
	{
		SearchEq.click();
	}
}
