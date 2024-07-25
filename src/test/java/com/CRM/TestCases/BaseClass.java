package com.CRM.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
	public WebDriver driver;
	
	@BeforeTest
public void setup()
{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");

}
}