package com.gooticket.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gooticket.qa.pages.LoginPage;
import com.gooticket.qa.base.ConfigTestBase;

public class HomePage extends ConfigTestBase {

	 String LOC_MY_ACCOUNT_CSS = "#goo_user_account_login";

//Get Home Page Title
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
//click on my Account button on home Page	
	public LoginPage clickOnMyAccount(){
	        WebElement myAccountButton = driver.findElement(By.cssSelector(LOC_MY_ACCOUNT_CSS));
	        myAccountButton.click();
	        return new LoginPage();
	    }
		
	}
	
	
	
	
	
	
	

}
