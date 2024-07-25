package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

public class HomePageTestCase {
  @Test(priority=1)
  public void verifyUr1() 
	  {
  HomePage hp=new HomePage();
 String actUrl=hp.getAppUrl();
 Assert.assertTrue(actUrl.contains("crm"));
 System.out.println("test pass:Url matched!");
}
 
  
  
  @Test(priority=2)
  public void verifyTitle()
  {
  }
  
  
  @Test(priority=3)
  public void verifyUrl(){
  }
  
  
  
  
  
}
