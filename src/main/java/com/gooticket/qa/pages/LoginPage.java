package com.gooticket.qa.pages;
package com.gooticket.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDry;

import com.crm.qa.pages.SignUpPage;
import com.gooticket.base.ConfigTestBase;

public class LoginPage extends ConfigTestBase{
	
    String LOC_EMAIL_ACCOUNT_CSS = "#email_create";
    String LOC_CREATE_ACCOUNT_BUTTON_CSS = "#SubmitCreate"
    		
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
    //fill Email id
    public void fillEmail(){

        String email = "wishsham_"+ RandomString.make(3).toLowerCase()+"@gmail.com";
        WebElement emailInput = driver.findElement(By.cssSelector(LOC_EMAIL_ACCOUNT_CSS));
        emailInput.sendKeys(email);
    }	

	//click on create account button
    private SignUpPage clickOncreateAccountButton(){
        WebElement createAccountButton = driver.findElement(By.cssSelector(LOC_CREATE_ACCOUNT_BUTTON_CSS));
        createAccountButton.click();
        return new SignUpPage();
    }
	
}
