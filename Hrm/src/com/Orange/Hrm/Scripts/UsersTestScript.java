package com.Orange.Hrm.Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Orange.Hrm.Login;
import com.Orange.Hrm.Users;

public class UsersTestScript {
	  WebDriver driver;
		@BeforeTest
		public void openBrowser()
		{
			System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://gsspl-trials65101.orangehrmlive.com/auth/login");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
		@Test
		public void checkVisibility()
		{
			Login Lg=new Login(driver);
			Lg.validLogin("Admin", "Y7Eu6BIsx@");
			Users us=new Users(driver);
			boolean text=us.GridVisible();
			Assert.assertTrue(text);
			
		}
		
		@AfterTest
		public void closeBrowser()
		{
			driver.close();
		}

}
