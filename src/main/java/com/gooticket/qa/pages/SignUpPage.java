package com.gooticket.qa.pages;

import com.gooticket.base.ConfigTestBase;

public class SignUpPage extends ConfigTestBase{
	
    String LOC_CHECKBOX_MR_CSS = "#id_gender1";
    String LOC_FIRSTNAME_INPUT_CSS = "#customer_firstname";
    String LOC_LASTNAME_INPUT_CSS = "#customer_lastname";
    String LOC_PASSWORD_INPUT_CSS = "#passwd";

    String LOC_DAYS_SELECT_CSS = "#days";
    String LOC_MONTHS_SELECT_CSS = "#months";
    String LOC_YEARS_SELECT_CSS = "#years";
	
	String LOC_COMPANY = "#company";
	String LOC_ADDRESS_FIRST_NAME = "#firstname";
	String LOC_ADDRESS_LAST_NAME = "#lastname";
	String LOC_ADDRESS_DELIVERY_MODE = "#id_delivery_mode";
	String LOC_ADDRESS_DETAIL_FIRST_LINE = "#address1";
	String LOC_ADDRESS_DETAIL_SECOND_LINE = "#address2";
	String LOC_ADDRESS_ZIPCODE = "#postcode";
	String LOC_ADDRESS_CITY = "#city";
	String LOC_ADDRESS_COUNTRY = "#id_country"; 
	String LOC_ADDRESS_PHONE = "#phone";  
	String LOC_ADDRESS_PHONE_MOBILE = "#phone_mobile";  
	String LOC_ADDRESS_REFERENCE="#alias"; 


    String LOC_REGISTER_BUTTON_CSS = "#submitAccount";
    

    public void fillFirstNameInput(){
        String firstName = "wishi";
        WebElement firstNameInput = driver.findElement(By.cssSelector(LOC_FIRSTNAME_INPUT_CSS));
        firstNameInput.sendKeys(firstName);
    }
    public void fillLastNameInput(){
        String lastName = "sham";
        WebElement lastNameInput = driver.findElement(By.cssSelector(LOC_LASTNAME_INPUT_CSS));
        lastNameInput.sendKeys(lastName);
    }

    public void fillPasswordInput(){
        String password = "Test@123";
        WebElement passwordInput = driver.findElement(By.cssSelector(LOC_PASSWORD_INPUT_CSS));
        passwordInput.sendKeys(password);
    }

    public void clickOnMrCheckbox(){
        WebElement MrCheckbox = driver.findElement(By.cssSelector(LOC_CHECKBOX_MR_CSS));
        MrCheckbox.click();
    }

    public void fillBirthDayDropdown(){
        String dayNumber = "2";
        Select dropdownDays = new Select(driver.findElement(By.cssSelector(LOC_DAYS_SELECT_CSS)));
        dropdownDays.selectByValue(dayNumber);

        String months = "3"; //March
        Select monthsDropdown = new Select(driver.findElement(By.cssSelector(LOC_MONTHS_SELECT_CSS)));
        monthsDropdown.selectByValue(months);

        String years = "2008";
        Select yearsDropdown = new Select(driver.findElement(By.cssSelector(LOC_YEARS_SELECT_CSS)));
        yearsDropdown.selectByValue(years);

    }
    public void fillEmail(){

        String email = "wishsham_"+ RandomString.make(3).toLowerCase()+"@gmail.com";
        WebElement emailInput = driver.findElement(By.cssSelector(LOC_EMAIL_ACCOUNT_CSS));
        emailInput.sendKeys(email);
    }
	
	 public void fillAddressFirstNameInput(){
        String firstName = "DDS";
        WebElement firstNameInput = driver.findElement(By.cssSelector(LOC_ADDRESS_FIRST_NAME));
        firstNameInput.sendKeys(firstName);
    }
	
	 public void fillAddressLastNameInput(){
        String lastName = "CMPNY";
        WebElement lastNameInput = driver.findElement(By.cssSelector(LOC_ADDRESS_LAST_NAME));
        firstNameInput.sendKeys(lastName);
    }
	
	 public void clickOnDeliveryMode(){
        WebElement MrCheckbox = driver.findElement(By.cssSelector(LOC_ADDRESS_DELIVERY_MODE));
        MrCheckbox.click();
    }
	 
    
	 public void clickOnRegisterButton(){
	        WebElement registerButton = driver.findElement(By.cssSelector(LOC_REGISTER_BUTTON_CSS));
	        registerButton.click();
	    }

}
