package com.Orange.Hrm.Scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Orange.Hrm.AddNationality;
import com.Orange.Hrm.Admin;
import com.Orange.Hrm.Login;
import com.Orange.Hrm.Nationality;

import Util.Generic;

public class NationTestt {
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
	
    public void validateNationality() throws IOException
    {
	Login Lg=new Login(driver);
	Lg.validLogin("Admin", "Y7Eu6BIsx@");
	//String actualtext=Lg.msgDisplayed();
	//String expectedtext="Dashboard";
	//Assert.assertEquals(actualtext, expectedtext);
	Admin adm=new Admin(driver);
	adm.openModule();
	AddNationality adn=new AddNationality(driver);
	adn.clickAddNation();
    String[][] data=Generic.getData("E:\\OhrmNation.xlsx", "Sheet1");

    for(int i=1;i<data.length;i++)
    {
    	//adn.clickAddNation();
    	adn.addName(data[i][0]);
    	//String actualtext=nt.show();
		//String expectedtext="Nationalities";
    	boolean text=adn.show();
    	Assert.assertTrue(text);
		driver.navigate().forward();

    }
    
		//AddNationality an=new AddNationality(driver);
		//String msg=an.addNationality();
		//String exp="Add Nationality";
		//Assert.assertEquals(msg, exp);
		//an.addName();
		//Nationality nt=new Nationality(driver);
		//String act=nt.addNation();
		//String exp="Successfully Saved";
		
		//Assert.assertEquals(act, exp);
    }
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
