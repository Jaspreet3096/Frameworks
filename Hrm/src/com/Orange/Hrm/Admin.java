package com.Orange.Hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
	
	@FindBy(css="#menu_admin_viewAdminModule > a")
	private WebElement clickNationalities;
	
	public Admin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openModule()
	{
		clickNationalities.click();
	}
	

}
