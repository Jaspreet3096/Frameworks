package com.Orange.Hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users {
@FindBy(css="#systemUserDiv > crud-panel > div > div")
private WebElement user_Visible;

@FindBy(css="#menu_admin_viewAdminModule > a")
private WebElement clickAdmin;

@FindBy(css="#menu_admin_UserManagement > a > span.left-menu-title")
private WebElement clickUserMgmt;

@FindBy(css="#menu_admin_viewSystemUsers > span.left-menu-title")
private WebElement clickUsers;
public Users(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public boolean GridVisible()
{
	clickAdmin.click();
	clickUserMgmt.click();
	clickUsers.click();
	boolean data=user_Visible.isDisplayed();
	return data;
}
}
