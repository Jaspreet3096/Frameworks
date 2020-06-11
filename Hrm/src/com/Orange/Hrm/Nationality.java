package com.Orange.Hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nationality {
	
	
	
	public Nationality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
