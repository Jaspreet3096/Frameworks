package com.Orange.Hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
@FindBy(id="txtUsername")
private WebElement userName;

@FindBy(id="txtPassword")
private WebElement passWord;

@FindBy(id="btnLogin")
private WebElement logIn;

@FindBy(css="#dashboard-navbar > nav > div > ul.left > li")
private WebElement text;

public Login(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public void validLogin(String Username,String Password)
{
	userName.sendKeys(Username);
	passWord.sendKeys(Password);
	logIn.click();
}

public String msgDisplayed()
{
	String msg=text.getText();
	return msg;
	}
}
