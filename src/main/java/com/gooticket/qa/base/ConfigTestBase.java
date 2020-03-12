package com.gooticket.qa.base;

import java.util.concurrent.TimeUnit;
import com.crm.qa.base.FirefoxDriver;
import com.crm.qa.base.WebDriver;
import com.crm.qa.util.TestUtil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ConfigTestBase {
	


	public static WebDriver driver;

	public static void initialization() {
		String browserName = "FireFox";
		String webSiteUrl = "https://www.gootickets.com/";

		if (browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/vishal/Documents/SeleniumServer/geckodriver");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please use FireFox Browser");
		}

		// To manage a home page
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		// Access to website
		driver.get(webSiteUrl);

	}


}
