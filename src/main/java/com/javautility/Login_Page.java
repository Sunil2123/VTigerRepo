package com.javautility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	WebDriver driver;
	public Login_Page(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;

	public WebElement getUsername() 
	{
		return username;
	}

	public WebElement getPassword() 
	{
		return password;
	}

	public WebElement getLoginbtn() 
	{
		return loginbtn;
	}
	public void loginapp() throws Throwable 
	{
     Generic gen=new Generic();
     	getUsername().sendKeys(gen.dataDriven("UN"));
     	getPassword().sendKeys(gen.dataDriven("PW"));
     	getLoginbtn().click();
		
	}
}
