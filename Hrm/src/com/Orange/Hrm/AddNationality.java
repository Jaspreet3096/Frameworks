package com.Orange.Hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNationality {
	
	@FindBy(css="#menu_admin_nationality > span.left-menu-title")
	private WebElement clickAdd;
	
	@FindBy(css="#nationalityDiv > div > a > i")//click  plus btn
	private WebElement clickAddNation;
	
	@FindBy(css="#name")//click name btn
	private WebElement name;
	
	@FindBy(css="#modal1 > form > div.modal-footer > a.modal-action.waves-effect.waves-green.btn.primary-btn")
	private WebElement clickSave;
	
	@FindBy(css="#right-side > header > div > ohrm-navbar > nav > div > div > ul > li")
	private WebElement showNationality;
	
	public AddNationality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddNation() 
	{
		clickAdd.click();
	}
	
	public void addName(String Name)
	{
		clickAddNation.click();
		name.clear();
		name.sendKeys(Name);
		clickSave.click();


	}
	
	public boolean show()
	{
		//boolean b=showNationality.isDisplayed();
		boolean txt=showNationality.isDisplayed();
		return txt;
	}
	
}
