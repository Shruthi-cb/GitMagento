package com.abc.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount 
{
	WebDriver driver;
	By logout = By.linkText("Log Out");
	public  MyAccount(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnLogout()
	{
		driver.findElement(logout).click();
	}

}
